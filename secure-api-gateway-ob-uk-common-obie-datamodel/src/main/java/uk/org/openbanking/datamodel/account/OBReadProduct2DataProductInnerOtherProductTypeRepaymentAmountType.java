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
package uk.org.openbanking.datamodel.account;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBReadProduct2DataProductInnerOtherProductTypeRepaymentAmountType {

    RABD("RABD"),

    RABL("RABL"),

    RACI("RACI"),

    RAFC("RAFC"),

    RAIO("RAIO"),

    RALT("RALT"),

    USOT("USOT");

    private String value;

    OBReadProduct2DataProductInnerOtherProductTypeRepaymentAmountType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBReadProduct2DataProductInnerOtherProductTypeRepaymentAmountType fromValue(String value) {
        for (OBReadProduct2DataProductInnerOtherProductTypeRepaymentAmountType b : OBReadProduct2DataProductInnerOtherProductTypeRepaymentAmountType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

