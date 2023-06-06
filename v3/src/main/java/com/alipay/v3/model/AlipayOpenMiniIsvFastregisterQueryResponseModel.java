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
 * AlipayOpenMiniIsvFastregisterQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniIsvFastregisterQueryResponseModel {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_ISV_APP_ID = "isv_app_id";
  @SerializedName(SERIALIZED_NAME_ISV_APP_ID)
  private String isvAppId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AlipayOpenMiniIsvFastregisterQueryResponseModel() { 
  }

  public AlipayOpenMiniIsvFastregisterQueryResponseModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序应用名
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三的试用小程序", value = "小程序应用名")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniIsvFastregisterQueryResponseModel isvAppId(String isvAppId) {
    
    this.isvAppId = isvAppId;
    return this;
  }

   /**
   * appid
   * @return isvAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202212121324324343", value = "appid")

  public String getIsvAppId() {
    return isvAppId;
  }


  public void setIsvAppId(String isvAppId) {
    this.isvAppId = isvAppId;
  }


  public AlipayOpenMiniIsvFastregisterQueryResponseModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序appid
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20212323243534535", value = "小程序appid")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniIsvFastregisterQueryResponseModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 代创建试用小程序单号
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2202324344343435353", value = "代创建试用小程序单号")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayOpenMiniIsvFastregisterQueryResponseModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户传入的外部订单号
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23948392483253534535", value = "商户传入的外部订单号")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayOpenMiniIsvFastregisterQueryResponseModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * WAIT_CONFIRM待确认创建， CONFIRM_TIMEOUT待创建确认授权超时， CREATE_MINI_APP_SUCCESS创建应用成功，CREATE_MINI_APP_FAILED创建应用失败，CANCELLED已注销，CERTIFY_SUCCESS认证成功，CERTIFY_FAILED认证失败，CERTIFY_OPERATOR管理员认证中，CERTIFY_MERCHANT法人认证中
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAIT_CONFIRM", value = "WAIT_CONFIRM待确认创建， CONFIRM_TIMEOUT待创建确认授权超时， CREATE_MINI_APP_SUCCESS创建应用成功，CREATE_MINI_APP_FAILED创建应用失败，CANCELLED已注销，CERTIFY_SUCCESS认证成功，CERTIFY_FAILED认证失败，CERTIFY_OPERATOR管理员认证中，CERTIFY_MERCHANT法人认证中")

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
    AlipayOpenMiniIsvFastregisterQueryResponseModel alipayOpenMiniIsvFastregisterQueryResponseModel = (AlipayOpenMiniIsvFastregisterQueryResponseModel) o;
    return Objects.equals(this.appName, alipayOpenMiniIsvFastregisterQueryResponseModel.appName) &&
        Objects.equals(this.isvAppId, alipayOpenMiniIsvFastregisterQueryResponseModel.isvAppId) &&
        Objects.equals(this.miniAppId, alipayOpenMiniIsvFastregisterQueryResponseModel.miniAppId) &&
        Objects.equals(this.orderNo, alipayOpenMiniIsvFastregisterQueryResponseModel.orderNo) &&
        Objects.equals(this.outOrderNo, alipayOpenMiniIsvFastregisterQueryResponseModel.outOrderNo) &&
        Objects.equals(this.status, alipayOpenMiniIsvFastregisterQueryResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, isvAppId, miniAppId, orderNo, outOrderNo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniIsvFastregisterQueryResponseModel {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    isvAppId: ").append(toIndentedString(isvAppId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("isv_app_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("order_no");
    openapiFields.add("out_order_no");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniIsvFastregisterQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniIsvFastregisterQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniIsvFastregisterQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniIsvFastregisterQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniIsvFastregisterQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniIsvFastregisterQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("isv_app_id") != null && !jsonObj.get("isv_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isv_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isv_app_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
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
       if (!AlipayOpenMiniIsvFastregisterQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniIsvFastregisterQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniIsvFastregisterQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniIsvFastregisterQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniIsvFastregisterQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniIsvFastregisterQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniIsvFastregisterQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniIsvFastregisterQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniIsvFastregisterQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniIsvFastregisterQueryResponseModel
  */
  public static AlipayOpenMiniIsvFastregisterQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniIsvFastregisterQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniIsvFastregisterQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

