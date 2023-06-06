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
 * PubChannelDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PubChannelDTO {
  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_PUB_CHANNEL = "pub_channel";
  @SerializedName(SERIALIZED_NAME_PUB_CHANNEL)
  private String pubChannel;

  public PubChannelDTO() { 
  }

  public PubChannelDTO extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 扩展信息，无需配置
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展信息，无需配置")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public PubChannelDTO pubChannel(String pubChannel) {
    
    this.pubChannel = pubChannel;
    return this;
  }

   /**
   * 1、SHOP_DETAIL:店铺详情页   2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）
   * @return pubChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "1、SHOP_DETAIL:店铺详情页   2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）")

  public String getPubChannel() {
    return pubChannel;
  }


  public void setPubChannel(String pubChannel) {
    this.pubChannel = pubChannel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PubChannelDTO pubChannelDTO = (PubChannelDTO) o;
    return Objects.equals(this.extInfo, pubChannelDTO.extInfo) &&
        Objects.equals(this.pubChannel, pubChannelDTO.pubChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extInfo, pubChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PubChannelDTO {\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    pubChannel: ").append(toIndentedString(pubChannel)).append("\n");
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
    openapiFields.add("ext_info");
    openapiFields.add("pub_channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PubChannelDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PubChannelDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PubChannelDTO is not found in the empty JSON string", PubChannelDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PubChannelDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PubChannelDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("pub_channel") != null && !jsonObj.get("pub_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pub_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pub_channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PubChannelDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PubChannelDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PubChannelDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PubChannelDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PubChannelDTO>() {
           @Override
           public void write(JsonWriter out, PubChannelDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PubChannelDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PubChannelDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PubChannelDTO
  * @throws IOException if the JSON string is invalid with respect to PubChannelDTO
  */
  public static PubChannelDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PubChannelDTO.class);
  }

 /**
  * Convert an instance of PubChannelDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

