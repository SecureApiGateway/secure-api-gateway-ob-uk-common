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
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import uk.org.openbanking.datamodel.common.OBAddressTypeCode;

/**
 * Postal address of a party.
 */

@Schema(name = "OBParty2_Address_inner", description = "Postal address of a party.")
@JsonTypeName("OBParty2_Address_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBParty2AddressInner {

  private OBAddressTypeCode addressType;

  @Valid
  private List<@Size(min = 1, max = 70)String> addressLine;

  private String streetName;

  private String buildingNumber;

  private String postCode;

  private String townName;

  private String countrySubDivision;

  private String country;

  public OBParty2AddressInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBParty2AddressInner(String country) {
    this.country = country;
  }

  public OBParty2AddressInner addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  */
  @Valid 
  @Schema(name = "AddressType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressType")
  public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBParty2AddressInner addressLine(List<@Size(min = 1, max = 70)String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBParty2AddressInner addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  */
  @Size(min = 0, max = 5) 
  @Schema(name = "AddressLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressLine")
  public List<@Size(min = 1, max = 70)String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<@Size(min = 1, max = 70)String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBParty2AddressInner streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
  */
  @Size(min = 1, max = 70) 
  @Schema(name = "StreetName", description = "Name of a street or thoroughfare.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StreetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBParty2AddressInner buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
  */
  @Size(min = 1, max = 16) 
  @Schema(name = "BuildingNumber", description = "Number that identifies the position of a building on a street.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildingNumber")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBParty2AddressInner postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  */
  @Size(min = 1, max = 16) 
  @Schema(name = "PostCode", description = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBParty2AddressInner townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "TownName", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TownName")
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBParty2AddressInner countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country eg, state, region, county.
   * @return countrySubDivision
  */
  @Size(min = 1, max = 35) 
  @Schema(name = "CountrySubDivision", description = "Identifies a subdivision of a country eg, state, region, county.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CountrySubDivision")
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBParty2AddressInner country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  */
  @NotNull @Pattern(regexp = "^[A-Z]{2,2}$") 
  @Schema(name = "Country", description = "Nation with its own government, occupying a particular territory.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBParty2AddressInner obParty2AddressInner = (OBParty2AddressInner) o;
    return Objects.equals(this.addressType, obParty2AddressInner.addressType) &&
        Objects.equals(this.addressLine, obParty2AddressInner.addressLine) &&
        Objects.equals(this.streetName, obParty2AddressInner.streetName) &&
        Objects.equals(this.buildingNumber, obParty2AddressInner.buildingNumber) &&
        Objects.equals(this.postCode, obParty2AddressInner.postCode) &&
        Objects.equals(this.townName, obParty2AddressInner.townName) &&
        Objects.equals(this.countrySubDivision, obParty2AddressInner.countrySubDivision) &&
        Objects.equals(this.country, obParty2AddressInner.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, addressLine, streetName, buildingNumber, postCode, townName, countrySubDivision, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2AddressInner {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

