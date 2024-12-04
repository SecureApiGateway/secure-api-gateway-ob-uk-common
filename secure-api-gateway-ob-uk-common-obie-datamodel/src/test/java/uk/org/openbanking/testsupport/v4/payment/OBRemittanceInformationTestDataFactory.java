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
package uk.org.openbanking.testsupport.v4.payment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.joda.time.DateTime;

import uk.org.openbanking.datamodel.v4.common.ExternalCreditorReferenceType1Code;
import uk.org.openbanking.datamodel.v4.common.ExternalDocumentType1Code;
import uk.org.openbanking.datamodel.v4.payment.OBReferredDocumentInformation;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformation2;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformationStructured;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformationStructuredCreditorReferenceInformation;

/**
 * Test data factory for the various OB classes representing payment remittance information.
 */
public class OBRemittanceInformationTestDataFactory {

    public static OBRemittanceInformation2 aValidOBRemittanceInformation2() {
        return (new OBRemittanceInformation2())
                .unstructured(List.of("INV.001"))
                .structured(Collections.singletonList(aValidOBRemittanceInformationStructured()));
    }

    public static OBRemittanceInformationStructured aValidOBRemittanceInformationStructured() {
        return (new OBRemittanceInformationStructured())
                .referredDocumentInformation(Collections.singletonList(aValidOBReferredDocumentInformation()))
                .referredDocumentAmount(1)
                .creditorReferenceInformation(aValidOBRemittanceInformationStructuredCreditorReferenceInformation())
                .invoicee("INVE5161856")
                .invoicer("INVR51856")
                .taxRemittance("Tax Remittance related information")
                .additionalRemittanceInformation(Collections.singletonList("Free text for additional information"));
    }

    public static OBReferredDocumentInformation aValidOBReferredDocumentInformation() {
        return (new OBReferredDocumentInformation())
                .code(ExternalDocumentType1Code.CINV)
                .issuer("Issuer01")
                .number("Number_01")
                .relatedDate(DateTime.now())
                .lineDetails(new ArrayList<>((Arrays.asList("Line1", "Line2"))));
    }

    private static OBRemittanceInformationStructuredCreditorReferenceInformation aValidOBRemittanceInformationStructuredCreditorReferenceInformation() {
        return (new OBRemittanceInformationStructuredCreditorReferenceInformation())
                .code(ExternalCreditorReferenceType1Code.DISP)
                .issuer("Issuer01")
                .reference("REF_26518");
    }
}
