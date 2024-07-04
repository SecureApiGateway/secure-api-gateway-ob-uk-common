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

import static org.assertj.core.api.Assertions.assertThat;

import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

class JwsClaimsUtilsTest {

    @Test
    void shouldParseClaims() throws ParseException {
        final String intentId = "intent-123";
        final SignedJWT jwt = jwtWithOidcClaimsBlock(intentId);

        final Claims claims = JwsClaimsUtils.getClaims(jwt);

        final Map<String, Claim> idTokenClaims = claims.getIdTokenClaims();
        assertThat(idTokenClaims).isNotNull();
        assertThat(idTokenClaims.get("acr")).isEqualTo(new Claim(true, "urn:openbanking:psd2:sca"));
        assertThat(idTokenClaims.get("openbanking_intent_id")).isEqualTo(new Claim(true, intentId));
        final Map<String, Claim> userInfoClaims = claims.getUserInfoClaims();
        assertThat(userInfoClaims).isNotNull();
        assertThat(userInfoClaims.get("openbanking_intent_id")).isEqualTo(new Claim(true, intentId));
        assertThat(userInfoClaims.get("example_list_of_values")).isEqualTo(new Claim(true, "value1", "value2"));
    }

    public static SignedJWT jwtWithOidcClaimsBlock(String intentId) {
        String payload = "{\n" +
                "\"clientId\":\"client-123\"," +
                "\"iss\":\"https://test-issuer\"," +
                "\"aud\":\"test-aud\"," +
                // OIDC claims, id_token and userinfo are parsed into a Claims object.
                "\"claims\":{" +
                    "\"id_token\":{" +
                        "\"acr\":{" +
                            "\"value\":\"urn:openbanking:psd2:sca\"," +
                            "\"essential\":true" +
                        "}," +
                        "\"openbanking_intent_id\":{" +
                            "\"value\":\"" + intentId + "\"," +
                            "\"essential\":true" +
                        "}" +
                    "}," +
                    "\"userinfo\":{" +
                        "\"openbanking_intent_id\":{" +
                            "\"value\":\"" + intentId + "\"," +
                            "\"essential\":true" +
                        "}," +
                        "\"example_list_of_values\":{" +
                            "\"values\": [" + "\"value1\",\"value2\"]," +
                            "\"essential\":true" +
                        "}" +
                    "}" +
                "}," +
                "\"scopes\":{" +
                    "\"accounts\":\"accounts\"," +
                    "\"openid\":\"openid\"," +
                    "\"payments\":\"payments\"" +
                "}" +
            "}";
        try {
            SignedJWT signedJwt = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), JWTClaimsSet.parse(payload));
            final SecureRandom random = new SecureRandom();
            signedJwt.sign(new MACSigner(random.generateSeed(256)));
            return signedJwt;
        } catch (JOSEException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

}