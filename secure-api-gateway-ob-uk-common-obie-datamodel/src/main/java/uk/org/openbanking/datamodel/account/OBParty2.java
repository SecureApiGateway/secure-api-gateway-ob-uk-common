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
package uk.org.openbanking.datamodel.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * OBParty2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBParty2 {

  private String partyId;

  private String partyNumber;

  private OBExternalPartyType1Code partyType;

  private String name;

  private String fullLegalName;

  private String legalStructure;

  private Boolean beneficialOwnership;

  private String accountRole;

  private String emailAddress;

  private String phone;

  private String mobile;

  private OBPartyRelationships1 relationships;

  @Valid
  private List<@Valid OBParty2AddressInner> address;

  public OBParty2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBParty2(String partyId) {
    this.partyId = partyId;
  }

  public OBParty2 partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
   * @return partyId
  */
  @NotNull @Size(min = 1, max = 40) 
  @Schema(name = "PartyId", description = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PartyId")
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public OBParty2 partyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
    return this;
  }

  /**
   * Number assigned by an agent to identify its customer.
   * @return partyNumber
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "PartyNumber", description = "Number assigned by an agent to identify its customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PartyNumber")
  public String getPartyNumber() {
    return partyNumber;
  }

  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }

  public OBParty2 partyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
    return this;
  }

  /**
   * Get partyType
   * @return partyType
  */
  @Valid 
  @Schema(name = "PartyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PartyType")
  public OBExternalPartyType1Code getPartyType() {
    return partyType;
  }

  public void setPartyType(OBExternalPartyType1Code partyType) {
    this.partyType = partyType;
  }

  public OBParty2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
  */
  @Size(min = 1, max = 350) 
  @Schema(name = "Name", description = "Name by which a party is known and which is usually used to identify that party.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBParty2 fullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 350 characters.
   * @return fullLegalName
  */
  @Size(min = 1, max = 350) 
  @Schema(name = "FullLegalName", description = "Specifies a character string with a maximum length of 350 characters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FullLegalName")
  public String getFullLegalName() {
    return fullLegalName;
  }

  public void setFullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
  }

  public OBParty2 legalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
    return this;
  }

  /**
   * Legal standing of the party.
   * @return legalStructure
  */
  
  @Schema(name = "LegalStructure", description = "Legal standing of the party.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LegalStructure")
  public String getLegalStructure() {
    return legalStructure;
  }

  public void setLegalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
  }

  public OBParty2 beneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
    return this;
  }

  /**
   * Get beneficialOwnership
   * @return beneficialOwnership
  */
  
  @Schema(name = "BeneficialOwnership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BeneficialOwnership")
  public Boolean getBeneficialOwnership() {
    return beneficialOwnership;
  }

  public void setBeneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
  }

  public OBParty2 accountRole(String accountRole) {
    this.accountRole = accountRole;
    return this;
  }

  /**
   * A party’s role with respect to the related account.
   * @return accountRole
  */
  
  @Schema(name = "AccountRole", description = "A party’s role with respect to the related account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountRole")
  public String getAccountRole() {
    return accountRole;
  }

  public void setAccountRole(String accountRole) {
    this.accountRole = accountRole;
  }

  public OBParty2 emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Address for electronic mail (e-mail).
   * @return emailAddress
  */
  @Size(min = 1, max = 256) 
  @Schema(name = "EmailAddress", description = "Address for electronic mail (e-mail).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public OBParty2 phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Collection of information that identifies a phone number, as defined by telecom services.
   * @return phone
  */
  @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}") 
  @Schema(name = "Phone", description = "Collection of information that identifies a phone number, as defined by telecom services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OBParty2 mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Collection of information that identifies a mobile phone number, as defined by telecom services.
   * @return mobile
  */
  @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}") 
  @Schema(name = "Mobile", description = "Collection of information that identifies a mobile phone number, as defined by telecom services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mobile")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public OBParty2 relationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
  */
  @Valid 
  @Schema(name = "Relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Relationships")
  public OBPartyRelationships1 getRelationships() {
    return relationships;
  }

  public void setRelationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
  }

  public OBParty2 address(List<@Valid OBParty2AddressInner> address) {
    this.address = address;
    return this;
  }

  public OBParty2 addAddressItem(OBParty2AddressInner addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "Address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Address")
  public List<@Valid OBParty2AddressInner> getAddress() {
    return address;
  }

  public void setAddress(List<@Valid OBParty2AddressInner> address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBParty2 obParty2 = (OBParty2) o;
    return Objects.equals(this.partyId, obParty2.partyId) &&
        Objects.equals(this.partyNumber, obParty2.partyNumber) &&
        Objects.equals(this.partyType, obParty2.partyType) &&
        Objects.equals(this.name, obParty2.name) &&
        Objects.equals(this.fullLegalName, obParty2.fullLegalName) &&
        Objects.equals(this.legalStructure, obParty2.legalStructure) &&
        Objects.equals(this.beneficialOwnership, obParty2.beneficialOwnership) &&
        Objects.equals(this.accountRole, obParty2.accountRole) &&
        Objects.equals(this.emailAddress, obParty2.emailAddress) &&
        Objects.equals(this.phone, obParty2.phone) &&
        Objects.equals(this.mobile, obParty2.mobile) &&
        Objects.equals(this.relationships, obParty2.relationships) &&
        Objects.equals(this.address, obParty2.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, partyNumber, partyType, name, fullLegalName, legalStructure, beneficialOwnership, accountRole, emailAddress, phone, mobile, relationships, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2 {\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullLegalName: ").append(toIndentedString(fullLegalName)).append("\n");
    sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
    sb.append("    beneficialOwnership: ").append(toIndentedString(beneficialOwnership)).append("\n");
    sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

