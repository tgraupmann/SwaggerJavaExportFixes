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
import io.swagger.client.model.NotificationActionModel;
import io.swagger.client.model.NotificationMessageAttributeModel;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * NotificationProfileModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class NotificationProfileModel {
  @SerializedName("NotificationStateName")
  private String notificationStateName = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("LinkAttribute")
  private String linkAttribute = null;

  @SerializedName("LinkType")
  private String linkType = null;

  @SerializedName("LogoUrl")
  private String logoUrl = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("MessageAttributes")
  private List<NotificationMessageAttributeModel> messageAttributes = new ArrayList<NotificationMessageAttributeModel>();

  @SerializedName("Actions")
  private List<NotificationActionModel> actions = new ArrayList<NotificationActionModel>();

  @SerializedName("NotificationId")
  private Long notificationId = null;

  @SerializedName("UserNotifiedEntityId")
  private Long userNotifiedEntityId = null;

  @SerializedName("MessageId")
  private Integer messageId = null;

  @SerializedName("CreatedDateTime")
  private DateTime createdDateTime = null;

  @SerializedName("NotificationStateId")
  private Integer notificationStateId = null;

  @SerializedName("ActionDateTime")
  private DateTime actionDateTime = null;

  public NotificationProfileModel notificationStateName(String notificationStateName) {
    this.notificationStateName = notificationStateName;
    return this;
  }

   /**
   * Get notificationStateName
   * @return notificationStateName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNotificationStateName() {
    return notificationStateName;
  }

  public void setNotificationStateName(String notificationStateName) {
    this.notificationStateName = notificationStateName;
  }

  public NotificationProfileModel displayName(String displayName) {
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

  public NotificationProfileModel linkAttribute(String linkAttribute) {
    this.linkAttribute = linkAttribute;
    return this;
  }

   /**
   * Get linkAttribute
   * @return linkAttribute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkAttribute() {
    return linkAttribute;
  }

  public void setLinkAttribute(String linkAttribute) {
    this.linkAttribute = linkAttribute;
  }

  public NotificationProfileModel linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public NotificationProfileModel logoUrl(String logoUrl) {
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

  public NotificationProfileModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotificationProfileModel messageAttributes(List<NotificationMessageAttributeModel> messageAttributes) {
    this.messageAttributes = messageAttributes;
    return this;
  }

  public NotificationProfileModel addMessageAttributesItem(NotificationMessageAttributeModel messageAttributesItem) {
    this.messageAttributes.add(messageAttributesItem);
    return this;
  }

   /**
   * Get messageAttributes
   * @return messageAttributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NotificationMessageAttributeModel> getMessageAttributes() {
    return messageAttributes;
  }

  public void setMessageAttributes(List<NotificationMessageAttributeModel> messageAttributes) {
    this.messageAttributes = messageAttributes;
  }

  public NotificationProfileModel actions(List<NotificationActionModel> actions) {
    this.actions = actions;
    return this;
  }

  public NotificationProfileModel addActionsItem(NotificationActionModel actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NotificationActionModel> getActions() {
    return actions;
  }

  public void setActions(List<NotificationActionModel> actions) {
    this.actions = actions;
  }

  public NotificationProfileModel notificationId(Long notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * Get notificationId
   * @return notificationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(Long notificationId) {
    this.notificationId = notificationId;
  }

  public NotificationProfileModel userNotifiedEntityId(Long userNotifiedEntityId) {
    this.userNotifiedEntityId = userNotifiedEntityId;
    return this;
  }

   /**
   * Get userNotifiedEntityId
   * @return userNotifiedEntityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUserNotifiedEntityId() {
    return userNotifiedEntityId;
  }

  public void setUserNotifiedEntityId(Long userNotifiedEntityId) {
    this.userNotifiedEntityId = userNotifiedEntityId;
  }

  public NotificationProfileModel messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }

  public NotificationProfileModel createdDateTime(DateTime createdDateTime) {
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

  public NotificationProfileModel notificationStateId(Integer notificationStateId) {
    this.notificationStateId = notificationStateId;
    return this;
  }

   /**
   * Get notificationStateId
   * @return notificationStateId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNotificationStateId() {
    return notificationStateId;
  }

  public void setNotificationStateId(Integer notificationStateId) {
    this.notificationStateId = notificationStateId;
  }

  public NotificationProfileModel actionDateTime(DateTime actionDateTime) {
    this.actionDateTime = actionDateTime;
    return this;
  }

   /**
   * Get actionDateTime
   * @return actionDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getActionDateTime() {
    return actionDateTime;
  }

  public void setActionDateTime(DateTime actionDateTime) {
    this.actionDateTime = actionDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationProfileModel notificationProfileModel = (NotificationProfileModel) o;
    return Objects.equals(this.notificationStateName, notificationProfileModel.notificationStateName) &&
        Objects.equals(this.displayName, notificationProfileModel.displayName) &&
        Objects.equals(this.linkAttribute, notificationProfileModel.linkAttribute) &&
        Objects.equals(this.linkType, notificationProfileModel.linkType) &&
        Objects.equals(this.logoUrl, notificationProfileModel.logoUrl) &&
        Objects.equals(this.message, notificationProfileModel.message) &&
        Objects.equals(this.messageAttributes, notificationProfileModel.messageAttributes) &&
        Objects.equals(this.actions, notificationProfileModel.actions) &&
        Objects.equals(this.notificationId, notificationProfileModel.notificationId) &&
        Objects.equals(this.userNotifiedEntityId, notificationProfileModel.userNotifiedEntityId) &&
        Objects.equals(this.messageId, notificationProfileModel.messageId) &&
        Objects.equals(this.createdDateTime, notificationProfileModel.createdDateTime) &&
        Objects.equals(this.notificationStateId, notificationProfileModel.notificationStateId) &&
        Objects.equals(this.actionDateTime, notificationProfileModel.actionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationStateName, displayName, linkAttribute, linkType, logoUrl, message, messageAttributes, actions, notificationId, userNotifiedEntityId, messageId, createdDateTime, notificationStateId, actionDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationProfileModel {\n");
    
    sb.append("    notificationStateName: ").append(toIndentedString(notificationStateName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    linkAttribute: ").append(toIndentedString(linkAttribute)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageAttributes: ").append(toIndentedString(messageAttributes)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    userNotifiedEntityId: ").append(toIndentedString(userNotifiedEntityId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    notificationStateId: ").append(toIndentedString(notificationStateId)).append("\n");
    sb.append("    actionDateTime: ").append(toIndentedString(actionDateTime)).append("\n");
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

