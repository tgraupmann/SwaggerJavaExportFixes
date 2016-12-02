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
 * TournamentMatchPlaybackModel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T00:05:30.138Z")
public class TournamentMatchPlaybackModel {
  @SerializedName("TournamentMatchPlaybackId")
  private Long tournamentMatchPlaybackId = null;

  @SerializedName("TournamentMatchId")
  private Long tournamentMatchId = null;

  @SerializedName("TournamentMatchPlayback")
  private String tournamentMatchPlayback = null;

  @SerializedName("TournamentMatchPlaybackDateTime")
  private DateTime tournamentMatchPlaybackDateTime = null;

  public TournamentMatchPlaybackModel tournamentMatchPlaybackId(Long tournamentMatchPlaybackId) {
    this.tournamentMatchPlaybackId = tournamentMatchPlaybackId;
    return this;
  }

   /**
   * Get tournamentMatchPlaybackId
   * @return tournamentMatchPlaybackId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTournamentMatchPlaybackId() {
    return tournamentMatchPlaybackId;
  }

  public void setTournamentMatchPlaybackId(Long tournamentMatchPlaybackId) {
    this.tournamentMatchPlaybackId = tournamentMatchPlaybackId;
  }

  public TournamentMatchPlaybackModel tournamentMatchId(Long tournamentMatchId) {
    this.tournamentMatchId = tournamentMatchId;
    return this;
  }

   /**
   * Get tournamentMatchId
   * @return tournamentMatchId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTournamentMatchId() {
    return tournamentMatchId;
  }

  public void setTournamentMatchId(Long tournamentMatchId) {
    this.tournamentMatchId = tournamentMatchId;
  }

  public TournamentMatchPlaybackModel tournamentMatchPlayback(String tournamentMatchPlayback) {
    this.tournamentMatchPlayback = tournamentMatchPlayback;
    return this;
  }

   /**
   * Get tournamentMatchPlayback
   * @return tournamentMatchPlayback
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTournamentMatchPlayback() {
    return tournamentMatchPlayback;
  }

  public void setTournamentMatchPlayback(String tournamentMatchPlayback) {
    this.tournamentMatchPlayback = tournamentMatchPlayback;
  }

  public TournamentMatchPlaybackModel tournamentMatchPlaybackDateTime(DateTime tournamentMatchPlaybackDateTime) {
    this.tournamentMatchPlaybackDateTime = tournamentMatchPlaybackDateTime;
    return this;
  }

   /**
   * Get tournamentMatchPlaybackDateTime
   * @return tournamentMatchPlaybackDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTournamentMatchPlaybackDateTime() {
    return tournamentMatchPlaybackDateTime;
  }

  public void setTournamentMatchPlaybackDateTime(DateTime tournamentMatchPlaybackDateTime) {
    this.tournamentMatchPlaybackDateTime = tournamentMatchPlaybackDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TournamentMatchPlaybackModel tournamentMatchPlaybackModel = (TournamentMatchPlaybackModel) o;
    return Objects.equals(this.tournamentMatchPlaybackId, tournamentMatchPlaybackModel.tournamentMatchPlaybackId) &&
        Objects.equals(this.tournamentMatchId, tournamentMatchPlaybackModel.tournamentMatchId) &&
        Objects.equals(this.tournamentMatchPlayback, tournamentMatchPlaybackModel.tournamentMatchPlayback) &&
        Objects.equals(this.tournamentMatchPlaybackDateTime, tournamentMatchPlaybackModel.tournamentMatchPlaybackDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tournamentMatchPlaybackId, tournamentMatchId, tournamentMatchPlayback, tournamentMatchPlaybackDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TournamentMatchPlaybackModel {\n");
    
    sb.append("    tournamentMatchPlaybackId: ").append(toIndentedString(tournamentMatchPlaybackId)).append("\n");
    sb.append("    tournamentMatchId: ").append(toIndentedString(tournamentMatchId)).append("\n");
    sb.append("    tournamentMatchPlayback: ").append(toIndentedString(tournamentMatchPlayback)).append("\n");
    sb.append("    tournamentMatchPlaybackDateTime: ").append(toIndentedString(tournamentMatchPlaybackDateTime)).append("\n");
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

