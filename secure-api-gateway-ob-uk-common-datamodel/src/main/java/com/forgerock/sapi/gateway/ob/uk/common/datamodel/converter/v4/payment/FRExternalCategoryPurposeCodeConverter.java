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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.payment;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRExternalCategoryPurposeCode;

import uk.org.openbanking.datamodel.v4.common.ExternalCategoryPurpose1Code;

public class FRExternalCategoryPurposeCodeConverter {

    // OB to FR
    public static FRExternalCategoryPurposeCode toFRExternalCategoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
        return categoryPurposeCode == null ? null : FRExternalCategoryPurposeCode.fromValue(categoryPurposeCode.getValue());
    }

    // FR to OB
    public static ExternalCategoryPurpose1Code toExternalCategoryPurpose1Code(FRExternalCategoryPurposeCode categoryPurposeCode) {
        return categoryPurposeCode == null ? null : ExternalCategoryPurpose1Code.fromValue(categoryPurposeCode.getValue());
    }
}
