/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2023-06-06
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * PointCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PointCard {
  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public PointCard() { 
  }

  public PointCard desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 工具的描述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "集点卡的功能描述", value = "工具的描述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public PointCard endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 工具的有效期的结束时间（必须晚于活动的结束时间）
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-01 00:00:00", value = "工具的有效期的结束时间（必须晚于活动的结束时间）")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public PointCard logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 工具的LOGO文件ID
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "工具的LOGO文件ID")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public PointCard name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 工具的名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "集点卡", value = "工具的名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PointCard startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 工具的有效期的起始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "工具的有效期的起始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public PointCard type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 工具类型，目前支持：  集点卡：POINT_CARD
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POINT_CARD", value = "工具类型，目前支持：  集点卡：POINT_CARD")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointCard pointCard = (PointCard) o;
    return Objects.equals(this.desc, pointCard.desc) &&
        Objects.equals(this.endTime, pointCard.endTime) &&
        Objects.equals(this.logo, pointCard.logo) &&
        Objects.equals(this.name, pointCard.name) &&
        Objects.equals(this.startTime, pointCard.startTime) &&
        Objects.equals(this.type, pointCard.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, endTime, logo, name, startTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointCard {\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("desc");
    openapiFields.add("end_time");
    openapiFields.add("logo");
    openapiFields.add("name");
    openapiFields.add("start_time");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PointCard
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PointCard.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PointCard is not found in the empty JSON string", PointCard.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PointCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PointCard` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PointCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PointCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PointCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PointCard.class));

       return (TypeAdapter<T>) new TypeAdapter<PointCard>() {
           @Override
           public void write(JsonWriter out, PointCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PointCard read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PointCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PointCard
  * @throws IOException if the JSON string is invalid with respect to PointCard
  */
  public static PointCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PointCard.class);
  }

 /**
  * Convert an instance of PointCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

