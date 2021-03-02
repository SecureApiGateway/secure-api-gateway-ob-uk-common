/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.securebanking.openbanking.uk.common.api.meta;
/**
 * All the constants defined by the Open Banking standard.
 */
public class OBConstants {
    public static final String JWT_BEARER_CLIENT_ASSERTION_TYPE =
            "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    public static final String INTENT_ID_VALUE_PREFIX = "urn:alphabank:intent:";

    public static class IdTokenClaim {
        public static final String INTENT_ID = "openbanking_intent_id";
        public static final String ACR = "acr";
        public static final String C_HASH = "c_hash";
        public static final String S_HASH = "s_hash";
        public static final String ID_TOKEN = "id_token";
        public static final String USER_INFO = "user_info";
        public static final String CLAIMS = "claims";
    }

    public static class AMAccessTokenClaim {
        public static final String CLAIMS = "claims";
        public static final String ID_TOKEN = "id_token";
        public static final String INTENT_ID = "openbanking_intent_id";
    }

    public static class SSOClaim {
        public static final String AUTHORITIES = "authorities";
        public static final String MTLS_SUBJECT_HASH = "mtlsSubjectHash";
    }

    public static class OIDCClaim {
        public static final String GRANT_TYPE = "grant_type";
        public static final String ID_TOKEN = "id_token";
        public static final String USER_INFO = "user_info";
        public static final String CLAIMS = "claims";
        public static final String CONSENT_APPROVAL_REDIRECT_URI = "consentApprovalRedirectUri";
        public static final String RESPONSE_TYPE = "response_type";
        public static final String CLIENT_ID = "client_id";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String REQUEST = "request";
        public static final String SCOPE = "scope";
        public static final String STATE = "state";
        public static final String NONCE = "nonce";
        public static final String SCOPE_REGISTER_PAYMENT = "registerPayment";
        public static final String SCOPE_OPENID = "openid";
        public static final String SCOPE_ACCOUNT = "account";
        public static final String CLIENT_ASSERTION_TYPE = "client_assertion_type";
        public static final String CLIENT_ASSERTION = "client_assertion";
        public static final String CODE = "code";
    }

    public static class RequestParameterClaim {
        public static final String AUD = "aud";
        public static final String SCOPE = "scope";
        public static final String ISS = "iss";
        public static final String CLAIMS = "exp";
        public static final String ID_TOKEN = "id_token";
        public static final String USERINFO = "userinfo";
        public static final String RESPONSE_TYPE = "response_type";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String STATE = "state";
        public static final String EXP = "exp";
        public static final String NONCE = "nonce";
        public static final String CLIENT_ID = "client_id";
    }

    public static class RegistrationTppRequestClaims {
        public static final String SOFTWARE_ID = "software_id";
        public static final String SOFTWARE_STATEMENT = "software_statement";
        public static final String JWKS_URI = "jwks_uri";
        public static final String REDIRECT_URIS = "redirect_uris";
        public static final String APPLICATION_TYPE_WEB = "web";
    }

    public static class AMRegistrationResponseClaims {
        public static final String CLIENT_ID = "client_id";
    }

    public static class OBJwtHeaderClaims {
        public static final String B64 = "b64";
        public static final String OB_ISS = "http://openbanking.org.uk/iss";
        public static final String OB_IAT = "http://openbanking.org.uk/iat";
        public static final String OB_TAN = "http://openbanking.org.uk/tan";
        public static final String CRIT = "crit";
    }

    public static class SSAClaims {
        public static final String SOFTWARE_ID = "software_id";
        public static final String SOFTWARE_CLIENT_ID = "software_client_id";
        public static final String SOFTWARE_CLIENT_DESCRIPTION = "software_client_description";
        public static final String SOFTWARE_CLIENT_NAME = "software_client_name";
        public static final String SOFTWARE_VERSION = "software_version";
        public static final String SOFTWARE_ENVIRONMENT = "software_environment";
        public static final String SOFTWARE_JWKS_ENDPOINT = "software_jwks_endpoint";
        public static final String SOFTWARE_JWKS_REVOKED_ENDPOINT = "software_jwks_revoked_endpoint";
        public static final String SOFTWARE_LOGO_URI = "software_logo_uri";
        public static final String SOFTWARE_MODE = "software_mode";
        public static final String SOFTWARE_ON_BEHALF_OF_ORG = "software_on_behalf_of_org";
        public static final String SOFTWARE_ON_BEHALF_OF_ORG_TYPE = "software_on_behalf_of_org_type";
        public static final String SOFTWARE_POLICY_URI = "software_policy_uri";
        public static final String SOFTWARE_REDIRECT_URIS = "software_redirect_uris";
        public static final String SOFTWARE_ROLES = "software_roles";
        public static final String SOFTWARE_TOS_URI = "software_tos_uri";
        public static final String ORGANISATION_COMPETENT_AUTHORITY_CLAIMS = "organisation_competent_authority_claims";
        public static final String ORG_STATUS = "org_status";
        public static final String ORG_ID = "org_id";
        public static final String ORG_NAME = "org_name";
        public static final String ORG_CONTACTS = "org_contacts";
        public static final String ORG_JWKS_ENDPOINT = "org_jwks_endpoint";
        public static final String ORG_JWKS_REVOKED_ENDPOINT = "org_jwks_revoked_endpoint";
        public static final String OB_REGISTRY_TOS = "ob_registry_tos";
        public static final String SOFTWARE_SIGINING_JWK = "software_signing_jwk";
    }

    public static class AISPContextClaims {
        public static final String ASPSP_SESSION_CONTEXT = "aspspSessionContext";
        public static final String ASPSP_ID = "aspspId";
    }

    public static class EventNotificationClaims {
        public static final String SUBJECT = "subject";
        public static final String SUBJECT_TYPE = "subject_type";
        public static final String RESOURCE_ID = "http://openbanking.org.uk/rid";
        public static final String RESOURCE_LINKS = "http://openbanking.org.uk/rlk";
        public static final String RESOURCE_TYPE = "http://openbanking.org.uk/rty";
        public static final String RESOURCE_LINK = "link";
        public static final String RESOURCE_VERSION = "version";
        public static final String OB_SUBJECT_TYPE = "http://openbanking.org.uk/rid_http://openbanking.org.uk/rty";
        public static final String EVENTS = "events";
        public static final String TRANSACTION_IDENTIFIER = "txn";
        public static final String TIME_OF_EVENT = "toe";
    }

    public static class Scope {
        public static final String ACCOUNT = "account";
        public static final String ACCOUNTS = "accounts";
        public static final String PAYMENTS = "payments";
        public static final String REGISTER_PAYMENT = "registerPayment";
        public static final String OPENID = "openid";
        public static final String AUTHORITY = "authority";
        public static final String GROUP = "group";
        public static final String FUNDS_CONFIRMATIONS = "fundsconfirmations";
        public static final String EVENT_POLLING = "eventpolling";
    }

    public static class ResponseType {
        public static final String CODE = "code";
        public static final String ID_TOKEN = "id_token";
    }

    public static class GrantType {
        public static final String CLIENT_CREDENTIAL = "client_credentials";
        public static final String AUTHORIZATION_CODE = "authorization_code";
    }

    public static class TAN {
        public static final String OB_DIRECTORY = "openbanking.org.uk";
    }
}
