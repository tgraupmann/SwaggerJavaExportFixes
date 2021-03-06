/*
 * Polling API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TournamentRoundRuleMapVotingStyleModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentRoundRuleMapVotingStyleModel {
  @SerializedName("MapVotingStyleId")
  private Integer mapVotingStyleId = null;

  @SerializedName("MapVotingStyle")
  private String mapVotingStyle = null;

  @SerializedName("MapVotingStyleDescription")
  private String mapVotingStyleDescription = null;

  @SerializedName("MinimumRequiredMaps")
  private Integer minimumRequiredMaps = null;

  @SerializedName("MinimumBestOf")
  private Integer minimumBestOf = null;

  @SerializedName("MaximumBestOf")
  private Integer maximumBestOf = null;

  @SerializedName("MaximumVotingStageNumber")
  private Integer maximumVotingStageNumber = null;

  public TournamentRoundRuleMapVotingStyleModel mapVotingStyleId(Integer mapVotingStyleId) {
    this.mapVotingStyleId = mapVotingStyleId;
    return this;
  }

   /**
   * Get mapVotingStyleId
   * @return mapVotingStyleId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMapVotingStyleId() {
    return mapVotingStyleId;
  }

  public void setMapVotingStyleId(Integer mapVotingStyleId) {
    this.mapVotingStyleId = mapVotingStyleId;
  }

  public TournamentRoundRuleMapVotingStyleModel mapVotingStyle(String mapVotingStyle) {
    this.mapVotingStyle = mapVotingStyle;
    return this;
  }

   /**
   * Get mapVotingStyle
   * @return mapVotingStyle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMapVotingStyle() {
    return mapVotingStyle;
  }

  public void setMapVotingStyle(String mapVotingStyle) {
    this.mapVotingStyle = mapVotingStyle;
  }

  public TournamentRoundRuleMapVotingStyleModel mapVotingStyleDescription(String mapVotingStyleDescription) {
    this.mapVotingStyleDescription = mapVotingStyleDescription;
    return this;
  }

   /**
   * Get mapVotingStyleDescription
   * @return mapVotingStyleDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMapVotingStyleDescription() {
    return mapVotingStyleDescription;
  }

  public void setMapVotingStyleDescription(String mapVotingStyleDescription) {
    this.mapVotingStyleDescription = mapVotingStyleDescription;
  }

  public TournamentRoundRuleMapVotingStyleModel minimumRequiredMaps(Integer minimumRequiredMaps) {
    this.minimumRequiredMaps = minimumRequiredMaps;
    return this;
  }

   /**
   * Get minimumRequiredMaps
   * @return minimumRequiredMaps
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMinimumRequiredMaps() {
    return minimumRequiredMaps;
  }

  public void setMinimumRequiredMaps(Integer minimumRequiredMaps) {
    this.minimumRequiredMaps = minimumRequiredMaps;
  }

  public TournamentRoundRuleMapVotingStyleModel minimumBestOf(Integer minimumBestOf) {
    this.minimumBestOf = minimumBestOf;
    return this;
  }

   /**
   * Get minimumBestOf
   * @return minimumBestOf
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMinimumBestOf() {
    return minimumBestOf;
  }

  public void setMinimumBestOf(Integer minimumBestOf) {
    this.minimumBestOf = minimumBestOf;
  }

  public TournamentRoundRuleMapVotingStyleModel maximumBestOf(Integer maximumBestOf) {
    this.maximumBestOf = maximumBestOf;
    return this;
  }

   /**
   * Get maximumBestOf
   * @return maximumBestOf
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaximumBestOf() {
    return maximumBestOf;
  }

  public void setMaximumBestOf(Integer maximumBestOf) {
    this.maximumBestOf = maximumBestOf;
  }

  public TournamentRoundRuleMapVotingStyleModel maximumVotingStageNumber(Integer maximumVotingStageNumber) {
    this.maximumVotingStageNumber = maximumVotingStageNumber;
    return this;
  }

   /**
   * Get maximumVotingStageNumber
   * @return maximumVotingStageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaximumVotingStageNumber() {
    return maximumVotingStageNumber;
  }

  public void setMaximumVotingStageNumber(Integer maximumVotingStageNumber) {
    this.maximumVotingStageNumber = maximumVotingStageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentRoundRuleMapVotingStyleModel tournamentRoundRuleMapVotingStyleModel = (TournamentRoundRuleMapVotingStyleModel) o;
    return Objects.equals(this.mapVotingStyleId, tournamentRoundRuleMapVotingStyleModel.mapVotingStyleId) &&
        Objects.equals(this.mapVotingStyle, tournamentRoundRuleMapVotingStyleModel.mapVotingStyle) &&
        Objects.equals(this.mapVotingStyleDescription, tournamentRoundRuleMapVotingStyleModel.mapVotingStyleDescription) &&
        Objects.equals(this.minimumRequiredMaps, tournamentRoundRuleMapVotingStyleModel.minimumRequiredMaps) &&
        Objects.equals(this.minimumBestOf, tournamentRoundRuleMapVotingStyleModel.minimumBestOf) &&
        Objects.equals(this.maximumBestOf, tournamentRoundRuleMapVotingStyleModel.maximumBestOf) &&
        Objects.equals(this.maximumVotingStageNumber, tournamentRoundRuleMapVotingStyleModel.maximumVotingStageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapVotingStyleId, mapVotingStyle, mapVotingStyleDescription, minimumRequiredMaps, minimumBestOf, maximumBestOf, maximumVotingStageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentRoundRuleMapVotingStyleModel {\n");
    
    sb.append("    mapVotingStyleId: ").append(toIndentedString(mapVotingStyleId)).append("\n");
    sb.append("    mapVotingStyle: ").append(toIndentedString(mapVotingStyle)).append("\n");
    sb.append("    mapVotingStyleDescription: ").append(toIndentedString(mapVotingStyleDescription)).append("\n");
    sb.append("    minimumRequiredMaps: ").append(toIndentedString(minimumRequiredMaps)).append("\n");
    sb.append("    minimumBestOf: ").append(toIndentedString(minimumBestOf)).append("\n");
    sb.append("    maximumBestOf: ").append(toIndentedString(maximumBestOf)).append("\n");
    sb.append("    maximumVotingStageNumber: ").append(toIndentedString(maximumVotingStageNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

