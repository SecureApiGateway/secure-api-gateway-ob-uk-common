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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.account.FRLinks;
import uk.org.openbanking.datamodel.common.Links;

import java.net.URI;

public class FRLinksConverter {

    // OB to FR
    public static FRLinks toFRLinks(Links links) {
        return links == null ? null : FRLinks.builder()
                .self(uriToStringOrNull(links.getSelf()))
                .first(uriToStringOrNull(links.getFirst()))
                .prev(uriToStringOrNull(links.getPrev()))
                .next(uriToStringOrNull(links.getNext()))
                .last(uriToStringOrNull(links.getLast()))
                .build();
    }

    private static String uriToStringOrNull(URI uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    // FR to OB
    public static Links toLinks(FRLinks links) {
        return links == null ? null : new Links()
                .self(stringToUriOrNull(links.getSelf()))
                .first(stringToUriOrNull(links.getFirst()))
                .prev(stringToUriOrNull(links.getPrev()))
                .next(stringToUriOrNull(links.getNext()))
                .last(stringToUriOrNull(links.getLast()));
    }

    private static URI stringToUriOrNull(String str) {
        if (str == null) {
            return null;
        }
        return URI.create(str);
    }
}
