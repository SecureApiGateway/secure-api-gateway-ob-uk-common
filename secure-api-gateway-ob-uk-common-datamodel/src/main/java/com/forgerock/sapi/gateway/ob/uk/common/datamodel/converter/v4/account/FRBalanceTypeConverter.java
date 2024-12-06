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

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRBalanceType;
import uk.org.openbanking.datamodel.v4.account.OBBalanceType1Code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class FRBalanceTypeConverter {

    private static final Map<String, String> v3tov4BalanceType;

    private static final Map<String, String> v4tov3BalanceType;

    static {
        final Map<String, String> consentBalanceTypeTransalations = new HashMap<>();
        consentBalanceTypeTransalations.put("ClosingAvailable", "CLAV");
        consentBalanceTypeTransalations.put("ClosingBooked", "CLBD");
        consentBalanceTypeTransalations.put("Expected", "XPCD");
        consentBalanceTypeTransalations.put("ForwardAvailable", "FWAV");
        consentBalanceTypeTransalations.put("Information", "INFO");
        consentBalanceTypeTransalations.put("InterimAvailable", "ITAV");
        consentBalanceTypeTransalations.put("InterimBooked", "ITBD");
        consentBalanceTypeTransalations.put("OpeningAvailable", "OPAV");
        consentBalanceTypeTransalations.put("OpeningBooked", "OPBD");
        consentBalanceTypeTransalations.put("PreviouslyClosedBooked", "PRCD");

        v3tov4BalanceType = Collections.unmodifiableMap(consentBalanceTypeTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3BalanceType = consentBalanceTypeTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    // FR to OB
    public static OBBalanceType1Code toOBBalanceType1Code(FRBalanceType balanceType) {
        if (balanceType == null) {
            return null;
        }
        return switch (balanceType) {
            case CLOSINGAVAILABLE -> OBBalanceType1Code.CLAV;
            case CLOSINGBOOKED -> OBBalanceType1Code.CLBD;
            case EXPECTED -> OBBalanceType1Code.XPCD;
            case FORWARDAVAILABLE -> OBBalanceType1Code.FWAV;
            case INFORMATION -> OBBalanceType1Code.INFO;
            case INTERIMBOOKED -> OBBalanceType1Code.ITBD;
            case OPENINGAVAILABLE -> OBBalanceType1Code.OPAV;
            case OPENINGBOOKED -> OBBalanceType1Code.OPBD;
            case PREVIOUSLYCLOSEDBOOKED -> OBBalanceType1Code.PRCD;
            default -> OBBalanceType1Code.ITAV;
        };
    }

    public static OBBalanceType1Code toOBBalanceType1CodeV4(String balanceType) {
        if (v3tov4BalanceType.containsKey(balanceType)) {
            return OBBalanceType1Code.fromValue(v3tov4BalanceType.get(balanceType));
        }
        throw new IllegalArgumentException("Unknown balanceType: " + balanceType);
    }

    public static FRBalanceType toFRBalanceTypeV3(String balanceType) {
        if (v4tov3BalanceType.containsKey(balanceType)) {
            return FRBalanceType.fromValue(v4tov3BalanceType.get(balanceType));
        }
        throw new IllegalArgumentException("Unknown balanceType: " + balanceType);
    }

    //TODO - add for other balance Types
}