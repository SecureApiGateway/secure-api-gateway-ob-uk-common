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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment;

import java.util.List;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAccountIdentifier;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRAmount;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRFinancialAgent;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPostalAddress;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformation;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRSupplementaryData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an equivalent object in the OB data model. It is stored within mongo (instead of the OB object), in order
 * to make it easier to introduce new versions of the Read/Write API.
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
public class FRWriteDomesticDataInitiation implements FRDomesticDataInitiation {

    private String instructionIdentification;
    private String endToEndIdentification;
    private String localInstrument;
    private FRAmount instructedAmount;
    private FRAccountIdentifier debtorAccount;
    private FRAccountIdentifier creditorAccount;
    private FRPostalAddress creditorPostalAddress;
    private FRRemittanceInformation remittanceInformation;
    private FRSupplementaryData supplementaryData;

    // V4 area
    private FRFinancialAgent creditorAgent;
    private FRFinancialAgent ultimateCreditor;
    private FRFinancialAgent ultimateDebtor;
    private List<FRRegulatoryReporting> regulatoryReporting;
}
