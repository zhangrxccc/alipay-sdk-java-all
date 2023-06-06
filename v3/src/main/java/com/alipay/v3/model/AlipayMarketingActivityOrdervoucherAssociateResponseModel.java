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
 * AlipayMarketingActivityOrdervoucherAssociateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherAssociateResponseModel {
  public static final String SERIALIZED_NAME_ASSOCIATE_TIME = "associate_time";
  @SerializedName(SERIALIZED_NAME_ASSOCIATE_TIME)
  private String associateTime;

  public AlipayMarketingActivityOrdervoucherAssociateResponseModel() { 
  }

  public AlipayMarketingActivityOrdervoucherAssociateResponseModel associateTime(String associateTime) {
    
    this.associateTime = associateTime;
    return this;
  }

   /**
   * 支付宝系统关联订单成功的时间。 格式为：yyyy-MM-dd HH:mm:ss
   * @return associateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "支付宝系统关联订单成功的时间。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getAssociateTime() {
    return associateTime;
  }


  public void setAssociateTime(String associateTime) {
    this.associateTime = associateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityOrdervoucherAssociateResponseModel alipayMarketingActivityOrdervoucherAssociateResponseModel = (AlipayMarketingActivityOrdervoucherAssociateResponseModel) o;
    return Objects.equals(this.associateTime, alipayMarketingActivityOrdervoucherAssociateResponseModel.associateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherAssociateResponseModel {\n");
    sb.append("    associateTime: ").append(toIndentedString(associateTime)).append("\n");
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
    openapiFields.add("associate_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherAssociateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherAssociateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherAssociateResponseModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherAssociateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityOrdervoucherAssociateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityOrdervoucherAssociateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("associate_time") != null && !jsonObj.get("associate_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associate_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associate_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherAssociateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherAssociateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherAssociateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherAssociateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherAssociateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherAssociateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityOrdervoucherAssociateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityOrdervoucherAssociateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherAssociateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherAssociateResponseModel
  */
  public static AlipayMarketingActivityOrdervoucherAssociateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherAssociateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherAssociateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

