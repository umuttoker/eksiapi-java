/*
 * Ekşi Sözlük Unofficial API
 * Ekşi sözlük'ün public olmayan apiyı. Bunu kullanmanın size yasal yaptırımları olabilir. Bunu kullanan kişiler bu riski göze almış olarak düşünülür.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: reklam@eksisozluk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse200UserInfoKarma
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T23:19:51.302Z")
public class InlineResponse200UserInfoKarma {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private Integer value = null;

  public InlineResponse200UserInfoKarma name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse200UserInfoKarma value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200UserInfoKarma inlineResponse200UserInfoKarma = (InlineResponse200UserInfoKarma) o;
    return Objects.equals(this.name, inlineResponse200UserInfoKarma.name) &&
        Objects.equals(this.value, inlineResponse200UserInfoKarma.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200UserInfoKarma {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
