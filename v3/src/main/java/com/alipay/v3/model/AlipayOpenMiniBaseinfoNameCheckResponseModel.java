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
 * AlipayOpenMiniBaseinfoNameCheckResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniBaseinfoNameCheckResponseModel {
  public static final String SERIALIZED_NAME_CHECK_CODE = "check_code";
  @SerializedName(SERIALIZED_NAME_CHECK_CODE)
  private String checkCode;

  public static final String SERIALIZED_NAME_CHECK_MEMO = "check_memo";
  @SerializedName(SERIALIZED_NAME_CHECK_MEMO)
  private String checkMemo;

  public AlipayOpenMiniBaseinfoNameCheckResponseModel() { 
  }

  public AlipayOpenMiniBaseinfoNameCheckResponseModel checkCode(String checkCode) {
    
    this.checkCode = checkCode;
    return this;
  }

   /**
   * 校验结果code
   * @return checkCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE", value = "校验结果code")

  public String getCheckCode() {
    return checkCode;
  }


  public void setCheckCode(String checkCode) {
    this.checkCode = checkCode;
  }


  public AlipayOpenMiniBaseinfoNameCheckResponseModel checkMemo(String checkMemo) {
    
    this.checkMemo = checkMemo;
    return this;
  }

   /**
   * 校验说明
   * @return checkMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无", value = "校验说明")

  public String getCheckMemo() {
    return checkMemo;
  }


  public void setCheckMemo(String checkMemo) {
    this.checkMemo = checkMemo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniBaseinfoNameCheckResponseModel alipayOpenMiniBaseinfoNameCheckResponseModel = (AlipayOpenMiniBaseinfoNameCheckResponseModel) o;
    return Objects.equals(this.checkCode, alipayOpenMiniBaseinfoNameCheckResponseModel.checkCode) &&
        Objects.equals(this.checkMemo, alipayOpenMiniBaseinfoNameCheckResponseModel.checkMemo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkCode, checkMemo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniBaseinfoNameCheckResponseModel {\n");
    sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
    sb.append("    checkMemo: ").append(toIndentedString(checkMemo)).append("\n");
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
    openapiFields.add("check_code");
    openapiFields.add("check_memo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniBaseinfoNameCheckResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniBaseinfoNameCheckResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniBaseinfoNameCheckResponseModel is not found in the empty JSON string", AlipayOpenMiniBaseinfoNameCheckResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniBaseinfoNameCheckResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniBaseinfoNameCheckResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("check_code") != null && !jsonObj.get("check_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_code").toString()));
      }
      if (jsonObj.get("check_memo") != null && !jsonObj.get("check_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_memo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniBaseinfoNameCheckResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniBaseinfoNameCheckResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniBaseinfoNameCheckResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniBaseinfoNameCheckResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniBaseinfoNameCheckResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniBaseinfoNameCheckResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniBaseinfoNameCheckResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniBaseinfoNameCheckResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniBaseinfoNameCheckResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniBaseinfoNameCheckResponseModel
  */
  public static AlipayOpenMiniBaseinfoNameCheckResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniBaseinfoNameCheckResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniBaseinfoNameCheckResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

