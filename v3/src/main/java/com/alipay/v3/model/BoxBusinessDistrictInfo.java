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
 * BoxBusinessDistrictInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BoxBusinessDistrictInfo {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_BUSINESS_DISTRICT_ID = "business_district_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DISTRICT_ID)
  private String businessDistrictId;

  public static final String SERIALIZED_NAME_BUSINESS_DISTRICT_NAME = "business_district_name";
  @SerializedName(SERIALIZED_NAME_BUSINESS_DISTRICT_NAME)
  private String businessDistrictName;

  public static final String SERIALIZED_NAME_RELATE_APPID = "relate_appid";
  @SerializedName(SERIALIZED_NAME_RELATE_APPID)
  private String relateAppid;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public BoxBusinessDistrictInfo() { 
  }

  public BoxBusinessDistrictInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "应用名", value = "应用名")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public BoxBusinessDistrictInfo businessDistrictId(String businessDistrictId) {
    
    this.businessDistrictId = businessDistrictId;
    return this;
  }

   /**
   * 商圈ID
   * @return businessDistrictId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "169109", value = "商圈ID")

  public String getBusinessDistrictId() {
    return businessDistrictId;
  }


  public void setBusinessDistrictId(String businessDistrictId) {
    this.businessDistrictId = businessDistrictId;
  }


  public BoxBusinessDistrictInfo businessDistrictName(String businessDistrictName) {
    
    this.businessDistrictName = businessDistrictName;
    return this;
  }

   /**
   * 商圈名称
   * @return businessDistrictName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商圈名称", value = "商圈名称")

  public String getBusinessDistrictName() {
    return businessDistrictName;
  }


  public void setBusinessDistrictName(String businessDistrictName) {
    this.businessDistrictName = businessDistrictName;
  }


  public BoxBusinessDistrictInfo relateAppid(String relateAppid) {
    
    this.relateAppid = relateAppid;
    return this;
  }

   /**
   * 商圈所属小程序对应的服务编码
   * @return relateAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018061360108419", value = "商圈所属小程序对应的服务编码")

  public String getRelateAppid() {
    return relateAppid;
  }


  public void setRelateAppid(String relateAppid) {
    this.relateAppid = relateAppid;
  }


  public BoxBusinessDistrictInfo serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 商圈所属小程序对应的服务编码
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019112021000906169109", value = "商圈所属小程序对应的服务编码")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxBusinessDistrictInfo boxBusinessDistrictInfo = (BoxBusinessDistrictInfo) o;
    return Objects.equals(this.appName, boxBusinessDistrictInfo.appName) &&
        Objects.equals(this.businessDistrictId, boxBusinessDistrictInfo.businessDistrictId) &&
        Objects.equals(this.businessDistrictName, boxBusinessDistrictInfo.businessDistrictName) &&
        Objects.equals(this.relateAppid, boxBusinessDistrictInfo.relateAppid) &&
        Objects.equals(this.serviceCode, boxBusinessDistrictInfo.serviceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, businessDistrictId, businessDistrictName, relateAppid, serviceCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxBusinessDistrictInfo {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    businessDistrictId: ").append(toIndentedString(businessDistrictId)).append("\n");
    sb.append("    businessDistrictName: ").append(toIndentedString(businessDistrictName)).append("\n");
    sb.append("    relateAppid: ").append(toIndentedString(relateAppid)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
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
    openapiFields.add("business_district_id");
    openapiFields.add("business_district_name");
    openapiFields.add("relate_appid");
    openapiFields.add("service_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BoxBusinessDistrictInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BoxBusinessDistrictInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoxBusinessDistrictInfo is not found in the empty JSON string", BoxBusinessDistrictInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BoxBusinessDistrictInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoxBusinessDistrictInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("business_district_id") != null && !jsonObj.get("business_district_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_district_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_district_id").toString()));
      }
      if (jsonObj.get("business_district_name") != null && !jsonObj.get("business_district_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_district_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_district_name").toString()));
      }
      if (jsonObj.get("relate_appid") != null && !jsonObj.get("relate_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relate_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relate_appid").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoxBusinessDistrictInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoxBusinessDistrictInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoxBusinessDistrictInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoxBusinessDistrictInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BoxBusinessDistrictInfo>() {
           @Override
           public void write(JsonWriter out, BoxBusinessDistrictInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoxBusinessDistrictInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoxBusinessDistrictInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoxBusinessDistrictInfo
  * @throws IOException if the JSON string is invalid with respect to BoxBusinessDistrictInfo
  */
  public static BoxBusinessDistrictInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoxBusinessDistrictInfo.class);
  }

 /**
  * Convert an instance of BoxBusinessDistrictInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

