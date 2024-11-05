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

import java.util.List;
import java.util.stream.Collectors;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.mapper.FRModelMapper;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.payment.FRRegulatoryReporting;

import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.v4.payment.OBRegulatoryReporting1;

public class FRRegulatoryReportingConverter {

    // OB to FR
    public static FRRegulatoryReporting toFRRegulatoryReporting(OBRegulatoryReporting1 regulatoryReporting) {
        return (FRRegulatoryReporting) FRModelMapper.map(regulatoryReporting, FRRegulatoryReporting.class);
    }

    public static FRRegulatoryReporting toFRRegulatoryReportingVrp(uk.org.openbanking.datamodel.v4.vrp.OBRegulatoryReporting1 regulatoryReporting) {
        return (FRRegulatoryReporting) FRModelMapper.map(regulatoryReporting, FRRegulatoryReporting.class);
    }

    @Size(max = 10)
    public static List<FRRegulatoryReporting> toFRRegulatoryReporting(List<OBRegulatoryReporting1> regulatoryReportings) {
        return regulatoryReportings == null ? null : (List) regulatoryReportings.stream().map(FRRegulatoryReportingConverter::toFRRegulatoryReporting).collect(Collectors.toList());
    }

    @Size(max = 10)
    public static List<FRRegulatoryReporting> toFRRegulatoryReportingVrp(List<uk.org.openbanking.datamodel.v4.vrp.OBRegulatoryReporting1> regulatoryReportings) {
        return regulatoryReportings == null ? null : (List) regulatoryReportings.stream().map(FRRegulatoryReportingConverter::toFRRegulatoryReportingVrp).collect(Collectors.toList());
    }

    // FR to OB
    public static OBRegulatoryReporting1 toOBRegulatoryReporting1(FRRegulatoryReporting regulatoryReporting) {
        return (OBRegulatoryReporting1) FRModelMapper.map(regulatoryReporting, OBRegulatoryReporting1.class);
    }

    public static uk.org.openbanking.datamodel.v4.vrp.OBRegulatoryReporting1 toOBRegulatoryReporting1Vrp(FRRegulatoryReporting regulatoryReporting) {
        return (uk.org.openbanking.datamodel.v4.vrp.OBRegulatoryReporting1) FRModelMapper.map(regulatoryReporting, uk.org.openbanking.datamodel.v4.vrp.OBRegulatoryReporting1.class);
    }

    @Size(max = 10)
    public static List<OBRegulatoryReporting1> toOBRegulatoryReporting1(List<FRRegulatoryReporting> regulatoryReportings) {
        return regulatoryReportings == null ? null : (List) regulatoryReportings.stream().map(FRRegulatoryReportingConverter::toOBRegulatoryReporting1).collect(Collectors.toList());
    }

    @Size(max = 10)
    public static List<uk.org.openbanking.datamodel.v4.vrp.OBRegulatoryReporting1> toOBRegulatoryReporting1Vrp(List<FRRegulatoryReporting> regulatoryReportings) {
        return regulatoryReportings == null ? null : (List) regulatoryReportings.stream().map(FRRegulatoryReportingConverter::toOBRegulatoryReporting1Vrp).collect(Collectors.toList());
    }

}
