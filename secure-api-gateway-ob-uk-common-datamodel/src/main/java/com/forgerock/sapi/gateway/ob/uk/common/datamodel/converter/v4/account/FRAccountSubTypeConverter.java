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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRFinancialAccount.FRAccountSubTypeCode;
import uk.org.openbanking.datamodel.v4.account.OBExternalAccountSubType1Code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class FRAccountSubTypeConverter {

    private static final Map<String, String> v3tov4AccountSubType;

    private static final Map<String, String> v4tov3AccountSubType;

    static {
        final Map<String, String> consentAccountSubtypeTransalations = new HashMap<>();
        consentAccountSubtypeTransalations.put("ChargeCard", "CHAR");
        consentAccountSubtypeTransalations.put("CreditCard", "CARD");
        consentAccountSubtypeTransalations.put("CurrentAccount", "CACC");
        consentAccountSubtypeTransalations.put("Loan", "LOAN");
        consentAccountSubtypeTransalations.put("Mortgage", "MORT");
        consentAccountSubtypeTransalations.put("Savings", "SVGS");

        v3tov4AccountSubType = Collections.unmodifiableMap(consentAccountSubtypeTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3AccountSubType = consentAccountSubtypeTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    // FR to OB
    public static OBExternalAccountSubType1Code toOBExternalAccountSubType1Code(FRAccountSubTypeCode status) {
        if (status == null) {
            return null;
        }
        return switch (status) {
            case CHARGECARD -> OBExternalAccountSubType1Code.CHAR;
            case CREDITCARD -> OBExternalAccountSubType1Code.CARD;
            case LOAN -> OBExternalAccountSubType1Code.LOAN;
            case MORTGAGE -> OBExternalAccountSubType1Code.MORT;
            case SAVINGS -> OBExternalAccountSubType1Code.SVGS;
            case CURRENTACCOUNT -> OBExternalAccountSubType1Code.CACC;
            default -> OBExternalAccountSubType1Code.CASH;
        };
    }

    public static OBExternalAccountSubType1Code toOBExternalAccountSubType1CodeV4(String accountSubType) {
        if (v3tov4AccountSubType.containsKey(accountSubType)) {
            return OBExternalAccountSubType1Code.fromValue(v3tov4AccountSubType.get(accountSubType));
        }
        throw new IllegalArgumentException("Unknown consent status: " + accountSubType);
    }

    public static FRAccountSubTypeCode toFRAccountSubTypeCodeV3(String accountSubType) {
        if (v4tov3AccountSubType.containsKey(accountSubType)) {
            return FRAccountSubTypeCode.fromValue(v4tov3AccountSubType.get(accountSubType));
        }
        throw new IllegalArgumentException("Unknown consent status: " + accountSubType);
    }

    //TODO - add for other acccount types
}