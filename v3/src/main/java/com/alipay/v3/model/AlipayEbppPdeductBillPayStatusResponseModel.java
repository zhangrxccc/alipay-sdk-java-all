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
 * AlipayEbppPdeductBillPayStatusResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppPdeductBillPayStatusResponseModel {
  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreement_id";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private String agreementId;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_ORDER_RESULT_CODE = "order_result_code";
  @SerializedName(SERIALIZED_NAME_ORDER_RESULT_CODE)
  private String orderResultCode;

  public static final String SERIALIZED_NAME_ORDER_RESULT_MSG = "order_result_msg";
  @SerializedName(SERIALIZED_NAME_ORDER_RESULT_MSG)
  private String orderResultMsg;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayEbppPdeductBillPayStatusResponseModel() { 
  }

  public AlipayEbppPdeductBillPayStatusResponseModel agreementId(String agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * 支付宝协议流水
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2919219429194", value = "支付宝协议流水")

  public String getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  public AlipayEbppPdeductBillPayStatusResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 用户UserId在应用AppId下的唯一用户标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "用户UserId在应用AppId下的唯一用户标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayEbppPdeductBillPayStatusResponseModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 支付宝流billNo
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015010122003385", value = "支付宝流billNo")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayEbppPdeductBillPayStatusResponseModel orderResultCode(String orderResultCode) {
    
    this.orderResultCode = orderResultCode;
    return this;
  }

   /**
   * 订单的结果码
   * @return orderResultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PAY_FAIL", value = "订单的结果码")

  public String getOrderResultCode() {
    return orderResultCode;
  }


  public void setOrderResultCode(String orderResultCode) {
    this.orderResultCode = orderResultCode;
  }


  public AlipayEbppPdeductBillPayStatusResponseModel orderResultMsg(String orderResultMsg) {
    
    this.orderResultMsg = orderResultMsg;
    return this;
  }

   /**
   * 订单的结果描述
   * @return orderResultMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AE0110270001_支付金额不足", value = "订单的结果描述")

  public String getOrderResultMsg() {
    return orderResultMsg;
  }


  public void setOrderResultMsg(String orderResultMsg) {
    this.orderResultMsg = orderResultMsg;
  }


  public AlipayEbppPdeductBillPayStatusResponseModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 外部订单流水
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21929910124", value = "外部订单流水")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayEbppPdeductBillPayStatusResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 支付宝订单支付状态。  0：未知状态。  1：支付成功。  2：支付失败。
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "支付宝订单支付状态。  0：未知状态。  1：支付成功。  2：支付失败。")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppPdeductBillPayStatusResponseModel alipayEbppPdeductBillPayStatusResponseModel = (AlipayEbppPdeductBillPayStatusResponseModel) o;
    return Objects.equals(this.agreementId, alipayEbppPdeductBillPayStatusResponseModel.agreementId) &&
        Objects.equals(this.openId, alipayEbppPdeductBillPayStatusResponseModel.openId) &&
        Objects.equals(this.orderNo, alipayEbppPdeductBillPayStatusResponseModel.orderNo) &&
        Objects.equals(this.orderResultCode, alipayEbppPdeductBillPayStatusResponseModel.orderResultCode) &&
        Objects.equals(this.orderResultMsg, alipayEbppPdeductBillPayStatusResponseModel.orderResultMsg) &&
        Objects.equals(this.outOrderNo, alipayEbppPdeductBillPayStatusResponseModel.outOrderNo) &&
        Objects.equals(this.status, alipayEbppPdeductBillPayStatusResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementId, openId, orderNo, orderResultCode, orderResultMsg, outOrderNo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppPdeductBillPayStatusResponseModel {\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderResultCode: ").append(toIndentedString(orderResultCode)).append("\n");
    sb.append("    orderResultMsg: ").append(toIndentedString(orderResultMsg)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("agreement_id");
    openapiFields.add("open_id");
    openapiFields.add("order_no");
    openapiFields.add("order_result_code");
    openapiFields.add("order_result_msg");
    openapiFields.add("out_order_no");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppPdeductBillPayStatusResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppPdeductBillPayStatusResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppPdeductBillPayStatusResponseModel is not found in the empty JSON string", AlipayEbppPdeductBillPayStatusResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppPdeductBillPayStatusResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppPdeductBillPayStatusResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_id") != null && !jsonObj.get("agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_id").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("order_result_code") != null && !jsonObj.get("order_result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_result_code").toString()));
      }
      if (jsonObj.get("order_result_msg") != null && !jsonObj.get("order_result_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_result_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_result_msg").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppPdeductBillPayStatusResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppPdeductBillPayStatusResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppPdeductBillPayStatusResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppPdeductBillPayStatusResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppPdeductBillPayStatusResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppPdeductBillPayStatusResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppPdeductBillPayStatusResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppPdeductBillPayStatusResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppPdeductBillPayStatusResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppPdeductBillPayStatusResponseModel
  */
  public static AlipayEbppPdeductBillPayStatusResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppPdeductBillPayStatusResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppPdeductBillPayStatusResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

