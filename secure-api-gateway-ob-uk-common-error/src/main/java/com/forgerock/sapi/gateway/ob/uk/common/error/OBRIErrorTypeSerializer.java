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
package com.forgerock.sapi.gateway.ob.uk.common.error;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class OBRIErrorTypeSerializer extends JsonSerializer<OBRIErrorType> {
    public OBRIErrorTypeSerializer() {
    }

    public void serialize(OBRIErrorType errorType, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("Name", errorType.name());
        jsonGenerator.writeStringField("HttpStatus", errorType.getHttpStatus().name());
        jsonGenerator.writeStringField("Code", errorType.getCode().getValue());
        jsonGenerator.writeStringField("Message", errorType.getMessage());
        if (errorType.getPath() != null) {
            jsonGenerator.writeStringField("Path", errorType.getPath());
        }

        jsonGenerator.writeEndObject();
    }
}
