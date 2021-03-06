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
import io.swagger.client.model.GameTitleOutputModel;
import org.joda.time.DateTime;

/**
 * TournamentCoreModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentCoreModel {
  @SerializedName("TournamentIsComplete")
  private Boolean tournamentIsComplete = null;

  @SerializedName("TournamentIsLive")
  private Boolean tournamentIsLive = null;

  @SerializedName("TournamentLiveDateTime")
  private DateTime tournamentLiveDateTime = null;

  @SerializedName("TournamentId")
  private Long tournamentId = null;

  @SerializedName("TournamentTitle")
  private String tournamentTitle = null;

  @SerializedName("TournamentSubTitle")
  private String tournamentSubTitle = null;

  @SerializedName("HighlightColor")
  private String highlightColor = null;

  @SerializedName("TournamentDescription")
  private String tournamentDescription = null;

  @SerializedName("MatchConnectionInstructions")
  private String matchConnectionInstructions = null;

  @SerializedName("GameTitleId")
  private Integer gameTitleId = null;

  @SerializedName("IsTeamTournament")
  private Boolean isTeamTournament = null;

  @SerializedName("MinimumNumberOfEntities")
  private Integer minimumNumberOfEntities = null;

  @SerializedName("MaximumNumberOfEntities")
  private Integer maximumNumberOfEntities = null;

  @SerializedName("TeamSize")
  private Integer teamSize = null;

  @SerializedName("TournamentTypeId")
  private Integer tournamentTypeId = null;

  @SerializedName("OriginalTournamentTypeId")
  private Integer originalTournamentTypeId = null;

  @SerializedName("TournamentTypeName")
  private String tournamentTypeName = null;

  @SerializedName("TournamentFeeAmount")
  private Double tournamentFeeAmount = null;

  @SerializedName("TournamentStartDateTime")
  private DateTime tournamentStartDateTime = null;

  @SerializedName("TournamentEndDateTime")
  private DateTime tournamentEndDateTime = null;

  @SerializedName("RegistrationCutoffDateTime")
  private DateTime registrationCutoffDateTime = null;

  @SerializedName("IsPublic")
  private Boolean isPublic = null;

  @SerializedName("IsFavorite")
  private Boolean isFavorite = null;

  @SerializedName("EnableMatchLobby")
  private Boolean enableMatchLobby = null;

  @SerializedName("LogoIsBorderless")
  private Boolean logoIsBorderless = null;

  @SerializedName("LogoUrl")
  private String logoUrl = null;

  @SerializedName("BackgroundUrl")
  private String backgroundUrl = null;

  @SerializedName("LogoRelativeUrl")
  private String logoRelativeUrl = null;

  @SerializedName("BackgroundRelativeUrl")
  private String backgroundRelativeUrl = null;

  @SerializedName("BackgroundHomeUrl")
  private String backgroundHomeUrl = null;

  @SerializedName("BackgroundHomeRelativeUrl")
  private String backgroundHomeRelativeUrl = null;

  @SerializedName("BackgroundSearchUrl")
  private String backgroundSearchUrl = null;

  @SerializedName("BackgroundSearchRelativeUrl")
  private String backgroundSearchRelativeUrl = null;

  @SerializedName("JoinPasswordRequired")
  private Boolean joinPasswordRequired = null;

  @SerializedName("HasConsolationRound")
  private Boolean hasConsolationRound = null;

  @SerializedName("CurrentNumberOfParticipants")
  private Integer currentNumberOfParticipants = null;

  @SerializedName("Game")
  private GameTitleOutputModel game = null;

  @SerializedName("LastUpdatedDateTime")
  private DateTime lastUpdatedDateTime = null;

  @SerializedName("WebsiteUrl")
  private String websiteUrl = null;

  @SerializedName("FacebookUrl")
  private String facebookUrl = null;

  @SerializedName("TwitchUrl")
  private String twitchUrl = null;

  @SerializedName("InstagramUrl")
  private String instagramUrl = null;

  @SerializedName("TwitterUrl")
  private String twitterUrl = null;

  public TournamentCoreModel tournamentIsComplete(Boolean tournamentIsComplete) {
    this.tournamentIsComplete = tournamentIsComplete;
    return this;
  }

   /**
   * Get tournamentIsComplete
   * @return tournamentIsComplete
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTournamentIsComplete() {
    return tournamentIsComplete;
  }

  public void setTournamentIsComplete(Boolean tournamentIsComplete) {
    this.tournamentIsComplete = tournamentIsComplete;
  }

  public TournamentCoreModel tournamentIsLive(Boolean tournamentIsLive) {
    this.tournamentIsLive = tournamentIsLive;
    return this;
  }

   /**
   * Get tournamentIsLive
   * @return tournamentIsLive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTournamentIsLive() {
    return tournamentIsLive;
  }

  public void setTournamentIsLive(Boolean tournamentIsLive) {
    this.tournamentIsLive = tournamentIsLive;
  }

  public TournamentCoreModel tournamentLiveDateTime(DateTime tournamentLiveDateTime) {
    this.tournamentLiveDateTime = tournamentLiveDateTime;
    return this;
  }

   /**
   * Get tournamentLiveDateTime
   * @return tournamentLiveDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTournamentLiveDateTime() {
    return tournamentLiveDateTime;
  }

  public void setTournamentLiveDateTime(DateTime tournamentLiveDateTime) {
    this.tournamentLiveDateTime = tournamentLiveDateTime;
  }

  public TournamentCoreModel tournamentId(Long tournamentId) {
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

  public TournamentCoreModel tournamentTitle(String tournamentTitle) {
    this.tournamentTitle = tournamentTitle;
    return this;
  }

   /**
   * Get tournamentTitle
   * @return tournamentTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentTitle() {
    return tournamentTitle;
  }

  public void setTournamentTitle(String tournamentTitle) {
    this.tournamentTitle = tournamentTitle;
  }

  public TournamentCoreModel tournamentSubTitle(String tournamentSubTitle) {
    this.tournamentSubTitle = tournamentSubTitle;
    return this;
  }

   /**
   * Get tournamentSubTitle
   * @return tournamentSubTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentSubTitle() {
    return tournamentSubTitle;
  }

  public void setTournamentSubTitle(String tournamentSubTitle) {
    this.tournamentSubTitle = tournamentSubTitle;
  }

  public TournamentCoreModel highlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
    return this;
  }

   /**
   * Get highlightColor
   * @return highlightColor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHighlightColor() {
    return highlightColor;
  }

  public void setHighlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
  }

  public TournamentCoreModel tournamentDescription(String tournamentDescription) {
    this.tournamentDescription = tournamentDescription;
    return this;
  }

   /**
   * Get tournamentDescription
   * @return tournamentDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentDescription() {
    return tournamentDescription;
  }

  public void setTournamentDescription(String tournamentDescription) {
    this.tournamentDescription = tournamentDescription;
  }

  public TournamentCoreModel matchConnectionInstructions(String matchConnectionInstructions) {
    this.matchConnectionInstructions = matchConnectionInstructions;
    return this;
  }

   /**
   * Get matchConnectionInstructions
   * @return matchConnectionInstructions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchConnectionInstructions() {
    return matchConnectionInstructions;
  }

  public void setMatchConnectionInstructions(String matchConnectionInstructions) {
    this.matchConnectionInstructions = matchConnectionInstructions;
  }

  public TournamentCoreModel gameTitleId(Integer gameTitleId) {
    this.gameTitleId = gameTitleId;
    return this;
  }

   /**
   * Get gameTitleId
   * @return gameTitleId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGameTitleId() {
    return gameTitleId;
  }

  public void setGameTitleId(Integer gameTitleId) {
    this.gameTitleId = gameTitleId;
  }

  public TournamentCoreModel isTeamTournament(Boolean isTeamTournament) {
    this.isTeamTournament = isTeamTournament;
    return this;
  }

   /**
   * Get isTeamTournament
   * @return isTeamTournament
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsTeamTournament() {
    return isTeamTournament;
  }

  public void setIsTeamTournament(Boolean isTeamTournament) {
    this.isTeamTournament = isTeamTournament;
  }

  public TournamentCoreModel minimumNumberOfEntities(Integer minimumNumberOfEntities) {
    this.minimumNumberOfEntities = minimumNumberOfEntities;
    return this;
  }

   /**
   * Get minimumNumberOfEntities
   * @return minimumNumberOfEntities
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMinimumNumberOfEntities() {
    return minimumNumberOfEntities;
  }

  public void setMinimumNumberOfEntities(Integer minimumNumberOfEntities) {
    this.minimumNumberOfEntities = minimumNumberOfEntities;
  }

  public TournamentCoreModel maximumNumberOfEntities(Integer maximumNumberOfEntities) {
    this.maximumNumberOfEntities = maximumNumberOfEntities;
    return this;
  }

   /**
   * Get maximumNumberOfEntities
   * @return maximumNumberOfEntities
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaximumNumberOfEntities() {
    return maximumNumberOfEntities;
  }

  public void setMaximumNumberOfEntities(Integer maximumNumberOfEntities) {
    this.maximumNumberOfEntities = maximumNumberOfEntities;
  }

  public TournamentCoreModel teamSize(Integer teamSize) {
    this.teamSize = teamSize;
    return this;
  }

   /**
   * Get teamSize
   * @return teamSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTeamSize() {
    return teamSize;
  }

  public void setTeamSize(Integer teamSize) {
    this.teamSize = teamSize;
  }

  public TournamentCoreModel tournamentTypeId(Integer tournamentTypeId) {
    this.tournamentTypeId = tournamentTypeId;
    return this;
  }

   /**
   * Get tournamentTypeId
   * @return tournamentTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTournamentTypeId() {
    return tournamentTypeId;
  }

  public void setTournamentTypeId(Integer tournamentTypeId) {
    this.tournamentTypeId = tournamentTypeId;
  }

  public TournamentCoreModel originalTournamentTypeId(Integer originalTournamentTypeId) {
    this.originalTournamentTypeId = originalTournamentTypeId;
    return this;
  }

   /**
   * Get originalTournamentTypeId
   * @return originalTournamentTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOriginalTournamentTypeId() {
    return originalTournamentTypeId;
  }

  public void setOriginalTournamentTypeId(Integer originalTournamentTypeId) {
    this.originalTournamentTypeId = originalTournamentTypeId;
  }

  public TournamentCoreModel tournamentTypeName(String tournamentTypeName) {
    this.tournamentTypeName = tournamentTypeName;
    return this;
  }

   /**
   * Get tournamentTypeName
   * @return tournamentTypeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentTypeName() {
    return tournamentTypeName;
  }

  public void setTournamentTypeName(String tournamentTypeName) {
    this.tournamentTypeName = tournamentTypeName;
  }

  public TournamentCoreModel tournamentFeeAmount(Double tournamentFeeAmount) {
    this.tournamentFeeAmount = tournamentFeeAmount;
    return this;
  }

   /**
   * Get tournamentFeeAmount
   * @return tournamentFeeAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTournamentFeeAmount() {
    return tournamentFeeAmount;
  }

  public void setTournamentFeeAmount(Double tournamentFeeAmount) {
    this.tournamentFeeAmount = tournamentFeeAmount;
  }

  public TournamentCoreModel tournamentStartDateTime(DateTime tournamentStartDateTime) {
    this.tournamentStartDateTime = tournamentStartDateTime;
    return this;
  }

   /**
   * Get tournamentStartDateTime
   * @return tournamentStartDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTournamentStartDateTime() {
    return tournamentStartDateTime;
  }

  public void setTournamentStartDateTime(DateTime tournamentStartDateTime) {
    this.tournamentStartDateTime = tournamentStartDateTime;
  }

  public TournamentCoreModel tournamentEndDateTime(DateTime tournamentEndDateTime) {
    this.tournamentEndDateTime = tournamentEndDateTime;
    return this;
  }

   /**
   * Get tournamentEndDateTime
   * @return tournamentEndDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTournamentEndDateTime() {
    return tournamentEndDateTime;
  }

  public void setTournamentEndDateTime(DateTime tournamentEndDateTime) {
    this.tournamentEndDateTime = tournamentEndDateTime;
  }

  public TournamentCoreModel registrationCutoffDateTime(DateTime registrationCutoffDateTime) {
    this.registrationCutoffDateTime = registrationCutoffDateTime;
    return this;
  }

   /**
   * Get registrationCutoffDateTime
   * @return registrationCutoffDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getRegistrationCutoffDateTime() {
    return registrationCutoffDateTime;
  }

  public void setRegistrationCutoffDateTime(DateTime registrationCutoffDateTime) {
    this.registrationCutoffDateTime = registrationCutoffDateTime;
  }

  public TournamentCoreModel isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Get isPublic
   * @return isPublic
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public TournamentCoreModel isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Get isFavorite
   * @return isFavorite
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public TournamentCoreModel enableMatchLobby(Boolean enableMatchLobby) {
    this.enableMatchLobby = enableMatchLobby;
    return this;
  }

   /**
   * Get enableMatchLobby
   * @return enableMatchLobby
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnableMatchLobby() {
    return enableMatchLobby;
  }

  public void setEnableMatchLobby(Boolean enableMatchLobby) {
    this.enableMatchLobby = enableMatchLobby;
  }

  public TournamentCoreModel logoIsBorderless(Boolean logoIsBorderless) {
    this.logoIsBorderless = logoIsBorderless;
    return this;
  }

   /**
   * Get logoIsBorderless
   * @return logoIsBorderless
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getLogoIsBorderless() {
    return logoIsBorderless;
  }

  public void setLogoIsBorderless(Boolean logoIsBorderless) {
    this.logoIsBorderless = logoIsBorderless;
  }

  public TournamentCoreModel logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public TournamentCoreModel backgroundUrl(String backgroundUrl) {
    this.backgroundUrl = backgroundUrl;
    return this;
  }

   /**
   * Get backgroundUrl
   * @return backgroundUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundUrl() {
    return backgroundUrl;
  }

  public void setBackgroundUrl(String backgroundUrl) {
    this.backgroundUrl = backgroundUrl;
  }

  public TournamentCoreModel logoRelativeUrl(String logoRelativeUrl) {
    this.logoRelativeUrl = logoRelativeUrl;
    return this;
  }

   /**
   * Get logoRelativeUrl
   * @return logoRelativeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLogoRelativeUrl() {
    return logoRelativeUrl;
  }

  public void setLogoRelativeUrl(String logoRelativeUrl) {
    this.logoRelativeUrl = logoRelativeUrl;
  }

  public TournamentCoreModel backgroundRelativeUrl(String backgroundRelativeUrl) {
    this.backgroundRelativeUrl = backgroundRelativeUrl;
    return this;
  }

   /**
   * Get backgroundRelativeUrl
   * @return backgroundRelativeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundRelativeUrl() {
    return backgroundRelativeUrl;
  }

  public void setBackgroundRelativeUrl(String backgroundRelativeUrl) {
    this.backgroundRelativeUrl = backgroundRelativeUrl;
  }

  public TournamentCoreModel backgroundHomeUrl(String backgroundHomeUrl) {
    this.backgroundHomeUrl = backgroundHomeUrl;
    return this;
  }

   /**
   * Get backgroundHomeUrl
   * @return backgroundHomeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundHomeUrl() {
    return backgroundHomeUrl;
  }

  public void setBackgroundHomeUrl(String backgroundHomeUrl) {
    this.backgroundHomeUrl = backgroundHomeUrl;
  }

  public TournamentCoreModel backgroundHomeRelativeUrl(String backgroundHomeRelativeUrl) {
    this.backgroundHomeRelativeUrl = backgroundHomeRelativeUrl;
    return this;
  }

   /**
   * Get backgroundHomeRelativeUrl
   * @return backgroundHomeRelativeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundHomeRelativeUrl() {
    return backgroundHomeRelativeUrl;
  }

  public void setBackgroundHomeRelativeUrl(String backgroundHomeRelativeUrl) {
    this.backgroundHomeRelativeUrl = backgroundHomeRelativeUrl;
  }

  public TournamentCoreModel backgroundSearchUrl(String backgroundSearchUrl) {
    this.backgroundSearchUrl = backgroundSearchUrl;
    return this;
  }

   /**
   * Get backgroundSearchUrl
   * @return backgroundSearchUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundSearchUrl() {
    return backgroundSearchUrl;
  }

  public void setBackgroundSearchUrl(String backgroundSearchUrl) {
    this.backgroundSearchUrl = backgroundSearchUrl;
  }

  public TournamentCoreModel backgroundSearchRelativeUrl(String backgroundSearchRelativeUrl) {
    this.backgroundSearchRelativeUrl = backgroundSearchRelativeUrl;
    return this;
  }

   /**
   * Get backgroundSearchRelativeUrl
   * @return backgroundSearchRelativeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundSearchRelativeUrl() {
    return backgroundSearchRelativeUrl;
  }

  public void setBackgroundSearchRelativeUrl(String backgroundSearchRelativeUrl) {
    this.backgroundSearchRelativeUrl = backgroundSearchRelativeUrl;
  }

  public TournamentCoreModel joinPasswordRequired(Boolean joinPasswordRequired) {
    this.joinPasswordRequired = joinPasswordRequired;
    return this;
  }

   /**
   * Get joinPasswordRequired
   * @return joinPasswordRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getJoinPasswordRequired() {
    return joinPasswordRequired;
  }

  public void setJoinPasswordRequired(Boolean joinPasswordRequired) {
    this.joinPasswordRequired = joinPasswordRequired;
  }

  public TournamentCoreModel hasConsolationRound(Boolean hasConsolationRound) {
    this.hasConsolationRound = hasConsolationRound;
    return this;
  }

   /**
   * Get hasConsolationRound
   * @return hasConsolationRound
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasConsolationRound() {
    return hasConsolationRound;
  }

  public void setHasConsolationRound(Boolean hasConsolationRound) {
    this.hasConsolationRound = hasConsolationRound;
  }

  public TournamentCoreModel currentNumberOfParticipants(Integer currentNumberOfParticipants) {
    this.currentNumberOfParticipants = currentNumberOfParticipants;
    return this;
  }

   /**
   * Get currentNumberOfParticipants
   * @return currentNumberOfParticipants
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCurrentNumberOfParticipants() {
    return currentNumberOfParticipants;
  }

  public void setCurrentNumberOfParticipants(Integer currentNumberOfParticipants) {
    this.currentNumberOfParticipants = currentNumberOfParticipants;
  }

  public TournamentCoreModel game(GameTitleOutputModel game) {
    this.game = game;
    return this;
  }

   /**
   * Get game
   * @return game
  **/
  @ApiModelProperty(example = "null", value = "")
  public GameTitleOutputModel getGame() {
    return game;
  }

  public void setGame(GameTitleOutputModel game) {
    this.game = game;
  }

  public TournamentCoreModel lastUpdatedDateTime(DateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
    return this;
  }

   /**
   * Get lastUpdatedDateTime
   * @return lastUpdatedDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastUpdatedDateTime() {
    return lastUpdatedDateTime;
  }

  public void setLastUpdatedDateTime(DateTime lastUpdatedDateTime) {
    this.lastUpdatedDateTime = lastUpdatedDateTime;
  }

  public TournamentCoreModel websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public TournamentCoreModel facebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
    return this;
  }

   /**
   * Get facebookUrl
   * @return facebookUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public TournamentCoreModel twitchUrl(String twitchUrl) {
    this.twitchUrl = twitchUrl;
    return this;
  }

   /**
   * Get twitchUrl
   * @return twitchUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTwitchUrl() {
    return twitchUrl;
  }

  public void setTwitchUrl(String twitchUrl) {
    this.twitchUrl = twitchUrl;
  }

  public TournamentCoreModel instagramUrl(String instagramUrl) {
    this.instagramUrl = instagramUrl;
    return this;
  }

   /**
   * Get instagramUrl
   * @return instagramUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInstagramUrl() {
    return instagramUrl;
  }

  public void setInstagramUrl(String instagramUrl) {
    this.instagramUrl = instagramUrl;
  }

  public TournamentCoreModel twitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
    return this;
  }

   /**
   * Get twitterUrl
   * @return twitterUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTwitterUrl() {
    return twitterUrl;
  }

  public void setTwitterUrl(String twitterUrl) {
    this.twitterUrl = twitterUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentCoreModel tournamentCoreModel = (TournamentCoreModel) o;
    return Objects.equals(this.tournamentIsComplete, tournamentCoreModel.tournamentIsComplete) &&
        Objects.equals(this.tournamentIsLive, tournamentCoreModel.tournamentIsLive) &&
        Objects.equals(this.tournamentLiveDateTime, tournamentCoreModel.tournamentLiveDateTime) &&
        Objects.equals(this.tournamentId, tournamentCoreModel.tournamentId) &&
        Objects.equals(this.tournamentTitle, tournamentCoreModel.tournamentTitle) &&
        Objects.equals(this.tournamentSubTitle, tournamentCoreModel.tournamentSubTitle) &&
        Objects.equals(this.highlightColor, tournamentCoreModel.highlightColor) &&
        Objects.equals(this.tournamentDescription, tournamentCoreModel.tournamentDescription) &&
        Objects.equals(this.matchConnectionInstructions, tournamentCoreModel.matchConnectionInstructions) &&
        Objects.equals(this.gameTitleId, tournamentCoreModel.gameTitleId) &&
        Objects.equals(this.isTeamTournament, tournamentCoreModel.isTeamTournament) &&
        Objects.equals(this.minimumNumberOfEntities, tournamentCoreModel.minimumNumberOfEntities) &&
        Objects.equals(this.maximumNumberOfEntities, tournamentCoreModel.maximumNumberOfEntities) &&
        Objects.equals(this.teamSize, tournamentCoreModel.teamSize) &&
        Objects.equals(this.tournamentTypeId, tournamentCoreModel.tournamentTypeId) &&
        Objects.equals(this.originalTournamentTypeId, tournamentCoreModel.originalTournamentTypeId) &&
        Objects.equals(this.tournamentTypeName, tournamentCoreModel.tournamentTypeName) &&
        Objects.equals(this.tournamentFeeAmount, tournamentCoreModel.tournamentFeeAmount) &&
        Objects.equals(this.tournamentStartDateTime, tournamentCoreModel.tournamentStartDateTime) &&
        Objects.equals(this.tournamentEndDateTime, tournamentCoreModel.tournamentEndDateTime) &&
        Objects.equals(this.registrationCutoffDateTime, tournamentCoreModel.registrationCutoffDateTime) &&
        Objects.equals(this.isPublic, tournamentCoreModel.isPublic) &&
        Objects.equals(this.isFavorite, tournamentCoreModel.isFavorite) &&
        Objects.equals(this.enableMatchLobby, tournamentCoreModel.enableMatchLobby) &&
        Objects.equals(this.logoIsBorderless, tournamentCoreModel.logoIsBorderless) &&
        Objects.equals(this.logoUrl, tournamentCoreModel.logoUrl) &&
        Objects.equals(this.backgroundUrl, tournamentCoreModel.backgroundUrl) &&
        Objects.equals(this.logoRelativeUrl, tournamentCoreModel.logoRelativeUrl) &&
        Objects.equals(this.backgroundRelativeUrl, tournamentCoreModel.backgroundRelativeUrl) &&
        Objects.equals(this.backgroundHomeUrl, tournamentCoreModel.backgroundHomeUrl) &&
        Objects.equals(this.backgroundHomeRelativeUrl, tournamentCoreModel.backgroundHomeRelativeUrl) &&
        Objects.equals(this.backgroundSearchUrl, tournamentCoreModel.backgroundSearchUrl) &&
        Objects.equals(this.backgroundSearchRelativeUrl, tournamentCoreModel.backgroundSearchRelativeUrl) &&
        Objects.equals(this.joinPasswordRequired, tournamentCoreModel.joinPasswordRequired) &&
        Objects.equals(this.hasConsolationRound, tournamentCoreModel.hasConsolationRound) &&
        Objects.equals(this.currentNumberOfParticipants, tournamentCoreModel.currentNumberOfParticipants) &&
        Objects.equals(this.game, tournamentCoreModel.game) &&
        Objects.equals(this.lastUpdatedDateTime, tournamentCoreModel.lastUpdatedDateTime) &&
        Objects.equals(this.websiteUrl, tournamentCoreModel.websiteUrl) &&
        Objects.equals(this.facebookUrl, tournamentCoreModel.facebookUrl) &&
        Objects.equals(this.twitchUrl, tournamentCoreModel.twitchUrl) &&
        Objects.equals(this.instagramUrl, tournamentCoreModel.instagramUrl) &&
        Objects.equals(this.twitterUrl, tournamentCoreModel.twitterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tournamentIsComplete, tournamentIsLive, tournamentLiveDateTime, tournamentId, tournamentTitle, tournamentSubTitle, highlightColor, tournamentDescription, matchConnectionInstructions, gameTitleId, isTeamTournament, minimumNumberOfEntities, maximumNumberOfEntities, teamSize, tournamentTypeId, originalTournamentTypeId, tournamentTypeName, tournamentFeeAmount, tournamentStartDateTime, tournamentEndDateTime, registrationCutoffDateTime, isPublic, isFavorite, enableMatchLobby, logoIsBorderless, logoUrl, backgroundUrl, logoRelativeUrl, backgroundRelativeUrl, backgroundHomeUrl, backgroundHomeRelativeUrl, backgroundSearchUrl, backgroundSearchRelativeUrl, joinPasswordRequired, hasConsolationRound, currentNumberOfParticipants, game, lastUpdatedDateTime, websiteUrl, facebookUrl, twitchUrl, instagramUrl, twitterUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentCoreModel {\n");
    
    sb.append("    tournamentIsComplete: ").append(toIndentedString(tournamentIsComplete)).append("\n");
    sb.append("    tournamentIsLive: ").append(toIndentedString(tournamentIsLive)).append("\n");
    sb.append("    tournamentLiveDateTime: ").append(toIndentedString(tournamentLiveDateTime)).append("\n");
    sb.append("    tournamentId: ").append(toIndentedString(tournamentId)).append("\n");
    sb.append("    tournamentTitle: ").append(toIndentedString(tournamentTitle)).append("\n");
    sb.append("    tournamentSubTitle: ").append(toIndentedString(tournamentSubTitle)).append("\n");
    sb.append("    highlightColor: ").append(toIndentedString(highlightColor)).append("\n");
    sb.append("    tournamentDescription: ").append(toIndentedString(tournamentDescription)).append("\n");
    sb.append("    matchConnectionInstructions: ").append(toIndentedString(matchConnectionInstructions)).append("\n");
    sb.append("    gameTitleId: ").append(toIndentedString(gameTitleId)).append("\n");
    sb.append("    isTeamTournament: ").append(toIndentedString(isTeamTournament)).append("\n");
    sb.append("    minimumNumberOfEntities: ").append(toIndentedString(minimumNumberOfEntities)).append("\n");
    sb.append("    maximumNumberOfEntities: ").append(toIndentedString(maximumNumberOfEntities)).append("\n");
    sb.append("    teamSize: ").append(toIndentedString(teamSize)).append("\n");
    sb.append("    tournamentTypeId: ").append(toIndentedString(tournamentTypeId)).append("\n");
    sb.append("    originalTournamentTypeId: ").append(toIndentedString(originalTournamentTypeId)).append("\n");
    sb.append("    tournamentTypeName: ").append(toIndentedString(tournamentTypeName)).append("\n");
    sb.append("    tournamentFeeAmount: ").append(toIndentedString(tournamentFeeAmount)).append("\n");
    sb.append("    tournamentStartDateTime: ").append(toIndentedString(tournamentStartDateTime)).append("\n");
    sb.append("    tournamentEndDateTime: ").append(toIndentedString(tournamentEndDateTime)).append("\n");
    sb.append("    registrationCutoffDateTime: ").append(toIndentedString(registrationCutoffDateTime)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    enableMatchLobby: ").append(toIndentedString(enableMatchLobby)).append("\n");
    sb.append("    logoIsBorderless: ").append(toIndentedString(logoIsBorderless)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    backgroundUrl: ").append(toIndentedString(backgroundUrl)).append("\n");
    sb.append("    logoRelativeUrl: ").append(toIndentedString(logoRelativeUrl)).append("\n");
    sb.append("    backgroundRelativeUrl: ").append(toIndentedString(backgroundRelativeUrl)).append("\n");
    sb.append("    backgroundHomeUrl: ").append(toIndentedString(backgroundHomeUrl)).append("\n");
    sb.append("    backgroundHomeRelativeUrl: ").append(toIndentedString(backgroundHomeRelativeUrl)).append("\n");
    sb.append("    backgroundSearchUrl: ").append(toIndentedString(backgroundSearchUrl)).append("\n");
    sb.append("    backgroundSearchRelativeUrl: ").append(toIndentedString(backgroundSearchRelativeUrl)).append("\n");
    sb.append("    joinPasswordRequired: ").append(toIndentedString(joinPasswordRequired)).append("\n");
    sb.append("    hasConsolationRound: ").append(toIndentedString(hasConsolationRound)).append("\n");
    sb.append("    currentNumberOfParticipants: ").append(toIndentedString(currentNumberOfParticipants)).append("\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    facebookUrl: ").append(toIndentedString(facebookUrl)).append("\n");
    sb.append("    twitchUrl: ").append(toIndentedString(twitchUrl)).append("\n");
    sb.append("    instagramUrl: ").append(toIndentedString(instagramUrl)).append("\n");
    sb.append("    twitterUrl: ").append(toIndentedString(twitterUrl)).append("\n");
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

