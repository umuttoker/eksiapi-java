/*
 * Ekşi Sözlük UnPublic API
 * Ekşi sözlük'ün public olmayan apiyı. Bunu kullanmanın size yasal yaptırımları olabilir. Bunu kullanan kişiler bu riski göze almış olarak düşünülür.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: umt.toker@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hasssektor.eksiapi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-11T23:04:25.106+03:00")
public class Message {
  @SerializedName("Id")
  private Integer ıd = null;

  @SerializedName("IsOutgoing")
  private Boolean ısOutgoing = null;

  @SerializedName("Date")
  private String date = null;

  @SerializedName("Content")
  private String content = null;

  public Message ıd(Integer ıd) {
    this.ıd = ıd;
    return this;
  }

   /**
   * Get ıd
   * @return ıd
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return ıd;
  }

  public void setId(Integer ıd) {
    this.ıd = ıd;
  }

  public Message ısOutgoing(Boolean ısOutgoing) {
    this.ısOutgoing = ısOutgoing;
    return this;
  }

   /**
   * Get ısOutgoing
   * @return ısOutgoing
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsOutgoing() {
    return ısOutgoing;
  }

  public void setIsOutgoing(Boolean ısOutgoing) {
    this.ısOutgoing = ısOutgoing;
  }

  public Message date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Message content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.ıd, message.ıd) &&
        Objects.equals(this.ısOutgoing, message.ısOutgoing) &&
        Objects.equals(this.date, message.date) &&
        Objects.equals(this.content, message.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ıd, ısOutgoing, date, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    ıd: ").append(toIndentedString(ıd)).append("\n");
    sb.append("    ısOutgoing: ").append(toIndentedString(ısOutgoing)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
