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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.mapper;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.ConversionUtils.convertListToSingleString;

import java.util.List;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common.FRPostalAddressConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPaymentRisk;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPostalAddress;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRRemittanceInformation;

import uk.org.openbanking.datamodel.v3.common.OBPostalAddress6;
import uk.org.openbanking.datamodel.v3.common.OBRisk1;
import uk.org.openbanking.datamodel.v3.payment.OBWriteDomestic2DataInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPRemittanceInformation;
import uk.org.openbanking.datamodel.v4.common.OBPostalAddress7;

/**
 * This is used to wrap a singleton model mapper so config can be set in one place without requiring DI/Spring in a common lib.
 * It also allows null handling to be standard for OB classes and the map method to be static.
 */
public class FRModelMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    private static final Converter<String, List<String>> STRING_TO_LIST_CONVERTER = context -> context.getSource() == null ? null : List.of(context.getSource());
    private static final Converter<List<String>, String> LIST_TO_SINGLE_STRING_CONVERTER = context -> convertListToSingleString(context.getSource());

    static {
        // Set project wide config here
        modelMapper.getConfiguration().setSkipNullEnabled(true);

        // Custom mapping to handle OBRisk1 typo contractPresentInidicator property
        modelMapper.createTypeMap(OBRisk1.class, FRPaymentRisk.class).addMapping(OBRisk1::getContractPresentInidicator, FRPaymentRisk::setContractPresentIndicator);
        modelMapper.createTypeMap(FRPaymentRisk.class, OBRisk1.class).addMapping(FRPaymentRisk::getContractPresentIndicator, OBRisk1::setContractPresentInidicator);

        modelMapper.createTypeMap(FRRemittanceInformation.class, OBWriteDomestic2DataInitiationRemittanceInformation.class)
                   .addMappings(mapper -> mapper.using(LIST_TO_SINGLE_STRING_CONVERTER)
                                                .map(FRRemittanceInformation::getUnstructured,
                                                     OBWriteDomestic2DataInitiationRemittanceInformation::setUnstructured));

        modelMapper.createTypeMap(OBWriteDomestic2DataInitiationRemittanceInformation.class, FRRemittanceInformation.class)
                .addMappings(mapper -> mapper.using(STRING_TO_LIST_CONVERTER)
                                             .map(OBWriteDomestic2DataInitiationRemittanceInformation::getUnstructured,
                                                  FRRemittanceInformation::setUnstructured));

        modelMapper.createTypeMap(FRRemittanceInformation.class, OBDomesticVRPInitiationRemittanceInformation.class)
                   .addMappings(mapper -> mapper.using(LIST_TO_SINGLE_STRING_CONVERTER)
                                                .map(FRRemittanceInformation::getUnstructured,
                                                     OBDomesticVRPInitiationRemittanceInformation::setUnstructured));

        modelMapper.createTypeMap(OBDomesticVRPInitiationRemittanceInformation.class, FRRemittanceInformation.class)
                .addMappings(mapper -> mapper.using(STRING_TO_LIST_CONVERTER)
                                             .map(OBDomesticVRPInitiationRemittanceInformation::getUnstructured,
                                                  FRRemittanceInformation::setUnstructured));

        modelMapper.createTypeMap(FRRemittanceInformation.class, OBVRPRemittanceInformation.class)
                   .addMappings(mapper -> mapper.using(LIST_TO_SINGLE_STRING_CONVERTER)
                                                .map(FRRemittanceInformation::getUnstructured,
                                                     OBVRPRemittanceInformation::setUnstructured));

        modelMapper.createTypeMap(OBVRPRemittanceInformation.class, FRRemittanceInformation.class)
                .addMappings(mapper -> mapper.using(STRING_TO_LIST_CONVERTER)
                                             .map(OBVRPRemittanceInformation::getUnstructured,
                                                  FRRemittanceInformation::setUnstructured));

        // Register converters which map between address types
        modelMapper.addConverter(context -> FRPostalAddressConverter.toOBPostalAddress6(context.getSource()), FRPostalAddress.class, OBPostalAddress6.class);
        modelMapper.addConverter(context -> FRPostalAddressConverter.toFRPostalAddress(context.getSource()), OBPostalAddress6.class, FRPostalAddress.class);
        modelMapper.addConverter(context -> FRPostalAddressConverter.toOBPostalAddress7(context.getSource()), FRPostalAddress.class, OBPostalAddress7.class);
        modelMapper.addConverter(context -> FRPostalAddressConverter.toFRPostalAddress(context.getSource()), OBPostalAddress7.class, FRPostalAddress.class);

    }

    /**
     * Recommended to only use this for classes with identical members (of which there are many in OB SDK!) with default mapping behaviour as this
     * avoids a lot of complexity and errors from mapping configs.
     * @param source Source
     * @param clazz Target type
     * @param <T> Target type
     * @param <V> Source type
     * @return Target
     */
    public static  <T,V> T map(V source, Class<T> clazz) {
        if (source==null) return null;
        return modelMapper.map(source, clazz);
    }
}
