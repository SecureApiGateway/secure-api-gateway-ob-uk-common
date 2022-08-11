/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.openbanking.uk.common.api.meta.forgerock;

import java.time.OffsetDateTime;

public enum FRQuarterType {
    ENGLISH(
            OffsetDateTime.now().withMonth(3).withDayOfMonth(25),
            OffsetDateTime.now().withMonth(6).withDayOfMonth(24),
            OffsetDateTime.now().withMonth(9).withDayOfMonth(29),
            OffsetDateTime.now().withMonth(12).withDayOfMonth(25)
    ),
    SCOTTISH(
            OffsetDateTime.now().withMonth(2).withDayOfMonth(2),
            OffsetDateTime.now().withMonth(5).withDayOfMonth(15),
            OffsetDateTime.now().withMonth(8).withDayOfMonth(1),
            OffsetDateTime.now().withMonth(11).withDayOfMonth(11)
    ),
    RECEIVED(
            OffsetDateTime.now().withMonth(3).withDayOfMonth(20),
            OffsetDateTime.now().withMonth(6).withDayOfMonth(19),
            OffsetDateTime.now().withMonth(9).withDayOfMonth(24),
            OffsetDateTime.now().withMonth(12).withDayOfMonth(20)
    );

    private final OffsetDateTime quarter1;
    private final OffsetDateTime quarter2;
    private final OffsetDateTime quarter3;
    private final OffsetDateTime quarter4;

    FRQuarterType(OffsetDateTime quarter1, OffsetDateTime quarter2, OffsetDateTime quarter3, OffsetDateTime quarter4) {
        this.quarter1 = quarter1;
        this.quarter2 = quarter2;
        this.quarter3 = quarter3;
        this.quarter4 = quarter4;
    }

    public OffsetDateTime getQuarter1() {
        return quarter1;
    }

    public OffsetDateTime getQuarter2() {
        return quarter2;
    }

    public OffsetDateTime getQuarter3() {
        return quarter3;
    }

    public OffsetDateTime getQuarter4() {
        return quarter4;
    }

    public static FRQuarterType fromQuarterTypeString(String quarterStr) {
        for (FRQuarterType quarterType : FRQuarterType.values()) {
            if (quarterType.name().equals(quarterStr)) {
                return quarterType;
            }
        }
        throw new IllegalArgumentException("Quarter type value not found: " + quarterStr);
    }

    public boolean matchOneQuarter(OffsetDateTime date) {
        return matchDayOfMonthAndMonth(date, quarter1)
                || matchDayOfMonthAndMonth(date, quarter2)
                || matchDayOfMonthAndMonth(date, quarter3)
                || matchDayOfMonthAndMonth(date, quarter4);
    }

    private boolean matchDayOfMonthAndMonth(OffsetDateTime date, OffsetDateTime quarter) {
        return date.getDayOfMonth() == quarter.getDayOfMonth()
                 && date.getMonth() == quarter.getMonth();
    }
}