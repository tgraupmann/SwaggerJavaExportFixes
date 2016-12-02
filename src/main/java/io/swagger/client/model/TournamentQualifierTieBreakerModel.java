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
 * TournamentQualifierTieBreakerModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentQualifierTieBreakerModel {
  @SerializedName("TieBreakerLevelId")
  private Integer tieBreakerLevelId = null;

  @SerializedName("TieBreakerTypeId")
  private Integer tieBreakerTypeId = null;

  @SerializedName("TieBreakerName")
  private String tieBreakerName = null;

  @SerializedName("TieBreakerDescription")
  private String tieBreakerDescription = null;

  public TournamentQualifierTieBreakerModel tieBreakerLevelId(Integer tieBreakerLevelId) {
    this.tieBreakerLevelId = tieBreakerLevelId;
    return this;
  }

   /**
   * Get tieBreakerLevelId
   * @return tieBreakerLevelId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTieBreakerLevelId() {
    return tieBreakerLevelId;
  }

  public void setTieBreakerLevelId(Integer tieBreakerLevelId) {
    this.tieBreakerLevelId = tieBreakerLevelId;
  }

  public TournamentQualifierTieBreakerModel tieBreakerTypeId(Integer tieBreakerTypeId) {
    this.tieBreakerTypeId = tieBreakerTypeId;
    return this;
  }

   /**
   * Get tieBreakerTypeId
   * @return tieBreakerTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTieBreakerTypeId() {
    return tieBreakerTypeId;
  }

  public void setTieBreakerTypeId(Integer tieBreakerTypeId) {
    this.tieBreakerTypeId = tieBreakerTypeId;
  }

  public TournamentQualifierTieBreakerModel tieBreakerName(String tieBreakerName) {
    this.tieBreakerName = tieBreakerName;
    return this;
  }

   /**
   * Get tieBreakerName
   * @return tieBreakerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTieBreakerName() {
    return tieBreakerName;
  }

  public void setTieBreakerName(String tieBreakerName) {
    this.tieBreakerName = tieBreakerName;
  }

  public TournamentQualifierTieBreakerModel tieBreakerDescription(String tieBreakerDescription) {
    this.tieBreakerDescription = tieBreakerDescription;
    return this;
  }

   /**
   * Get tieBreakerDescription
   * @return tieBreakerDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTieBreakerDescription() {
    return tieBreakerDescription;
  }

  public void setTieBreakerDescription(String tieBreakerDescription) {
    this.tieBreakerDescription = tieBreakerDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentQualifierTieBreakerModel tournamentQualifierTieBreakerModel = (TournamentQualifierTieBreakerModel) o;
    return Objects.equals(this.tieBreakerLevelId, tournamentQualifierTieBreakerModel.tieBreakerLevelId) &&
        Objects.equals(this.tieBreakerTypeId, tournamentQualifierTieBreakerModel.tieBreakerTypeId) &&
        Objects.equals(this.tieBreakerName, tournamentQualifierTieBreakerModel.tieBreakerName) &&
        Objects.equals(this.tieBreakerDescription, tournamentQualifierTieBreakerModel.tieBreakerDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tieBreakerLevelId, tieBreakerTypeId, tieBreakerName, tieBreakerDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentQualifierTieBreakerModel {\n");
    
    sb.append("    tieBreakerLevelId: ").append(toIndentedString(tieBreakerLevelId)).append("\n");
    sb.append("    tieBreakerTypeId: ").append(toIndentedString(tieBreakerTypeId)).append("\n");
    sb.append("    tieBreakerName: ").append(toIndentedString(tieBreakerName)).append("\n");
    sb.append("    tieBreakerDescription: ").append(toIndentedString(tieBreakerDescription)).append("\n");
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

