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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */

@Schema(name = "OBPostalAddress7", description = "Information that locates and identifies a specific address, as defined by postal services.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBPostalAddress7 {

    private OBAddressType2Code addressType;

    private String department;

    private String subDepartment;

    private String streetName;

    private String buildingNumber;

    private String buildingName;

    private String floor;

    private String unitNumber;

    private String room;

    private String postBox;

    private String townLocationName;

    private String districtName;

    private String careOf;

    private String postCode;

    private String townName;

    private String countrySubDivision;

    private String country;

    @Valid
    private List<@Size(min = 1, max = 70) String> addressLine;

    public OBPostalAddress7 addressType(OBAddressType2Code addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Get addressType
     *
     * @return addressType
     */
    @Valid
    @Schema(name = "AddressType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AddressType")
    public OBAddressType2Code getAddressType() {
        return addressType;
    }

    public void setAddressType(OBAddressType2Code addressType) {
        this.addressType = addressType;
    }

    public OBPostalAddress7 department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Identification of a division of a large organisation or building.
     *
     * @return department
     */
    @Size(min = 1, max = 70)
    @Schema(name = "Department", description = "Identification of a division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public OBPostalAddress7 subDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
        return this;
    }

    /**
     * Identification of a sub-division of a large organisation or building.
     *
     * @return subDepartment
     */
    @Size(min = 1, max = 70)
    @Schema(name = "SubDepartment", description = "Identification of a sub-division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SubDepartment")
    public String getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
    }

    public OBPostalAddress7 streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * Name of a street or thoroughfare.
     *
     * @return streetName
     */
    @Size(min = 1, max = 140)
    @Schema(name = "StreetName", description = "Name of a street or thoroughfare.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("StreetName")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public OBPostalAddress7 buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }

    /**
     * Number that identifies the position of a building on a street.
     *
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

    public OBPostalAddress7 buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    /**
     * Name of a referenced building.
     *
     * @return buildingName
     */
    @Size(min = 1, max = 140)
    @Schema(name = "BuildingName", description = "Name of a referenced building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("BuildingName")
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public OBPostalAddress7 floor(String floor) {
        this.floor = floor;
        return this;
    }

    /**
     * Number that identifies the level within a building
     *
     * @return floor
     */
    @Size(min = 1, max = 70)
    @Schema(name = "Floor", description = "Number that identifies the level within a building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Floor")
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public OBPostalAddress7 unitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
        return this;
    }

    /**
     * Number that identifies the unit of a specific address .
     *
     * @return unitNumber
     */
    @Size(min = 1, max = 16)
    @Schema(name = "UnitNumber", description = "Number that identifies the unit of a specific address .", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UnitNumber")
    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public OBPostalAddress7 room(String room) {
        this.room = room;
        return this;
    }

    /**
     * Information that locates and identifies a room to form part of an address
     *
     * @return room
     */
    @Size(min = 1, max = 70)
    @Schema(name = "Room", description = "Information that locates and identifies a room to form part of an address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Room")
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public OBPostalAddress7 postBox(String postBox) {
        this.postBox = postBox;
        return this;
    }

    /**
     * Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.
     *
     * @return postBox
     */
    @Size(min = 1, max = 16)
    @Schema(name = "PostBox", description = "Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PostBox")
    public String getPostBox() {
        return postBox;
    }

    public void setPostBox(String postBox) {
        this.postBox = postBox;
    }

    public OBPostalAddress7 townLocationName(String townLocationName) {
        this.townLocationName = townLocationName;
        return this;
    }

    /**
     * Name of a built-up area, with defined boundaries, and a local government.
     *
     * @return townLocationName
     */
    @Size(min = 1, max = 140)
    @Schema(name = "TownLocationName", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TownLocationName")
    public String getTownLocationName() {
        return townLocationName;
    }

    public void setTownLocationName(String townLocationName) {
        this.townLocationName = townLocationName;
    }

    public OBPostalAddress7 districtName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    /**
     * Number that of the regional area, known as a district, which forms part of an address
     *
     * @return districtName
     */
    @Size(min = 1, max = 140)
    @Schema(name = "DistrictName", description = "Number that of the regional area, known as a district, which forms part of an address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DistrictName")
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public OBPostalAddress7 careOf(String careOf) {
        this.careOf = careOf;
        return this;
    }

    /**
     * The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.
     *
     * @return careOf
     */
    @Size(min = 1, max = 140)
    @Schema(name = "CareOf", description = "The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CareOf")
    public String getCareOf() {
        return careOf;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

    public OBPostalAddress7 postCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    /**
     * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
     *
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

    public OBPostalAddress7 townName(String townName) {
        this.townName = townName;
        return this;
    }

    /**
     * Name of a built-up area, with defined boundaries, and a local government.
     *
     * @return townName
     */
    @Size(min = 1, max = 140)
    @Schema(name = "TownName", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("TownName")
    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public OBPostalAddress7 countrySubDivision(String countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
        return this;
    }

    /**
     * Identifies a subdivision of a country such as state, region, county.
     *
     * @return countrySubDivision
     */
    @Size(min = 1, max = 35)
    @Schema(name = "CountrySubDivision", description = "Identifies a subdivision of a country such as state, region, county.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CountrySubDivision")
    public String getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(String countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    public OBPostalAddress7 country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Nation with its own government.
     *
     * @return country
     */
    @Pattern(regexp = "^[A-Z]{2,2}$")
    @Schema(name = "Country", description = "Nation with its own government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public OBPostalAddress7 addressLine(List<@Size(min = 1, max = 70) String> addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    public OBPostalAddress7 addAddressLineItem(String addressLineItem) {
        if (this.addressLine == null) {
            this.addressLine = new ArrayList<>();
        }
        this.addressLine.add(addressLineItem);
        return this;
    }

    /**
     * Get addressLine
     *
     * @return addressLine
     */
    @Size(min = 0, max = 7)
    @Schema(name = "AddressLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("AddressLine")
    public List<@Size(min = 1, max = 70) String> getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(List<@Size(min = 1, max = 70) String> addressLine) {
        this.addressLine = addressLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBPostalAddress7 obPostalAddress7 = (OBPostalAddress7) o;
        return Objects.equals(this.addressType, obPostalAddress7.addressType) &&
                Objects.equals(this.department, obPostalAddress7.department) &&
                Objects.equals(this.subDepartment, obPostalAddress7.subDepartment) &&
                Objects.equals(this.streetName, obPostalAddress7.streetName) &&
                Objects.equals(this.buildingNumber, obPostalAddress7.buildingNumber) &&
                Objects.equals(this.buildingName, obPostalAddress7.buildingName) &&
                Objects.equals(this.floor, obPostalAddress7.floor) &&
                Objects.equals(this.unitNumber, obPostalAddress7.unitNumber) &&
                Objects.equals(this.room, obPostalAddress7.room) &&
                Objects.equals(this.postBox, obPostalAddress7.postBox) &&
                Objects.equals(this.townLocationName, obPostalAddress7.townLocationName) &&
                Objects.equals(this.districtName, obPostalAddress7.districtName) &&
                Objects.equals(this.careOf, obPostalAddress7.careOf) &&
                Objects.equals(this.postCode, obPostalAddress7.postCode) &&
                Objects.equals(this.townName, obPostalAddress7.townName) &&
                Objects.equals(this.countrySubDivision, obPostalAddress7.countrySubDivision) &&
                Objects.equals(this.country, obPostalAddress7.country) &&
                Objects.equals(this.addressLine, obPostalAddress7.addressLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressType, department, subDepartment, streetName, buildingNumber, buildingName, floor, unitNumber, room, postBox, townLocationName, districtName, careOf, postCode, townName, countrySubDivision, country, addressLine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBPostalAddress7 {\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
        sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
        sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
        sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
        sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
        sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
        sb.append("    room: ").append(toIndentedString(room)).append("\n");
        sb.append("    postBox: ").append(toIndentedString(postBox)).append("\n");
        sb.append("    townLocationName: ").append(toIndentedString(townLocationName)).append("\n");
        sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
        sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
        sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
        sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
        sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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

