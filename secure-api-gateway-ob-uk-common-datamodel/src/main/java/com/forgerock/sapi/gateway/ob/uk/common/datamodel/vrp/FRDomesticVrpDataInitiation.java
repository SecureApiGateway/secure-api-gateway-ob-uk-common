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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPostalAddress;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformation;

/**
 * Represents the values that are common across the various domestic payment "initiation" objects.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FRWriteDomesticVrpDataInitiation.class, name = "FRWriteDomesticVRPDataInitiation")
})
public interface FRDomesticVrpDataInitiation {
    FRAccountIdentifier getDebtorAccount();

    FRAccountIdentifier getCreditorAccount();

    FRPostalAddress getCreditorPostalAddress();

    FRRemittanceInformation getRemittanceInformation();
}
