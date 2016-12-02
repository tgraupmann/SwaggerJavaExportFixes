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
import io.swagger.client.model.AddressCountryModel;
import io.swagger.client.model.EntityProfileModel;
import io.swagger.client.model.EntityStreamingModel;
import io.swagger.client.model.MatchPlayStatisticsModel;
import java.util.ArrayList;
import java.util.List;

/**
 * TournamentMatchPlayerModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentMatchPlayerModel {
  @SerializedName("TournamentMatchId")
  private Long tournamentMatchId = null;

  @SerializedName("TournamentId")
  private Long tournamentId = null;

  @SerializedName("EntityPlayerId")
  private Long entityPlayerId = null;

  @SerializedName("IsTeamCaptain")
  private Boolean isTeamCaptain = null;

  @SerializedName("IsOnTeamA")
  private Boolean isOnTeamA = null;

  @SerializedName("IsCoach")
  private Boolean isCoach = null;

  @SerializedName("Nickname")
  private String nickname = null;

  @SerializedName("VoteDidMyTeamWin")
  private Boolean voteDidMyTeamWin = null;

  @SerializedName("IsReady")
  private Boolean isReady = null;

  @SerializedName("WasRemoved")
  private Boolean wasRemoved = null;

  @SerializedName("HasPenalty")
  private Boolean hasPenalty = null;

  @SerializedName("IsActive")
  private Boolean isActive = null;

  @SerializedName("GamePlayerIdentifier")
  private String gamePlayerIdentifier = null;

  @SerializedName("SteamId32")
  private String steamId32 = null;

  @SerializedName("SteamId64")
  private String steamId64 = null;

  @SerializedName("Profile")
  private EntityProfileModel profile = null;

  @SerializedName("Statistics")
  private MatchPlayStatisticsModel statistics = null;

  @SerializedName("AddressCountry")
  private AddressCountryModel addressCountry = null;

  @SerializedName("StreamingServices")
  private List<EntityStreamingModel> streamingServices = new ArrayList<EntityStreamingModel>();

  public TournamentMatchPlayerModel tournamentMatchId(Long tournamentMatchId) {
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

  public TournamentMatchPlayerModel tournamentId(Long tournamentId) {
    this.tournamentId = tournamentId;
    return this;
  }

   /**
   * Get tournamentId
   * @return tournamentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTournamentId() {
    return tournamentId;
  }

  public void setTournamentId(Long tournamentId) {
    this.tournamentId = tournamentId;
  }

  public TournamentMatchPlayerModel entityPlayerId(Long entityPlayerId) {
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

  public TournamentMatchPlayerModel isTeamCaptain(Boolean isTeamCaptain) {
    this.isTeamCaptain = isTeamCaptain;
    return this;
  }

   /**
   * Get isTeamCaptain
   * @return isTeamCaptain
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsTeamCaptain() {
    return isTeamCaptain;
  }

  public void setIsTeamCaptain(Boolean isTeamCaptain) {
    this.isTeamCaptain = isTeamCaptain;
  }

  public TournamentMatchPlayerModel isOnTeamA(Boolean isOnTeamA) {
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

  public TournamentMatchPlayerModel isCoach(Boolean isCoach) {
    this.isCoach = isCoach;
    return this;
  }

   /**
   * Get isCoach
   * @return isCoach
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsCoach() {
    return isCoach;
  }

  public void setIsCoach(Boolean isCoach) {
    this.isCoach = isCoach;
  }

  public TournamentMatchPlayerModel nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public TournamentMatchPlayerModel voteDidMyTeamWin(Boolean voteDidMyTeamWin) {
    this.voteDidMyTeamWin = voteDidMyTeamWin;
    return this;
  }

   /**
   * Get voteDidMyTeamWin
   * @return voteDidMyTeamWin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVoteDidMyTeamWin() {
    return voteDidMyTeamWin;
  }

  public void setVoteDidMyTeamWin(Boolean voteDidMyTeamWin) {
    this.voteDidMyTeamWin = voteDidMyTeamWin;
  }

  public TournamentMatchPlayerModel isReady(Boolean isReady) {
    this.isReady = isReady;
    return this;
  }

   /**
   * Get isReady
   * @return isReady
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsReady() {
    return isReady;
  }

  public void setIsReady(Boolean isReady) {
    this.isReady = isReady;
  }

  public TournamentMatchPlayerModel wasRemoved(Boolean wasRemoved) {
    this.wasRemoved = wasRemoved;
    return this;
  }

   /**
   * Get wasRemoved
   * @return wasRemoved
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getWasRemoved() {
    return wasRemoved;
  }

  public void setWasRemoved(Boolean wasRemoved) {
    this.wasRemoved = wasRemoved;
  }

  public TournamentMatchPlayerModel hasPenalty(Boolean hasPenalty) {
    this.hasPenalty = hasPenalty;
    return this;
  }

   /**
   * Get hasPenalty
   * @return hasPenalty
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasPenalty() {
    return hasPenalty;
  }

  public void setHasPenalty(Boolean hasPenalty) {
    this.hasPenalty = hasPenalty;
  }

  public TournamentMatchPlayerModel isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public TournamentMatchPlayerModel gamePlayerIdentifier(String gamePlayerIdentifier) {
    this.gamePlayerIdentifier = gamePlayerIdentifier;
    return this;
  }

   /**
   * Get gamePlayerIdentifier
   * @return gamePlayerIdentifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamePlayerIdentifier() {
    return gamePlayerIdentifier;
  }

  public void setGamePlayerIdentifier(String gamePlayerIdentifier) {
    this.gamePlayerIdentifier = gamePlayerIdentifier;
  }

  public TournamentMatchPlayerModel steamId32(String steamId32) {
    this.steamId32 = steamId32;
    return this;
  }

   /**
   * Get steamId32
   * @return steamId32
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSteamId32() {
    return steamId32;
  }

  public void setSteamId32(String steamId32) {
    this.steamId32 = steamId32;
  }

  public TournamentMatchPlayerModel steamId64(String steamId64) {
    this.steamId64 = steamId64;
    return this;
  }

   /**
   * Get steamId64
   * @return steamId64
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSteamId64() {
    return steamId64;
  }

  public void setSteamId64(String steamId64) {
    this.steamId64 = steamId64;
  }

  public TournamentMatchPlayerModel profile(EntityProfileModel profile) {
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

  public TournamentMatchPlayerModel statistics(MatchPlayStatisticsModel statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchPlayStatisticsModel getStatistics() {
    return statistics;
  }

  public void setStatistics(MatchPlayStatisticsModel statistics) {
    this.statistics = statistics;
  }

  public TournamentMatchPlayerModel addressCountry(AddressCountryModel addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Get addressCountry
   * @return addressCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressCountryModel getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(AddressCountryModel addressCountry) {
    this.addressCountry = addressCountry;
  }

  public TournamentMatchPlayerModel streamingServices(List<EntityStreamingModel> streamingServices) {
    this.streamingServices = streamingServices;
    return this;
  }

  public TournamentMatchPlayerModel addStreamingServicesItem(EntityStreamingModel streamingServicesItem) {
    this.streamingServices.add(streamingServicesItem);
    return this;
  }

   /**
   * Get streamingServices
   * @return streamingServices
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EntityStreamingModel> getStreamingServices() {
    return streamingServices;
  }

  public void setStreamingServices(List<EntityStreamingModel> streamingServices) {
    this.streamingServices = streamingServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentMatchPlayerModel tournamentMatchPlayerModel = (TournamentMatchPlayerModel) o;
    return Objects.equals(this.tournamentMatchId, tournamentMatchPlayerModel.tournamentMatchId) &&
        Objects.equals(this.tournamentId, tournamentMatchPlayerModel.tournamentId) &&
        Objects.equals(this.entityPlayerId, tournamentMatchPlayerModel.entityPlayerId) &&
        Objects.equals(this.isTeamCaptain, tournamentMatchPlayerModel.isTeamCaptain) &&
        Objects.equals(this.isOnTeamA, tournamentMatchPlayerModel.isOnTeamA) &&
        Objects.equals(this.isCoach, tournamentMatchPlayerModel.isCoach) &&
        Objects.equals(this.nickname, tournamentMatchPlayerModel.nickname) &&
        Objects.equals(this.voteDidMyTeamWin, tournamentMatchPlayerModel.voteDidMyTeamWin) &&
        Objects.equals(this.isReady, tournamentMatchPlayerModel.isReady) &&
        Objects.equals(this.wasRemoved, tournamentMatchPlayerModel.wasRemoved) &&
        Objects.equals(this.hasPenalty, tournamentMatchPlayerModel.hasPenalty) &&
        Objects.equals(this.isActive, tournamentMatchPlayerModel.isActive) &&
        Objects.equals(this.gamePlayerIdentifier, tournamentMatchPlayerModel.gamePlayerIdentifier) &&
        Objects.equals(this.steamId32, tournamentMatchPlayerModel.steamId32) &&
        Objects.equals(this.steamId64, tournamentMatchPlayerModel.steamId64) &&
        Objects.equals(this.profile, tournamentMatchPlayerModel.profile) &&
        Objects.equals(this.statistics, tournamentMatchPlayerModel.statistics) &&
        Objects.equals(this.addressCountry, tournamentMatchPlayerModel.addressCountry) &&
        Objects.equals(this.streamingServices, tournamentMatchPlayerModel.streamingServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tournamentMatchId, tournamentId, entityPlayerId, isTeamCaptain, isOnTeamA, isCoach, nickname, voteDidMyTeamWin, isReady, wasRemoved, hasPenalty, isActive, gamePlayerIdentifier, steamId32, steamId64, profile, statistics, addressCountry, streamingServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentMatchPlayerModel {\n");
    
    sb.append("    tournamentMatchId: ").append(toIndentedString(tournamentMatchId)).append("\n");
    sb.append("    tournamentId: ").append(toIndentedString(tournamentId)).append("\n");
    sb.append("    entityPlayerId: ").append(toIndentedString(entityPlayerId)).append("\n");
    sb.append("    isTeamCaptain: ").append(toIndentedString(isTeamCaptain)).append("\n");
    sb.append("    isOnTeamA: ").append(toIndentedString(isOnTeamA)).append("\n");
    sb.append("    isCoach: ").append(toIndentedString(isCoach)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    voteDidMyTeamWin: ").append(toIndentedString(voteDidMyTeamWin)).append("\n");
    sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
    sb.append("    wasRemoved: ").append(toIndentedString(wasRemoved)).append("\n");
    sb.append("    hasPenalty: ").append(toIndentedString(hasPenalty)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    gamePlayerIdentifier: ").append(toIndentedString(gamePlayerIdentifier)).append("\n");
    sb.append("    steamId32: ").append(toIndentedString(steamId32)).append("\n");
    sb.append("    steamId64: ").append(toIndentedString(steamId64)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    streamingServices: ").append(toIndentedString(streamingServices)).append("\n");
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
