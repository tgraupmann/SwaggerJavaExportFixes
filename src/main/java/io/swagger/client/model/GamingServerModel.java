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
import org.joda.time.DateTime;

/**
 * GamingServerModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class GamingServerModel {
  @SerializedName("GamingServerId")
  private Integer gamingServerId = null;

  @SerializedName("GameTitleId")
  private Integer gameTitleId = null;

  @SerializedName("GameName")
  private String gameName = null;

  @SerializedName("GamingServerAddedDateTime")
  private DateTime gamingServerAddedDateTime = null;

  @SerializedName("GamingServerTypeCode")
  private String gamingServerTypeCode = null;

  @SerializedName("GamingServerTypeId")
  private Integer gamingServerTypeId = null;

  @SerializedName("GamingServerTypeName")
  private String gamingServerTypeName = null;

  @SerializedName("GamingServerLocationId")
  private Integer gamingServerLocationId = null;

  @SerializedName("GamingServerCityName")
  private String gamingServerCityName = null;

  @SerializedName("AddressCountryId")
  private Integer addressCountryId = null;

  @SerializedName("AddressCountry")
  private AddressCountryModel addressCountry = null;

  @SerializedName("GamingServerRegionId")
  private Integer gamingServerRegionId = null;

  @SerializedName("GamingServerRegionName")
  private String gamingServerRegionName = null;

  @SerializedName("GamingServerName")
  private String gamingServerName = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("StreamingPort")
  private String streamingPort = null;

  @SerializedName("GamePort")
  private String gamePort = null;

  @SerializedName("GameQueryPort")
  private String gameQueryPort = null;

  @SerializedName("GamingServerHostingProviderCode")
  private String gamingServerHostingProviderCode = null;

  @SerializedName("GamingServerHostingProviderId")
  private Integer gamingServerHostingProviderId = null;

  @SerializedName("GamingServerHostingProviderName")
  private String gamingServerHostingProviderName = null;

  @SerializedName("GamingServerModeTypeCode")
  private String gamingServerModeTypeCode = null;

  @SerializedName("GamingServerModeTypeId")
  private Integer gamingServerModeTypeId = null;

  @SerializedName("GamingServerModeTypeName")
  private String gamingServerModeTypeName = null;

  @SerializedName("JoinPassword")
  private String joinPassword = null;

  @SerializedName("LastHeartbeatDateTime")
  private DateTime lastHeartbeatDateTime = null;

  @SerializedName("ExternalCallbackTemplate")
  private String externalCallbackTemplate = null;

  @SerializedName("InternalCallbackTemplate")
  private String internalCallbackTemplate = null;

  @SerializedName("IsInUsed")
  private Boolean isInUsed = null;

  @SerializedName("GameModVersion")
  private Float gameModVersion = null;

  @SerializedName("CurrentGameModVersion")
  private Float currentGameModVersion = null;

  @SerializedName("IsPremiumServer")
  private Boolean isPremiumServer = null;

  @SerializedName("ThirdPartyServerIdentifier")
  private String thirdPartyServerIdentifier = null;

  @SerializedName("GameServerVersion")
  private String gameServerVersion = null;

  @SerializedName("IsServerOutdated")
  private Boolean isServerOutdated = null;

  @SerializedName("GameShortCode")
  private String gameShortCode = null;

  @SerializedName("LanTag")
  private String lanTag = null;

  @SerializedName("AwsInstanceId")
  private String awsInstanceId = null;

  @SerializedName("AwsRegionName")
  private String awsRegionName = null;

  public GamingServerModel gamingServerId(Integer gamingServerId) {
    this.gamingServerId = gamingServerId;
    return this;
  }

   /**
   * Get gamingServerId
   * @return gamingServerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGamingServerId() {
    return gamingServerId;
  }

  public void setGamingServerId(Integer gamingServerId) {
    this.gamingServerId = gamingServerId;
  }

  public GamingServerModel gameTitleId(Integer gameTitleId) {
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

  public GamingServerModel gameName(String gameName) {
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

  public GamingServerModel gamingServerAddedDateTime(DateTime gamingServerAddedDateTime) {
    this.gamingServerAddedDateTime = gamingServerAddedDateTime;
    return this;
  }

   /**
   * Get gamingServerAddedDateTime
   * @return gamingServerAddedDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getGamingServerAddedDateTime() {
    return gamingServerAddedDateTime;
  }

  public void setGamingServerAddedDateTime(DateTime gamingServerAddedDateTime) {
    this.gamingServerAddedDateTime = gamingServerAddedDateTime;
  }

  public GamingServerModel gamingServerTypeCode(String gamingServerTypeCode) {
    this.gamingServerTypeCode = gamingServerTypeCode;
    return this;
  }

   /**
   * Get gamingServerTypeCode
   * @return gamingServerTypeCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerTypeCode() {
    return gamingServerTypeCode;
  }

  public void setGamingServerTypeCode(String gamingServerTypeCode) {
    this.gamingServerTypeCode = gamingServerTypeCode;
  }

  public GamingServerModel gamingServerTypeId(Integer gamingServerTypeId) {
    this.gamingServerTypeId = gamingServerTypeId;
    return this;
  }

   /**
   * Get gamingServerTypeId
   * @return gamingServerTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGamingServerTypeId() {
    return gamingServerTypeId;
  }

  public void setGamingServerTypeId(Integer gamingServerTypeId) {
    this.gamingServerTypeId = gamingServerTypeId;
  }

  public GamingServerModel gamingServerTypeName(String gamingServerTypeName) {
    this.gamingServerTypeName = gamingServerTypeName;
    return this;
  }

   /**
   * Get gamingServerTypeName
   * @return gamingServerTypeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerTypeName() {
    return gamingServerTypeName;
  }

  public void setGamingServerTypeName(String gamingServerTypeName) {
    this.gamingServerTypeName = gamingServerTypeName;
  }

  public GamingServerModel gamingServerLocationId(Integer gamingServerLocationId) {
    this.gamingServerLocationId = gamingServerLocationId;
    return this;
  }

   /**
   * Get gamingServerLocationId
   * @return gamingServerLocationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGamingServerLocationId() {
    return gamingServerLocationId;
  }

  public void setGamingServerLocationId(Integer gamingServerLocationId) {
    this.gamingServerLocationId = gamingServerLocationId;
  }

  public GamingServerModel gamingServerCityName(String gamingServerCityName) {
    this.gamingServerCityName = gamingServerCityName;
    return this;
  }

   /**
   * Get gamingServerCityName
   * @return gamingServerCityName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerCityName() {
    return gamingServerCityName;
  }

  public void setGamingServerCityName(String gamingServerCityName) {
    this.gamingServerCityName = gamingServerCityName;
  }

  public GamingServerModel addressCountryId(Integer addressCountryId) {
    this.addressCountryId = addressCountryId;
    return this;
  }

   /**
   * Get addressCountryId
   * @return addressCountryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAddressCountryId() {
    return addressCountryId;
  }

  public void setAddressCountryId(Integer addressCountryId) {
    this.addressCountryId = addressCountryId;
  }

  public GamingServerModel addressCountry(AddressCountryModel addressCountry) {
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

  public GamingServerModel gamingServerRegionId(Integer gamingServerRegionId) {
    this.gamingServerRegionId = gamingServerRegionId;
    return this;
  }

   /**
   * Get gamingServerRegionId
   * @return gamingServerRegionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGamingServerRegionId() {
    return gamingServerRegionId;
  }

  public void setGamingServerRegionId(Integer gamingServerRegionId) {
    this.gamingServerRegionId = gamingServerRegionId;
  }

  public GamingServerModel gamingServerRegionName(String gamingServerRegionName) {
    this.gamingServerRegionName = gamingServerRegionName;
    return this;
  }

   /**
   * Get gamingServerRegionName
   * @return gamingServerRegionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerRegionName() {
    return gamingServerRegionName;
  }

  public void setGamingServerRegionName(String gamingServerRegionName) {
    this.gamingServerRegionName = gamingServerRegionName;
  }

  public GamingServerModel gamingServerName(String gamingServerName) {
    this.gamingServerName = gamingServerName;
    return this;
  }

   /**
   * Get gamingServerName
   * @return gamingServerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerName() {
    return gamingServerName;
  }

  public void setGamingServerName(String gamingServerName) {
    this.gamingServerName = gamingServerName;
  }

  public GamingServerModel ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public GamingServerModel streamingPort(String streamingPort) {
    this.streamingPort = streamingPort;
    return this;
  }

   /**
   * Get streamingPort
   * @return streamingPort
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStreamingPort() {
    return streamingPort;
  }

  public void setStreamingPort(String streamingPort) {
    this.streamingPort = streamingPort;
  }

  public GamingServerModel gamePort(String gamePort) {
    this.gamePort = gamePort;
    return this;
  }

   /**
   * Get gamePort
   * @return gamePort
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamePort() {
    return gamePort;
  }

  public void setGamePort(String gamePort) {
    this.gamePort = gamePort;
  }

  public GamingServerModel gameQueryPort(String gameQueryPort) {
    this.gameQueryPort = gameQueryPort;
    return this;
  }

   /**
   * Get gameQueryPort
   * @return gameQueryPort
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGameQueryPort() {
    return gameQueryPort;
  }

  public void setGameQueryPort(String gameQueryPort) {
    this.gameQueryPort = gameQueryPort;
  }

  public GamingServerModel gamingServerHostingProviderCode(String gamingServerHostingProviderCode) {
    this.gamingServerHostingProviderCode = gamingServerHostingProviderCode;
    return this;
  }

   /**
   * Get gamingServerHostingProviderCode
   * @return gamingServerHostingProviderCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerHostingProviderCode() {
    return gamingServerHostingProviderCode;
  }

  public void setGamingServerHostingProviderCode(String gamingServerHostingProviderCode) {
    this.gamingServerHostingProviderCode = gamingServerHostingProviderCode;
  }

  public GamingServerModel gamingServerHostingProviderId(Integer gamingServerHostingProviderId) {
    this.gamingServerHostingProviderId = gamingServerHostingProviderId;
    return this;
  }

   /**
   * Get gamingServerHostingProviderId
   * @return gamingServerHostingProviderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGamingServerHostingProviderId() {
    return gamingServerHostingProviderId;
  }

  public void setGamingServerHostingProviderId(Integer gamingServerHostingProviderId) {
    this.gamingServerHostingProviderId = gamingServerHostingProviderId;
  }

  public GamingServerModel gamingServerHostingProviderName(String gamingServerHostingProviderName) {
    this.gamingServerHostingProviderName = gamingServerHostingProviderName;
    return this;
  }

   /**
   * Get gamingServerHostingProviderName
   * @return gamingServerHostingProviderName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerHostingProviderName() {
    return gamingServerHostingProviderName;
  }

  public void setGamingServerHostingProviderName(String gamingServerHostingProviderName) {
    this.gamingServerHostingProviderName = gamingServerHostingProviderName;
  }

  public GamingServerModel gamingServerModeTypeCode(String gamingServerModeTypeCode) {
    this.gamingServerModeTypeCode = gamingServerModeTypeCode;
    return this;
  }

   /**
   * Get gamingServerModeTypeCode
   * @return gamingServerModeTypeCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerModeTypeCode() {
    return gamingServerModeTypeCode;
  }

  public void setGamingServerModeTypeCode(String gamingServerModeTypeCode) {
    this.gamingServerModeTypeCode = gamingServerModeTypeCode;
  }

  public GamingServerModel gamingServerModeTypeId(Integer gamingServerModeTypeId) {
    this.gamingServerModeTypeId = gamingServerModeTypeId;
    return this;
  }

   /**
   * Get gamingServerModeTypeId
   * @return gamingServerModeTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGamingServerModeTypeId() {
    return gamingServerModeTypeId;
  }

  public void setGamingServerModeTypeId(Integer gamingServerModeTypeId) {
    this.gamingServerModeTypeId = gamingServerModeTypeId;
  }

  public GamingServerModel gamingServerModeTypeName(String gamingServerModeTypeName) {
    this.gamingServerModeTypeName = gamingServerModeTypeName;
    return this;
  }

   /**
   * Get gamingServerModeTypeName
   * @return gamingServerModeTypeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGamingServerModeTypeName() {
    return gamingServerModeTypeName;
  }

  public void setGamingServerModeTypeName(String gamingServerModeTypeName) {
    this.gamingServerModeTypeName = gamingServerModeTypeName;
  }

  public GamingServerModel joinPassword(String joinPassword) {
    this.joinPassword = joinPassword;
    return this;
  }

   /**
   * Get joinPassword
   * @return joinPassword
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getJoinPassword() {
    return joinPassword;
  }

  public void setJoinPassword(String joinPassword) {
    this.joinPassword = joinPassword;
  }

  public GamingServerModel lastHeartbeatDateTime(DateTime lastHeartbeatDateTime) {
    this.lastHeartbeatDateTime = lastHeartbeatDateTime;
    return this;
  }

   /**
   * Get lastHeartbeatDateTime
   * @return lastHeartbeatDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastHeartbeatDateTime() {
    return lastHeartbeatDateTime;
  }

  public void setLastHeartbeatDateTime(DateTime lastHeartbeatDateTime) {
    this.lastHeartbeatDateTime = lastHeartbeatDateTime;
  }

  public GamingServerModel externalCallbackTemplate(String externalCallbackTemplate) {
    this.externalCallbackTemplate = externalCallbackTemplate;
    return this;
  }

   /**
   * Get externalCallbackTemplate
   * @return externalCallbackTemplate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalCallbackTemplate() {
    return externalCallbackTemplate;
  }

  public void setExternalCallbackTemplate(String externalCallbackTemplate) {
    this.externalCallbackTemplate = externalCallbackTemplate;
  }

  public GamingServerModel internalCallbackTemplate(String internalCallbackTemplate) {
    this.internalCallbackTemplate = internalCallbackTemplate;
    return this;
  }

   /**
   * Get internalCallbackTemplate
   * @return internalCallbackTemplate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInternalCallbackTemplate() {
    return internalCallbackTemplate;
  }

  public void setInternalCallbackTemplate(String internalCallbackTemplate) {
    this.internalCallbackTemplate = internalCallbackTemplate;
  }

  public GamingServerModel isInUsed(Boolean isInUsed) {
    this.isInUsed = isInUsed;
    return this;
  }

   /**
   * Get isInUsed
   * @return isInUsed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsInUsed() {
    return isInUsed;
  }

  public void setIsInUsed(Boolean isInUsed) {
    this.isInUsed = isInUsed;
  }

  public GamingServerModel gameModVersion(Float gameModVersion) {
    this.gameModVersion = gameModVersion;
    return this;
  }

   /**
   * Get gameModVersion
   * @return gameModVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getGameModVersion() {
    return gameModVersion;
  }

  public void setGameModVersion(Float gameModVersion) {
    this.gameModVersion = gameModVersion;
  }

  public GamingServerModel currentGameModVersion(Float currentGameModVersion) {
    this.currentGameModVersion = currentGameModVersion;
    return this;
  }

   /**
   * Get currentGameModVersion
   * @return currentGameModVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getCurrentGameModVersion() {
    return currentGameModVersion;
  }

  public void setCurrentGameModVersion(Float currentGameModVersion) {
    this.currentGameModVersion = currentGameModVersion;
  }

  public GamingServerModel isPremiumServer(Boolean isPremiumServer) {
    this.isPremiumServer = isPremiumServer;
    return this;
  }

   /**
   * Get isPremiumServer
   * @return isPremiumServer
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPremiumServer() {
    return isPremiumServer;
  }

  public void setIsPremiumServer(Boolean isPremiumServer) {
    this.isPremiumServer = isPremiumServer;
  }

  public GamingServerModel thirdPartyServerIdentifier(String thirdPartyServerIdentifier) {
    this.thirdPartyServerIdentifier = thirdPartyServerIdentifier;
    return this;
  }

   /**
   * Get thirdPartyServerIdentifier
   * @return thirdPartyServerIdentifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getThirdPartyServerIdentifier() {
    return thirdPartyServerIdentifier;
  }

  public void setThirdPartyServerIdentifier(String thirdPartyServerIdentifier) {
    this.thirdPartyServerIdentifier = thirdPartyServerIdentifier;
  }

  public GamingServerModel gameServerVersion(String gameServerVersion) {
    this.gameServerVersion = gameServerVersion;
    return this;
  }

   /**
   * Get gameServerVersion
   * @return gameServerVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGameServerVersion() {
    return gameServerVersion;
  }

  public void setGameServerVersion(String gameServerVersion) {
    this.gameServerVersion = gameServerVersion;
  }

  public GamingServerModel isServerOutdated(Boolean isServerOutdated) {
    this.isServerOutdated = isServerOutdated;
    return this;
  }

   /**
   * Get isServerOutdated
   * @return isServerOutdated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsServerOutdated() {
    return isServerOutdated;
  }

  public void setIsServerOutdated(Boolean isServerOutdated) {
    this.isServerOutdated = isServerOutdated;
  }

  public GamingServerModel gameShortCode(String gameShortCode) {
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

  public GamingServerModel lanTag(String lanTag) {
    this.lanTag = lanTag;
    return this;
  }

   /**
   * Get lanTag
   * @return lanTag
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanTag() {
    return lanTag;
  }

  public void setLanTag(String lanTag) {
    this.lanTag = lanTag;
  }

  public GamingServerModel awsInstanceId(String awsInstanceId) {
    this.awsInstanceId = awsInstanceId;
    return this;
  }

   /**
   * Get awsInstanceId
   * @return awsInstanceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAwsInstanceId() {
    return awsInstanceId;
  }

  public void setAwsInstanceId(String awsInstanceId) {
    this.awsInstanceId = awsInstanceId;
  }

  public GamingServerModel awsRegionName(String awsRegionName) {
    this.awsRegionName = awsRegionName;
    return this;
  }

   /**
   * Get awsRegionName
   * @return awsRegionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAwsRegionName() {
    return awsRegionName;
  }

  public void setAwsRegionName(String awsRegionName) {
    this.awsRegionName = awsRegionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamingServerModel gamingServerModel = (GamingServerModel) o;
    return Objects.equals(this.gamingServerId, gamingServerModel.gamingServerId) &&
        Objects.equals(this.gameTitleId, gamingServerModel.gameTitleId) &&
        Objects.equals(this.gameName, gamingServerModel.gameName) &&
        Objects.equals(this.gamingServerAddedDateTime, gamingServerModel.gamingServerAddedDateTime) &&
        Objects.equals(this.gamingServerTypeCode, gamingServerModel.gamingServerTypeCode) &&
        Objects.equals(this.gamingServerTypeId, gamingServerModel.gamingServerTypeId) &&
        Objects.equals(this.gamingServerTypeName, gamingServerModel.gamingServerTypeName) &&
        Objects.equals(this.gamingServerLocationId, gamingServerModel.gamingServerLocationId) &&
        Objects.equals(this.gamingServerCityName, gamingServerModel.gamingServerCityName) &&
        Objects.equals(this.addressCountryId, gamingServerModel.addressCountryId) &&
        Objects.equals(this.addressCountry, gamingServerModel.addressCountry) &&
        Objects.equals(this.gamingServerRegionId, gamingServerModel.gamingServerRegionId) &&
        Objects.equals(this.gamingServerRegionName, gamingServerModel.gamingServerRegionName) &&
        Objects.equals(this.gamingServerName, gamingServerModel.gamingServerName) &&
        Objects.equals(this.ipAddress, gamingServerModel.ipAddress) &&
        Objects.equals(this.streamingPort, gamingServerModel.streamingPort) &&
        Objects.equals(this.gamePort, gamingServerModel.gamePort) &&
        Objects.equals(this.gameQueryPort, gamingServerModel.gameQueryPort) &&
        Objects.equals(this.gamingServerHostingProviderCode, gamingServerModel.gamingServerHostingProviderCode) &&
        Objects.equals(this.gamingServerHostingProviderId, gamingServerModel.gamingServerHostingProviderId) &&
        Objects.equals(this.gamingServerHostingProviderName, gamingServerModel.gamingServerHostingProviderName) &&
        Objects.equals(this.gamingServerModeTypeCode, gamingServerModel.gamingServerModeTypeCode) &&
        Objects.equals(this.gamingServerModeTypeId, gamingServerModel.gamingServerModeTypeId) &&
        Objects.equals(this.gamingServerModeTypeName, gamingServerModel.gamingServerModeTypeName) &&
        Objects.equals(this.joinPassword, gamingServerModel.joinPassword) &&
        Objects.equals(this.lastHeartbeatDateTime, gamingServerModel.lastHeartbeatDateTime) &&
        Objects.equals(this.externalCallbackTemplate, gamingServerModel.externalCallbackTemplate) &&
        Objects.equals(this.internalCallbackTemplate, gamingServerModel.internalCallbackTemplate) &&
        Objects.equals(this.isInUsed, gamingServerModel.isInUsed) &&
        Objects.equals(this.gameModVersion, gamingServerModel.gameModVersion) &&
        Objects.equals(this.currentGameModVersion, gamingServerModel.currentGameModVersion) &&
        Objects.equals(this.isPremiumServer, gamingServerModel.isPremiumServer) &&
        Objects.equals(this.thirdPartyServerIdentifier, gamingServerModel.thirdPartyServerIdentifier) &&
        Objects.equals(this.gameServerVersion, gamingServerModel.gameServerVersion) &&
        Objects.equals(this.isServerOutdated, gamingServerModel.isServerOutdated) &&
        Objects.equals(this.gameShortCode, gamingServerModel.gameShortCode) &&
        Objects.equals(this.lanTag, gamingServerModel.lanTag) &&
        Objects.equals(this.awsInstanceId, gamingServerModel.awsInstanceId) &&
        Objects.equals(this.awsRegionName, gamingServerModel.awsRegionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gamingServerId, gameTitleId, gameName, gamingServerAddedDateTime, gamingServerTypeCode, gamingServerTypeId, gamingServerTypeName, gamingServerLocationId, gamingServerCityName, addressCountryId, addressCountry, gamingServerRegionId, gamingServerRegionName, gamingServerName, ipAddress, streamingPort, gamePort, gameQueryPort, gamingServerHostingProviderCode, gamingServerHostingProviderId, gamingServerHostingProviderName, gamingServerModeTypeCode, gamingServerModeTypeId, gamingServerModeTypeName, joinPassword, lastHeartbeatDateTime, externalCallbackTemplate, internalCallbackTemplate, isInUsed, gameModVersion, currentGameModVersion, isPremiumServer, thirdPartyServerIdentifier, gameServerVersion, isServerOutdated, gameShortCode, lanTag, awsInstanceId, awsRegionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamingServerModel {\n");
    
    sb.append("    gamingServerId: ").append(toIndentedString(gamingServerId)).append("\n");
    sb.append("    gameTitleId: ").append(toIndentedString(gameTitleId)).append("\n");
    sb.append("    gameName: ").append(toIndentedString(gameName)).append("\n");
    sb.append("    gamingServerAddedDateTime: ").append(toIndentedString(gamingServerAddedDateTime)).append("\n");
    sb.append("    gamingServerTypeCode: ").append(toIndentedString(gamingServerTypeCode)).append("\n");
    sb.append("    gamingServerTypeId: ").append(toIndentedString(gamingServerTypeId)).append("\n");
    sb.append("    gamingServerTypeName: ").append(toIndentedString(gamingServerTypeName)).append("\n");
    sb.append("    gamingServerLocationId: ").append(toIndentedString(gamingServerLocationId)).append("\n");
    sb.append("    gamingServerCityName: ").append(toIndentedString(gamingServerCityName)).append("\n");
    sb.append("    addressCountryId: ").append(toIndentedString(addressCountryId)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    gamingServerRegionId: ").append(toIndentedString(gamingServerRegionId)).append("\n");
    sb.append("    gamingServerRegionName: ").append(toIndentedString(gamingServerRegionName)).append("\n");
    sb.append("    gamingServerName: ").append(toIndentedString(gamingServerName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    streamingPort: ").append(toIndentedString(streamingPort)).append("\n");
    sb.append("    gamePort: ").append(toIndentedString(gamePort)).append("\n");
    sb.append("    gameQueryPort: ").append(toIndentedString(gameQueryPort)).append("\n");
    sb.append("    gamingServerHostingProviderCode: ").append(toIndentedString(gamingServerHostingProviderCode)).append("\n");
    sb.append("    gamingServerHostingProviderId: ").append(toIndentedString(gamingServerHostingProviderId)).append("\n");
    sb.append("    gamingServerHostingProviderName: ").append(toIndentedString(gamingServerHostingProviderName)).append("\n");
    sb.append("    gamingServerModeTypeCode: ").append(toIndentedString(gamingServerModeTypeCode)).append("\n");
    sb.append("    gamingServerModeTypeId: ").append(toIndentedString(gamingServerModeTypeId)).append("\n");
    sb.append("    gamingServerModeTypeName: ").append(toIndentedString(gamingServerModeTypeName)).append("\n");
    sb.append("    joinPassword: ").append(toIndentedString(joinPassword)).append("\n");
    sb.append("    lastHeartbeatDateTime: ").append(toIndentedString(lastHeartbeatDateTime)).append("\n");
    sb.append("    externalCallbackTemplate: ").append(toIndentedString(externalCallbackTemplate)).append("\n");
    sb.append("    internalCallbackTemplate: ").append(toIndentedString(internalCallbackTemplate)).append("\n");
    sb.append("    isInUsed: ").append(toIndentedString(isInUsed)).append("\n");
    sb.append("    gameModVersion: ").append(toIndentedString(gameModVersion)).append("\n");
    sb.append("    currentGameModVersion: ").append(toIndentedString(currentGameModVersion)).append("\n");
    sb.append("    isPremiumServer: ").append(toIndentedString(isPremiumServer)).append("\n");
    sb.append("    thirdPartyServerIdentifier: ").append(toIndentedString(thirdPartyServerIdentifier)).append("\n");
    sb.append("    gameServerVersion: ").append(toIndentedString(gameServerVersion)).append("\n");
    sb.append("    isServerOutdated: ").append(toIndentedString(isServerOutdated)).append("\n");
    sb.append("    gameShortCode: ").append(toIndentedString(gameShortCode)).append("\n");
    sb.append("    lanTag: ").append(toIndentedString(lanTag)).append("\n");
    sb.append("    awsInstanceId: ").append(toIndentedString(awsInstanceId)).append("\n");
    sb.append("    awsRegionName: ").append(toIndentedString(awsRegionName)).append("\n");
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
