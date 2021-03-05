/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents the values that are common across the various domestic payment "initiation" objects.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type"
)
@JsonSubTypes({
        @Type(value = FRWriteDomesticDataInitiation.class, name = "FRWriteDomesticDataInitiation"),
        @Type(value = FRWriteDomesticScheduledDataInitiation.class, name = "FRWriteDomesticScheduledDataInitiation"),
        @Type(value = FRWriteDomesticStandingOrderDataInitiation.class, name = "FRWriteDomesticStandingOrderDataInitiation")
})
public interface FRDomesticDataInitiation {

    FRAccountIdentifier getDebtorAccount();

    FRAccountIdentifier getCreditorAccount();

    FRSupplementaryData getSupplementaryData();
}
