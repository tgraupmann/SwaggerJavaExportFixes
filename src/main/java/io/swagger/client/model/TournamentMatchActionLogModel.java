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
import io.swagger.client.model.EntityProfileModel;
import org.joda.time.DateTime;

/**
 * TournamentMatchActionLogModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentMatchActionLogModel {
  @SerializedName("TournamentMatchActionLogId")
  private Long tournamentMatchActionLogId = null;

  @SerializedName("EntityId")
  private Long entityId = null;

  @SerializedName("EntityProfile")
  private EntityProfileModel entityProfile = null;

  @SerializedName("TournamentMatchId")
  private Long tournamentMatchId = null;

  @SerializedName("ActionLogTypeId")
  private Integer actionLogTypeId = null;

  @SerializedName("ActionLogType")
  private String actionLogType = null;

  @SerializedName("AdministratorComment")
  private String administratorComment = null;

  @SerializedName("ActionLogDateTime")
  private DateTime actionLogDateTime = null;

  public TournamentMatchActionLogModel tournamentMatchActionLogId(Long tournamentMatchActionLogId) {
    this.tournamentMatchActionLogId = tournamentMatchActionLogId;
    return this;
  }

   /**
   * Get tournamentMatchActionLogId
   * @return tournamentMatchActionLogId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTournamentMatchActionLogId() {
    return tournamentMatchActionLogId;
  }

  public void setTournamentMatchActionLogId(Long tournamentMatchActionLogId) {
    this.tournamentMatchActionLogId = tournamentMatchActionLogId;
  }

  public TournamentMatchActionLogModel entityId(Long entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEntityId() {
    return entityId;
  }

  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }

  public TournamentMatchActionLogModel entityProfile(EntityProfileModel entityProfile) {
    this.entityProfile = entityProfile;
    return this;
  }

   /**
   * Get entityProfile
   * @return entityProfile
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityProfileModel getEntityProfile() {
    return entityProfile;
  }

  public void setEntityProfile(EntityProfileModel entityProfile) {
    this.entityProfile = entityProfile;
  }

  public TournamentMatchActionLogModel tournamentMatchId(Long tournamentMatchId) {
    this.tournamentMatchId = tournamentMatchId;
    return this;
  }

   /**
   * Get tournamentMatchId
   * @return tournamentMatchId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTournamentMatchId() {
    return tournamentMatchId;
  }

  public void setTournamentMatchId(Long tournamentMatchId) {
    this.tournamentMatchId = tournamentMatchId;
  }

  public TournamentMatchActionLogModel actionLogTypeId(Integer actionLogTypeId) {
    this.actionLogTypeId = actionLogTypeId;
    return this;
  }

   /**
   * Get actionLogTypeId
   * @return actionLogTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getActionLogTypeId() {
    return actionLogTypeId;
  }

  public void setActionLogTypeId(Integer actionLogTypeId) {
    this.actionLogTypeId = actionLogTypeId;
  }

  public TournamentMatchActionLogModel actionLogType(String actionLogType) {
    this.actionLogType = actionLogType;
    return this;
  }

   /**
   * Get actionLogType
   * @return actionLogType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActionLogType() {
    return actionLogType;
  }

  public void setActionLogType(String actionLogType) {
    this.actionLogType = actionLogType;
  }

  public TournamentMatchActionLogModel administratorComment(String administratorComment) {
    this.administratorComment = administratorComment;
    return this;
  }

   /**
   * Get administratorComment
   * @return administratorComment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAdministratorComment() {
    return administratorComment;
  }

  public void setAdministratorComment(String administratorComment) {
    this.administratorComment = administratorComment;
  }

  public TournamentMatchActionLogModel actionLogDateTime(DateTime actionLogDateTime) {
    this.actionLogDateTime = actionLogDateTime;
    return this;
  }

   /**
   * Get actionLogDateTime
   * @return actionLogDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getActionLogDateTime() {
    return actionLogDateTime;
  }

  public void setActionLogDateTime(DateTime actionLogDateTime) {
    this.actionLogDateTime = actionLogDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentMatchActionLogModel tournamentMatchActionLogModel = (TournamentMatchActionLogModel) o;
    return Objects.equals(this.tournamentMatchActionLogId, tournamentMatchActionLogModel.tournamentMatchActionLogId) &&
        Objects.equals(this.entityId, tournamentMatchActionLogModel.entityId) &&
        Objects.equals(this.entityProfile, tournamentMatchActionLogModel.entityProfile) &&
        Objects.equals(this.tournamentMatchId, tournamentMatchActionLogModel.tournamentMatchId) &&
        Objects.equals(this.actionLogTypeId, tournamentMatchActionLogModel.actionLogTypeId) &&
        Objects.equals(this.actionLogType, tournamentMatchActionLogModel.actionLogType) &&
        Objects.equals(this.administratorComment, tournamentMatchActionLogModel.administratorComment) &&
        Objects.equals(this.actionLogDateTime, tournamentMatchActionLogModel.actionLogDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tournamentMatchActionLogId, entityId, entityProfile, tournamentMatchId, actionLogTypeId, actionLogType, administratorComment, actionLogDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentMatchActionLogModel {\n");
    
    sb.append("    tournamentMatchActionLogId: ").append(toIndentedString(tournamentMatchActionLogId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityProfile: ").append(toIndentedString(entityProfile)).append("\n");
    sb.append("    tournamentMatchId: ").append(toIndentedString(tournamentMatchId)).append("\n");
    sb.append("    actionLogTypeId: ").append(toIndentedString(actionLogTypeId)).append("\n");
    sb.append("    actionLogType: ").append(toIndentedString(actionLogType)).append("\n");
    sb.append("    administratorComment: ").append(toIndentedString(administratorComment)).append("\n");
    sb.append("    actionLogDateTime: ").append(toIndentedString(actionLogDateTime)).append("\n");
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

