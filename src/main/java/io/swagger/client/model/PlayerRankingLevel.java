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
 * PlayerRankingLevel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class PlayerRankingLevel {
  @SerializedName("LevelNumber")
  private Integer levelNumber = null;

  @SerializedName("ExperiencePointsRequired")
  private Long experiencePointsRequired = null;

  @SerializedName("ExperiencePointsRequiredToNext")
  private Long experiencePointsRequiredToNext = null;

  @SerializedName("CurrentExperiencePoints")
  private Long currentExperiencePoints = null;

  @SerializedName("ExperiencePointsRemaining")
  private Long experiencePointsRemaining = null;

  @SerializedName("ArenaRankTitle")
  private String arenaRankTitle = null;

  /**
   * Gets or Sets arenaRank
   */
  public enum ArenaRankEnum {
    @SerializedName("0")
    NUMBER_0(0),
    
    @SerializedName("1")
    NUMBER_1(1),
    
    @SerializedName("2")
    NUMBER_2(2),
    
    @SerializedName("3")
    NUMBER_3(3),
    
    @SerializedName("4")
    NUMBER_4(4),
    
    @SerializedName("5")
    NUMBER_5(5),
    
    @SerializedName("6")
    NUMBER_6(6),
    
    @SerializedName("7")
    NUMBER_7(7),
    
    @SerializedName("8")
    NUMBER_8(8),
    
    @SerializedName("9")
    NUMBER_9(9),
    
    @SerializedName("10")
    NUMBER_10(10);

    private Integer value;

    ArenaRankEnum(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ArenaRank")
  private ArenaRankEnum arenaRank = null;

  public PlayerRankingLevel levelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

   /**
   * Get levelNumber
   * @return levelNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(Integer levelNumber) {
    this.levelNumber = levelNumber;
  }

  public PlayerRankingLevel experiencePointsRequired(Long experiencePointsRequired) {
    this.experiencePointsRequired = experiencePointsRequired;
    return this;
  }

   /**
   * Get experiencePointsRequired
   * @return experiencePointsRequired
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExperiencePointsRequired() {
    return experiencePointsRequired;
  }

  public void setExperiencePointsRequired(Long experiencePointsRequired) {
    this.experiencePointsRequired = experiencePointsRequired;
  }

  public PlayerRankingLevel experiencePointsRequiredToNext(Long experiencePointsRequiredToNext) {
    this.experiencePointsRequiredToNext = experiencePointsRequiredToNext;
    return this;
  }

   /**
   * Get experiencePointsRequiredToNext
   * @return experiencePointsRequiredToNext
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExperiencePointsRequiredToNext() {
    return experiencePointsRequiredToNext;
  }

  public void setExperiencePointsRequiredToNext(Long experiencePointsRequiredToNext) {
    this.experiencePointsRequiredToNext = experiencePointsRequiredToNext;
  }

  public PlayerRankingLevel currentExperiencePoints(Long currentExperiencePoints) {
    this.currentExperiencePoints = currentExperiencePoints;
    return this;
  }

   /**
   * Get currentExperiencePoints
   * @return currentExperiencePoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCurrentExperiencePoints() {
    return currentExperiencePoints;
  }

  public void setCurrentExperiencePoints(Long currentExperiencePoints) {
    this.currentExperiencePoints = currentExperiencePoints;
  }

  public PlayerRankingLevel experiencePointsRemaining(Long experiencePointsRemaining) {
    this.experiencePointsRemaining = experiencePointsRemaining;
    return this;
  }

   /**
   * Get experiencePointsRemaining
   * @return experiencePointsRemaining
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExperiencePointsRemaining() {
    return experiencePointsRemaining;
  }

  public void setExperiencePointsRemaining(Long experiencePointsRemaining) {
    this.experiencePointsRemaining = experiencePointsRemaining;
  }

  public PlayerRankingLevel arenaRankTitle(String arenaRankTitle) {
    this.arenaRankTitle = arenaRankTitle;
    return this;
  }

   /**
   * Get arenaRankTitle
   * @return arenaRankTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArenaRankTitle() {
    return arenaRankTitle;
  }

  public void setArenaRankTitle(String arenaRankTitle) {
    this.arenaRankTitle = arenaRankTitle;
  }

  public PlayerRankingLevel arenaRank(ArenaRankEnum arenaRank) {
    this.arenaRank = arenaRank;
    return this;
  }

   /**
   * Get arenaRank
   * @return arenaRank
  **/
  @ApiModelProperty(example = "null", value = "")
  public ArenaRankEnum getArenaRank() {
    return arenaRank;
  }

  public void setArenaRank(ArenaRankEnum arenaRank) {
    this.arenaRank = arenaRank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerRankingLevel playerRankingLevel = (PlayerRankingLevel) o;
    return Objects.equals(this.levelNumber, playerRankingLevel.levelNumber) &&
        Objects.equals(this.experiencePointsRequired, playerRankingLevel.experiencePointsRequired) &&
        Objects.equals(this.experiencePointsRequiredToNext, playerRankingLevel.experiencePointsRequiredToNext) &&
        Objects.equals(this.currentExperiencePoints, playerRankingLevel.currentExperiencePoints) &&
        Objects.equals(this.experiencePointsRemaining, playerRankingLevel.experiencePointsRemaining) &&
        Objects.equals(this.arenaRankTitle, playerRankingLevel.arenaRankTitle) &&
        Objects.equals(this.arenaRank, playerRankingLevel.arenaRank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelNumber, experiencePointsRequired, experiencePointsRequiredToNext, currentExperiencePoints, experiencePointsRemaining, arenaRankTitle, arenaRank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerRankingLevel {\n");
    
    sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
    sb.append("    experiencePointsRequired: ").append(toIndentedString(experiencePointsRequired)).append("\n");
    sb.append("    experiencePointsRequiredToNext: ").append(toIndentedString(experiencePointsRequiredToNext)).append("\n");
    sb.append("    currentExperiencePoints: ").append(toIndentedString(currentExperiencePoints)).append("\n");
    sb.append("    experiencePointsRemaining: ").append(toIndentedString(experiencePointsRemaining)).append("\n");
    sb.append("    arenaRankTitle: ").append(toIndentedString(arenaRankTitle)).append("\n");
    sb.append("    arenaRank: ").append(toIndentedString(arenaRank)).append("\n");
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
