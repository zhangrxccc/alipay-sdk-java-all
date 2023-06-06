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
 * AlipayOpenPublicLifeLabelCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicLifeLabelCreateModel {
  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_LABEL_NAME = "label_name";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME)
  private String labelName;

  public AlipayOpenPublicLifeLabelCreateModel() { 
  }

  public AlipayOpenPublicLifeLabelCreateModel dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 标签值类型，不填默认为 string 类型。 注意：目前只支持 string（字符串类型）。
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "标签值类型，不填默认为 string 类型。 注意：目前只支持 string（字符串类型）。")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public AlipayOpenPublicLifeLabelCreateModel labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * 自定义标签名。 注意：每个生活号最多创建 100 个自定义标签。
   * @return labelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "职业", value = "自定义标签名。 注意：每个生活号最多创建 100 个自定义标签。")

  public String getLabelName() {
    return labelName;
  }


  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicLifeLabelCreateModel alipayOpenPublicLifeLabelCreateModel = (AlipayOpenPublicLifeLabelCreateModel) o;
    return Objects.equals(this.dataType, alipayOpenPublicLifeLabelCreateModel.dataType) &&
        Objects.equals(this.labelName, alipayOpenPublicLifeLabelCreateModel.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicLifeLabelCreateModel {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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
    openapiFields.add("data_type");
    openapiFields.add("label_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicLifeLabelCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicLifeLabelCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicLifeLabelCreateModel is not found in the empty JSON string", AlipayOpenPublicLifeLabelCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicLifeLabelCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicLifeLabelCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if (jsonObj.get("label_name") != null && !jsonObj.get("label_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicLifeLabelCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicLifeLabelCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicLifeLabelCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicLifeLabelCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicLifeLabelCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicLifeLabelCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicLifeLabelCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicLifeLabelCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicLifeLabelCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicLifeLabelCreateModel
  */
  public static AlipayOpenPublicLifeLabelCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicLifeLabelCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicLifeLabelCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

