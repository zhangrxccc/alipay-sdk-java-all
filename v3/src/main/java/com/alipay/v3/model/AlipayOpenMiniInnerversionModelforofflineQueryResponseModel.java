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
 * AlipayOpenMiniInnerversionModelforofflineQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerversionModelforofflineQueryResponseModel {
  public static final String SERIALIZED_NAME_MODEL_JSON = "model_json";
  @SerializedName(SERIALIZED_NAME_MODEL_JSON)
  private String modelJson;

  public static final String SERIALIZED_NAME_SYNC_ID = "sync_id";
  @SerializedName(SERIALIZED_NAME_SYNC_ID)
  private String syncId;

  public AlipayOpenMiniInnerversionModelforofflineQueryResponseModel() { 
  }

  public AlipayOpenMiniInnerversionModelforofflineQueryResponseModel modelJson(String modelJson) {
    
    this.modelJson = modelJson;
    return this;
  }

   /**
   * 线上版本包数据
   * @return modelJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "线上版本包数据")

  public String getModelJson() {
    return modelJson;
  }


  public void setModelJson(String modelJson) {
    this.modelJson = modelJson;
  }


  public AlipayOpenMiniInnerversionModelforofflineQueryResponseModel syncId(String syncId) {
    
    this.syncId = syncId;
    return this;
  }

   /**
   * 同步ID，同步失败时便于去线上追溯
   * @return syncId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcasdasda1217893189389asdasda98", value = "同步ID，同步失败时便于去线上追溯")

  public String getSyncId() {
    return syncId;
  }


  public void setSyncId(String syncId) {
    this.syncId = syncId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerversionModelforofflineQueryResponseModel alipayOpenMiniInnerversionModelforofflineQueryResponseModel = (AlipayOpenMiniInnerversionModelforofflineQueryResponseModel) o;
    return Objects.equals(this.modelJson, alipayOpenMiniInnerversionModelforofflineQueryResponseModel.modelJson) &&
        Objects.equals(this.syncId, alipayOpenMiniInnerversionModelforofflineQueryResponseModel.syncId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelJson, syncId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerversionModelforofflineQueryResponseModel {\n");
    sb.append("    modelJson: ").append(toIndentedString(modelJson)).append("\n");
    sb.append("    syncId: ").append(toIndentedString(syncId)).append("\n");
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
    openapiFields.add("model_json");
    openapiFields.add("sync_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerversionModelforofflineQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerversionModelforofflineQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerversionModelforofflineQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerversionModelforofflineQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerversionModelforofflineQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerversionModelforofflineQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("model_json") != null && !jsonObj.get("model_json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_json").toString()));
      }
      if (jsonObj.get("sync_id") != null && !jsonObj.get("sync_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sync_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sync_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerversionModelforofflineQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerversionModelforofflineQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerversionModelforofflineQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerversionModelforofflineQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerversionModelforofflineQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerversionModelforofflineQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerversionModelforofflineQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerversionModelforofflineQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerversionModelforofflineQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerversionModelforofflineQueryResponseModel
  */
  public static AlipayOpenMiniInnerversionModelforofflineQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerversionModelforofflineQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerversionModelforofflineQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

