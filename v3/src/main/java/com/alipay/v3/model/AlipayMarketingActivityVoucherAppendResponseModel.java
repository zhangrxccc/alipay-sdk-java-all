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
 * AlipayMarketingActivityVoucherAppendResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityVoucherAppendResponseModel {
  public static final String SERIALIZED_NAME_RECHARGE_URL = "recharge_url";
  @SerializedName(SERIALIZED_NAME_RECHARGE_URL)
  private String rechargeUrl;

  public AlipayMarketingActivityVoucherAppendResponseModel() { 
  }

  public AlipayMarketingActivityVoucherAppendResponseModel rechargeUrl(String rechargeUrl) {
    
    this.rechargeUrl = rechargeUrl;
    return this;
  }

   /**
   * 预充值链接  限制 有效时间3天
   * @return rechargeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://voucherprod.alipay.com/coupon/templatepayment.htm?templateId=20210829000730015448005XXOO&authNo=2021082910002001170507729XX5&operationId=202X0829X45X35X1170X", value = "预充值链接  限制 有效时间3天")

  public String getRechargeUrl() {
    return rechargeUrl;
  }


  public void setRechargeUrl(String rechargeUrl) {
    this.rechargeUrl = rechargeUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityVoucherAppendResponseModel alipayMarketingActivityVoucherAppendResponseModel = (AlipayMarketingActivityVoucherAppendResponseModel) o;
    return Objects.equals(this.rechargeUrl, alipayMarketingActivityVoucherAppendResponseModel.rechargeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rechargeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityVoucherAppendResponseModel {\n");
    sb.append("    rechargeUrl: ").append(toIndentedString(rechargeUrl)).append("\n");
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
    openapiFields.add("recharge_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityVoucherAppendResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityVoucherAppendResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityVoucherAppendResponseModel is not found in the empty JSON string", AlipayMarketingActivityVoucherAppendResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityVoucherAppendResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityVoucherAppendResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("recharge_url") != null && !jsonObj.get("recharge_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recharge_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recharge_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityVoucherAppendResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityVoucherAppendResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityVoucherAppendResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityVoucherAppendResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityVoucherAppendResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityVoucherAppendResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityVoucherAppendResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityVoucherAppendResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityVoucherAppendResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityVoucherAppendResponseModel
  */
  public static AlipayMarketingActivityVoucherAppendResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityVoucherAppendResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityVoucherAppendResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

