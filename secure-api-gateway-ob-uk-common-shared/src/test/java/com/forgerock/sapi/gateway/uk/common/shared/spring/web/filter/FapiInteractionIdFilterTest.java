/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.forgerock.sapi.gateway.uk.common.shared.spring.web.filter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.obie.OBHeaders;
import com.forgerock.sapi.gateway.uk.common.shared.fapi.FapiInteractionIdContext;

import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class FapiInteractionIdFilterTest {

    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    private MockFilterChain chain;
    private FapiInteractionIdFilter filter;
    private String xFapiInteractionIdFromMdc;

    private Optional<String> xFapiInteractionIdFromIdContext;

    @BeforeEach
    void setup() {
        FapiInteractionIdContext.removeFapiInteractionId();
        this.xFapiInteractionIdFromMdc = null;
        this.xFapiInteractionIdFromIdContext = Optional.empty();

        this.request = new MockHttpServletRequest();
        this.response = new MockHttpServletResponse();
        
        // Filter to use in the onward chain which simply captures the interactionId from MDC
        final OncePerRequestFilter captureFapiInteractionIdFilter = new OncePerRequestFilter() {
            @Override
            protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) {
                xFapiInteractionIdFromMdc = MDC.get(OBHeaders.X_FAPI_INTERACTION_ID);
                xFapiInteractionIdFromIdContext = FapiInteractionIdContext.getFapiInteractionId();
            }
        };
        this.chain = new MockFilterChain(new HttpServlet(){}, captureFapiInteractionIdFilter);
        this.filter = new FapiInteractionIdFilter();
    }

    @Test
    void testDoesNothingIfNoFapiIdHeader() throws Exception {
        this.filter.doFilter(this.request, this.response, this.chain);
        assertThat(MDC.get(OBHeaders.X_FAPI_INTERACTION_ID)).isNull();
        assertThat(xFapiInteractionIdFromMdc).isNull();
        assertThat(FapiInteractionIdContext.getFapiInteractionId()).isEmpty();
    }

    @Test
    void  testStoreFapiIdHeaderInMdc() throws Exception {
        final String testInteractionId = "test-1234";
        request.addHeader(OBHeaders.X_FAPI_INTERACTION_ID, testInteractionId);
        this.filter.doFilter(this.request, this.response, this.chain);

        // Verify that the interactionId was found in the MDC when calling other filters
        assertThat(xFapiInteractionIdFromMdc).isEqualTo(testInteractionId);
        assertThat(xFapiInteractionIdFromIdContext).isPresent().contains(testInteractionId);

        // Verify MDC is cleared once filter returns
        assertThat(MDC.get(OBHeaders.X_FAPI_INTERACTION_ID)).isNull();
    }

}