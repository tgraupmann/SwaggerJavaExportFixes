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
import io.swagger.client.model.InsiderPostModel;
import java.util.ArrayList;
import java.util.List;

/**
 * ResponseOutputModelListInsiderPostModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class ResponseOutputModelListInsiderPostModel {
  @SerializedName("Response")
  private List<InsiderPostModel> response = new ArrayList<InsiderPostModel>();

  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("Message")
  private String message = null;

  /**
   * See {Razer.Arena.Processing.Models.Enumerations.ApiResponseStatusCodes} for status code meaning.  0 = success, 2 = invalid api key, 3 = invalid login token, 9 = processing error (see message).
   */
  public enum StatusCodeEnum {
    @SerializedName("0")
    NUMBER_0(0),
    
    @SerializedName("2")
    NUMBER_2(2),
    
    @SerializedName("3")
    NUMBER_3(3),
    
    @SerializedName("4")
    NUMBER_4(4),
    
    @SerializedName("9")
    NUMBER_9(9);

    private Integer value;

    StatusCodeEnum(Integer value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("StatusCode")
  private StatusCodeEnum statusCode = null;

  public ResponseOutputModelListInsiderPostModel response(List<InsiderPostModel> response) {
    this.response = response;
    return this;
  }

  public ResponseOutputModelListInsiderPostModel addResponseItem(InsiderPostModel responseItem) {
    this.response.add(responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InsiderPostModel> getResponse() {
    return response;
  }

  public void setResponse(List<InsiderPostModel> response) {
    this.response = response;
  }

  public ResponseOutputModelListInsiderPostModel success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ResponseOutputModelListInsiderPostModel message(String message) {
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

  public ResponseOutputModelListInsiderPostModel statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * See {Razer.Arena.Processing.Models.Enumerations.ApiResponseStatusCodes} for status code meaning.  0 = success, 2 = invalid api key, 3 = invalid login token, 9 = processing error (see message).
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "See {Razer.Arena.Processing.Models.Enumerations.ApiResponseStatusCodes} for status code meaning.  0 = success, 2 = invalid api key, 3 = invalid login token, 9 = processing error (see message).")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseOutputModelListInsiderPostModel responseOutputModelListInsiderPostModel = (ResponseOutputModelListInsiderPostModel) o;
    return Objects.equals(this.response, responseOutputModelListInsiderPostModel.response) &&
        Objects.equals(this.success, responseOutputModelListInsiderPostModel.success) &&
        Objects.equals(this.message, responseOutputModelListInsiderPostModel.message) &&
        Objects.equals(this.statusCode, responseOutputModelListInsiderPostModel.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, success, message, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseOutputModelListInsiderPostModel {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

