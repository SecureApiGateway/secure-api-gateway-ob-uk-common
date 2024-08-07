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

import org.modelmapper.ModelMapper;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRPaymentRisk;

import uk.org.openbanking.datamodel.v3.common.OBRisk1;

/**
 * This is used to wrap a singleton model mapper so config can be set in one place without requiring DI/Spring in a common lib.
 * It also allows null handling to be standard for OB classes and the map method to be static.
 */
public class FRModelMapper {

    private static final ModelMapper modelMapper = new ModelMapper();
    static {
        // Set project wide config here
        modelMapper.getConfiguration().setSkipNullEnabled(true);

        // Custom mapping to handle OBRisk1 typo contractPresentInidicator property
        modelMapper.createTypeMap(OBRisk1.class, FRPaymentRisk.class).addMapping(OBRisk1::getContractPresentInidicator, FRPaymentRisk::setContractPresentIndicator);
        modelMapper.createTypeMap(FRPaymentRisk.class, OBRisk1.class).addMapping(FRPaymentRisk::getContractPresentIndicator, OBRisk1::setContractPresentInidicator);
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
