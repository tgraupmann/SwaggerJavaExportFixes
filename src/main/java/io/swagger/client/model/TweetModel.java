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
 * TweetModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TweetModel {
  @SerializedName("TweetId")
  private Long tweetId = null;

  @SerializedName("PostDateTime")
  private DateTime postDateTime = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("RetweetCount")
  private Integer retweetCount = null;

  @SerializedName("FavoriteCount")
  private Integer favoriteCount = null;

  @SerializedName("IsRetweet")
  private Boolean isRetweet = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("TweetDirectLink")
  private String tweetDirectLink = null;

  public TweetModel tweetId(Long tweetId) {
    this.tweetId = tweetId;
    return this;
  }

   /**
   * Get tweetId
   * @return tweetId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTweetId() {
    return tweetId;
  }

  public void setTweetId(Long tweetId) {
    this.tweetId = tweetId;
  }

  public TweetModel postDateTime(DateTime postDateTime) {
    this.postDateTime = postDateTime;
    return this;
  }

   /**
   * Get postDateTime
   * @return postDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getPostDateTime() {
    return postDateTime;
  }

  public void setPostDateTime(DateTime postDateTime) {
    this.postDateTime = postDateTime;
  }

  public TweetModel message(String message) {
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

  public TweetModel retweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
    return this;
  }

   /**
   * Get retweetCount
   * @return retweetCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRetweetCount() {
    return retweetCount;
  }

  public void setRetweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
  }

  public TweetModel favoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Integer favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public TweetModel isRetweet(Boolean isRetweet) {
    this.isRetweet = isRetweet;
    return this;
  }

   /**
   * Get isRetweet
   * @return isRetweet
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsRetweet() {
    return isRetweet;
  }

  public void setIsRetweet(Boolean isRetweet) {
    this.isRetweet = isRetweet;
  }

  public TweetModel imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public TweetModel tweetDirectLink(String tweetDirectLink) {
    this.tweetDirectLink = tweetDirectLink;
    return this;
  }

   /**
   * Get tweetDirectLink
   * @return tweetDirectLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTweetDirectLink() {
    return tweetDirectLink;
  }

  public void setTweetDirectLink(String tweetDirectLink) {
    this.tweetDirectLink = tweetDirectLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetModel tweetModel = (TweetModel) o;
    return Objects.equals(this.tweetId, tweetModel.tweetId) &&
        Objects.equals(this.postDateTime, tweetModel.postDateTime) &&
        Objects.equals(this.message, tweetModel.message) &&
        Objects.equals(this.retweetCount, tweetModel.retweetCount) &&
        Objects.equals(this.favoriteCount, tweetModel.favoriteCount) &&
        Objects.equals(this.isRetweet, tweetModel.isRetweet) &&
        Objects.equals(this.imageUrl, tweetModel.imageUrl) &&
        Objects.equals(this.tweetDirectLink, tweetModel.tweetDirectLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tweetId, postDateTime, message, retweetCount, favoriteCount, isRetweet, imageUrl, tweetDirectLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetModel {\n");
    
    sb.append("    tweetId: ").append(toIndentedString(tweetId)).append("\n");
    sb.append("    postDateTime: ").append(toIndentedString(postDateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    retweetCount: ").append(toIndentedString(retweetCount)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    isRetweet: ").append(toIndentedString(isRetweet)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    tweetDirectLink: ").append(toIndentedString(tweetDirectLink)).append("\n");
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

