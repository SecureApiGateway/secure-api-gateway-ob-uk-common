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
package uk.org.openbanking.jackson.v3.account;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import uk.org.openbanking.datamodel.v3.account.OBRisk2;

import java.io.IOException;

public class OBRisk2Deserializer extends StdDeserializer<OBRisk2> {

    public OBRisk2Deserializer() {
        this(null);
    }

    public OBRisk2Deserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public OBRisk2 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String data = jsonParser.readValueAsTree().toString();
        OBRisk2 obRisk2 = new OBRisk2();
        obRisk2.setData(data);
        return obRisk2;
    }
}
