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
package uk.org.openbanking.testsupport.vrp;

import com.forgerock.sapi.gateway.uk.common.shared.api.meta.share.IntentType;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.OBReadRefundAccountEnum;
import uk.org.openbanking.datamodel.vrp.*;

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVrpConsentRequestTestDataFactory.aValidOBDomesticVRPConsentRequest;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVrpConsentRequestTestDataFactory.aValidOBDomesticVRPControlParameters;

public class OBDomesticVRPConsentResponseTestDataFactory {

    public static OBDomesticVRPConsentResponse aValidOBDomesticVRPConsentResponse() {
        OBDomesticVRPConsentRequest consentRequest = aValidOBDomesticVRPConsentRequest();
        return (new OBDomesticVRPConsentResponse())
                .data(aValidOBDomesticVRPConsentResponseData(
                        IntentType.DOMESTIC_VRP_PAYMENT_CONSENT.generateIntentId(),
                        consentRequest.getData())
                )
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentResponse aValidOBDomesticVRPConsentResponse(String consentId) {
        OBDomesticVRPConsentRequest consentRequest = aValidOBDomesticVRPConsentRequest();
        return (new OBDomesticVRPConsentResponse())
                .data(aValidOBDomesticVRPConsentResponseData(consentId, consentRequest.getData()))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentResponse aValidOBDomesticVRPConsentResponse(OBDomesticVRPConsentRequest consentRequest) {
        return (new OBDomesticVRPConsentResponse())
                .data(aValidOBDomesticVRPConsentResponseData(
                        IntentType.DOMESTIC_VRP_PAYMENT_CONSENT.generateIntentId(),
                        consentRequest.getData())
                )
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentResponse aValidOBDomesticVRPConsentResponse(OBDomesticVRPRequest request) {
        return (new OBDomesticVRPConsentResponse())
                .data(aValidOBDomesticVRPConsentResponseData(request.getData()))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentResponse aValidOBDomesticVRPConsentResponse(String consentId, OBDomesticVRPConsentRequest consentRequest) {
        return (new OBDomesticVRPConsentResponse())
                .data(aValidOBDomesticVRPConsentResponseData(consentId, consentRequest.getData()))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentResponseData aValidOBDomesticVRPConsentResponseData(String consentId, OBDomesticVRPConsentRequestData consentRequestData) {
        DateTime now = now();
        return (new OBDomesticVRPConsentResponseData()
                .consentId(consentId)
                .readRefundAccount(consentRequestData.getReadRefundAccount())
                .controlParameters(consentRequestData.getControlParameters())
                .creationDateTime(now)
                .debtorAccount(consentRequestData.getInitiation().getDebtorAccount())
                .initiation(consentRequestData.getInitiation())
        );
    }

    public static OBDomesticVRPConsentResponseData aValidOBDomesticVRPConsentResponseData(OBDomesticVRPRequestData requestData) {
        DateTime now = now();
        return (new OBDomesticVRPConsentResponseData()
                .consentId(requestData.getConsentId())
                .readRefundAccount(OBReadRefundAccountEnum.YES)
                .controlParameters(aValidOBDomesticVRPControlParameters())
                .creationDateTime(now)
                .debtorAccount(requestData.getInitiation().getDebtorAccount())
                .initiation(requestData.getInitiation())
        );
    }
}
