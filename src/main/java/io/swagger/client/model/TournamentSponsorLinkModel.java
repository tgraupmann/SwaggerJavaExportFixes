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
 * TournamentSponsorLinkModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentSponsorLinkModel {
  @SerializedName("SponsorName")
  private String sponsorName = null;

  @SerializedName("SponsorImageUrl")
  private String sponsorImageUrl = null;

  @SerializedName("SponsorImageRelativeUrl")
  private String sponsorImageRelativeUrl = null;

  @SerializedName("SponsorLink")
  private String sponsorLink = null;

  public TournamentSponsorLinkModel sponsorName(String sponsorName) {
    this.sponsorName = sponsorName;
    return this;
  }

   /**
   * Get sponsorName
   * @return sponsorName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSponsorName() {
    return sponsorName;
  }

  public void setSponsorName(String sponsorName) {
    this.sponsorName = sponsorName;
  }

  public TournamentSponsorLinkModel sponsorImageUrl(String sponsorImageUrl) {
    this.sponsorImageUrl = sponsorImageUrl;
    return this;
  }

   /**
   * Get sponsorImageUrl
   * @return sponsorImageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSponsorImageUrl() {
    return sponsorImageUrl;
  }

  public void setSponsorImageUrl(String sponsorImageUrl) {
    this.sponsorImageUrl = sponsorImageUrl;
  }

  public TournamentSponsorLinkModel sponsorImageRelativeUrl(String sponsorImageRelativeUrl) {
    this.sponsorImageRelativeUrl = sponsorImageRelativeUrl;
    return this;
  }

   /**
   * Get sponsorImageRelativeUrl
   * @return sponsorImageRelativeUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSponsorImageRelativeUrl() {
    return sponsorImageRelativeUrl;
  }

  public void setSponsorImageRelativeUrl(String sponsorImageRelativeUrl) {
    this.sponsorImageRelativeUrl = sponsorImageRelativeUrl;
  }

  public TournamentSponsorLinkModel sponsorLink(String sponsorLink) {
    this.sponsorLink = sponsorLink;
    return this;
  }

   /**
   * Get sponsorLink
   * @return sponsorLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSponsorLink() {
    return sponsorLink;
  }

  public void setSponsorLink(String sponsorLink) {
    this.sponsorLink = sponsorLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentSponsorLinkModel tournamentSponsorLinkModel = (TournamentSponsorLinkModel) o;
    return Objects.equals(this.sponsorName, tournamentSponsorLinkModel.sponsorName) &&
        Objects.equals(this.sponsorImageUrl, tournamentSponsorLinkModel.sponsorImageUrl) &&
        Objects.equals(this.sponsorImageRelativeUrl, tournamentSponsorLinkModel.sponsorImageRelativeUrl) &&
        Objects.equals(this.sponsorLink, tournamentSponsorLinkModel.sponsorLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sponsorName, sponsorImageUrl, sponsorImageRelativeUrl, sponsorLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentSponsorLinkModel {\n");
    
    sb.append("    sponsorName: ").append(toIndentedString(sponsorName)).append("\n");
    sb.append("    sponsorImageUrl: ").append(toIndentedString(sponsorImageUrl)).append("\n");
    sb.append("    sponsorImageRelativeUrl: ").append(toIndentedString(sponsorImageRelativeUrl)).append("\n");
    sb.append("    sponsorLink: ").append(toIndentedString(sponsorLink)).append("\n");
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
