/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.common;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.account.FRLinks;
import org.junit.jupiter.api.Test;
import uk.org.openbanking.datamodel.common.Links;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

class FRLinksConverterTest {

    @Test
    void testConvertToFRLinks() {
        final Links links = new Links();
        links.setFirst(URI.create("file://blah"));
        links.setLast(URI.create("https://google.co.uk"));

        final FRLinks frLinks = FRLinksConverter.toFRLinks(links);
        assertEquals("file://blah", frLinks.getFirst());
        assertNull(frLinks.getNext());
        assertNull(frLinks.getPrev());
        assertEquals("https://google.co.uk", frLinks.getLast());

        final Links convertedBackToLinks = FRLinksConverter.toLinks(frLinks);
        assertEquals(links, convertedBackToLinks);
    }
}
