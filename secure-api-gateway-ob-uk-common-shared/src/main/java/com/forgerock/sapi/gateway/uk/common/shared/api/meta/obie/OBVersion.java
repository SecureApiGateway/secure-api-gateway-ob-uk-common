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

import lombok.extern.slf4j.Slf4j;

import org.springframework.util.StringUtils;

/**
 * Represents the API versions on the OB sandbox.
 */
@Slf4j
public enum OBVersion {
    v1_0,
    v1_1,
    v2_0,
    v3_0,
    v3_1,
    v3_1_1,
    v3_1_2,
    v3_1_3,
    v3_1_4,
    v3_1_5,
    v3_1_6,
    v3_1_7,
    v3_1_8,
    v3_1_9,
    v3_1_10,
    v3_1_11,
    v4_0_0;

    /**
     * Provides the OBversion object if exist <br/>
     * Accepts formats 'vX.X.X' and 'X.X.X'
     *
     * @param version string representation
     * @return the version Enum object
     */
    public static OBVersion fromString(String version) {
        try {
            if (StringUtils.hasText(version)) {
                if (!version.startsWith("v")) {
                    version = "v".concat(version);
                }
                return OBVersion.valueOf(
                        version.replace(".", "_")
                                .toLowerCase()
                );
            }
        } catch (IllegalArgumentException e) {
            log.debug("No match found for {} in enum: {}", version, OBVersion.class.getName(), e);
        }
        return null;
    }

    public boolean isBeforeVersion(OBVersion version) {
        return this.ordinal() < version.ordinal();
    }

    public boolean isAfterVersion(OBVersion version) {
        return this.ordinal() > version.ordinal();
    }

    /**
     * Provides the canonical value of version stripping 'v' and replacing '_' for '.'
     *
     * @return canonical string version formatted to x.x.x
     */
    public String getCanonicalVersion() {
        return this.name().substring(1).replace("_", ".");
    }

    /**
     * Provides the canonical Enum name replacing '_' for '.'
     *
     * @return canonical Enum name formatted to vX.X.X
     */
    public String getCanonicalName() {
        return this.name().replace("_", ".");
    }

}
