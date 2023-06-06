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
 * AlipayCommerceIotDeviceReportUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceIotDeviceReportUploadResponseModel {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Boolean status;

  public AlipayCommerceIotDeviceReportUploadResponseModel() { 
  }

  public AlipayCommerceIotDeviceReportUploadResponseModel status(Boolean status) {
    
    this.status = status;
    return this;
  }

   /**
   * 是否上传成功
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否上传成功")

  public Boolean getStatus() {
    return status;
  }


  public void setStatus(Boolean status) {
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
    AlipayCommerceIotDeviceReportUploadResponseModel alipayCommerceIotDeviceReportUploadResponseModel = (AlipayCommerceIotDeviceReportUploadResponseModel) o;
    return Objects.equals(this.status, alipayCommerceIotDeviceReportUploadResponseModel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceIotDeviceReportUploadResponseModel {\n");
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
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceIotDeviceReportUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceIotDeviceReportUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceIotDeviceReportUploadResponseModel is not found in the empty JSON string", AlipayCommerceIotDeviceReportUploadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceIotDeviceReportUploadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceIotDeviceReportUploadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceIotDeviceReportUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceIotDeviceReportUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceIotDeviceReportUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceIotDeviceReportUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceIotDeviceReportUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceIotDeviceReportUploadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceIotDeviceReportUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceIotDeviceReportUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceIotDeviceReportUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceIotDeviceReportUploadResponseModel
  */
  public static AlipayCommerceIotDeviceReportUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceIotDeviceReportUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceIotDeviceReportUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

