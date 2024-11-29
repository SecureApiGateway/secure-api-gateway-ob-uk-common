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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.testsupport.payment;

import java.util.Collections;
import java.util.List;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRExternalCreditorReferenceTypeCode;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRReferredDocumentInformation;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformation;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformationStructured;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformationStructuredCreditorReferenceInformation;

/**
 * Test data factory for {@link FRRemittanceInformation}
 */
public class FRRemittanceInformationTestDataFactory {

    public static FRRemittanceInformation aValidFRRemittanceInformation() {
        return FRRemittanceInformation.builder()
                .reference("123456")
                .structured(Collections.singletonList(FRRemittanceInformationStructured.builder()
                        .referredDocumentInformation((List<FRReferredDocumentInformation>) FRRemittanceInformationStructuredCreditorReferenceInformation.builder()
                                .code(FRExternalCreditorReferenceTypeCode.DISP)
                                .issuer("ab")
                                .reference("ref")
                                .build())
                        .referredDocumentAmount(2)
                        .creditorReferenceInformation(FRRemittanceInformationStructuredCreditorReferenceInformation.builder()
                                .code(FRExternalCreditorReferenceTypeCode.DISP)
                                .issuer("ab")
                                .reference("ref")
                                .build())
                        .invoicer("abcd")
                        .invoicee("wxyz")
                        .taxRemittance("blah")
                        .additionalRemittanceInformation(Collections.singletonList("etc"))
                        .build()))
                .unstructured(List.of("INV.001"))
                .build();
    }
}
