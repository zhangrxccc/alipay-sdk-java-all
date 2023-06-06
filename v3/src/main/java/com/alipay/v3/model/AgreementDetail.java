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
 * AgreementDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgreementDetail {
  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AgreementDetail() { 
  }

  public AgreementDetail agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20120000000000000000", value = "协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AgreementDetail status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 协议状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "协议状态")

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
    AgreementDetail agreementDetail = (AgreementDetail) o;
    return Objects.equals(this.agreementNo, agreementDetail.agreementNo) &&
        Objects.equals(this.status, agreementDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementDetail {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgreementDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AgreementDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgreementDetail is not found in the empty JSON string", AgreementDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AgreementDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgreementDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgreementDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgreementDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgreementDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgreementDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<AgreementDetail>() {
           @Override
           public void write(JsonWriter out, AgreementDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgreementDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgreementDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgreementDetail
  * @throws IOException if the JSON string is invalid with respect to AgreementDetail
  */
  public static AgreementDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgreementDetail.class);
  }

 /**
  * Convert an instance of AgreementDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

