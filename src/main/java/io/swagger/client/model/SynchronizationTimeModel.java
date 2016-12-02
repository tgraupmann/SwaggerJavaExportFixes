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
 * SynchronizationTimeModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class SynchronizationTimeModel {
  @SerializedName("ClientDateTime")
  private DateTime clientDateTime = null;

  @SerializedName("ServerDateTime")
  private DateTime serverDateTime = null;

  @SerializedName("OffsetSeconds")
  private Integer offsetSeconds = null;

  public SynchronizationTimeModel clientDateTime(DateTime clientDateTime) {
    this.clientDateTime = clientDateTime;
    return this;
  }

   /**
   * Get clientDateTime
   * @return clientDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getClientDateTime() {
    return clientDateTime;
  }

  public void setClientDateTime(DateTime clientDateTime) {
    this.clientDateTime = clientDateTime;
  }

  public SynchronizationTimeModel serverDateTime(DateTime serverDateTime) {
    this.serverDateTime = serverDateTime;
    return this;
  }

   /**
   * Get serverDateTime
   * @return serverDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getServerDateTime() {
    return serverDateTime;
  }

  public void setServerDateTime(DateTime serverDateTime) {
    this.serverDateTime = serverDateTime;
  }

  public SynchronizationTimeModel offsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
    return this;
  }

   /**
   * Get offsetSeconds
   * @return offsetSeconds
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOffsetSeconds() {
    return offsetSeconds;
  }

  public void setOffsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynchronizationTimeModel synchronizationTimeModel = (SynchronizationTimeModel) o;
    return Objects.equals(this.clientDateTime, synchronizationTimeModel.clientDateTime) &&
        Objects.equals(this.serverDateTime, synchronizationTimeModel.serverDateTime) &&
        Objects.equals(this.offsetSeconds, synchronizationTimeModel.offsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDateTime, serverDateTime, offsetSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynchronizationTimeModel {\n");
    
    sb.append("    clientDateTime: ").append(toIndentedString(clientDateTime)).append("\n");
    sb.append("    serverDateTime: ").append(toIndentedString(serverDateTime)).append("\n");
    sb.append("    offsetSeconds: ").append(toIndentedString(offsetSeconds)).append("\n");
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

