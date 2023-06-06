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
 * ZhimaCreditPayafteruseCreditbizorderOrderResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditbizorderOrderResponseModel {
  public static final String SERIALIZED_NAME_CREDIT_BIZ_ORDER_ID = "credit_biz_order_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_BIZ_ORDER_ID)
  private String creditBizOrderId;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public ZhimaCreditPayafteruseCreditbizorderOrderResponseModel() { 
  }

  public ZhimaCreditPayafteruseCreditbizorderOrderResponseModel creditBizOrderId(String creditBizOrderId) {
    
    this.creditBizOrderId = creditBizOrderId;
    return this;
  }

   /**
   * 信用服务订单号
   * @return creditBizOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMCB99202103310000450000041833", value = "信用服务订单号")

  public String getCreditBizOrderId() {
    return creditBizOrderId;
  }


  public void setCreditBizOrderId(String creditBizOrderId) {
    this.creditBizOrderId = creditBizOrderId;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderResponseModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户传入的外部订单号
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out1210212021212", value = "商户传入的外部订单号")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPayafteruseCreditbizorderOrderResponseModel zhimaCreditPayafteruseCreditbizorderOrderResponseModel = (ZhimaCreditPayafteruseCreditbizorderOrderResponseModel) o;
    return Objects.equals(this.creditBizOrderId, zhimaCreditPayafteruseCreditbizorderOrderResponseModel.creditBizOrderId) &&
        Objects.equals(this.outOrderNo, zhimaCreditPayafteruseCreditbizorderOrderResponseModel.outOrderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditBizOrderId, outOrderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditbizorderOrderResponseModel {\n");
    sb.append("    creditBizOrderId: ").append(toIndentedString(creditBizOrderId)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
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
    openapiFields.add("credit_biz_order_id");
    openapiFields.add("out_order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditbizorderOrderResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditbizorderOrderResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditbizorderOrderResponseModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditbizorderOrderResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPayafteruseCreditbizorderOrderResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPayafteruseCreditbizorderOrderResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("credit_biz_order_id") != null && !jsonObj.get("credit_biz_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_biz_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_biz_order_id").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditbizorderOrderResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditbizorderOrderResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditbizorderOrderResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditbizorderOrderResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditbizorderOrderResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditbizorderOrderResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPayafteruseCreditbizorderOrderResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPayafteruseCreditbizorderOrderResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditbizorderOrderResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditbizorderOrderResponseModel
  */
  public static ZhimaCreditPayafteruseCreditbizorderOrderResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditbizorderOrderResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditbizorderOrderResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

