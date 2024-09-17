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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRegulatoryAuthorityConverter.toFRRegulatoryAuthority;
import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v4.common.FRRegulatoryAuthorityConverter.toOBRegulatoryAuthority2;
import static java.util.stream.Collectors.toList;

import java.util.List;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRRegulatoryReporting;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRStructuredRegulatoryReporting;

import uk.org.openbanking.datamodel.v4.payment.OBRegulatoryReporting1;
import uk.org.openbanking.datamodel.v4.payment.OBRegulatoryReporting1DebitCreditReportingIndicator;
import uk.org.openbanking.datamodel.v4.payment.OBStructuredRegulatoryReporting3;

public class FRRegulatoryReportingConverter {

    // OB to FR
    public static FRRegulatoryReporting toFRRegulatoryReporting(OBRegulatoryReporting1 regulatoryReporting) {
        return regulatoryReporting == null ? null : FRRegulatoryReporting.builder()
                .debitCreditReportingIndicator(toFRRegulatoryReportingDebitCreditReportingIndicator(regulatoryReporting.getDebitCreditReportingIndicator()))
                .authority(toFRRegulatoryAuthority(regulatoryReporting.getAuthority()))
                .details((toFRStructuredRegulatoryReporting(regulatoryReporting.getDetails())))
                .build();
    }

    public static FRRegulatoryReporting.FRRegulatoryReportingDebitCreditReportingIndicator toFRRegulatoryReportingDebitCreditReportingIndicator(OBRegulatoryReporting1DebitCreditReportingIndicator debitCreditReportingIndicator) {
        return debitCreditReportingIndicator == null ? null : FRRegulatoryReporting.FRRegulatoryReportingDebitCreditReportingIndicator.valueOf(debitCreditReportingIndicator.name());
    }

    public static FRStructuredRegulatoryReporting toFRStructuredRegulatoryReporting(OBStructuredRegulatoryReporting3 obStructuredRegulatoryReporting) {
        return FRModelMapper.map(obStructuredRegulatoryReporting, FRStructuredRegulatoryReporting.class);
    }

    public static List<FRStructuredRegulatoryReporting> toFRStructuredRegulatoryReporting(List<OBStructuredRegulatoryReporting3> obStructuredRegulatoryReportings) {
        if (obStructuredRegulatoryReportings == null) {
            return null;
        }
        return obStructuredRegulatoryReportings.stream().map(FRRegulatoryReportingConverter::toFRStructuredRegulatoryReporting).collect(toList());
    }

    // FR to OB
    public static OBRegulatoryReporting1 toOBRegulatoryReporting1(FRRegulatoryReporting regulatoryReporting) {
        return regulatoryReporting == null ? null : new OBRegulatoryReporting1()
                .debitCreditReportingIndicator(toOBRegulatoryReporting1DebitCreditReportingIndicator(regulatoryReporting.getDebitCreditReportingIndicator()))
                .authority(toOBRegulatoryAuthority2(regulatoryReporting.getAuthority()))
                .details(toOBStructuredRegulatoryReporting3(regulatoryReporting.getDetails()));
    }

    public static OBRegulatoryReporting1DebitCreditReportingIndicator toOBRegulatoryReporting1DebitCreditReportingIndicator(FRRegulatoryReporting.FRRegulatoryReportingDebitCreditReportingIndicator debitCreditReportingIndicator) {
        return debitCreditReportingIndicator == null ? null : OBRegulatoryReporting1DebitCreditReportingIndicator.valueOf(debitCreditReportingIndicator.name());
    }

    public static OBStructuredRegulatoryReporting3 toOBStructuredRegulatoryReporting3(FRStructuredRegulatoryReporting frRegulatoryReporting) {
        return FRModelMapper.map(frRegulatoryReporting, OBStructuredRegulatoryReporting3.class);
    }

    public static List<OBStructuredRegulatoryReporting3> toOBStructuredRegulatoryReporting3(List<FRStructuredRegulatoryReporting> frRegulatoryReportings) {
        if (frRegulatoryReportings == null) {
            return null;
        }
        return frRegulatoryReportings.stream().map(FRRegulatoryReportingConverter::toOBStructuredRegulatoryReporting3).collect(toList());
    }
}
