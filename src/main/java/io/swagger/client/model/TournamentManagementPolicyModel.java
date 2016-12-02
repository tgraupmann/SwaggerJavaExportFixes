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
import java.util.ArrayList;
import java.util.List;

/**
 * TournamentManagementPolicyModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentManagementPolicyModel {
  @SerializedName("TournamentManagementPolicyId")
  private Integer tournamentManagementPolicyId = null;

  @SerializedName("TournamentManagementPolicyName")
  private String tournamentManagementPolicyName = null;

  @SerializedName("TournamentManagementPolicyDescription")
  private String tournamentManagementPolicyDescription = null;

  @SerializedName("GroupPurchasePrice")
  private Double groupPurchasePrice = null;

  @SerializedName("GroupRenewalTimespan")
  private Integer groupRenewalTimespan = null;

  @SerializedName("AllowPurchaseOfGroup")
  private Boolean allowPurchaseOfGroup = null;

  @SerializedName("AllowTournamentCreation")
  private Boolean allowTournamentCreation = null;

  @SerializedName("LimitTournamentCreation")
  private Boolean limitTournamentCreation = null;

  @SerializedName("MaxConcurrentTournaments")
  private Integer maxConcurrentTournaments = null;

  @SerializedName("MaxTournamentsPerTimespan")
  private Integer maxTournamentsPerTimespan = null;

  @SerializedName("MaxTournamentsTimespanSeconds")
  private Integer maxTournamentsTimespanSeconds = null;

  @SerializedName("MaxParticipantsPerTournament")
  private Integer maxParticipantsPerTournament = null;

  @SerializedName("AllowPublicTournament")
  private Boolean allowPublicTournament = null;

  @SerializedName("AllowFormatSE")
  private Boolean allowFormatSE = null;

  @SerializedName("AllowFormatDE")
  private Boolean allowFormatDE = null;

  @SerializedName("AllowFormatQualifiers")
  private Boolean allowFormatQualifiers = null;

  @SerializedName("AllowConsolationPrizes")
  private Boolean allowConsolationPrizes = null;

  @SerializedName("AdvanceCreationTimeLimit")
  private Integer advanceCreationTimeLimit = null;

  @SerializedName("AllowGlobalRegion")
  private Boolean allowGlobalRegion = null;

  @SerializedName("AssignNewServerLimit")
  private Integer assignNewServerLimit = null;

  @SerializedName("AllowBrandedSponsorship")
  private Boolean allowBrandedSponsorship = null;

  @SerializedName("AllowAccessAnalytics")
  private Boolean allowAccessAnalytics = null;

  @SerializedName("MaximumTournamentAdmins")
  private Integer maximumTournamentAdmins = null;

  @SerializedName("AllowCountryRestrictions")
  private Boolean allowCountryRestrictions = null;

  @SerializedName("AllowStandByList")
  private Boolean allowStandByList = null;

  @SerializedName("AllowRepeatAndCycle")
  private Boolean allowRepeatAndCycle = null;

  @SerializedName("AllowLanMode")
  private Boolean allowLanMode = null;

  @SerializedName("AllowManualMode")
  private Boolean allowManualMode = null;

  @SerializedName("AuthorizedGameTitles")
  private List<Integer> authorizedGameTitles = new ArrayList<Integer>();

  public TournamentManagementPolicyModel tournamentManagementPolicyId(Integer tournamentManagementPolicyId) {
    this.tournamentManagementPolicyId = tournamentManagementPolicyId;
    return this;
  }

   /**
   * Get tournamentManagementPolicyId
   * @return tournamentManagementPolicyId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTournamentManagementPolicyId() {
    return tournamentManagementPolicyId;
  }

  public void setTournamentManagementPolicyId(Integer tournamentManagementPolicyId) {
    this.tournamentManagementPolicyId = tournamentManagementPolicyId;
  }

  public TournamentManagementPolicyModel tournamentManagementPolicyName(String tournamentManagementPolicyName) {
    this.tournamentManagementPolicyName = tournamentManagementPolicyName;
    return this;
  }

   /**
   * Get tournamentManagementPolicyName
   * @return tournamentManagementPolicyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentManagementPolicyName() {
    return tournamentManagementPolicyName;
  }

  public void setTournamentManagementPolicyName(String tournamentManagementPolicyName) {
    this.tournamentManagementPolicyName = tournamentManagementPolicyName;
  }

  public TournamentManagementPolicyModel tournamentManagementPolicyDescription(String tournamentManagementPolicyDescription) {
    this.tournamentManagementPolicyDescription = tournamentManagementPolicyDescription;
    return this;
  }

   /**
   * Get tournamentManagementPolicyDescription
   * @return tournamentManagementPolicyDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentManagementPolicyDescription() {
    return tournamentManagementPolicyDescription;
  }

  public void setTournamentManagementPolicyDescription(String tournamentManagementPolicyDescription) {
    this.tournamentManagementPolicyDescription = tournamentManagementPolicyDescription;
  }

  public TournamentManagementPolicyModel groupPurchasePrice(Double groupPurchasePrice) {
    this.groupPurchasePrice = groupPurchasePrice;
    return this;
  }

   /**
   * Get groupPurchasePrice
   * @return groupPurchasePrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getGroupPurchasePrice() {
    return groupPurchasePrice;
  }

  public void setGroupPurchasePrice(Double groupPurchasePrice) {
    this.groupPurchasePrice = groupPurchasePrice;
  }

  public TournamentManagementPolicyModel groupRenewalTimespan(Integer groupRenewalTimespan) {
    this.groupRenewalTimespan = groupRenewalTimespan;
    return this;
  }

   /**
   * Get groupRenewalTimespan
   * @return groupRenewalTimespan
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGroupRenewalTimespan() {
    return groupRenewalTimespan;
  }

  public void setGroupRenewalTimespan(Integer groupRenewalTimespan) {
    this.groupRenewalTimespan = groupRenewalTimespan;
  }

  public TournamentManagementPolicyModel allowPurchaseOfGroup(Boolean allowPurchaseOfGroup) {
    this.allowPurchaseOfGroup = allowPurchaseOfGroup;
    return this;
  }

   /**
   * Get allowPurchaseOfGroup
   * @return allowPurchaseOfGroup
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowPurchaseOfGroup() {
    return allowPurchaseOfGroup;
  }

  public void setAllowPurchaseOfGroup(Boolean allowPurchaseOfGroup) {
    this.allowPurchaseOfGroup = allowPurchaseOfGroup;
  }

  public TournamentManagementPolicyModel allowTournamentCreation(Boolean allowTournamentCreation) {
    this.allowTournamentCreation = allowTournamentCreation;
    return this;
  }

   /**
   * Get allowTournamentCreation
   * @return allowTournamentCreation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowTournamentCreation() {
    return allowTournamentCreation;
  }

  public void setAllowTournamentCreation(Boolean allowTournamentCreation) {
    this.allowTournamentCreation = allowTournamentCreation;
  }

  public TournamentManagementPolicyModel limitTournamentCreation(Boolean limitTournamentCreation) {
    this.limitTournamentCreation = limitTournamentCreation;
    return this;
  }

   /**
   * Get limitTournamentCreation
   * @return limitTournamentCreation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getLimitTournamentCreation() {
    return limitTournamentCreation;
  }

  public void setLimitTournamentCreation(Boolean limitTournamentCreation) {
    this.limitTournamentCreation = limitTournamentCreation;
  }

  public TournamentManagementPolicyModel maxConcurrentTournaments(Integer maxConcurrentTournaments) {
    this.maxConcurrentTournaments = maxConcurrentTournaments;
    return this;
  }

   /**
   * Get maxConcurrentTournaments
   * @return maxConcurrentTournaments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxConcurrentTournaments() {
    return maxConcurrentTournaments;
  }

  public void setMaxConcurrentTournaments(Integer maxConcurrentTournaments) {
    this.maxConcurrentTournaments = maxConcurrentTournaments;
  }

  public TournamentManagementPolicyModel maxTournamentsPerTimespan(Integer maxTournamentsPerTimespan) {
    this.maxTournamentsPerTimespan = maxTournamentsPerTimespan;
    return this;
  }

   /**
   * Get maxTournamentsPerTimespan
   * @return maxTournamentsPerTimespan
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxTournamentsPerTimespan() {
    return maxTournamentsPerTimespan;
  }

  public void setMaxTournamentsPerTimespan(Integer maxTournamentsPerTimespan) {
    this.maxTournamentsPerTimespan = maxTournamentsPerTimespan;
  }

  public TournamentManagementPolicyModel maxTournamentsTimespanSeconds(Integer maxTournamentsTimespanSeconds) {
    this.maxTournamentsTimespanSeconds = maxTournamentsTimespanSeconds;
    return this;
  }

   /**
   * Get maxTournamentsTimespanSeconds
   * @return maxTournamentsTimespanSeconds
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxTournamentsTimespanSeconds() {
    return maxTournamentsTimespanSeconds;
  }

  public void setMaxTournamentsTimespanSeconds(Integer maxTournamentsTimespanSeconds) {
    this.maxTournamentsTimespanSeconds = maxTournamentsTimespanSeconds;
  }

  public TournamentManagementPolicyModel maxParticipantsPerTournament(Integer maxParticipantsPerTournament) {
    this.maxParticipantsPerTournament = maxParticipantsPerTournament;
    return this;
  }

   /**
   * Get maxParticipantsPerTournament
   * @return maxParticipantsPerTournament
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxParticipantsPerTournament() {
    return maxParticipantsPerTournament;
  }

  public void setMaxParticipantsPerTournament(Integer maxParticipantsPerTournament) {
    this.maxParticipantsPerTournament = maxParticipantsPerTournament;
  }

  public TournamentManagementPolicyModel allowPublicTournament(Boolean allowPublicTournament) {
    this.allowPublicTournament = allowPublicTournament;
    return this;
  }

   /**
   * Get allowPublicTournament
   * @return allowPublicTournament
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowPublicTournament() {
    return allowPublicTournament;
  }

  public void setAllowPublicTournament(Boolean allowPublicTournament) {
    this.allowPublicTournament = allowPublicTournament;
  }

  public TournamentManagementPolicyModel allowFormatSE(Boolean allowFormatSE) {
    this.allowFormatSE = allowFormatSE;
    return this;
  }

   /**
   * Get allowFormatSE
   * @return allowFormatSE
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowFormatSE() {
    return allowFormatSE;
  }

  public void setAllowFormatSE(Boolean allowFormatSE) {
    this.allowFormatSE = allowFormatSE;
  }

  public TournamentManagementPolicyModel allowFormatDE(Boolean allowFormatDE) {
    this.allowFormatDE = allowFormatDE;
    return this;
  }

   /**
   * Get allowFormatDE
   * @return allowFormatDE
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowFormatDE() {
    return allowFormatDE;
  }

  public void setAllowFormatDE(Boolean allowFormatDE) {
    this.allowFormatDE = allowFormatDE;
  }

  public TournamentManagementPolicyModel allowFormatQualifiers(Boolean allowFormatQualifiers) {
    this.allowFormatQualifiers = allowFormatQualifiers;
    return this;
  }

   /**
   * Get allowFormatQualifiers
   * @return allowFormatQualifiers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowFormatQualifiers() {
    return allowFormatQualifiers;
  }

  public void setAllowFormatQualifiers(Boolean allowFormatQualifiers) {
    this.allowFormatQualifiers = allowFormatQualifiers;
  }

  public TournamentManagementPolicyModel allowConsolationPrizes(Boolean allowConsolationPrizes) {
    this.allowConsolationPrizes = allowConsolationPrizes;
    return this;
  }

   /**
   * Get allowConsolationPrizes
   * @return allowConsolationPrizes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowConsolationPrizes() {
    return allowConsolationPrizes;
  }

  public void setAllowConsolationPrizes(Boolean allowConsolationPrizes) {
    this.allowConsolationPrizes = allowConsolationPrizes;
  }

  public TournamentManagementPolicyModel advanceCreationTimeLimit(Integer advanceCreationTimeLimit) {
    this.advanceCreationTimeLimit = advanceCreationTimeLimit;
    return this;
  }

   /**
   * Get advanceCreationTimeLimit
   * @return advanceCreationTimeLimit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAdvanceCreationTimeLimit() {
    return advanceCreationTimeLimit;
  }

  public void setAdvanceCreationTimeLimit(Integer advanceCreationTimeLimit) {
    this.advanceCreationTimeLimit = advanceCreationTimeLimit;
  }

  public TournamentManagementPolicyModel allowGlobalRegion(Boolean allowGlobalRegion) {
    this.allowGlobalRegion = allowGlobalRegion;
    return this;
  }

   /**
   * Get allowGlobalRegion
   * @return allowGlobalRegion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowGlobalRegion() {
    return allowGlobalRegion;
  }

  public void setAllowGlobalRegion(Boolean allowGlobalRegion) {
    this.allowGlobalRegion = allowGlobalRegion;
  }

  public TournamentManagementPolicyModel assignNewServerLimit(Integer assignNewServerLimit) {
    this.assignNewServerLimit = assignNewServerLimit;
    return this;
  }

   /**
   * Get assignNewServerLimit
   * @return assignNewServerLimit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAssignNewServerLimit() {
    return assignNewServerLimit;
  }

  public void setAssignNewServerLimit(Integer assignNewServerLimit) {
    this.assignNewServerLimit = assignNewServerLimit;
  }

  public TournamentManagementPolicyModel allowBrandedSponsorship(Boolean allowBrandedSponsorship) {
    this.allowBrandedSponsorship = allowBrandedSponsorship;
    return this;
  }

   /**
   * Get allowBrandedSponsorship
   * @return allowBrandedSponsorship
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowBrandedSponsorship() {
    return allowBrandedSponsorship;
  }

  public void setAllowBrandedSponsorship(Boolean allowBrandedSponsorship) {
    this.allowBrandedSponsorship = allowBrandedSponsorship;
  }

  public TournamentManagementPolicyModel allowAccessAnalytics(Boolean allowAccessAnalytics) {
    this.allowAccessAnalytics = allowAccessAnalytics;
    return this;
  }

   /**
   * Get allowAccessAnalytics
   * @return allowAccessAnalytics
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowAccessAnalytics() {
    return allowAccessAnalytics;
  }

  public void setAllowAccessAnalytics(Boolean allowAccessAnalytics) {
    this.allowAccessAnalytics = allowAccessAnalytics;
  }

  public TournamentManagementPolicyModel maximumTournamentAdmins(Integer maximumTournamentAdmins) {
    this.maximumTournamentAdmins = maximumTournamentAdmins;
    return this;
  }

   /**
   * Get maximumTournamentAdmins
   * @return maximumTournamentAdmins
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaximumTournamentAdmins() {
    return maximumTournamentAdmins;
  }

  public void setMaximumTournamentAdmins(Integer maximumTournamentAdmins) {
    this.maximumTournamentAdmins = maximumTournamentAdmins;
  }

  public TournamentManagementPolicyModel allowCountryRestrictions(Boolean allowCountryRestrictions) {
    this.allowCountryRestrictions = allowCountryRestrictions;
    return this;
  }

   /**
   * Get allowCountryRestrictions
   * @return allowCountryRestrictions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowCountryRestrictions() {
    return allowCountryRestrictions;
  }

  public void setAllowCountryRestrictions(Boolean allowCountryRestrictions) {
    this.allowCountryRestrictions = allowCountryRestrictions;
  }

  public TournamentManagementPolicyModel allowStandByList(Boolean allowStandByList) {
    this.allowStandByList = allowStandByList;
    return this;
  }

   /**
   * Get allowStandByList
   * @return allowStandByList
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowStandByList() {
    return allowStandByList;
  }

  public void setAllowStandByList(Boolean allowStandByList) {
    this.allowStandByList = allowStandByList;
  }

  public TournamentManagementPolicyModel allowRepeatAndCycle(Boolean allowRepeatAndCycle) {
    this.allowRepeatAndCycle = allowRepeatAndCycle;
    return this;
  }

   /**
   * Get allowRepeatAndCycle
   * @return allowRepeatAndCycle
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowRepeatAndCycle() {
    return allowRepeatAndCycle;
  }

  public void setAllowRepeatAndCycle(Boolean allowRepeatAndCycle) {
    this.allowRepeatAndCycle = allowRepeatAndCycle;
  }

  public TournamentManagementPolicyModel allowLanMode(Boolean allowLanMode) {
    this.allowLanMode = allowLanMode;
    return this;
  }

   /**
   * Get allowLanMode
   * @return allowLanMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowLanMode() {
    return allowLanMode;
  }

  public void setAllowLanMode(Boolean allowLanMode) {
    this.allowLanMode = allowLanMode;
  }

  public TournamentManagementPolicyModel allowManualMode(Boolean allowManualMode) {
    this.allowManualMode = allowManualMode;
    return this;
  }

   /**
   * Get allowManualMode
   * @return allowManualMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowManualMode() {
    return allowManualMode;
  }

  public void setAllowManualMode(Boolean allowManualMode) {
    this.allowManualMode = allowManualMode;
  }

  public TournamentManagementPolicyModel authorizedGameTitles(List<Integer> authorizedGameTitles) {
    this.authorizedGameTitles = authorizedGameTitles;
    return this;
  }

  public TournamentManagementPolicyModel addAuthorizedGameTitlesItem(Integer authorizedGameTitlesItem) {
    this.authorizedGameTitles.add(authorizedGameTitlesItem);
    return this;
  }

   /**
   * Get authorizedGameTitles
   * @return authorizedGameTitles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getAuthorizedGameTitles() {
    return authorizedGameTitles;
  }

  public void setAuthorizedGameTitles(List<Integer> authorizedGameTitles) {
    this.authorizedGameTitles = authorizedGameTitles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentManagementPolicyModel tournamentManagementPolicyModel = (TournamentManagementPolicyModel) o;
    return Objects.equals(this.tournamentManagementPolicyId, tournamentManagementPolicyModel.tournamentManagementPolicyId) &&
        Objects.equals(this.tournamentManagementPolicyName, tournamentManagementPolicyModel.tournamentManagementPolicyName) &&
        Objects.equals(this.tournamentManagementPolicyDescription, tournamentManagementPolicyModel.tournamentManagementPolicyDescription) &&
        Objects.equals(this.groupPurchasePrice, tournamentManagementPolicyModel.groupPurchasePrice) &&
        Objects.equals(this.groupRenewalTimespan, tournamentManagementPolicyModel.groupRenewalTimespan) &&
        Objects.equals(this.allowPurchaseOfGroup, tournamentManagementPolicyModel.allowPurchaseOfGroup) &&
        Objects.equals(this.allowTournamentCreation, tournamentManagementPolicyModel.allowTournamentCreation) &&
        Objects.equals(this.limitTournamentCreation, tournamentManagementPolicyModel.limitTournamentCreation) &&
        Objects.equals(this.maxConcurrentTournaments, tournamentManagementPolicyModel.maxConcurrentTournaments) &&
        Objects.equals(this.maxTournamentsPerTimespan, tournamentManagementPolicyModel.maxTournamentsPerTimespan) &&
        Objects.equals(this.maxTournamentsTimespanSeconds, tournamentManagementPolicyModel.maxTournamentsTimespanSeconds) &&
        Objects.equals(this.maxParticipantsPerTournament, tournamentManagementPolicyModel.maxParticipantsPerTournament) &&
        Objects.equals(this.allowPublicTournament, tournamentManagementPolicyModel.allowPublicTournament) &&
        Objects.equals(this.allowFormatSE, tournamentManagementPolicyModel.allowFormatSE) &&
        Objects.equals(this.allowFormatDE, tournamentManagementPolicyModel.allowFormatDE) &&
        Objects.equals(this.allowFormatQualifiers, tournamentManagementPolicyModel.allowFormatQualifiers) &&
        Objects.equals(this.allowConsolationPrizes, tournamentManagementPolicyModel.allowConsolationPrizes) &&
        Objects.equals(this.advanceCreationTimeLimit, tournamentManagementPolicyModel.advanceCreationTimeLimit) &&
        Objects.equals(this.allowGlobalRegion, tournamentManagementPolicyModel.allowGlobalRegion) &&
        Objects.equals(this.assignNewServerLimit, tournamentManagementPolicyModel.assignNewServerLimit) &&
        Objects.equals(this.allowBrandedSponsorship, tournamentManagementPolicyModel.allowBrandedSponsorship) &&
        Objects.equals(this.allowAccessAnalytics, tournamentManagementPolicyModel.allowAccessAnalytics) &&
        Objects.equals(this.maximumTournamentAdmins, tournamentManagementPolicyModel.maximumTournamentAdmins) &&
        Objects.equals(this.allowCountryRestrictions, tournamentManagementPolicyModel.allowCountryRestrictions) &&
        Objects.equals(this.allowStandByList, tournamentManagementPolicyModel.allowStandByList) &&
        Objects.equals(this.allowRepeatAndCycle, tournamentManagementPolicyModel.allowRepeatAndCycle) &&
        Objects.equals(this.allowLanMode, tournamentManagementPolicyModel.allowLanMode) &&
        Objects.equals(this.allowManualMode, tournamentManagementPolicyModel.allowManualMode) &&
        Objects.equals(this.authorizedGameTitles, tournamentManagementPolicyModel.authorizedGameTitles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tournamentManagementPolicyId, tournamentManagementPolicyName, tournamentManagementPolicyDescription, groupPurchasePrice, groupRenewalTimespan, allowPurchaseOfGroup, allowTournamentCreation, limitTournamentCreation, maxConcurrentTournaments, maxTournamentsPerTimespan, maxTournamentsTimespanSeconds, maxParticipantsPerTournament, allowPublicTournament, allowFormatSE, allowFormatDE, allowFormatQualifiers, allowConsolationPrizes, advanceCreationTimeLimit, allowGlobalRegion, assignNewServerLimit, allowBrandedSponsorship, allowAccessAnalytics, maximumTournamentAdmins, allowCountryRestrictions, allowStandByList, allowRepeatAndCycle, allowLanMode, allowManualMode, authorizedGameTitles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentManagementPolicyModel {\n");
    
    sb.append("    tournamentManagementPolicyId: ").append(toIndentedString(tournamentManagementPolicyId)).append("\n");
    sb.append("    tournamentManagementPolicyName: ").append(toIndentedString(tournamentManagementPolicyName)).append("\n");
    sb.append("    tournamentManagementPolicyDescription: ").append(toIndentedString(tournamentManagementPolicyDescription)).append("\n");
    sb.append("    groupPurchasePrice: ").append(toIndentedString(groupPurchasePrice)).append("\n");
    sb.append("    groupRenewalTimespan: ").append(toIndentedString(groupRenewalTimespan)).append("\n");
    sb.append("    allowPurchaseOfGroup: ").append(toIndentedString(allowPurchaseOfGroup)).append("\n");
    sb.append("    allowTournamentCreation: ").append(toIndentedString(allowTournamentCreation)).append("\n");
    sb.append("    limitTournamentCreation: ").append(toIndentedString(limitTournamentCreation)).append("\n");
    sb.append("    maxConcurrentTournaments: ").append(toIndentedString(maxConcurrentTournaments)).append("\n");
    sb.append("    maxTournamentsPerTimespan: ").append(toIndentedString(maxTournamentsPerTimespan)).append("\n");
    sb.append("    maxTournamentsTimespanSeconds: ").append(toIndentedString(maxTournamentsTimespanSeconds)).append("\n");
    sb.append("    maxParticipantsPerTournament: ").append(toIndentedString(maxParticipantsPerTournament)).append("\n");
    sb.append("    allowPublicTournament: ").append(toIndentedString(allowPublicTournament)).append("\n");
    sb.append("    allowFormatSE: ").append(toIndentedString(allowFormatSE)).append("\n");
    sb.append("    allowFormatDE: ").append(toIndentedString(allowFormatDE)).append("\n");
    sb.append("    allowFormatQualifiers: ").append(toIndentedString(allowFormatQualifiers)).append("\n");
    sb.append("    allowConsolationPrizes: ").append(toIndentedString(allowConsolationPrizes)).append("\n");
    sb.append("    advanceCreationTimeLimit: ").append(toIndentedString(advanceCreationTimeLimit)).append("\n");
    sb.append("    allowGlobalRegion: ").append(toIndentedString(allowGlobalRegion)).append("\n");
    sb.append("    assignNewServerLimit: ").append(toIndentedString(assignNewServerLimit)).append("\n");
    sb.append("    allowBrandedSponsorship: ").append(toIndentedString(allowBrandedSponsorship)).append("\n");
    sb.append("    allowAccessAnalytics: ").append(toIndentedString(allowAccessAnalytics)).append("\n");
    sb.append("    maximumTournamentAdmins: ").append(toIndentedString(maximumTournamentAdmins)).append("\n");
    sb.append("    allowCountryRestrictions: ").append(toIndentedString(allowCountryRestrictions)).append("\n");
    sb.append("    allowStandByList: ").append(toIndentedString(allowStandByList)).append("\n");
    sb.append("    allowRepeatAndCycle: ").append(toIndentedString(allowRepeatAndCycle)).append("\n");
    sb.append("    allowLanMode: ").append(toIndentedString(allowLanMode)).append("\n");
    sb.append("    allowManualMode: ").append(toIndentedString(allowManualMode)).append("\n");
    sb.append("    authorizedGameTitles: ").append(toIndentedString(authorizedGameTitles)).append("\n");
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

