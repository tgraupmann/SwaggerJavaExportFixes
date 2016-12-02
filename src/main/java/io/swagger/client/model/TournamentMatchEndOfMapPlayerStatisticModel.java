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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TournamentMatchEndOfMapPlayerStatisticModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentMatchEndOfMapPlayerStatisticModel {
  @SerializedName("EntityPlayerId")
  private Long entityPlayerId = null;

  @SerializedName("Profile")
  private EntityProfileModel profile = null;

  @SerializedName("Statistics")
  private Map<String, Integer> statistics = new HashMap<String, Integer>();

  @SerializedName("IsOnTeamA")
  private Boolean isOnTeamA = null;

  public TournamentMatchEndOfMapPlayerStatisticModel entityPlayerId(Long entityPlayerId) {
    this.entityPlayerId = entityPlayerId;
    return this;
  }

   /**
   * Get entityPlayerId
   * @return entityPlayerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEntityPlayerId() {
    return entityPlayerId;
  }

  public void setEntityPlayerId(Long entityPlayerId) {
    this.entityPlayerId = entityPlayerId;
  }

  public TournamentMatchEndOfMapPlayerStatisticModel profile(EntityProfileModel profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityProfileModel getProfile() {
    return profile;
  }

  public void setProfile(EntityProfileModel profile) {
    this.profile = profile;
  }

  public TournamentMatchEndOfMapPlayerStatisticModel statistics(Map<String, Integer> statistics) {
    this.statistics = statistics;
    return this;
  }

  public TournamentMatchEndOfMapPlayerStatisticModel putStatisticsItem(String key, Integer statisticsItem) {
    this.statistics.put(key, statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Integer> getStatistics() {
    return statistics;
  }

  public void setStatistics(Map<String, Integer> statistics) {
    this.statistics = statistics;
  }

  public TournamentMatchEndOfMapPlayerStatisticModel isOnTeamA(Boolean isOnTeamA) {
    this.isOnTeamA = isOnTeamA;
    return this;
  }

   /**
   * Get isOnTeamA
   * @return isOnTeamA
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsOnTeamA() {
    return isOnTeamA;
  }

  public void setIsOnTeamA(Boolean isOnTeamA) {
    this.isOnTeamA = isOnTeamA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentMatchEndOfMapPlayerStatisticModel tournamentMatchEndOfMapPlayerStatisticModel = (TournamentMatchEndOfMapPlayerStatisticModel) o;
    return Objects.equals(this.entityPlayerId, tournamentMatchEndOfMapPlayerStatisticModel.entityPlayerId) &&
        Objects.equals(this.profile, tournamentMatchEndOfMapPlayerStatisticModel.profile) &&
        Objects.equals(this.statistics, tournamentMatchEndOfMapPlayerStatisticModel.statistics) &&
        Objects.equals(this.isOnTeamA, tournamentMatchEndOfMapPlayerStatisticModel.isOnTeamA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityPlayerId, profile, statistics, isOnTeamA);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentMatchEndOfMapPlayerStatisticModel {\n");
    
    sb.append("    entityPlayerId: ").append(toIndentedString(entityPlayerId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    isOnTeamA: ").append(toIndentedString(isOnTeamA)).append("\n");
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

