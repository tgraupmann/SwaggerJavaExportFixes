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
 * AddressCountryModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class AddressCountryModel {
  @SerializedName("AddressCountryId")
  private Integer addressCountryId = null;

  @SerializedName("AddressCountryCode")
  private String addressCountryCode = null;

  @SerializedName("AddressCountry")
  private String addressCountry = null;

  @SerializedName("AllowsRealMoney")
  private Boolean allowsRealMoney = null;

  @SerializedName("CountryXxLargeImageUrl")
  private String countryXxLargeImageUrl = null;

  @SerializedName("CountryXLargeImageUrl")
  private String countryXLargeImageUrl = null;

  @SerializedName("CountryLargeImageUrl")
  private String countryLargeImageUrl = null;

  @SerializedName("CountryMediumImageUrl")
  private String countryMediumImageUrl = null;

  @SerializedName("CountrySmallImageUrl")
  private String countrySmallImageUrl = null;

  @SerializedName("CountryLogoUrl")
  private String countryLogoUrl = null;

  @SerializedName("OrderBy")
  private Integer orderBy = null;

  public AddressCountryModel addressCountryId(Integer addressCountryId) {
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

  public AddressCountryModel addressCountryCode(String addressCountryCode) {
    this.addressCountryCode = addressCountryCode;
    return this;
  }

   /**
   * Get addressCountryCode
   * @return addressCountryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddressCountryCode() {
    return addressCountryCode;
  }

  public void setAddressCountryCode(String addressCountryCode) {
    this.addressCountryCode = addressCountryCode;
  }

  public AddressCountryModel addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Get addressCountry
   * @return addressCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public AddressCountryModel allowsRealMoney(Boolean allowsRealMoney) {
    this.allowsRealMoney = allowsRealMoney;
    return this;
  }

   /**
   * Get allowsRealMoney
   * @return allowsRealMoney
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowsRealMoney() {
    return allowsRealMoney;
  }

  public void setAllowsRealMoney(Boolean allowsRealMoney) {
    this.allowsRealMoney = allowsRealMoney;
  }

  public AddressCountryModel countryXxLargeImageUrl(String countryXxLargeImageUrl) {
    this.countryXxLargeImageUrl = countryXxLargeImageUrl;
    return this;
  }

   /**
   * Get countryXxLargeImageUrl
   * @return countryXxLargeImageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryXxLargeImageUrl() {
    return countryXxLargeImageUrl;
  }

  public void setCountryXxLargeImageUrl(String countryXxLargeImageUrl) {
    this.countryXxLargeImageUrl = countryXxLargeImageUrl;
  }

  public AddressCountryModel countryXLargeImageUrl(String countryXLargeImageUrl) {
    this.countryXLargeImageUrl = countryXLargeImageUrl;
    return this;
  }

   /**
   * Get countryXLargeImageUrl
   * @return countryXLargeImageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryXLargeImageUrl() {
    return countryXLargeImageUrl;
  }

  public void setCountryXLargeImageUrl(String countryXLargeImageUrl) {
    this.countryXLargeImageUrl = countryXLargeImageUrl;
  }

  public AddressCountryModel countryLargeImageUrl(String countryLargeImageUrl) {
    this.countryLargeImageUrl = countryLargeImageUrl;
    return this;
  }

   /**
   * Get countryLargeImageUrl
   * @return countryLargeImageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryLargeImageUrl() {
    return countryLargeImageUrl;
  }

  public void setCountryLargeImageUrl(String countryLargeImageUrl) {
    this.countryLargeImageUrl = countryLargeImageUrl;
  }

  public AddressCountryModel countryMediumImageUrl(String countryMediumImageUrl) {
    this.countryMediumImageUrl = countryMediumImageUrl;
    return this;
  }

   /**
   * Get countryMediumImageUrl
   * @return countryMediumImageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryMediumImageUrl() {
    return countryMediumImageUrl;
  }

  public void setCountryMediumImageUrl(String countryMediumImageUrl) {
    this.countryMediumImageUrl = countryMediumImageUrl;
  }

  public AddressCountryModel countrySmallImageUrl(String countrySmallImageUrl) {
    this.countrySmallImageUrl = countrySmallImageUrl;
    return this;
  }

   /**
   * Get countrySmallImageUrl
   * @return countrySmallImageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountrySmallImageUrl() {
    return countrySmallImageUrl;
  }

  public void setCountrySmallImageUrl(String countrySmallImageUrl) {
    this.countrySmallImageUrl = countrySmallImageUrl;
  }

  public AddressCountryModel countryLogoUrl(String countryLogoUrl) {
    this.countryLogoUrl = countryLogoUrl;
    return this;
  }

   /**
   * Get countryLogoUrl
   * @return countryLogoUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryLogoUrl() {
    return countryLogoUrl;
  }

  public void setCountryLogoUrl(String countryLogoUrl) {
    this.countryLogoUrl = countryLogoUrl;
  }

  public AddressCountryModel orderBy(Integer orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(Integer orderBy) {
    this.orderBy = orderBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCountryModel addressCountryModel = (AddressCountryModel) o;
    return Objects.equals(this.addressCountryId, addressCountryModel.addressCountryId) &&
        Objects.equals(this.addressCountryCode, addressCountryModel.addressCountryCode) &&
        Objects.equals(this.addressCountry, addressCountryModel.addressCountry) &&
        Objects.equals(this.allowsRealMoney, addressCountryModel.allowsRealMoney) &&
        Objects.equals(this.countryXxLargeImageUrl, addressCountryModel.countryXxLargeImageUrl) &&
        Objects.equals(this.countryXLargeImageUrl, addressCountryModel.countryXLargeImageUrl) &&
        Objects.equals(this.countryLargeImageUrl, addressCountryModel.countryLargeImageUrl) &&
        Objects.equals(this.countryMediumImageUrl, addressCountryModel.countryMediumImageUrl) &&
        Objects.equals(this.countrySmallImageUrl, addressCountryModel.countrySmallImageUrl) &&
        Objects.equals(this.countryLogoUrl, addressCountryModel.countryLogoUrl) &&
        Objects.equals(this.orderBy, addressCountryModel.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCountryId, addressCountryCode, addressCountry, allowsRealMoney, countryXxLargeImageUrl, countryXLargeImageUrl, countryLargeImageUrl, countryMediumImageUrl, countrySmallImageUrl, countryLogoUrl, orderBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCountryModel {\n");
    
    sb.append("    addressCountryId: ").append(toIndentedString(addressCountryId)).append("\n");
    sb.append("    addressCountryCode: ").append(toIndentedString(addressCountryCode)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    allowsRealMoney: ").append(toIndentedString(allowsRealMoney)).append("\n");
    sb.append("    countryXxLargeImageUrl: ").append(toIndentedString(countryXxLargeImageUrl)).append("\n");
    sb.append("    countryXLargeImageUrl: ").append(toIndentedString(countryXLargeImageUrl)).append("\n");
    sb.append("    countryLargeImageUrl: ").append(toIndentedString(countryLargeImageUrl)).append("\n");
    sb.append("    countryMediumImageUrl: ").append(toIndentedString(countryMediumImageUrl)).append("\n");
    sb.append("    countrySmallImageUrl: ").append(toIndentedString(countrySmallImageUrl)).append("\n");
    sb.append("    countryLogoUrl: ").append(toIndentedString(countryLogoUrl)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
