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
import java.util.ArrayList;
import java.util.List;

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
 * AlipayOpenInstantdeliveryAccountCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenInstantdeliveryAccountCreateModel {
  public static final String SERIALIZED_NAME_LOGISTICS_CODES = "logistics_codes";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_CODES)
  private List<String> logisticsCodes = null;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public AlipayOpenInstantdeliveryAccountCreateModel() { 
  }

  public AlipayOpenInstantdeliveryAccountCreateModel logisticsCodes(List<String> logisticsCodes) {
    
    this.logisticsCodes = logisticsCodes;
    return this;
  }

  public AlipayOpenInstantdeliveryAccountCreateModel addLogisticsCodesItem(String logisticsCodesItem) {
    if (this.logisticsCodes == null) {
      this.logisticsCodes = new ArrayList<>();
    }
    this.logisticsCodes.add(logisticsCodesItem);
    return this;
  }

   /**
   * 配送公司编码
   * @return logisticsCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ISTD", value = "配送公司编码")

  public List<String> getLogisticsCodes() {
    return logisticsCodes;
  }


  public void setLogisticsCodes(List<String> logisticsCodes) {
    this.logisticsCodes = logisticsCodes;
  }


  public AlipayOpenInstantdeliveryAccountCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out_biz_no_202008311750000", value = "外部业务号")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenInstantdeliveryAccountCreateModel alipayOpenInstantdeliveryAccountCreateModel = (AlipayOpenInstantdeliveryAccountCreateModel) o;
    return Objects.equals(this.logisticsCodes, alipayOpenInstantdeliveryAccountCreateModel.logisticsCodes) &&
        Objects.equals(this.outBizNo, alipayOpenInstantdeliveryAccountCreateModel.outBizNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logisticsCodes, outBizNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenInstantdeliveryAccountCreateModel {\n");
    sb.append("    logisticsCodes: ").append(toIndentedString(logisticsCodes)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
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
    openapiFields.add("logistics_codes");
    openapiFields.add("out_biz_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenInstantdeliveryAccountCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenInstantdeliveryAccountCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenInstantdeliveryAccountCreateModel is not found in the empty JSON string", AlipayOpenInstantdeliveryAccountCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenInstantdeliveryAccountCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenInstantdeliveryAccountCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("logistics_codes") != null && !jsonObj.get("logistics_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_codes` to be an array in the JSON string but got `%s`", jsonObj.get("logistics_codes").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenInstantdeliveryAccountCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenInstantdeliveryAccountCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenInstantdeliveryAccountCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenInstantdeliveryAccountCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenInstantdeliveryAccountCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenInstantdeliveryAccountCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenInstantdeliveryAccountCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenInstantdeliveryAccountCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenInstantdeliveryAccountCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenInstantdeliveryAccountCreateModel
  */
  public static AlipayOpenInstantdeliveryAccountCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenInstantdeliveryAccountCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenInstantdeliveryAccountCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

