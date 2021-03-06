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
import org.joda.time.DateTime;

/**
 * EntityStreamingModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class EntityStreamingModel {
  @SerializedName("EntityId")
  private Long entityId = null;

  @SerializedName("EntityName")
  private String entityName = null;

  @SerializedName("StreamName")
  private String streamName = null;

  @SerializedName("StreamLink")
  private String streamLink = null;

  @SerializedName("StreamCurrentlyActive")
  private Boolean streamCurrentlyActive = null;

  @SerializedName("StreamActiveViewers")
  private Integer streamActiveViewers = null;

  @SerializedName("LastUpdatedDateTime")
  private DateTime lastUpdatedDateTime = null;

  @SerializedName("StreamImageLarge")
  private String streamImageLarge = null;

  @SerializedName("StreamImageMedium")
  private String streamImageMedium = null;

  @SerializedName("StreamImageSmall")
  private String streamImageSmall = null;

  @SerializedName("GameName")
  private String gameName = null;

  @SerializedName("GameId")
  private Integer gameId = null;

  @SerializedName("GameShortCode")
  private String gameShortCode = null;

  @SerializedName("StreamingServiceId")
  private Integer streamingServiceId = null;

  @SerializedName("StreamingService")
  private String streamingService = null;

  @SerializedName("SourceName")
  private String sourceName = null;

  public EntityStreamingModel entityId(Long entityId) {
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

  public EntityStreamingModel entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntityStreamingModel streamName(String streamName) {
    this.streamName = streamName;
    return this;
  }

   /**
   * Get streamName
   * @return streamName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }

  public EntityStreamingModel streamLink(String streamLink) {
    this.streamLink = streamLink;
    return this;
  }

   /**
   * Get streamLink
   * @return streamLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamLink() {
    return streamLink;
  }

  public void setStreamLink(String streamLink) {
    this.streamLink = streamLink;
  }

  public EntityStreamingModel streamCurrentlyActive(Boolean streamCurrentlyActive) {
    this.streamCurrentlyActive = streamCurrentlyActive;
    return this;
  }

   /**
   * Get streamCurrentlyActive
   * @return streamCurrentlyActive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStreamCurrentlyActive() {
    return streamCurrentlyActive;
  }

  public void setStreamCurrentlyActive(Boolean streamCurrentlyActive) {
    this.streamCurrentlyActive = streamCurrentlyActive;
  }

  public EntityStreamingModel streamActiveViewers(Integer streamActiveViewers) {
    this.streamActiveViewers = streamActiveViewers;
    return this;
  }

   /**
   * Get streamActiveViewers
   * @return streamActiveViewers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStreamActiveViewers() {
    return streamActiveViewers;
  }

  public void setStreamActiveViewers(Integer streamActiveViewers) {
    this.streamActiveViewers = streamActiveViewers;
  }

  public EntityStreamingModel lastUpdatedDateTime(DateTime lastUpdatedDateTime) {
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

  public EntityStreamingModel streamImageLarge(String streamImageLarge) {
    this.streamImageLarge = streamImageLarge;
    return this;
  }

   /**
   * Get streamImageLarge
   * @return streamImageLarge
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamImageLarge() {
    return streamImageLarge;
  }

  public void setStreamImageLarge(String streamImageLarge) {
    this.streamImageLarge = streamImageLarge;
  }

  public EntityStreamingModel streamImageMedium(String streamImageMedium) {
    this.streamImageMedium = streamImageMedium;
    return this;
  }

   /**
   * Get streamImageMedium
   * @return streamImageMedium
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamImageMedium() {
    return streamImageMedium;
  }

  public void setStreamImageMedium(String streamImageMedium) {
    this.streamImageMedium = streamImageMedium;
  }

  public EntityStreamingModel streamImageSmall(String streamImageSmall) {
    this.streamImageSmall = streamImageSmall;
    return this;
  }

   /**
   * Get streamImageSmall
   * @return streamImageSmall
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamImageSmall() {
    return streamImageSmall;
  }

  public void setStreamImageSmall(String streamImageSmall) {
    this.streamImageSmall = streamImageSmall;
  }

  public EntityStreamingModel gameName(String gameName) {
    this.gameName = gameName;
    return this;
  }

   /**
   * Get gameName
   * @return gameName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public EntityStreamingModel gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Get gameId
   * @return gameId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public EntityStreamingModel gameShortCode(String gameShortCode) {
    this.gameShortCode = gameShortCode;
    return this;
  }

   /**
   * Get gameShortCode
   * @return gameShortCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGameShortCode() {
    return gameShortCode;
  }

  public void setGameShortCode(String gameShortCode) {
    this.gameShortCode = gameShortCode;
  }

  public EntityStreamingModel streamingServiceId(Integer streamingServiceId) {
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

  public EntityStreamingModel streamingService(String streamingService) {
    this.streamingService = streamingService;
    return this;
  }

   /**
   * Get streamingService
   * @return streamingService
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamingService() {
    return streamingService;
  }

  public void setStreamingService(String streamingService) {
    this.streamingService = streamingService;
  }

  public EntityStreamingModel sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Get sourceName
   * @return sourceName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityStreamingModel entityStreamingModel = (EntityStreamingModel) o;
    return Objects.equals(this.entityId, entityStreamingModel.entityId) &&
        Objects.equals(this.entityName, entityStreamingModel.entityName) &&
        Objects.equals(this.streamName, entityStreamingModel.streamName) &&
        Objects.equals(this.streamLink, entityStreamingModel.streamLink) &&
        Objects.equals(this.streamCurrentlyActive, entityStreamingModel.streamCurrentlyActive) &&
        Objects.equals(this.streamActiveViewers, entityStreamingModel.streamActiveViewers) &&
        Objects.equals(this.lastUpdatedDateTime, entityStreamingModel.lastUpdatedDateTime) &&
        Objects.equals(this.streamImageLarge, entityStreamingModel.streamImageLarge) &&
        Objects.equals(this.streamImageMedium, entityStreamingModel.streamImageMedium) &&
        Objects.equals(this.streamImageSmall, entityStreamingModel.streamImageSmall) &&
        Objects.equals(this.gameName, entityStreamingModel.gameName) &&
        Objects.equals(this.gameId, entityStreamingModel.gameId) &&
        Objects.equals(this.gameShortCode, entityStreamingModel.gameShortCode) &&
        Objects.equals(this.streamingServiceId, entityStreamingModel.streamingServiceId) &&
        Objects.equals(this.streamingService, entityStreamingModel.streamingService) &&
        Objects.equals(this.sourceName, entityStreamingModel.sourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityName, streamName, streamLink, streamCurrentlyActive, streamActiveViewers, lastUpdatedDateTime, streamImageLarge, streamImageMedium, streamImageSmall, gameName, gameId, gameShortCode, streamingServiceId, streamingService, sourceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityStreamingModel {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
    sb.append("    streamLink: ").append(toIndentedString(streamLink)).append("\n");
    sb.append("    streamCurrentlyActive: ").append(toIndentedString(streamCurrentlyActive)).append("\n");
    sb.append("    streamActiveViewers: ").append(toIndentedString(streamActiveViewers)).append("\n");
    sb.append("    lastUpdatedDateTime: ").append(toIndentedString(lastUpdatedDateTime)).append("\n");
    sb.append("    streamImageLarge: ").append(toIndentedString(streamImageLarge)).append("\n");
    sb.append("    streamImageMedium: ").append(toIndentedString(streamImageMedium)).append("\n");
    sb.append("    streamImageSmall: ").append(toIndentedString(streamImageSmall)).append("\n");
    sb.append("    gameName: ").append(toIndentedString(gameName)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    gameShortCode: ").append(toIndentedString(gameShortCode)).append("\n");
    sb.append("    streamingServiceId: ").append(toIndentedString(streamingServiceId)).append("\n");
    sb.append("    streamingService: ").append(toIndentedString(streamingService)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
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

