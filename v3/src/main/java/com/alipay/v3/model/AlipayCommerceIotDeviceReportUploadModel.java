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
 * AlipayCommerceIotDeviceReportUploadModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceIotDeviceReportUploadModel {
  public static final String SERIALIZED_NAME_REPORT_CONTENT = "report_content";
  @SerializedName(SERIALIZED_NAME_REPORT_CONTENT)
  private String reportContent;

  public static final String SERIALIZED_NAME_SN = "sn";
  @SerializedName(SERIALIZED_NAME_SN)
  private String sn;

  public AlipayCommerceIotDeviceReportUploadModel() { 
  }

  public AlipayCommerceIotDeviceReportUploadModel reportContent(String reportContent) {
    
    this.reportContent = reportContent;
    return this;
  }

   /**
   * 设备检测报告详情
   * @return reportContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "设备检测报告详情JSON字符串", value = "设备检测报告详情")

  public String getReportContent() {
    return reportContent;
  }


  public void setReportContent(String reportContent) {
    this.reportContent = reportContent;
  }


  public AlipayCommerceIotDeviceReportUploadModel sn(String sn) {
    
    this.sn = sn;
    return this;
  }

   /**
   * 设备唯一标识
   * @return sn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMIT1D2020108003872", value = "设备唯一标识")

  public String getSn() {
    return sn;
  }


  public void setSn(String sn) {
    this.sn = sn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceIotDeviceReportUploadModel alipayCommerceIotDeviceReportUploadModel = (AlipayCommerceIotDeviceReportUploadModel) o;
    return Objects.equals(this.reportContent, alipayCommerceIotDeviceReportUploadModel.reportContent) &&
        Objects.equals(this.sn, alipayCommerceIotDeviceReportUploadModel.sn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportContent, sn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceIotDeviceReportUploadModel {\n");
    sb.append("    reportContent: ").append(toIndentedString(reportContent)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
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
    openapiFields.add("report_content");
    openapiFields.add("sn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceIotDeviceReportUploadModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceIotDeviceReportUploadModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceIotDeviceReportUploadModel is not found in the empty JSON string", AlipayCommerceIotDeviceReportUploadModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceIotDeviceReportUploadModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceIotDeviceReportUploadModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("report_content") != null && !jsonObj.get("report_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `report_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("report_content").toString()));
      }
      if (jsonObj.get("sn") != null && !jsonObj.get("sn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceIotDeviceReportUploadModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceIotDeviceReportUploadModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceIotDeviceReportUploadModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceIotDeviceReportUploadModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceIotDeviceReportUploadModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceIotDeviceReportUploadModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceIotDeviceReportUploadModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceIotDeviceReportUploadModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceIotDeviceReportUploadModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceIotDeviceReportUploadModel
  */
  public static AlipayCommerceIotDeviceReportUploadModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceIotDeviceReportUploadModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceIotDeviceReportUploadModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

