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
 * InteligentDisplayConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentDisplayConfig {
  public static final String SERIALIZED_NAME_SLOGAN = "slogan";
  @SerializedName(SERIALIZED_NAME_SLOGAN)
  private String slogan;

  public static final String SERIALIZED_NAME_SLOGAN_IMG = "slogan_img";
  @SerializedName(SERIALIZED_NAME_SLOGAN_IMG)
  private String sloganImg;

  public InteligentDisplayConfig() { 
  }

  public InteligentDisplayConfig slogan(String slogan) {
    
    this.slogan = slogan;
    return this;
  }

   /**
   * 券的宣传语  含圈人的直领活动，且投放渠道选择了支付成功页或店铺的情况下必填
   * @return slogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的宣传语", value = "券的宣传语  含圈人的直领活动，且投放渠道选择了支付成功页或店铺的情况下必填")

  public String getSlogan() {
    return slogan;
  }


  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }


  public InteligentDisplayConfig sloganImg(String sloganImg) {
    
    this.sloganImg = sloganImg;
    return this;
  }

   /**
   * 券的宣传图片文件ID  含圈人的直领活动，且投放渠道选择了店铺的情况下必填
   * @return sloganImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "券的宣传图片文件ID  含圈人的直领活动，且投放渠道选择了店铺的情况下必填")

  public String getSloganImg() {
    return sloganImg;
  }


  public void setSloganImg(String sloganImg) {
    this.sloganImg = sloganImg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentDisplayConfig inteligentDisplayConfig = (InteligentDisplayConfig) o;
    return Objects.equals(this.slogan, inteligentDisplayConfig.slogan) &&
        Objects.equals(this.sloganImg, inteligentDisplayConfig.sloganImg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slogan, sloganImg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentDisplayConfig {\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    sloganImg: ").append(toIndentedString(sloganImg)).append("\n");
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
    openapiFields.add("slogan");
    openapiFields.add("slogan_img");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentDisplayConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentDisplayConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentDisplayConfig is not found in the empty JSON string", InteligentDisplayConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentDisplayConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentDisplayConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("slogan") != null && !jsonObj.get("slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slogan").toString()));
      }
      if (jsonObj.get("slogan_img") != null && !jsonObj.get("slogan_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slogan_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slogan_img").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentDisplayConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentDisplayConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentDisplayConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentDisplayConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentDisplayConfig>() {
           @Override
           public void write(JsonWriter out, InteligentDisplayConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentDisplayConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentDisplayConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentDisplayConfig
  * @throws IOException if the JSON string is invalid with respect to InteligentDisplayConfig
  */
  public static InteligentDisplayConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentDisplayConfig.class);
  }

 /**
  * Convert an instance of InteligentDisplayConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

