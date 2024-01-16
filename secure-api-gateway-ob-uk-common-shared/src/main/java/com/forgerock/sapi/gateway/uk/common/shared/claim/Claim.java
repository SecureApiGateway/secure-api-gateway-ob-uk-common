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
package com.forgerock.sapi.gateway.uk.common.shared.claim;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Claim model, according to the section 5 of the openid connect standard.
 */
public class Claim {

    private boolean essential;
    private List<String> values;

    public Claim(boolean essential, String... values) {
        this.essential = essential;
        this.values = Arrays.asList(values);
    }

    public Claim(boolean essential, List<String> values) {
        this.essential = essential;
        this.values = values;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        if (values.size() == 1) {
            json.put("value", values.get(0));
        } else if (values.size() > 1) {
            JSONArray jsonValues = new JSONArray();
            jsonValues.addAll(values);
            json.put("values", jsonValues);
        }
        json.put("essential", essential);
        return json;
    }

    public boolean isEssential() {
        return essential;
    }

    public List<String> getValues() {
        return values;
    }

    public String getValue() {
        return values.get(0);
    }

    public static Claim parseClaim(JSONObject json) {
        boolean essential = false;
        List<String> values = new ArrayList<>();
        if (json.containsKey("essential")) {
            essential = (boolean) json.get("essential");
        }
        if (json.containsKey("value")) {
            values.add((String) json.get("value"));
        }
        if (json.containsKey("values")) {
            JSONArray array = (JSONArray) json.get("values");
            String[] valuesAsArray = array.toArray(new String[0]);
            values.addAll(Arrays.asList(valuesAsArray));
        }
        return new Claim(essential, values);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Claim)) return false;
        Claim claim = (Claim) o;
        return essential == claim.essential &&
                Objects.equals(values, claim.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(essential, values);
    }
}
