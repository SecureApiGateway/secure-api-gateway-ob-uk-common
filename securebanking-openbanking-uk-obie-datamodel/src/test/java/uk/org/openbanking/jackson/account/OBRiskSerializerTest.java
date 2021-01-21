/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.jackson.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import uk.org.openbanking.datamodel.account.OBRisk2;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for {@link uk.org.openbanking.jackson.account.OBRisk2Serializer}.
 */
public class OBRiskSerializerTest {

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void serialize() throws IOException {

        //Given
        String expectedValue = "{\"foo\":\"bar\"}";

        //When
        OBRisk2 obRisk2 = mapper.readValue(expectedValue, OBRisk2.class);
        String resultValue = mapper.writeValueAsString(obRisk2);

        //Then
        assertThat(expectedValue).isEqualTo(resultValue);
    }
}