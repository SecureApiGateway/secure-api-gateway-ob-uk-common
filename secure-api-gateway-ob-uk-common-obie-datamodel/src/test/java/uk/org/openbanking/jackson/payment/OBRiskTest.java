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
package uk.org.openbanking.jackson.payment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.org.openbanking.datamodel.v3.common.OBRisk1;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.io.IOException;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;

/**
 * Unit test for {@link OBRisk1} validation.
 */
public class OBRiskTest {

    private ObjectMapper mapper = new ObjectMapper();
    private Validator validator;

    @BeforeEach
    public void setUp() {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void serialize() throws IOException {
        //Given
        String expectedValue = "{" +
                "\"PaymentContextCode\":\"EcommerceGoods\"," +
                "\"MerchantCategoryCode\":\"5967\"," +
                "\"MerchantCustomerIdentification\":\"053598653254\"," +
                "\"DeliveryAddress\":{" +
                "\"AddressLine\":[" +
                "\"Flat 7\"," +
                "\"Acacia Lodge\"" +
                "]," +
                "\"StreetName\":\"Acacia Avenue\"," +
                "\"BuildingNumber\":\"27\"," +
                "\"PostCode\":\"GU31 2ZZ\"," +
                "\"TownName\":\"Sparsholt\"," +
                "\"CountrySubDivision\":\"Wessex\"," +
                "\"Country\":\"UK\"" +
                "}" +
                "}";

        //When
        OBRisk1 obRisk1 = mapper.readValue(expectedValue, OBRisk1.class);
        Set<ConstraintViolation<OBRisk1>> violations = validator.validate(obRisk1);
        assertThat(violations.isEmpty()).isTrue();
        String resultValue = mapper.writeValueAsString(obRisk1);

        //Then
        assertThat(expectedValue).isEqualTo(resultValue);
    }

    @Test
    public void paymentContextCodeNotSpecified() throws IOException {
        //Given
        String expectedValue = "{" +
                "\"MerchantCategoryCode\":\"5967\"," +
                "\"MerchantCustomerIdentification\":\"053598653254\"," +
                "\"DeliveryAddress\":{" +
                "\"AddressLine\":[" +
                "\"Flat 7\"," +
                "\"Acacia Lodge\"" +
                "]," +
                "\"StreetName\":\"Acacia Avenue\"," +
                "\"BuildingNumber\":\"27\"," +
                "\"PostCode\":\"GU31 2ZZ\"," +
                "\"TownName\":\"Sparsholt\"," +
                "\"CountrySubDivision\":\"Wessex\"," +
                "\"Country\":\"UK\"" +
                "}" +
                "}";

        //When
        OBRisk1 obRisk1 = mapper.readValue(expectedValue, OBRisk1.class);
        Set<ConstraintViolation<OBRisk1>> violations = validator.validate(obRisk1);
        assertThat(violations.isEmpty()).isTrue();
        String resultValue = mapper.writeValueAsString(obRisk1);

        //Then
        assertThat(expectedValue).isEqualTo(resultValue);
    }

    @Test
    public void testInvalidPaymentContext() {
        //Given
        String expectedValue = "{" +
                "\"PaymentContextCode\":\"wrongValue\"," +
                "\"MerchantCategoryCode\":\"5967\"," +
                "\"MerchantCustomerIdentification\":\"053598653254\"," +
                "\"DeliveryAddress\":{" +
                "\"AddressLine\":[" +
                "\"Flat 7\"," +
                "\"Acacia Lodge\"" +
                "]," +
                "\"StreetName\":\"Acacia Avenue\"," +
                "\"BuildingNumber\":\"27\"," +
                "\"PostCode\":\"GU31 2ZZ\"," +
                "\"TownName\":\"Sparsholt\"," +
                "\"CountrySubDivision\":\"Wessex\"," +
                "\"Country\":\"UK\"" +
                "}" +
                "}";

        //When
        ValueInstantiationException exception = catchThrowableOfType(() -> mapper.readValue(expectedValue, OBRisk1.class),
                ValueInstantiationException.class);

        // Then
        assertThat(exception.getMessage()).contains("Cannot construct instance of " +
                "`uk.org.openbanking.datamodel.v3.common.OBExternalPaymentContext1Code`");
    }
}
