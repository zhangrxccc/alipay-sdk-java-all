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
 * DatadigitalFincloudGeneralsaasFaceCheckInitializeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DatadigitalFincloudGeneralsaasFaceCheckInitializeModel {
  public static final String SERIALIZED_NAME_BIZ_CODE = "biz_code";
  @SerializedName(SERIALIZED_NAME_BIZ_CODE)
  private String bizCode;

  public static final String SERIALIZED_NAME_OUTER_ORDER_NO = "outer_order_no";
  @SerializedName(SERIALIZED_NAME_OUTER_ORDER_NO)
  private String outerOrderNo;

  public DatadigitalFincloudGeneralsaasFaceCheckInitializeModel() { 
  }

  public DatadigitalFincloudGeneralsaasFaceCheckInitializeModel bizCode(String bizCode) {
    
    this.bizCode = bizCode;
    return this;
  }

   /**
   * DATA_DIGITAL_BIZ_CODE_FACE_CHECK_LIVE，代表活体检测。
   * @return bizCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DATA_DIGITAL_BIZ_CODE_FACE_CHECK_LIVE", value = "DATA_DIGITAL_BIZ_CODE_FACE_CHECK_LIVE，代表活体检测。")

  public String getBizCode() {
    return bizCode;
  }


  public void setBizCode(String bizCode) {
    this.bizCode = bizCode;
  }


  public DatadigitalFincloudGeneralsaasFaceCheckInitializeModel outerOrderNo(String outerOrderNo) {
    
    this.outerOrderNo = outerOrderNo;
    return this;
  }

   /**
   * 客户业务单据号。
   * @return outerOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2324sasfe", value = "客户业务单据号。")

  public String getOuterOrderNo() {
    return outerOrderNo;
  }


  public void setOuterOrderNo(String outerOrderNo) {
    this.outerOrderNo = outerOrderNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatadigitalFincloudGeneralsaasFaceCheckInitializeModel datadigitalFincloudGeneralsaasFaceCheckInitializeModel = (DatadigitalFincloudGeneralsaasFaceCheckInitializeModel) o;
    return Objects.equals(this.bizCode, datadigitalFincloudGeneralsaasFaceCheckInitializeModel.bizCode) &&
        Objects.equals(this.outerOrderNo, datadigitalFincloudGeneralsaasFaceCheckInitializeModel.outerOrderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizCode, outerOrderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatadigitalFincloudGeneralsaasFaceCheckInitializeModel {\n");
    sb.append("    bizCode: ").append(toIndentedString(bizCode)).append("\n");
    sb.append("    outerOrderNo: ").append(toIndentedString(outerOrderNo)).append("\n");
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
    openapiFields.add("biz_code");
    openapiFields.add("outer_order_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DatadigitalFincloudGeneralsaasFaceCheckInitializeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DatadigitalFincloudGeneralsaasFaceCheckInitializeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatadigitalFincloudGeneralsaasFaceCheckInitializeModel is not found in the empty JSON string", DatadigitalFincloudGeneralsaasFaceCheckInitializeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DatadigitalFincloudGeneralsaasFaceCheckInitializeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatadigitalFincloudGeneralsaasFaceCheckInitializeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_code") != null && !jsonObj.get("biz_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_code").toString()));
      }
      if (jsonObj.get("outer_order_no") != null && !jsonObj.get("outer_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_order_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatadigitalFincloudGeneralsaasFaceCheckInitializeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatadigitalFincloudGeneralsaasFaceCheckInitializeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatadigitalFincloudGeneralsaasFaceCheckInitializeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatadigitalFincloudGeneralsaasFaceCheckInitializeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DatadigitalFincloudGeneralsaasFaceCheckInitializeModel>() {
           @Override
           public void write(JsonWriter out, DatadigitalFincloudGeneralsaasFaceCheckInitializeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatadigitalFincloudGeneralsaasFaceCheckInitializeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatadigitalFincloudGeneralsaasFaceCheckInitializeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatadigitalFincloudGeneralsaasFaceCheckInitializeModel
  * @throws IOException if the JSON string is invalid with respect to DatadigitalFincloudGeneralsaasFaceCheckInitializeModel
  */
  public static DatadigitalFincloudGeneralsaasFaceCheckInitializeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatadigitalFincloudGeneralsaasFaceCheckInitializeModel.class);
  }

 /**
  * Convert an instance of DatadigitalFincloudGeneralsaasFaceCheckInitializeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

