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
 * AlipayPcreditHuabeiAuthAccumulationQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthAccumulationQueryResponseModel {
  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private String totalDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_PAY_COUNT = "total_pay_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAY_COUNT)
  private String totalPayCount;

  public static final String SERIALIZED_NAME_TOTAL_REAL_PAY_AMOUNT = "total_real_pay_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_REAL_PAY_AMOUNT)
  private String totalRealPayAmount;

  public AlipayPcreditHuabeiAuthAccumulationQueryResponseModel() { 
  }

  public AlipayPcreditHuabeiAuthAccumulationQueryResponseModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 本周期内支付宝端根据用户消费情况试算出的应付费用，仅供参考使用。
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.75", value = "本周期内支付宝端根据用户消费情况试算出的应付费用，仅供参考使用。")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public AlipayPcreditHuabeiAuthAccumulationQueryResponseModel totalDiscountAmount(String totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * 本周期内用户累计享受的优惠金额
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.15", value = "本周期内用户累计享受的优惠金额")

  public String getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(String totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }


  public AlipayPcreditHuabeiAuthAccumulationQueryResponseModel totalPayCount(String totalPayCount) {
    
    this.totalPayCount = totalPayCount;
    return this;
  }

   /**
   * 本周期内用户总的消费次数
   * @return totalPayCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "本周期内用户总的消费次数")

  public String getTotalPayCount() {
    return totalPayCount;
  }


  public void setTotalPayCount(String totalPayCount) {
    this.totalPayCount = totalPayCount;
  }


  public AlipayPcreditHuabeiAuthAccumulationQueryResponseModel totalRealPayAmount(String totalRealPayAmount) {
    
    this.totalRealPayAmount = totalRealPayAmount;
    return this;
  }

   /**
   * 本周期内用户累计支付宝付款金额
   * @return totalRealPayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.75", value = "本周期内用户累计支付宝付款金额")

  public String getTotalRealPayAmount() {
    return totalRealPayAmount;
  }


  public void setTotalRealPayAmount(String totalRealPayAmount) {
    this.totalRealPayAmount = totalRealPayAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPcreditHuabeiAuthAccumulationQueryResponseModel alipayPcreditHuabeiAuthAccumulationQueryResponseModel = (AlipayPcreditHuabeiAuthAccumulationQueryResponseModel) o;
    return Objects.equals(this.payAmount, alipayPcreditHuabeiAuthAccumulationQueryResponseModel.payAmount) &&
        Objects.equals(this.totalDiscountAmount, alipayPcreditHuabeiAuthAccumulationQueryResponseModel.totalDiscountAmount) &&
        Objects.equals(this.totalPayCount, alipayPcreditHuabeiAuthAccumulationQueryResponseModel.totalPayCount) &&
        Objects.equals(this.totalRealPayAmount, alipayPcreditHuabeiAuthAccumulationQueryResponseModel.totalRealPayAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payAmount, totalDiscountAmount, totalPayCount, totalRealPayAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthAccumulationQueryResponseModel {\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    totalPayCount: ").append(toIndentedString(totalPayCount)).append("\n");
    sb.append("    totalRealPayAmount: ").append(toIndentedString(totalRealPayAmount)).append("\n");
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
    openapiFields.add("pay_amount");
    openapiFields.add("total_discount_amount");
    openapiFields.add("total_pay_count");
    openapiFields.add("total_real_pay_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthAccumulationQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthAccumulationQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthAccumulationQueryResponseModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthAccumulationQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPcreditHuabeiAuthAccumulationQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPcreditHuabeiAuthAccumulationQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("total_discount_amount") != null && !jsonObj.get("total_discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_discount_amount").toString()));
      }
      if (jsonObj.get("total_pay_count") != null && !jsonObj.get("total_pay_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_pay_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_pay_count").toString()));
      }
      if (jsonObj.get("total_real_pay_amount") != null && !jsonObj.get("total_real_pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_real_pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_real_pay_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthAccumulationQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthAccumulationQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthAccumulationQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthAccumulationQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthAccumulationQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthAccumulationQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPcreditHuabeiAuthAccumulationQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPcreditHuabeiAuthAccumulationQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthAccumulationQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthAccumulationQueryResponseModel
  */
  public static AlipayPcreditHuabeiAuthAccumulationQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthAccumulationQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthAccumulationQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

