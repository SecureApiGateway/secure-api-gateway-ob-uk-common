/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Filter which stores the x-fapi-interaction-id header value in the {@link MDC} log context.
 *
 * This means that the x-fapi-interaction-id will be present in each log message for a request, which allows requests to
 * be traced through the system.
 */
public class FapiInteractionIdFilter extends OncePerRequestFilter {

    public static final String X_FAPI_INTERACTION_ID = "x-fapi-interaction-id";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String xFapiInteractionId = request.getHeader(X_FAPI_INTERACTION_ID);
        if (StringUtils.hasText(xFapiInteractionId)) {
            MDC.put(X_FAPI_INTERACTION_ID, xFapiInteractionId);
        }
        try {
            filterChain.doFilter(request, response);
        } finally {
            MDC.remove(X_FAPI_INTERACTION_ID);
        }
    }

}
