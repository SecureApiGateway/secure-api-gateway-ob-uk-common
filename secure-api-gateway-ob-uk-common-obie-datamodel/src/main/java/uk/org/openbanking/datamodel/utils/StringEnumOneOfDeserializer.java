/*
 * Copyright © 2020-2026 Ping Identity Corporation (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Base for Jackson deserialisers of oneOf interfaces whose implementations
 * are string-valued enums serialised via {@code @JsonValue} — e.g.
 * {@code OBFrequency6Type}, the oneOf behind {@code OBFrequency6.Type} from
 * spec revision 4r4 onward (oneOf of {@code OBFrequency6Code} and
 * {@code Frequency_1}).
 *
 * OB's oneOf schemas carry no discriminator, so the generator emits an empty
 * interface that Jackson cannot deserialise, and adding type-info annotations
 * to the interface would change the wire format (verified empirically: the
 * enum serialises as a plain string via {@code @JsonValue}, and type-info
 * wrapping breaks that).
 *
 * This deserialiser preserves the plain-string wire format: the JSON value is
 * read as a string and converted with the target enum's {@code fromValue}.
 * Only the OB codeset arm is exercised today; when the gateway starts
 * accepting ISO {@code Frequency_1} values, add the branch here.
 *
 * NOT generated: lives beside EqualityVerificationUtil as a hand-written
 * helper. If OB later adds a discriminator to a oneOf schema, prefer the
 * generator's own type-info annotations and retire these classes.
 */
public abstract class StringEnumOneOfDeserializer<T> extends JsonDeserializer<Object> {

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getValueAsString();
        if (value == null) {
            return null;
        }
        try {
            return fromValue(value);
        } catch (IllegalArgumentException e) {
            throw new IOException("Unknown oneOf enum value: " + value, e);
        }
    }

    protected abstract Object fromValue(String value);
}
