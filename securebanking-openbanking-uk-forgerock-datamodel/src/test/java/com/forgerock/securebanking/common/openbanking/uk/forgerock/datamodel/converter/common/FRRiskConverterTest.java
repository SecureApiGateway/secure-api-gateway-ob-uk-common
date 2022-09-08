package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRPaymentRisk;

import uk.org.openbanking.datamodel.common.OBRisk1;
import uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory;

class FRRiskConverterTest {

    @Test
    void shouldConvertOBRisk1() {
        final OBRisk1[] testData = new OBRisk1[] {
                OBRisk1TestDataFactory.aValidOBRisk1(),
                OBRisk1TestDataFactory.aValidOBRisk1MandatoryFields()
        };

        for (OBRisk1 obRisk : testData) {
            // Encode, Decode, then validate we got back to the original
            final FRPaymentRisk frRisk = FRRiskConverter.toFRPaymentRisk(obRisk);
            assertEquals(obRisk, FRRiskConverter.toOBRisk1(frRisk));
        }
    }

}