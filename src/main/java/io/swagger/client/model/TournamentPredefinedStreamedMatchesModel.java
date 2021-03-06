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
 * TournamentPredefinedStreamedMatchesModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentPredefinedStreamedMatchesModel {
  @SerializedName("RoundRuleLevelId")
  private Integer roundRuleLevelId = null;

  @SerializedName("RoundNumber")
  private Integer roundNumber = null;

  @SerializedName("MatchNumber")
  private Integer matchNumber = null;

  @SerializedName("StreamingServiceId")
  private Integer streamingServiceId = null;

  @SerializedName("BroadcastUrl")
  private String broadcastUrl = null;

  public TournamentPredefinedStreamedMatchesModel roundRuleLevelId(Integer roundRuleLevelId) {
    this.roundRuleLevelId = roundRuleLevelId;
    return this;
  }

   /**
   * Get roundRuleLevelId
   * @return roundRuleLevelId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRoundRuleLevelId() {
    return roundRuleLevelId;
  }

  public void setRoundRuleLevelId(Integer roundRuleLevelId) {
    this.roundRuleLevelId = roundRuleLevelId;
  }

  public TournamentPredefinedStreamedMatchesModel roundNumber(Integer roundNumber) {
    this.roundNumber = roundNumber;
    return this;
  }

   /**
   * Get roundNumber
   * @return roundNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRoundNumber() {
    return roundNumber;
  }

  public void setRoundNumber(Integer roundNumber) {
    this.roundNumber = roundNumber;
  }

  public TournamentPredefinedStreamedMatchesModel matchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
    return this;
  }

   /**
   * Get matchNumber
   * @return matchNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMatchNumber() {
    return matchNumber;
  }

  public void setMatchNumber(Integer matchNumber) {
    this.matchNumber = matchNumber;
  }

  public TournamentPredefinedStreamedMatchesModel streamingServiceId(Integer streamingServiceId) {
    this.streamingServiceId = streamingServiceId;
    return this;
  }

   /**
   * Get streamingServiceId
   * @return streamingServiceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStreamingServiceId() {
    return streamingServiceId;
  }

  public void setStreamingServiceId(Integer streamingServiceId) {
    this.streamingServiceId = streamingServiceId;
  }

  public TournamentPredefinedStreamedMatchesModel broadcastUrl(String broadcastUrl) {
    this.broadcastUrl = broadcastUrl;
    return this;
  }

   /**
   * Get broadcastUrl
   * @return broadcastUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBroadcastUrl() {
    return broadcastUrl;
  }

  public void setBroadcastUrl(String broadcastUrl) {
    this.broadcastUrl = broadcastUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentPredefinedStreamedMatchesModel tournamentPredefinedStreamedMatchesModel = (TournamentPredefinedStreamedMatchesModel) o;
    return Objects.equals(this.roundRuleLevelId, tournamentPredefinedStreamedMatchesModel.roundRuleLevelId) &&
        Objects.equals(this.roundNumber, tournamentPredefinedStreamedMatchesModel.roundNumber) &&
        Objects.equals(this.matchNumber, tournamentPredefinedStreamedMatchesModel.matchNumber) &&
        Objects.equals(this.streamingServiceId, tournamentPredefinedStreamedMatchesModel.streamingServiceId) &&
        Objects.equals(this.broadcastUrl, tournamentPredefinedStreamedMatchesModel.broadcastUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roundRuleLevelId, roundNumber, matchNumber, streamingServiceId, broadcastUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentPredefinedStreamedMatchesModel {\n");
    
    sb.append("    roundRuleLevelId: ").append(toIndentedString(roundRuleLevelId)).append("\n");
    sb.append("    roundNumber: ").append(toIndentedString(roundNumber)).append("\n");
    sb.append("    matchNumber: ").append(toIndentedString(matchNumber)).append("\n");
    sb.append("    streamingServiceId: ").append(toIndentedString(streamingServiceId)).append("\n");
    sb.append("    broadcastUrl: ").append(toIndentedString(broadcastUrl)).append("\n");
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

