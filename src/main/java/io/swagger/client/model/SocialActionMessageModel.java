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
import io.swagger.client.model.SocialActionMessageAttributeModel;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * SocialActionMessageModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class SocialActionMessageModel {
  @SerializedName("LogoUrl")
  private String logoUrl = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("EntityId")
  private Long entityId = null;

  @SerializedName("RazerUuid")
  private String razerUuid = null;

  @SerializedName("EntityName")
  private String entityName = null;

  @SerializedName("CreatedDateTime")
  private DateTime createdDateTime = null;

  @SerializedName("MessageKey")
  private String messageKey = null;

  @SerializedName("MessageAttributes")
  private List<SocialActionMessageAttributeModel> messageAttributes = new ArrayList<SocialActionMessageAttributeModel>();

  public SocialActionMessageModel logoUrl(String logoUrl) {
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

  public SocialActionMessageModel displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SocialActionMessageModel entityId(Long entityId) {
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

  public SocialActionMessageModel razerUuid(String razerUuid) {
    this.razerUuid = razerUuid;
    return this;
  }

   /**
   * Get razerUuid
   * @return razerUuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRazerUuid() {
    return razerUuid;
  }

  public void setRazerUuid(String razerUuid) {
    this.razerUuid = razerUuid;
  }

  public SocialActionMessageModel entityName(String entityName) {
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

  public SocialActionMessageModel createdDateTime(DateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(DateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public SocialActionMessageModel messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

   /**
   * Get messageKey
   * @return messageKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public SocialActionMessageModel messageAttributes(List<SocialActionMessageAttributeModel> messageAttributes) {
    this.messageAttributes = messageAttributes;
    return this;
  }

  public SocialActionMessageModel addMessageAttributesItem(SocialActionMessageAttributeModel messageAttributesItem) {
    this.messageAttributes.add(messageAttributesItem);
    return this;
  }

   /**
   * Get messageAttributes
   * @return messageAttributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SocialActionMessageAttributeModel> getMessageAttributes() {
    return messageAttributes;
  }

  public void setMessageAttributes(List<SocialActionMessageAttributeModel> messageAttributes) {
    this.messageAttributes = messageAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialActionMessageModel socialActionMessageModel = (SocialActionMessageModel) o;
    return Objects.equals(this.logoUrl, socialActionMessageModel.logoUrl) &&
        Objects.equals(this.displayName, socialActionMessageModel.displayName) &&
        Objects.equals(this.entityId, socialActionMessageModel.entityId) &&
        Objects.equals(this.razerUuid, socialActionMessageModel.razerUuid) &&
        Objects.equals(this.entityName, socialActionMessageModel.entityName) &&
        Objects.equals(this.createdDateTime, socialActionMessageModel.createdDateTime) &&
        Objects.equals(this.messageKey, socialActionMessageModel.messageKey) &&
        Objects.equals(this.messageAttributes, socialActionMessageModel.messageAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoUrl, displayName, entityId, razerUuid, entityName, createdDateTime, messageKey, messageAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialActionMessageModel {\n");
    
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    razerUuid: ").append(toIndentedString(razerUuid)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    messageAttributes: ").append(toIndentedString(messageAttributes)).append("\n");
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

