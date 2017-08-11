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
import com.hasssektor.eksiapi.models.Entry;
import com.hasssektor.eksiapi.models.TopicId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EntryWithTopic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-11T23:04:25.106+03:00")
public class EntryWithTopic {
  @SerializedName("TopicId")
  private TopicId topicId = null;

  @SerializedName("Entry")
  private Entry entry = null;

  public EntryWithTopic topicId(TopicId topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * Get topicId
   * @return topicId
  **/
  @ApiModelProperty(example = "null", value = "")
  public TopicId getTopicId() {
    return topicId;
  }

  public void setTopicId(TopicId topicId) {
    this.topicId = topicId;
  }

  public EntryWithTopic entry(Entry entry) {
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Entry getEntry() {
    return entry;
  }

  public void setEntry(Entry entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryWithTopic entryWithTopic = (EntryWithTopic) o;
    return Objects.equals(this.topicId, entryWithTopic.topicId) &&
        Objects.equals(this.entry, entryWithTopic.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, entry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryWithTopic {\n");
    
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

