/*
 * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
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

import java.io.IOException;

import org.slf4j.MDC;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.obie.OBHeaders;
import com.forgerock.sapi.gateway.uk.common.shared.fapi.FapiInteractionIdContext;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Filter which stores the x-fapi-interaction-id header value in the {@link MDC} log context and {@link FapiInteractionIdContext}
 *
 * This means that the x-fapi-interaction-id will be present in each log message for a request, which allows requests to
 * be traced through the system.
 */
public class FapiInteractionIdFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String xFapiInteractionId = request.getHeader(OBHeaders.X_FAPI_INTERACTION_ID);
        if (StringUtils.hasText(xFapiInteractionId)) {
            MDC.put(OBHeaders.X_FAPI_INTERACTION_ID, xFapiInteractionId);
            FapiInteractionIdContext.setFapiInteractionId(xFapiInteractionId);
        }
        try {
            filterChain.doFilter(request, response);
        } finally {
            MDC.remove(OBHeaders.X_FAPI_INTERACTION_ID);
            FapiInteractionIdContext.removeFapiInteractionId();
        }
    }
}
