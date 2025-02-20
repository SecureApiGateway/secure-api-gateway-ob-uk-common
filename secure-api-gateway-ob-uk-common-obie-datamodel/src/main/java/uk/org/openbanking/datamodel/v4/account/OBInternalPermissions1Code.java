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
package uk.org.openbanking.datamodel.v4.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Specifies the Open Banking account access data types. <br /> This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP. <br /> For a full list of enumeration values refer to `OBInternalPermissions1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum OBInternalPermissions1Code {

    READACCOUNTSBASIC("ReadAccountsBasic"),

    READACCOUNTSDETAIL("ReadAccountsDetail"),

    READBALANCES("ReadBalances"),

    READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),

    READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),

    READDIRECTDEBITS("ReadDirectDebits"),

    READOFFERS("ReadOffers"),

    READPAN("ReadPAN"),

    READPARTY("ReadParty"),

    READPARTYPSU("ReadPartyPSU"),

    READPRODUCTS("ReadProducts"),

    READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),

    READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),

    READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),

    READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),

    READSTATEMENTSBASIC("ReadStatementsBasic"),

    READSTATEMENTSDETAIL("ReadStatementsDetail"),

    READTRANSACTIONSBASIC("ReadTransactionsBasic"),

    READTRANSACTIONSCREDITS("ReadTransactionsCredits"),

    READTRANSACTIONSDEBITS("ReadTransactionsDebits"),

    READTRANSACTIONSDETAIL("ReadTransactionsDetail");

    private String value;

    OBInternalPermissions1Code(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBInternalPermissions1Code fromValue(String value) {
        for (OBInternalPermissions1Code b : OBInternalPermissions1Code.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

