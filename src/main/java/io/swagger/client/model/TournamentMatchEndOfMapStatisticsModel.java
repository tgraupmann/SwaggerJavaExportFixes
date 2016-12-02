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
import io.swagger.client.model.TournamentMatchEndOfMapMvpAwardModel;
import io.swagger.client.model.TournamentMatchEndOfMapPlayerStatisticModel;
import java.util.ArrayList;
import java.util.List;

/**
 * TournamentMatchEndOfMapStatisticsModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentMatchEndOfMapStatisticsModel {
  @SerializedName("MapNumber")
  private Integer mapNumber = null;

  @SerializedName("MapProperName")
  private String mapProperName = null;

  @SerializedName("PlayerStatistics")
  private List<TournamentMatchEndOfMapPlayerStatisticModel> playerStatistics = new ArrayList<TournamentMatchEndOfMapPlayerStatisticModel>();

  @SerializedName("MvpAwards")
  private List<TournamentMatchEndOfMapMvpAwardModel> mvpAwards = new ArrayList<TournamentMatchEndOfMapMvpAwardModel>();

  public TournamentMatchEndOfMapStatisticsModel mapNumber(Integer mapNumber) {
    this.mapNumber = mapNumber;
    return this;
  }

   /**
   * Get mapNumber
   * @return mapNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMapNumber() {
    return mapNumber;
  }

  public void setMapNumber(Integer mapNumber) {
    this.mapNumber = mapNumber;
  }

  public TournamentMatchEndOfMapStatisticsModel mapProperName(String mapProperName) {
    this.mapProperName = mapProperName;
    return this;
  }

   /**
   * Get mapProperName
   * @return mapProperName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMapProperName() {
    return mapProperName;
  }

  public void setMapProperName(String mapProperName) {
    this.mapProperName = mapProperName;
  }

  public TournamentMatchEndOfMapStatisticsModel playerStatistics(List<TournamentMatchEndOfMapPlayerStatisticModel> playerStatistics) {
    this.playerStatistics = playerStatistics;
    return this;
  }

  public TournamentMatchEndOfMapStatisticsModel addPlayerStatisticsItem(TournamentMatchEndOfMapPlayerStatisticModel playerStatisticsItem) {
    this.playerStatistics.add(playerStatisticsItem);
    return this;
  }

   /**
   * Get playerStatistics
   * @return playerStatistics
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TournamentMatchEndOfMapPlayerStatisticModel> getPlayerStatistics() {
    return playerStatistics;
  }

  public void setPlayerStatistics(List<TournamentMatchEndOfMapPlayerStatisticModel> playerStatistics) {
    this.playerStatistics = playerStatistics;
  }

  public TournamentMatchEndOfMapStatisticsModel mvpAwards(List<TournamentMatchEndOfMapMvpAwardModel> mvpAwards) {
    this.mvpAwards = mvpAwards;
    return this;
  }

  public TournamentMatchEndOfMapStatisticsModel addMvpAwardsItem(TournamentMatchEndOfMapMvpAwardModel mvpAwardsItem) {
    this.mvpAwards.add(mvpAwardsItem);
    return this;
  }

   /**
   * Get mvpAwards
   * @return mvpAwards
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TournamentMatchEndOfMapMvpAwardModel> getMvpAwards() {
    return mvpAwards;
  }

  public void setMvpAwards(List<TournamentMatchEndOfMapMvpAwardModel> mvpAwards) {
    this.mvpAwards = mvpAwards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentMatchEndOfMapStatisticsModel tournamentMatchEndOfMapStatisticsModel = (TournamentMatchEndOfMapStatisticsModel) o;
    return Objects.equals(this.mapNumber, tournamentMatchEndOfMapStatisticsModel.mapNumber) &&
        Objects.equals(this.mapProperName, tournamentMatchEndOfMapStatisticsModel.mapProperName) &&
        Objects.equals(this.playerStatistics, tournamentMatchEndOfMapStatisticsModel.playerStatistics) &&
        Objects.equals(this.mvpAwards, tournamentMatchEndOfMapStatisticsModel.mvpAwards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapNumber, mapProperName, playerStatistics, mvpAwards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentMatchEndOfMapStatisticsModel {\n");
    
    sb.append("    mapNumber: ").append(toIndentedString(mapNumber)).append("\n");
    sb.append("    mapProperName: ").append(toIndentedString(mapProperName)).append("\n");
    sb.append("    playerStatistics: ").append(toIndentedString(playerStatistics)).append("\n");
    sb.append("    mvpAwards: ").append(toIndentedString(mvpAwards)).append("\n");
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
