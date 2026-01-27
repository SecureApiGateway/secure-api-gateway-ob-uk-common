/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.uk.common.shared.fapi;

import java.util.Optional;

/**
 * This class manages storing/retrieving an x-fapi-interaction-id using a {@link ThreadLocal}.
 *
 * This is a similar approach to {@link org.slf4j.MDC}, it allows the x-fapi-interaction-id to be propagated through
 * the system so that it can be used for tracing purposes. If, as part of processing a request, the system needs to make
 * a HTTP call then the same x-fapi-interaction-id can be set in the HTTP header of that request.
 */
public class FapiInteractionIdContext {

    private static final ThreadLocal<String> THREAD_LOCAL_INTERACTION_ID = new ThreadLocal<>();

    /**
     * @param fapiInteractionId value to store in the ThreadLocal context.
     */
    public static void setFapiInteractionId(String fapiInteractionId) {
        THREAD_LOCAL_INTERACTION_ID.set(fapiInteractionId);
    }

    /**
     * @return an Optional which may contain an x-fapi-interaction-id if one has previously been configured via
     * the {@link this#setFapiInteractionId(String)}. May be empty if set has not been called for this thread OR
     * a previously set value has been removed by calling thos#removeFapiInteractionId
     */
    public static Optional<String> getFapiInteractionId() {
        return Optional.ofNullable(THREAD_LOCAL_INTERACTION_ID.get());
    }

    /**
     * Clears any value stored in the ThreadLocal context
     */
    public static void removeFapiInteractionId() {
        THREAD_LOCAL_INTERACTION_ID.remove();
    }

}
