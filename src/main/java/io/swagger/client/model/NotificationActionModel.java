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
 * NotificationActionModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class NotificationActionModel {
  @SerializedName("Action")
  private String action = null;

  @SerializedName("IsPreferredAction")
  private Boolean isPreferredAction = null;

  @SerializedName("ActionAttribute")
  private String actionAttribute = null;

  public NotificationActionModel action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public NotificationActionModel isPreferredAction(Boolean isPreferredAction) {
    this.isPreferredAction = isPreferredAction;
    return this;
  }

   /**
   * Get isPreferredAction
   * @return isPreferredAction
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsPreferredAction() {
    return isPreferredAction;
  }

  public void setIsPreferredAction(Boolean isPreferredAction) {
    this.isPreferredAction = isPreferredAction;
  }

  public NotificationActionModel actionAttribute(String actionAttribute) {
    this.actionAttribute = actionAttribute;
    return this;
  }

   /**
   * Get actionAttribute
   * @return actionAttribute
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getActionAttribute() {
    return actionAttribute;
  }

  public void setActionAttribute(String actionAttribute) {
    this.actionAttribute = actionAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationActionModel notificationActionModel = (NotificationActionModel) o;
    return Objects.equals(this.action, notificationActionModel.action) &&
        Objects.equals(this.isPreferredAction, notificationActionModel.isPreferredAction) &&
        Objects.equals(this.actionAttribute, notificationActionModel.actionAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, isPreferredAction, actionAttribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationActionModel {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    isPreferredAction: ").append(toIndentedString(isPreferredAction)).append("\n");
    sb.append("    actionAttribute: ").append(toIndentedString(actionAttribute)).append("\n");
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
