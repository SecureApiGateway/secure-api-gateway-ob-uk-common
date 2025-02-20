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
package com.forgerock.sapi.gateway.uk.common.shared.api.meta.obie;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OBVersionTest {

    @Test
    void valuesShouldHaveCanonicalNameAndVersion() {
        assertThat(OBVersion.v3_1_10.getCanonicalVersion()).isEqualTo("3.1.10");
        assertThat(OBVersion.v3_1_10.getCanonicalName()).isEqualTo("v3.1.10");
        assertThat(OBVersion.v4_0_0.getCanonicalVersion()).isEqualTo("4.0.0");
        assertThat(OBVersion.v4_0_0.getCanonicalName()).isEqualTo("v4.0.0");
    }

    @Test
    void testIsBeforeVersion() {
        assertTrue(OBVersion.v3_1_10.isBeforeVersion(OBVersion.v4_0_0));
        assertTrue(OBVersion.v3_1_8.isBeforeVersion(OBVersion.v3_1_9));
        assertTrue(OBVersion.v3_1_8.isBeforeVersion(OBVersion.v3_1_10));
        assertTrue(OBVersion.v3_1_8.isBeforeVersion(OBVersion.v3_1_11));
        assertTrue(OBVersion.v3_1_8.isBeforeVersion(OBVersion.v4_0_0));

        assertFalse(OBVersion.v3_1_10.isBeforeVersion(OBVersion.v3_1_10));
        assertFalse(OBVersion.v4_0_0.isBeforeVersion(OBVersion.v3_1_10));
    }

    @Test
    void testIsAfterVersion() {
        assertTrue(OBVersion.v4_0_0.isAfterVersion(OBVersion.v3_1_11));
        assertTrue(OBVersion.v4_0_0.isAfterVersion(OBVersion.v3_1_10));
        assertTrue(OBVersion.v3_1_11.isAfterVersion(OBVersion.v3_1_10));

        assertFalse(OBVersion.v3_1_10.isAfterVersion(OBVersion.v3_1_11));
        assertFalse(OBVersion.v3_1_10.isAfterVersion(OBVersion.v3_1_10));
    }

    @Test
    void testParseFromVersionString() {
        assertThat(OBVersion.fromString("v3.1.10")).isEqualTo(OBVersion.v3_1_10);
        assertThat(OBVersion.fromString("3.1.10")).isEqualTo(OBVersion.v3_1_10);
        assertThat(OBVersion.fromString("v4.0.0")).isEqualTo(OBVersion.v4_0_0);
        assertThat(OBVersion.fromString("4.0.0")).isEqualTo(OBVersion.v4_0_0);

        assertThat(OBVersion.fromString("")).isNull();
        assertThat(OBVersion.fromString(" ")).isNull();
        assertThat(OBVersion.fromString(null)).isNull();
        assertThat(OBVersion.fromString("v99")).isNull();
        assertThat(OBVersion.fromString("v4")).isNull();
    }
}