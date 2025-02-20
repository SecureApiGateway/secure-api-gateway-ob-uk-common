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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Stream;

/**
 * Represents {@code OBCreditLine1} in the OB data model. It is stored within mongo (instead of the OB object),
 * in order to make it easier to introduce new versions of the Read/Write API.
 *
 * <p>
 * Note that this object is used across multiple versions of the Read/Write API, meaning that some values won't be
 * populated. For this reason it is a mutable {@link Data} rather than an immutable {@link lombok.Value} one.
 * </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRCreditLine {

    private Boolean included;
    private FRLimitType type;
    private FRAmount amount;

    public enum FRLimitType {
        AVAILABLE("Available"),
        CREDIT("Credit"),
        EMERGENCY("Emergency"),
        PRE_AGREED("Pre-Agreed"),
        TEMPORARY("Temporary");

        private String value;

        FRLimitType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @JsonValue
        public String toString() {
            return value;
        }

        @JsonCreator
        public static FRLimitType fromValue(String value) {
            return Stream.of(values())
                    .filter(type -> type.getValue().equals(value))
                    .findFirst()
                    .orElse(null);
        }
    }
}
