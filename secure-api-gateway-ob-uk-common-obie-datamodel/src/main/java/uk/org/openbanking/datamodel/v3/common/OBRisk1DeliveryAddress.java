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
package uk.org.openbanking.datamodel.v3.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Information that locates and identifies a specific address, as defined by postal services or in free format text.
 */
@ApiModel(description = "Information that locates and identifies a specific address, as defined by postal services or in free format text.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBRisk1DeliveryAddress   {
  @JsonProperty("AddressLine")
  @Valid
  private List<String> addressLine = null;

  @JsonProperty("StreetName")
  private String streetName;

  @JsonProperty("BuildingNumber")
  private String buildingNumber;

  @JsonProperty("PostCode")
  private String postCode;

  @JsonProperty("TownName")
  private String townName;

  @JsonProperty("CountrySubDivision")
  private String countrySubDivision;

  @JsonProperty("Country")
  private String country;

  public OBRisk1DeliveryAddress addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBRisk1DeliveryAddress addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<String>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  */
  @ApiModelProperty(value = "")

@Size(min=0,max=2) 
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBRisk1DeliveryAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
  */
  @ApiModelProperty(value = "Name of a street or thoroughfare.")

@Size(min=1,max=70) 
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBRisk1DeliveryAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
  */
  @ApiModelProperty(value = "Number that identifies the position of a building on a street.")

@Size(min=1,max=16) 
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBRisk1DeliveryAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
  */
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")

@Size(min=1,max=16) 
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBRisk1DeliveryAddress townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
  */
  @ApiModelProperty(required = true, value = "Name of a built-up area, with defined boundaries, and a local government.")
  @NotNull

@Size(min=1,max=35) 
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBRisk1DeliveryAddress countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
  */
  @ApiModelProperty(value = "Identifies a subdivision of a country such as state, region, county.")

@Size(min=1,max=35) 
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBRisk1DeliveryAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government.
   * @return country
  */
  @ApiModelProperty(required = true, value = "Nation with its own government.")
  @NotNull

@Pattern(regexp="^[A-Z]{2,2}$") 
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
    OBRisk1DeliveryAddress obRisk1DeliveryAddress = (OBRisk1DeliveryAddress) o;
    return Objects.equals(this.addressLine, obRisk1DeliveryAddress.addressLine) &&
        Objects.equals(this.streetName, obRisk1DeliveryAddress.streetName) &&
        Objects.equals(this.buildingNumber, obRisk1DeliveryAddress.buildingNumber) &&
        Objects.equals(this.postCode, obRisk1DeliveryAddress.postCode) &&
        Objects.equals(this.townName, obRisk1DeliveryAddress.townName) &&
        Objects.equals(this.countrySubDivision, obRisk1DeliveryAddress.countrySubDivision) &&
        Objects.equals(this.country, obRisk1DeliveryAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, streetName, buildingNumber, postCode, townName, countrySubDivision, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRisk1DeliveryAddress {\n");
    
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

