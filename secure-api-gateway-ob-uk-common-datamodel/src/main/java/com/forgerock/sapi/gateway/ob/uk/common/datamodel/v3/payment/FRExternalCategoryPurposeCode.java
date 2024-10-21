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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.v3.payment;

import java.util.stream.Stream;

public enum FRExternalCategoryPurposeCode {
    BONU("BONU"),
    CASH("CASH"),
    CBLK("CBLK"),
    CCRD("CCRD"),
    CGWV("CGWV"),
    CIPC("CIPC"),
    CONC("CONC"),
    CORT("CORT"),
    DCRD("DCRD"),
    DIVI("DIVI"),
    DVPM("DVPM"),
    EPAY("EPAY"),
    FCDT("FCDT"),
    FCIN("FCIN"),
    FCOL("FCOL"),
    GOVT("GOVT"),
    GP2P("GP2P"),
    HEDG("HEDG"),
    ICCP("ICCP"),
    IDCP("IDCP"),
    INTC("INTC"),
    INTE("INTE"),
    LBOX("LBOX"),
    LOAN("LOAN"),
    MP2B("MP2B"),
    MP2P("MP2P"),
    OTHR("OTHR"),
    PENS("PENS"),
    RPRE("RPRE"),
    RRCT("RRCT"),
    RVPM("RVPM"),
    SALA("SALA"),
    SECU("SECU"),
    SSBE("SSBE"),
    SUPP("SUPP"),
    SWEP("SWEP"),
    TAXS("TAXS"),
    TOPG("TOPG"),
    TRAD("TRAD"),
    TREA("TREA"),
    VATX("VATX"),
    VOST("VOST"),
    WHLD("WHLD"),
    ZABA("ZABA");

    private final String value;

    FRExternalCategoryPurposeCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return value;
    }

    public static FRExternalCategoryPurposeCode fromValue(String value) {
        return Stream.of(values())
                .filter(code -> code.getValue().equals(value))
                .findFirst()
                .orElse(null);
    }
}
