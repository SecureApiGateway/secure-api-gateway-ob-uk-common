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
package uk.org.openbanking.datamodel.v4.account;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Set of elements to describe the card instrument used in the transaction.
 */

@Schema(name = "OBTransactionCardInstrument1", description = "Set of elements to describe the card instrument used in the transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBTransactionCardInstrument1 {

    private OBTransactionCardInstrument1CardSchemeName cardSchemeName;

    private OBTransactionCardInstrument1AuthorisationType authorisationType;

    private String name;

    private String identification;

    public OBTransactionCardInstrument1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBTransactionCardInstrument1(OBTransactionCardInstrument1CardSchemeName cardSchemeName) {
        this.cardSchemeName = cardSchemeName;
    }

    public OBTransactionCardInstrument1 cardSchemeName(OBTransactionCardInstrument1CardSchemeName cardSchemeName) {
        this.cardSchemeName = cardSchemeName;
        return this;
    }

    /**
     * Get cardSchemeName
     *
     * @return cardSchemeName
     */
    @NotNull
    @Valid
    @Schema(name = "CardSchemeName", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CardSchemeName")
    public OBTransactionCardInstrument1CardSchemeName getCardSchemeName() {
        return cardSchemeName;
    }

    public void setCardSchemeName(OBTransactionCardInstrument1CardSchemeName cardSchemeName) {
        this.cardSchemeName = cardSchemeName;
    }

    public OBTransactionCardInstrument1 authorisationType(OBTransactionCardInstrument1AuthorisationType authorisationType) {
        this.authorisationType = authorisationType;
        return this;
    }

    /**
     * Get authorisationType
     *
     * @return authorisationType
     */
    @Valid
    @Schema(name = "AuthorisationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AuthorisationType")
    public OBTransactionCardInstrument1AuthorisationType getAuthorisationType() {
        return authorisationType;
    }

    public void setAuthorisationType(OBTransactionCardInstrument1AuthorisationType authorisationType) {
        this.authorisationType = authorisationType;
    }

    public OBTransactionCardInstrument1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the cardholder using the card instrument.
     *
     * @return name
     */
    @Size(min = 1, max = 70)
    @Schema(name = "Name", description = "Name of the cardholder using the card instrument.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBTransactionCardInstrument1 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
     *
     * @return identification
     */
    @Size(min = 1, max = 34)
    @Schema(name = "Identification", description = "Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransactionCardInstrument1 obTransactionCardInstrument1 = (OBTransactionCardInstrument1) o;
        return Objects.equals(this.cardSchemeName, obTransactionCardInstrument1.cardSchemeName) &&
                Objects.equals(this.authorisationType, obTransactionCardInstrument1.authorisationType) &&
                Objects.equals(this.name, obTransactionCardInstrument1.name) &&
                Objects.equals(this.identification, obTransactionCardInstrument1.identification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardSchemeName, authorisationType, name, identification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransactionCardInstrument1 {\n");
        sb.append("    cardSchemeName: ").append(toIndentedString(cardSchemeName)).append("\n");
        sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

