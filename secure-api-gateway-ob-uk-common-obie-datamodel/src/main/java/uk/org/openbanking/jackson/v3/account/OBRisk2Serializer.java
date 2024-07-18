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
package uk.org.openbanking.jackson.v3.account;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import uk.org.openbanking.datamodel.v3.account.OBRisk2;

import java.io.IOException;

public class OBRisk2Serializer extends StdSerializer<OBRisk2> {

    public OBRisk2Serializer() {
        this(null);
    }

    public OBRisk2Serializer(Class<OBRisk2> t) {
        super(t);
    }

    @Override
    public void serialize(OBRisk2 obRisk2, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = mapper.readTree(obRisk2.getData());
        jsonGenerator.writeObject(actualObj);
    }
}
