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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.account;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FRAccountWithBalance extends FRAccount {

    private List<FRCashBalance> balances;

    public FRAccountWithBalance(FRAccount account, List<FRCashBalance> balances) {
        super(account.getId(),
                account.getUserId(),
                account.getAccount(),
                account.getLatestStatementId(),
                account.getCreated(),
                account.getUpdated());
        this.balances = balances;
    }
}
