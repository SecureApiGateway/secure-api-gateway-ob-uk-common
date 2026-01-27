/*
 * Copyright © 2020-2026 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.v4.common;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 */

@Schema(name = "OBRisk1", description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRisk1 {

    private OBRisk1PaymentContextCode paymentContextCode;

    private String merchantCategoryCode;

    private String merchantCustomerIdentification;

    private Boolean contractPresentIndicator;

    private Boolean beneficiaryPrepopulatedIndicator;

    private ExternalPurpose1Code paymentPurposeCode;

    private ExternalCategoryPurpose1Code categoryPurposeCode;

    private OBInternalExtendedAccountType1Code beneficiaryAccountType;

    private OBPostalAddress7 deliveryAddress;

    public OBRisk1 paymentContextCode(OBRisk1PaymentContextCode paymentContextCode) {
        this.paymentContextCode = paymentContextCode;
        return this;
    }

    /**
     * Get paymentContextCode
     *
     * @return paymentContextCode
     */
    @Valid
    @Schema(name = "PaymentContextCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PaymentContextCode")
    public OBRisk1PaymentContextCode getPaymentContextCode() {
        return paymentContextCode;
    }

    public void setPaymentContextCode(OBRisk1PaymentContextCode paymentContextCode) {
        this.paymentContextCode = paymentContextCode;
    }

    public OBRisk1 merchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
    }

    /**
     * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
     *
     * @return merchantCategoryCode
     */
    @Size(min = 3, max = 4)
    @Schema(name = "MerchantCategoryCode", description = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MerchantCategoryCode")
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public OBRisk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
        this.merchantCustomerIdentification = merchantCustomerIdentification;
        return this;
    }

    /**
     * The unique customer identifier of the PSU with the merchant.
     *
     * @return merchantCustomerIdentification
     */
    @Size(min = 1, max = 70)
    @Schema(name = "MerchantCustomerIdentification", description = "The unique customer identifier of the PSU with the merchant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MerchantCustomerIdentification")
    public String getMerchantCustomerIdentification() {
        return merchantCustomerIdentification;
    }

    public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
        this.merchantCustomerIdentification = merchantCustomerIdentification;
    }

    public OBRisk1 contractPresentIndicator(Boolean contractPresentIndicator) {
        this.contractPresentIndicator = contractPresentIndicator;
        return this;
    }

    /**
     * Indicates if Payee has a contractual relationship with the PISP.
     *
     * @return contractPresentIndicator
     */

    @Schema(name = "ContractPresentIndicator", description = "Indicates if Payee has a contractual relationship with the PISP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ContractPresentIndicator")
    public Boolean getContractPresentIndicator() {
        return contractPresentIndicator;
    }

    public void setContractPresentIndicator(Boolean contractPresentIndicator) {
        this.contractPresentIndicator = contractPresentIndicator;
    }

    public OBRisk1 beneficiaryPrepopulatedIndicator(Boolean beneficiaryPrepopulatedIndicator) {
        this.beneficiaryPrepopulatedIndicator = beneficiaryPrepopulatedIndicator;
        return this;
    }

    /**
     * Indicates if PISP has immutably prepopulated payment details in for the PSU.
     *
     * @return beneficiaryPrepopulatedIndicator
     */

    @Schema(name = "BeneficiaryPrepopulatedIndicator", description = "Indicates if PISP has immutably prepopulated payment details in for the PSU.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BeneficiaryPrepopulatedIndicator")
    public Boolean getBeneficiaryPrepopulatedIndicator() {
        return beneficiaryPrepopulatedIndicator;
    }

    public void setBeneficiaryPrepopulatedIndicator(Boolean beneficiaryPrepopulatedIndicator) {
        this.beneficiaryPrepopulatedIndicator = beneficiaryPrepopulatedIndicator;
    }

    public OBRisk1 paymentPurposeCode(ExternalPurpose1Code paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
        return this;
    }

    /**
     * Get paymentPurposeCode
     *
     * @return paymentPurposeCode
     */
    @Valid
    @Schema(name = "PaymentPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PaymentPurposeCode")
    public ExternalPurpose1Code getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    public void setPaymentPurposeCode(ExternalPurpose1Code paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
    }

    public OBRisk1 categoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
        this.categoryPurposeCode = categoryPurposeCode;
        return this;
    }

    /**
     * Get categoryPurposeCode
     *
     * @return categoryPurposeCode
     */
    @Valid
    @Schema(name = "CategoryPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CategoryPurposeCode")
    public ExternalCategoryPurpose1Code getCategoryPurposeCode() {
        return categoryPurposeCode;
    }

    public void setCategoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
        this.categoryPurposeCode = categoryPurposeCode;
    }

    public OBRisk1 beneficiaryAccountType(OBInternalExtendedAccountType1Code beneficiaryAccountType) {
        this.beneficiaryAccountType = beneficiaryAccountType;
        return this;
    }

    /**
     * Get beneficiaryAccountType
     *
     * @return beneficiaryAccountType
     */
    @Valid
    @Schema(name = "BeneficiaryAccountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BeneficiaryAccountType")
    public OBInternalExtendedAccountType1Code getBeneficiaryAccountType() {
        return beneficiaryAccountType;
    }

    public void setBeneficiaryAccountType(OBInternalExtendedAccountType1Code beneficiaryAccountType) {
        this.beneficiaryAccountType = beneficiaryAccountType;
    }

    public OBRisk1 deliveryAddress(OBPostalAddress7 deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    /**
     * Get deliveryAddress
     *
     * @return deliveryAddress
     */
    @Valid
    @Schema(name = "DeliveryAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DeliveryAddress")
    public OBPostalAddress7 getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(OBPostalAddress7 deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRisk1 obRisk1 = (OBRisk1) o;
        return Objects.equals(this.paymentContextCode, obRisk1.paymentContextCode) &&
                Objects.equals(this.merchantCategoryCode, obRisk1.merchantCategoryCode) &&
                Objects.equals(this.merchantCustomerIdentification, obRisk1.merchantCustomerIdentification) &&
                Objects.equals(this.contractPresentIndicator, obRisk1.contractPresentIndicator) &&
                Objects.equals(this.beneficiaryPrepopulatedIndicator, obRisk1.beneficiaryPrepopulatedIndicator) &&
                Objects.equals(this.paymentPurposeCode, obRisk1.paymentPurposeCode) &&
                Objects.equals(this.categoryPurposeCode, obRisk1.categoryPurposeCode) &&
                Objects.equals(this.beneficiaryAccountType, obRisk1.beneficiaryAccountType) &&
                Objects.equals(this.deliveryAddress, obRisk1.deliveryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, contractPresentIndicator, beneficiaryPrepopulatedIndicator, paymentPurposeCode, categoryPurposeCode, beneficiaryAccountType, deliveryAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRisk1 {\n");
        sb.append("    paymentContextCode: ").append(toIndentedString(paymentContextCode)).append("\n");
        sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
        sb.append("    merchantCustomerIdentification: ").append(toIndentedString(merchantCustomerIdentification)).append("\n");
        sb.append("    contractPresentIndicator: ").append(toIndentedString(contractPresentIndicator)).append("\n");
        sb.append("    beneficiaryPrepopulatedIndicator: ").append(toIndentedString(beneficiaryPrepopulatedIndicator)).append("\n");
        sb.append("    paymentPurposeCode: ").append(toIndentedString(paymentPurposeCode)).append("\n");
        sb.append("    categoryPurposeCode: ").append(toIndentedString(categoryPurposeCode)).append("\n");
        sb.append("    beneficiaryAccountType: ").append(toIndentedString(beneficiaryAccountType)).append("\n");
        sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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

