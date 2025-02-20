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
package uk.org.openbanking.datamodel.v4.payment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Regularity with which credit transfer instructions are to be created and processed
 */

@Schema(name = "OBFrequency6", description = "Regularity with which credit transfer instructions are to be created and processed")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBFrequency6 {

    private OBFrequency6Code type;

    private Integer countPerPeriod;

    private String pointInTime;

    public OBFrequency6() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBFrequency6(OBFrequency6Code type) {
        this.type = type;
    }

    public OBFrequency6 type(OBFrequency6Code type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @NotNull
    @Valid
    @Schema(name = "Type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Type")
    public OBFrequency6Code getType() {
        return type;
    }

    public void setType(OBFrequency6Code type) {
        this.type = type;
    }

    public OBFrequency6 countPerPeriod(Integer countPerPeriod) {
        this.countPerPeriod = countPerPeriod;
        return this;
    }

    /**
     * Number of instructions to be created and processed during the specified period .Specifies a frequency in terms of a count per period within a specified frequency type. Note: should not be used alongside `PointInTime`
     *
     * @return countPerPeriod
     */

    @Schema(name = "CountPerPeriod", example = "1", description = "Number of instructions to be created and processed during the specified period .Specifies a frequency in terms of a count per period within a specified frequency type. Note: should not be used alongside `PointInTime`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CountPerPeriod")
    public Integer getCountPerPeriod() {
        return countPerPeriod;
    }

    public void setCountPerPeriod(Integer countPerPeriod) {
        this.countPerPeriod = countPerPeriod;
    }

    public OBFrequency6 pointInTime(String pointInTime) {
        this.pointInTime = pointInTime;
        return this;
    }

    /**
     * Exact2NumericText - Further information on the exact point in time the event should take place. Specifies a frequency in terms of an exact point in time or moment within a specified frequency type. Note: should not be used alongside `CountPerSide`
     *
     * @return pointInTime
     */
    @Size(max = 2)
    @Schema(name = "PointInTime", example = "00", description = "Exact2NumericText - Further information on the exact point in time the event should take place. Specifies a frequency in terms of an exact point in time or moment within a specified frequency type. Note: should not be used alongside `CountPerSide`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("PointInTime")
    public String getPointInTime() {
        return pointInTime;
    }

    public void setPointInTime(String pointInTime) {
        this.pointInTime = pointInTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBFrequency6 obFrequency6 = (OBFrequency6) o;
        return Objects.equals(this.type, obFrequency6.type) &&
                Objects.equals(this.countPerPeriod, obFrequency6.countPerPeriod) &&
                Objects.equals(this.pointInTime, obFrequency6.pointInTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, countPerPeriod, pointInTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFrequency6 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    countPerPeriod: ").append(toIndentedString(countPerPeriod)).append("\n");
        sb.append("    pointInTime: ").append(toIndentedString(pointInTime)).append("\n");
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

