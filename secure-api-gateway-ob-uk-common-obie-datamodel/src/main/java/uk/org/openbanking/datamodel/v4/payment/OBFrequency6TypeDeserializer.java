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
package uk.org.openbanking.datamodel.v4.payment;

import uk.org.openbanking.datamodel.utils.StringEnumOneOfDeserializer;

/**
 * Jackson deserialiser for {@code OBFrequency6Type} (payment package).
 * See {@link StringEnumOneOfDeserializer} for the rationale.
 */
public class OBFrequency6TypeDeserializer extends StringEnumOneOfDeserializer<Object> {

    @Override
    protected Object fromValue(String value) {
        return OBFrequency6Code.fromValue(value);
    }
}
