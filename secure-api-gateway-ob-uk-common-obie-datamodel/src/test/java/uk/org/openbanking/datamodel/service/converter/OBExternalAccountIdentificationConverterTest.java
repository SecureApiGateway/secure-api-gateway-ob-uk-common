/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.service.converter;

import org.junit.jupiter.api.Test;
import uk.org.openbanking.datamodel.common.OBExternalAccountIdentification2Code;
import uk.org.openbanking.datamodel.common.OBExternalAccountIdentification3Code;
import uk.org.openbanking.datamodel.common.OBExternalAccountIdentification4Code;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.account.OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3;
import static uk.org.openbanking.datamodel.service.converter.account.OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4;

/**
 * Unit test for {@link uk.org.openbanking.datamodel.service.converter.account.OBExternalAccountIdentificationConverter}.
 */
public class OBExternalAccountIdentificationConverterTest {

    @Test
    public void toOBExternalAccountIdentification3_fromOBExternalAccountIdentification4Code() {
        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER))
                .isEqualTo(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER);

        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.IBAN))
                .isEqualTo(OBExternalAccountIdentification3Code.IBAN);

        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.PAN))
                .isEqualTo(OBExternalAccountIdentification3Code.PAN);

        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.BBAN)).isNull();

        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.PAYM)).isNull();
    }

    @Test
    public void toOBExternalAccountIdentification3_fromOBExternalAccountIdentification2Code() {
        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code.SortCodeAccountNumber))
                .isEqualTo(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER);

        assertThat(toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code.IBAN))
                .isEqualTo(OBExternalAccountIdentification3Code.IBAN);
    }

    @Test
    public void toOBExternalAccountIdentification4_fromOBExternalAccountIdentification2Code() {
        assertThat(toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code.SortCodeAccountNumber))
                .isEqualTo(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER);

        assertThat(toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code.IBAN))
                .isEqualTo(OBExternalAccountIdentification4Code.IBAN);
    }

    @Test
    public void toOBExternalAccountIdentification4_fromOBExternalAccountIdentification3Code() {
        assertThat(toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER))
                .isEqualTo(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER);

        assertThat(toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.IBAN))
                .isEqualTo(OBExternalAccountIdentification4Code.IBAN);

        assertThat(toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.PAN))
                .isEqualTo(OBExternalAccountIdentification4Code.PAN);
    }
}
