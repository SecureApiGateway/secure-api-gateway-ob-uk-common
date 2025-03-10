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
package uk.org.openbanking.datamodel.v3.discovery;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = GenericOBDiscoveryAPILinks.class, name = "GenericOBDiscoveryAPILinks"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksAccount1.class, name = "OBDiscoveryAPILinksAccount1"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksAccount2.class, name = "OBDiscoveryAPILinksAccount2"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksAccount3.class, name = "OBDiscoveryAPILinksAccount3"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksPayment1.class, name = "OBDiscoveryAPILinksPayment1"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksPayment3.class, name = "OBDiscoveryAPILinksPayment3"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksPayment4.class, name = "OBDiscoveryAPILinksPayment4"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksVrpPayment.class, name = "OBDiscoveryAPILinksVrpPayment"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksFundsConfirmation3.class, name = "OBDiscoveryAPILinksFundsConfirmation3"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksEventNotification3.class, name = "OBDiscoveryAPILinksEventNotification3"),
        @JsonSubTypes.Type(value = OBDiscoveryAPILinksEventNotification4.class, name = "OBDiscoveryAPILinksEventNotification4"),
})
@ApiModel(description = "Endpoints corresponding to a specific version")
public interface OBDiscoveryAPILinks {

}
