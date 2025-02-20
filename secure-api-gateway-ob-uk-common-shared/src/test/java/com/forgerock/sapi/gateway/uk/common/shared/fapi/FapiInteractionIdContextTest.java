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
package com.forgerock.sapi.gateway.uk.common.shared.fapi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FapiInteractionIdContextTest {

    @BeforeEach
    void beforeEach() {
        FapiInteractionIdContext.removeFapiInteractionId();
    }

    @Test
    void testUsingContextFromSingleThread() {
        verifyEmptyContext();

        // Set
        final String interactionId = UUID.randomUUID().toString();
        setContext(interactionId);

        // Overwrite
        final String anotherInteractionId = "another-id";
        setContext(anotherInteractionId);

        // Clear
        clearContext();
    }

    @Test
    void testUsingContextFromMultipleThreads() throws Exception {
        final ExecutorService executorService = Executors.newFixedThreadPool(32);
        try {
            final List<Future<Void>> testTaskFutures = executorService.invokeAll(Collections.nCopies(128, () -> {
                final String interactionId = UUID.randomUUID().toString();
                setContext(interactionId);

                // Simulate doing some work
                Thread.sleep(1);

                verifyContextContainsId(interactionId);
                clearContext();

                return null;
            }));

            for (Future<Void> testTaskFuture : testTaskFutures) {
                testTaskFuture.get();
            }
        } finally {
            executorService.shutdown();
        }
    }

    private static void verifyEmptyContext() {
        assertThat(FapiInteractionIdContext.getFapiInteractionId()).isEmpty();
    }

    private static void setContext(String interactionId) {
        FapiInteractionIdContext.setFapiInteractionId(interactionId);
        verifyContextContainsId(interactionId);
    }

    private static void verifyContextContainsId(String interactionId) {
        assertThat(FapiInteractionIdContext.getFapiInteractionId()).isPresent().contains(interactionId);
    }

    private static void clearContext() {
        FapiInteractionIdContext.removeFapiInteractionId();
        assertThat(FapiInteractionIdContext.getFapiInteractionId()).isEmpty();
    }

}