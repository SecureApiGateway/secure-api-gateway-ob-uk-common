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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRDomesticVrpInstruction {
    @JsonProperty("InstructionIdentification")
    private String instructionIdentification;
    @JsonProperty("EndToEndIdentification")
    private String endToEndIdentification;
    @JsonProperty("RemittanceInformation")
    private FRRemittanceInformation remittanceInformation;
    @JsonProperty("LocalInstrument")
    private String localInstrument;
    @JsonProperty("InstructedAmount")
    private FRAmount instructedAmount;
    @JsonProperty("CreditorPostalAddress")
    private FRPostalAddress creditorPostalAddress;
    @JsonProperty("CreditorAccount")
    private FRAccountIdentifier creditorAccount;
    @JsonProperty("SupplementaryData")
    private FRSupplementaryData supplementaryData;
    @JsonProperty("UltimateCreditor")
    private FRFinancialAgent ultimateCreditor;
}
