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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.funds;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents {@code OBFundsConfirmationData1} in the OB data model. Note that
 * {@code OBFundsConfirmation1} is skipped in this domain model since it only contains {@code OBFundsConfirmationData1}.
 *
 * <p>
 * This class is stored within mongo (instead of the OB model), in order to make it easier to introduce new versions of
 * the Read/Write API.
 * </p>
 *
 * <p>
 * Note that this object is used across multiple versions of the Read/Write API, meaning that some values won't be
 * populated. For this reason it is a mutable {@link Data} rather than an immutable {@link lombok.Value} one.
 * </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRFundsConfirmationData {

    private String consentId;
    private String reference;
    private FRAmount instructedAmount;
}
