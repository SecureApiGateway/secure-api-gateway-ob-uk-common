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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.account;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRTransactionData.FREntryStatus;
import uk.org.openbanking.datamodel.v4.account.ExternalEntryStatus1Code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class FREntryStatusConverter {

    private static final Map<String, String> v3tov4EntryStatus;

    private static final Map<String, String> v4tov3EntryStatus;

    static {
        final Map<String, String> entryStatusTransalations = new HashMap<>();
       entryStatusTransalations.put("Booked", "BOOK");
       entryStatusTransalations.put("Pending", "PDNG");

        v3tov4EntryStatus = Collections.unmodifiableMap(entryStatusTransalations);
        // v4 is the inverse of the v3 mappings
        v4tov3EntryStatus =entryStatusTransalations.entrySet().stream().collect(toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    // FR to OB
    public static ExternalEntryStatus1Code toExternalEntryStatus1Code(FREntryStatus entryStatus) {
        if (entryStatus == null) {
            return null;
        }
        return switch (entryStatus) {
            case PENDING -> ExternalEntryStatus1Code.PDNG;
            default -> ExternalEntryStatus1Code.BOOK;
        };
    }

    public static ExternalEntryStatus1Code toExternalEntryStatus1CodeV4(String entryStatus) {
        if (v3tov4EntryStatus.containsKey(entryStatus)) {
            return ExternalEntryStatus1Code.fromValue(v3tov4EntryStatus.get(entryStatus));
        }
        throw new IllegalArgumentException("Unknown entry Status: " + entryStatus);
    }

    public static FREntryStatus toFREntryStatusV3(String entryStatus) {
        if (v4tov3EntryStatus.containsKey(entryStatus)) {
            return FREntryStatus.fromValue(v4tov3EntryStatus.get(entryStatus));
        }
        throw new IllegalArgumentException("Unknown entry Status: " + entryStatus);
    }

    //TODO - add for other entry Status
}