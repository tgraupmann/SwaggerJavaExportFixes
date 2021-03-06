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
import io.swagger.client.model.MatchPlayStatisticsModel;
import io.swagger.client.model.TournamentParticipantQualifierTieBreakerModel;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * TournamentParticipantModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentParticipantModel {
  @SerializedName("TournamentId")
  private Long tournamentId = null;

  @SerializedName("EntityParticipantId")
  private Long entityParticipantId = null;

  @SerializedName("EntityParticipantProfile")
  private EntityProfileModel entityParticipantProfile = null;

  @SerializedName("JoinDateTime")
  private DateTime joinDateTime = null;

  @SerializedName("IsChallengeAggrssor")
  private Boolean isChallengeAggrssor = null;

  /**
   * Gets or Sets tournamentRoleId
   */
  public enum TournamentRoleIdEnum {
    @SerializedName("1")
    NUMBER_1(1),
    
    @SerializedName("2")
    NUMBER_2(2),
    
    @SerializedName("3")
    NUMBER_3(3);

    private Integer value;

    TournamentRoleIdEnum(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("TournamentRoleId")
  private TournamentRoleIdEnum tournamentRoleId = null;

  @SerializedName("TournamentRoleName")
  private String tournamentRoleName = null;

  @SerializedName("IsAccepted")
  private Boolean isAccepted = null;

  @SerializedName("Statistics")
  private MatchPlayStatisticsModel statistics = null;

  @SerializedName("FinalPlacement")
  private Integer finalPlacement = null;

  @SerializedName("SeededPlacement")
  private Integer seededPlacement = null;

  @SerializedName("FlaggedAsCheater")
  private Boolean flaggedAsCheater = null;

  @SerializedName("HasDismissedResults")
  private Boolean hasDismissedResults = null;

  @SerializedName("PrizeAwardedAmount")
  private Double prizeAwardedAmount = null;

  @SerializedName("OtherPrizeAwarded")
  private String otherPrizeAwarded = null;

  @SerializedName("MatchPlayStatisticsId")
  private Long matchPlayStatisticsId = null;

  @SerializedName("IsCheckedIn")
  private Boolean isCheckedIn = null;

  @SerializedName("CheckedInDateTime")
  private DateTime checkedInDateTime = null;

  @SerializedName("IsStandBy")
  private Boolean isStandBy = null;

  @SerializedName("StandByPosition")
  private Integer standByPosition = null;

  @SerializedName("QualifierGroupNumber")
  private Integer qualifierGroupNumber = null;

  @SerializedName("QualifierGroupSeedNumber")
  private Integer qualifierGroupSeedNumber = null;

  @SerializedName("QualifierWinCount")
  private Integer qualifierWinCount = null;

  @SerializedName("QualifierLossCount")
  private Integer qualifierLossCount = null;

  @SerializedName("QualifierTieCount")
  private Integer qualifierTieCount = null;

  @SerializedName("QualifierTotalPoints")
  private Integer qualifierTotalPoints = null;

  @SerializedName("QualifierLastTotalPoints")
  private Integer qualifierLastTotalPoints = null;

  @SerializedName("QualifierRankingPosition")
  private Integer qualifierRankingPosition = null;

  @SerializedName("QualifierLastRankingPosition")
  private Integer qualifierLastRankingPosition = null;

  @SerializedName("QualifierScoreLastUpdate")
  private DateTime qualifierScoreLastUpdate = null;

  @SerializedName("QualifierCurrentRoundNumber")
  private Integer qualifierCurrentRoundNumber = null;

  @SerializedName("QuitAfterLive")
  private Boolean quitAfterLive = null;

  @SerializedName("QuitAfterLiveDateTime")
  private DateTime quitAfterLiveDateTime = null;

  @SerializedName("RemovedAfterLive")
  private Boolean removedAfterLive = null;

  @SerializedName("RemovedAfterLiveDateTime")
  private DateTime removedAfterLiveDateTime = null;

  @SerializedName("QualifierTieBreakers")
  private List<TournamentParticipantQualifierTieBreakerModel> qualifierTieBreakers = new ArrayList<TournamentParticipantQualifierTieBreakerModel>();

  public TournamentParticipantModel tournamentId(Long tournamentId) {
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

  public TournamentParticipantModel entityParticipantId(Long entityParticipantId) {
    this.entityParticipantId = entityParticipantId;
    return this;
  }

   /**
   * Get entityParticipantId
   * @return entityParticipantId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEntityParticipantId() {
    return entityParticipantId;
  }

  public void setEntityParticipantId(Long entityParticipantId) {
    this.entityParticipantId = entityParticipantId;
  }

  public TournamentParticipantModel entityParticipantProfile(EntityProfileModel entityParticipantProfile) {
    this.entityParticipantProfile = entityParticipantProfile;
    return this;
  }

   /**
   * Get entityParticipantProfile
   * @return entityParticipantProfile
  **/
  @ApiModelProperty(example = "null", value = "")
  public EntityProfileModel getEntityParticipantProfile() {
    return entityParticipantProfile;
  }

  public void setEntityParticipantProfile(EntityProfileModel entityParticipantProfile) {
    this.entityParticipantProfile = entityParticipantProfile;
  }

  public TournamentParticipantModel joinDateTime(DateTime joinDateTime) {
    this.joinDateTime = joinDateTime;
    return this;
  }

   /**
   * Get joinDateTime
   * @return joinDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getJoinDateTime() {
    return joinDateTime;
  }

  public void setJoinDateTime(DateTime joinDateTime) {
    this.joinDateTime = joinDateTime;
  }

  public TournamentParticipantModel isChallengeAggrssor(Boolean isChallengeAggrssor) {
    this.isChallengeAggrssor = isChallengeAggrssor;
    return this;
  }

   /**
   * Get isChallengeAggrssor
   * @return isChallengeAggrssor
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsChallengeAggrssor() {
    return isChallengeAggrssor;
  }

  public void setIsChallengeAggrssor(Boolean isChallengeAggrssor) {
    this.isChallengeAggrssor = isChallengeAggrssor;
  }

  public TournamentParticipantModel tournamentRoleId(TournamentRoleIdEnum tournamentRoleId) {
    this.tournamentRoleId = tournamentRoleId;
    return this;
  }

   /**
   * Get tournamentRoleId
   * @return tournamentRoleId
  **/
  @ApiModelProperty(example = "null", value = "")
  public TournamentRoleIdEnum getTournamentRoleId() {
    return tournamentRoleId;
  }

  public void setTournamentRoleId(TournamentRoleIdEnum tournamentRoleId) {
    this.tournamentRoleId = tournamentRoleId;
  }

  public TournamentParticipantModel tournamentRoleName(String tournamentRoleName) {
    this.tournamentRoleName = tournamentRoleName;
    return this;
  }

   /**
   * Get tournamentRoleName
   * @return tournamentRoleName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentRoleName() {
    return tournamentRoleName;
  }

  public void setTournamentRoleName(String tournamentRoleName) {
    this.tournamentRoleName = tournamentRoleName;
  }

  public TournamentParticipantModel isAccepted(Boolean isAccepted) {
    this.isAccepted = isAccepted;
    return this;
  }

   /**
   * Get isAccepted
   * @return isAccepted
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsAccepted() {
    return isAccepted;
  }

  public void setIsAccepted(Boolean isAccepted) {
    this.isAccepted = isAccepted;
  }

  public TournamentParticipantModel statistics(MatchPlayStatisticsModel statistics) {
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

  public TournamentParticipantModel finalPlacement(Integer finalPlacement) {
    this.finalPlacement = finalPlacement;
    return this;
  }

   /**
   * Get finalPlacement
   * @return finalPlacement
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFinalPlacement() {
    return finalPlacement;
  }

  public void setFinalPlacement(Integer finalPlacement) {
    this.finalPlacement = finalPlacement;
  }

  public TournamentParticipantModel seededPlacement(Integer seededPlacement) {
    this.seededPlacement = seededPlacement;
    return this;
  }

   /**
   * Get seededPlacement
   * @return seededPlacement
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSeededPlacement() {
    return seededPlacement;
  }

  public void setSeededPlacement(Integer seededPlacement) {
    this.seededPlacement = seededPlacement;
  }

  public TournamentParticipantModel flaggedAsCheater(Boolean flaggedAsCheater) {
    this.flaggedAsCheater = flaggedAsCheater;
    return this;
  }

   /**
   * Get flaggedAsCheater
   * @return flaggedAsCheater
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFlaggedAsCheater() {
    return flaggedAsCheater;
  }

  public void setFlaggedAsCheater(Boolean flaggedAsCheater) {
    this.flaggedAsCheater = flaggedAsCheater;
  }

  public TournamentParticipantModel hasDismissedResults(Boolean hasDismissedResults) {
    this.hasDismissedResults = hasDismissedResults;
    return this;
  }

   /**
   * Get hasDismissedResults
   * @return hasDismissedResults
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasDismissedResults() {
    return hasDismissedResults;
  }

  public void setHasDismissedResults(Boolean hasDismissedResults) {
    this.hasDismissedResults = hasDismissedResults;
  }

  public TournamentParticipantModel prizeAwardedAmount(Double prizeAwardedAmount) {
    this.prizeAwardedAmount = prizeAwardedAmount;
    return this;
  }

   /**
   * Get prizeAwardedAmount
   * @return prizeAwardedAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPrizeAwardedAmount() {
    return prizeAwardedAmount;
  }

  public void setPrizeAwardedAmount(Double prizeAwardedAmount) {
    this.prizeAwardedAmount = prizeAwardedAmount;
  }

  public TournamentParticipantModel otherPrizeAwarded(String otherPrizeAwarded) {
    this.otherPrizeAwarded = otherPrizeAwarded;
    return this;
  }

   /**
   * Get otherPrizeAwarded
   * @return otherPrizeAwarded
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOtherPrizeAwarded() {
    return otherPrizeAwarded;
  }

  public void setOtherPrizeAwarded(String otherPrizeAwarded) {
    this.otherPrizeAwarded = otherPrizeAwarded;
  }

  public TournamentParticipantModel matchPlayStatisticsId(Long matchPlayStatisticsId) {
    this.matchPlayStatisticsId = matchPlayStatisticsId;
    return this;
  }

   /**
   * Get matchPlayStatisticsId
   * @return matchPlayStatisticsId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMatchPlayStatisticsId() {
    return matchPlayStatisticsId;
  }

  public void setMatchPlayStatisticsId(Long matchPlayStatisticsId) {
    this.matchPlayStatisticsId = matchPlayStatisticsId;
  }

  public TournamentParticipantModel isCheckedIn(Boolean isCheckedIn) {
    this.isCheckedIn = isCheckedIn;
    return this;
  }

   /**
   * Get isCheckedIn
   * @return isCheckedIn
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsCheckedIn() {
    return isCheckedIn;
  }

  public void setIsCheckedIn(Boolean isCheckedIn) {
    this.isCheckedIn = isCheckedIn;
  }

  public TournamentParticipantModel checkedInDateTime(DateTime checkedInDateTime) {
    this.checkedInDateTime = checkedInDateTime;
    return this;
  }

   /**
   * Get checkedInDateTime
   * @return checkedInDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCheckedInDateTime() {
    return checkedInDateTime;
  }

  public void setCheckedInDateTime(DateTime checkedInDateTime) {
    this.checkedInDateTime = checkedInDateTime;
  }

  public TournamentParticipantModel isStandBy(Boolean isStandBy) {
    this.isStandBy = isStandBy;
    return this;
  }

   /**
   * Get isStandBy
   * @return isStandBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsStandBy() {
    return isStandBy;
  }

  public void setIsStandBy(Boolean isStandBy) {
    this.isStandBy = isStandBy;
  }

  public TournamentParticipantModel standByPosition(Integer standByPosition) {
    this.standByPosition = standByPosition;
    return this;
  }

   /**
   * Get standByPosition
   * @return standByPosition
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStandByPosition() {
    return standByPosition;
  }

  public void setStandByPosition(Integer standByPosition) {
    this.standByPosition = standByPosition;
  }

  public TournamentParticipantModel qualifierGroupNumber(Integer qualifierGroupNumber) {
    this.qualifierGroupNumber = qualifierGroupNumber;
    return this;
  }

   /**
   * Get qualifierGroupNumber
   * @return qualifierGroupNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierGroupNumber() {
    return qualifierGroupNumber;
  }

  public void setQualifierGroupNumber(Integer qualifierGroupNumber) {
    this.qualifierGroupNumber = qualifierGroupNumber;
  }

  public TournamentParticipantModel qualifierGroupSeedNumber(Integer qualifierGroupSeedNumber) {
    this.qualifierGroupSeedNumber = qualifierGroupSeedNumber;
    return this;
  }

   /**
   * Get qualifierGroupSeedNumber
   * @return qualifierGroupSeedNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierGroupSeedNumber() {
    return qualifierGroupSeedNumber;
  }

  public void setQualifierGroupSeedNumber(Integer qualifierGroupSeedNumber) {
    this.qualifierGroupSeedNumber = qualifierGroupSeedNumber;
  }

  public TournamentParticipantModel qualifierWinCount(Integer qualifierWinCount) {
    this.qualifierWinCount = qualifierWinCount;
    return this;
  }

   /**
   * Get qualifierWinCount
   * @return qualifierWinCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierWinCount() {
    return qualifierWinCount;
  }

  public void setQualifierWinCount(Integer qualifierWinCount) {
    this.qualifierWinCount = qualifierWinCount;
  }

  public TournamentParticipantModel qualifierLossCount(Integer qualifierLossCount) {
    this.qualifierLossCount = qualifierLossCount;
    return this;
  }

   /**
   * Get qualifierLossCount
   * @return qualifierLossCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierLossCount() {
    return qualifierLossCount;
  }

  public void setQualifierLossCount(Integer qualifierLossCount) {
    this.qualifierLossCount = qualifierLossCount;
  }

  public TournamentParticipantModel qualifierTieCount(Integer qualifierTieCount) {
    this.qualifierTieCount = qualifierTieCount;
    return this;
  }

   /**
   * Get qualifierTieCount
   * @return qualifierTieCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierTieCount() {
    return qualifierTieCount;
  }

  public void setQualifierTieCount(Integer qualifierTieCount) {
    this.qualifierTieCount = qualifierTieCount;
  }

  public TournamentParticipantModel qualifierTotalPoints(Integer qualifierTotalPoints) {
    this.qualifierTotalPoints = qualifierTotalPoints;
    return this;
  }

   /**
   * Get qualifierTotalPoints
   * @return qualifierTotalPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierTotalPoints() {
    return qualifierTotalPoints;
  }

  public void setQualifierTotalPoints(Integer qualifierTotalPoints) {
    this.qualifierTotalPoints = qualifierTotalPoints;
  }

  public TournamentParticipantModel qualifierLastTotalPoints(Integer qualifierLastTotalPoints) {
    this.qualifierLastTotalPoints = qualifierLastTotalPoints;
    return this;
  }

   /**
   * Get qualifierLastTotalPoints
   * @return qualifierLastTotalPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierLastTotalPoints() {
    return qualifierLastTotalPoints;
  }

  public void setQualifierLastTotalPoints(Integer qualifierLastTotalPoints) {
    this.qualifierLastTotalPoints = qualifierLastTotalPoints;
  }

  public TournamentParticipantModel qualifierRankingPosition(Integer qualifierRankingPosition) {
    this.qualifierRankingPosition = qualifierRankingPosition;
    return this;
  }

   /**
   * Get qualifierRankingPosition
   * @return qualifierRankingPosition
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierRankingPosition() {
    return qualifierRankingPosition;
  }

  public void setQualifierRankingPosition(Integer qualifierRankingPosition) {
    this.qualifierRankingPosition = qualifierRankingPosition;
  }

  public TournamentParticipantModel qualifierLastRankingPosition(Integer qualifierLastRankingPosition) {
    this.qualifierLastRankingPosition = qualifierLastRankingPosition;
    return this;
  }

   /**
   * Get qualifierLastRankingPosition
   * @return qualifierLastRankingPosition
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierLastRankingPosition() {
    return qualifierLastRankingPosition;
  }

  public void setQualifierLastRankingPosition(Integer qualifierLastRankingPosition) {
    this.qualifierLastRankingPosition = qualifierLastRankingPosition;
  }

  public TournamentParticipantModel qualifierScoreLastUpdate(DateTime qualifierScoreLastUpdate) {
    this.qualifierScoreLastUpdate = qualifierScoreLastUpdate;
    return this;
  }

   /**
   * Get qualifierScoreLastUpdate
   * @return qualifierScoreLastUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getQualifierScoreLastUpdate() {
    return qualifierScoreLastUpdate;
  }

  public void setQualifierScoreLastUpdate(DateTime qualifierScoreLastUpdate) {
    this.qualifierScoreLastUpdate = qualifierScoreLastUpdate;
  }

  public TournamentParticipantModel qualifierCurrentRoundNumber(Integer qualifierCurrentRoundNumber) {
    this.qualifierCurrentRoundNumber = qualifierCurrentRoundNumber;
    return this;
  }

   /**
   * Get qualifierCurrentRoundNumber
   * @return qualifierCurrentRoundNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQualifierCurrentRoundNumber() {
    return qualifierCurrentRoundNumber;
  }

  public void setQualifierCurrentRoundNumber(Integer qualifierCurrentRoundNumber) {
    this.qualifierCurrentRoundNumber = qualifierCurrentRoundNumber;
  }

  public TournamentParticipantModel quitAfterLive(Boolean quitAfterLive) {
    this.quitAfterLive = quitAfterLive;
    return this;
  }

   /**
   * Get quitAfterLive
   * @return quitAfterLive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getQuitAfterLive() {
    return quitAfterLive;
  }

  public void setQuitAfterLive(Boolean quitAfterLive) {
    this.quitAfterLive = quitAfterLive;
  }

  public TournamentParticipantModel quitAfterLiveDateTime(DateTime quitAfterLiveDateTime) {
    this.quitAfterLiveDateTime = quitAfterLiveDateTime;
    return this;
  }

   /**
   * Get quitAfterLiveDateTime
   * @return quitAfterLiveDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getQuitAfterLiveDateTime() {
    return quitAfterLiveDateTime;
  }

  public void setQuitAfterLiveDateTime(DateTime quitAfterLiveDateTime) {
    this.quitAfterLiveDateTime = quitAfterLiveDateTime;
  }

  public TournamentParticipantModel removedAfterLive(Boolean removedAfterLive) {
    this.removedAfterLive = removedAfterLive;
    return this;
  }

   /**
   * Get removedAfterLive
   * @return removedAfterLive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRemovedAfterLive() {
    return removedAfterLive;
  }

  public void setRemovedAfterLive(Boolean removedAfterLive) {
    this.removedAfterLive = removedAfterLive;
  }

  public TournamentParticipantModel removedAfterLiveDateTime(DateTime removedAfterLiveDateTime) {
    this.removedAfterLiveDateTime = removedAfterLiveDateTime;
    return this;
  }

   /**
   * Get removedAfterLiveDateTime
   * @return removedAfterLiveDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getRemovedAfterLiveDateTime() {
    return removedAfterLiveDateTime;
  }

  public void setRemovedAfterLiveDateTime(DateTime removedAfterLiveDateTime) {
    this.removedAfterLiveDateTime = removedAfterLiveDateTime;
  }

  public TournamentParticipantModel qualifierTieBreakers(List<TournamentParticipantQualifierTieBreakerModel> qualifierTieBreakers) {
    this.qualifierTieBreakers = qualifierTieBreakers;
    return this;
  }

  public TournamentParticipantModel addQualifierTieBreakersItem(TournamentParticipantQualifierTieBreakerModel qualifierTieBreakersItem) {
    this.qualifierTieBreakers.add(qualifierTieBreakersItem);
    return this;
  }

   /**
   * Get qualifierTieBreakers
   * @return qualifierTieBreakers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<TournamentParticipantQualifierTieBreakerModel> getQualifierTieBreakers() {
    return qualifierTieBreakers;
  }

  public void setQualifierTieBreakers(List<TournamentParticipantQualifierTieBreakerModel> qualifierTieBreakers) {
    this.qualifierTieBreakers = qualifierTieBreakers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentParticipantModel tournamentParticipantModel = (TournamentParticipantModel) o;
    return Objects.equals(this.tournamentId, tournamentParticipantModel.tournamentId) &&
        Objects.equals(this.entityParticipantId, tournamentParticipantModel.entityParticipantId) &&
        Objects.equals(this.entityParticipantProfile, tournamentParticipantModel.entityParticipantProfile) &&
        Objects.equals(this.joinDateTime, tournamentParticipantModel.joinDateTime) &&
        Objects.equals(this.isChallengeAggrssor, tournamentParticipantModel.isChallengeAggrssor) &&
        Objects.equals(this.tournamentRoleId, tournamentParticipantModel.tournamentRoleId) &&
        Objects.equals(this.tournamentRoleName, tournamentParticipantModel.tournamentRoleName) &&
        Objects.equals(this.isAccepted, tournamentParticipantModel.isAccepted) &&
        Objects.equals(this.statistics, tournamentParticipantModel.statistics) &&
        Objects.equals(this.finalPlacement, tournamentParticipantModel.finalPlacement) &&
        Objects.equals(this.seededPlacement, tournamentParticipantModel.seededPlacement) &&
        Objects.equals(this.flaggedAsCheater, tournamentParticipantModel.flaggedAsCheater) &&
        Objects.equals(this.hasDismissedResults, tournamentParticipantModel.hasDismissedResults) &&
        Objects.equals(this.prizeAwardedAmount, tournamentParticipantModel.prizeAwardedAmount) &&
        Objects.equals(this.otherPrizeAwarded, tournamentParticipantModel.otherPrizeAwarded) &&
        Objects.equals(this.matchPlayStatisticsId, tournamentParticipantModel.matchPlayStatisticsId) &&
        Objects.equals(this.isCheckedIn, tournamentParticipantModel.isCheckedIn) &&
        Objects.equals(this.checkedInDateTime, tournamentParticipantModel.checkedInDateTime) &&
        Objects.equals(this.isStandBy, tournamentParticipantModel.isStandBy) &&
        Objects.equals(this.standByPosition, tournamentParticipantModel.standByPosition) &&
        Objects.equals(this.qualifierGroupNumber, tournamentParticipantModel.qualifierGroupNumber) &&
        Objects.equals(this.qualifierGroupSeedNumber, tournamentParticipantModel.qualifierGroupSeedNumber) &&
        Objects.equals(this.qualifierWinCount, tournamentParticipantModel.qualifierWinCount) &&
        Objects.equals(this.qualifierLossCount, tournamentParticipantModel.qualifierLossCount) &&
        Objects.equals(this.qualifierTieCount, tournamentParticipantModel.qualifierTieCount) &&
        Objects.equals(this.qualifierTotalPoints, tournamentParticipantModel.qualifierTotalPoints) &&
        Objects.equals(this.qualifierLastTotalPoints, tournamentParticipantModel.qualifierLastTotalPoints) &&
        Objects.equals(this.qualifierRankingPosition, tournamentParticipantModel.qualifierRankingPosition) &&
        Objects.equals(this.qualifierLastRankingPosition, tournamentParticipantModel.qualifierLastRankingPosition) &&
        Objects.equals(this.qualifierScoreLastUpdate, tournamentParticipantModel.qualifierScoreLastUpdate) &&
        Objects.equals(this.qualifierCurrentRoundNumber, tournamentParticipantModel.qualifierCurrentRoundNumber) &&
        Objects.equals(this.quitAfterLive, tournamentParticipantModel.quitAfterLive) &&
        Objects.equals(this.quitAfterLiveDateTime, tournamentParticipantModel.quitAfterLiveDateTime) &&
        Objects.equals(this.removedAfterLive, tournamentParticipantModel.removedAfterLive) &&
        Objects.equals(this.removedAfterLiveDateTime, tournamentParticipantModel.removedAfterLiveDateTime) &&
        Objects.equals(this.qualifierTieBreakers, tournamentParticipantModel.qualifierTieBreakers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tournamentId, entityParticipantId, entityParticipantProfile, joinDateTime, isChallengeAggrssor, tournamentRoleId, tournamentRoleName, isAccepted, statistics, finalPlacement, seededPlacement, flaggedAsCheater, hasDismissedResults, prizeAwardedAmount, otherPrizeAwarded, matchPlayStatisticsId, isCheckedIn, checkedInDateTime, isStandBy, standByPosition, qualifierGroupNumber, qualifierGroupSeedNumber, qualifierWinCount, qualifierLossCount, qualifierTieCount, qualifierTotalPoints, qualifierLastTotalPoints, qualifierRankingPosition, qualifierLastRankingPosition, qualifierScoreLastUpdate, qualifierCurrentRoundNumber, quitAfterLive, quitAfterLiveDateTime, removedAfterLive, removedAfterLiveDateTime, qualifierTieBreakers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentParticipantModel {\n");
    
    sb.append("    tournamentId: ").append(toIndentedString(tournamentId)).append("\n");
    sb.append("    entityParticipantId: ").append(toIndentedString(entityParticipantId)).append("\n");
    sb.append("    entityParticipantProfile: ").append(toIndentedString(entityParticipantProfile)).append("\n");
    sb.append("    joinDateTime: ").append(toIndentedString(joinDateTime)).append("\n");
    sb.append("    isChallengeAggrssor: ").append(toIndentedString(isChallengeAggrssor)).append("\n");
    sb.append("    tournamentRoleId: ").append(toIndentedString(tournamentRoleId)).append("\n");
    sb.append("    tournamentRoleName: ").append(toIndentedString(tournamentRoleName)).append("\n");
    sb.append("    isAccepted: ").append(toIndentedString(isAccepted)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    finalPlacement: ").append(toIndentedString(finalPlacement)).append("\n");
    sb.append("    seededPlacement: ").append(toIndentedString(seededPlacement)).append("\n");
    sb.append("    flaggedAsCheater: ").append(toIndentedString(flaggedAsCheater)).append("\n");
    sb.append("    hasDismissedResults: ").append(toIndentedString(hasDismissedResults)).append("\n");
    sb.append("    prizeAwardedAmount: ").append(toIndentedString(prizeAwardedAmount)).append("\n");
    sb.append("    otherPrizeAwarded: ").append(toIndentedString(otherPrizeAwarded)).append("\n");
    sb.append("    matchPlayStatisticsId: ").append(toIndentedString(matchPlayStatisticsId)).append("\n");
    sb.append("    isCheckedIn: ").append(toIndentedString(isCheckedIn)).append("\n");
    sb.append("    checkedInDateTime: ").append(toIndentedString(checkedInDateTime)).append("\n");
    sb.append("    isStandBy: ").append(toIndentedString(isStandBy)).append("\n");
    sb.append("    standByPosition: ").append(toIndentedString(standByPosition)).append("\n");
    sb.append("    qualifierGroupNumber: ").append(toIndentedString(qualifierGroupNumber)).append("\n");
    sb.append("    qualifierGroupSeedNumber: ").append(toIndentedString(qualifierGroupSeedNumber)).append("\n");
    sb.append("    qualifierWinCount: ").append(toIndentedString(qualifierWinCount)).append("\n");
    sb.append("    qualifierLossCount: ").append(toIndentedString(qualifierLossCount)).append("\n");
    sb.append("    qualifierTieCount: ").append(toIndentedString(qualifierTieCount)).append("\n");
    sb.append("    qualifierTotalPoints: ").append(toIndentedString(qualifierTotalPoints)).append("\n");
    sb.append("    qualifierLastTotalPoints: ").append(toIndentedString(qualifierLastTotalPoints)).append("\n");
    sb.append("    qualifierRankingPosition: ").append(toIndentedString(qualifierRankingPosition)).append("\n");
    sb.append("    qualifierLastRankingPosition: ").append(toIndentedString(qualifierLastRankingPosition)).append("\n");
    sb.append("    qualifierScoreLastUpdate: ").append(toIndentedString(qualifierScoreLastUpdate)).append("\n");
    sb.append("    qualifierCurrentRoundNumber: ").append(toIndentedString(qualifierCurrentRoundNumber)).append("\n");
    sb.append("    quitAfterLive: ").append(toIndentedString(quitAfterLive)).append("\n");
    sb.append("    quitAfterLiveDateTime: ").append(toIndentedString(quitAfterLiveDateTime)).append("\n");
    sb.append("    removedAfterLive: ").append(toIndentedString(removedAfterLive)).append("\n");
    sb.append("    removedAfterLiveDateTime: ").append(toIndentedString(removedAfterLiveDateTime)).append("\n");
    sb.append("    qualifierTieBreakers: ").append(toIndentedString(qualifierTieBreakers)).append("\n");
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

