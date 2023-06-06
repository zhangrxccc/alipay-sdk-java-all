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
 * AlipayOfflineMarketShopModifyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketShopModifyResponseModel {
  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_AUDIT_DESC = "audit_desc";
  @SerializedName(SERIALIZED_NAME_AUDIT_DESC)
  private String auditDesc;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private String auditStatus;

  public static final String SERIALIZED_NAME_IS_ONLINE = "is_online";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE)
  private String isOnline;

  public static final String SERIALIZED_NAME_IS_SHOW = "is_show";
  @SerializedName(SERIALIZED_NAME_IS_SHOW)
  private String isShow;

  public AlipayOfflineMarketShopModifyResponseModel() { 
  }

  public AlipayOfflineMarketShopModifyResponseModel applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 修改门店请求受理成功后返回的支付宝流水ID，根据此ID调用接口  alipay.offline.market.applyorder.batchquery，能够获取当前修改店铺请求审核状态、驳回原因等信息。
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015111410223410000001", value = "修改门店请求受理成功后返回的支付宝流水ID，根据此ID调用接口  alipay.offline.market.applyorder.batchquery，能够获取当前修改店铺请求审核状态、驳回原因等信息。")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public AlipayOfflineMarketShopModifyResponseModel auditDesc(String auditDesc) {
    
    this.auditDesc = auditDesc;
    return this;
  }

   /**
   * 废弃字段。
   * @return auditDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "门店首图不符合规范", value = "废弃字段。")

  public String getAuditDesc() {
    return auditDesc;
  }


  public void setAuditDesc(String auditDesc) {
    this.auditDesc = auditDesc;
  }


  public AlipayOfflineMarketShopModifyResponseModel auditStatus(String auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 同步请求如果支付宝受理成功，将返回AUDITING状态。
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "同步请求如果支付宝受理成功，将返回AUDITING状态。")

  public String getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(String auditStatus) {
    this.auditStatus = auditStatus;
  }


  public AlipayOfflineMarketShopModifyResponseModel isOnline(String isOnline) {
    
    this.isOnline = isOnline;
    return this;
  }

   /**
   * 废弃字段，T表示上架,F表示未上架。
   * @return isOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "废弃字段，T表示上架,F表示未上架。")

  public String getIsOnline() {
    return isOnline;
  }


  public void setIsOnline(String isOnline) {
    this.isOnline = isOnline;
  }


  public AlipayOfflineMarketShopModifyResponseModel isShow(String isShow) {
    
    this.isShow = isShow;
    return this;
  }

   /**
   * 废弃字段，T表示显示，F表示隐藏。
   * @return isShow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "废弃字段，T表示显示，F表示隐藏。")

  public String getIsShow() {
    return isShow;
  }


  public void setIsShow(String isShow) {
    this.isShow = isShow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOfflineMarketShopModifyResponseModel alipayOfflineMarketShopModifyResponseModel = (AlipayOfflineMarketShopModifyResponseModel) o;
    return Objects.equals(this.applyId, alipayOfflineMarketShopModifyResponseModel.applyId) &&
        Objects.equals(this.auditDesc, alipayOfflineMarketShopModifyResponseModel.auditDesc) &&
        Objects.equals(this.auditStatus, alipayOfflineMarketShopModifyResponseModel.auditStatus) &&
        Objects.equals(this.isOnline, alipayOfflineMarketShopModifyResponseModel.isOnline) &&
        Objects.equals(this.isShow, alipayOfflineMarketShopModifyResponseModel.isShow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, auditDesc, auditStatus, isOnline, isShow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketShopModifyResponseModel {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    auditDesc: ").append(toIndentedString(auditDesc)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
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
    openapiFields.add("apply_id");
    openapiFields.add("audit_desc");
    openapiFields.add("audit_status");
    openapiFields.add("is_online");
    openapiFields.add("is_show");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketShopModifyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketShopModifyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketShopModifyResponseModel is not found in the empty JSON string", AlipayOfflineMarketShopModifyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOfflineMarketShopModifyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOfflineMarketShopModifyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("audit_desc") != null && !jsonObj.get("audit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_desc").toString()));
      }
      if (jsonObj.get("audit_status") != null && !jsonObj.get("audit_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_status").toString()));
      }
      if (jsonObj.get("is_online") != null && !jsonObj.get("is_online").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_online` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_online").toString()));
      }
      if (jsonObj.get("is_show") != null && !jsonObj.get("is_show").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_show` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_show").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketShopModifyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketShopModifyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketShopModifyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketShopModifyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketShopModifyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketShopModifyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOfflineMarketShopModifyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOfflineMarketShopModifyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketShopModifyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketShopModifyResponseModel
  */
  public static AlipayOfflineMarketShopModifyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketShopModifyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketShopModifyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

