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
import com.alipay.v3.model.StationDetailInfo;
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
 * AlipayCommerceCityfacilitatorStationQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceCityfacilitatorStationQueryResponseModel {
  public static final String SERIALIZED_NAME_SUPPORT_STARTS = "support_starts";
  @SerializedName(SERIALIZED_NAME_SUPPORT_STARTS)
  private List<StationDetailInfo> supportStarts = null;

  public AlipayCommerceCityfacilitatorStationQueryResponseModel() { 
  }

  public AlipayCommerceCityfacilitatorStationQueryResponseModel supportStarts(List<StationDetailInfo> supportStarts) {
    
    this.supportStarts = supportStarts;
    return this;
  }

  public AlipayCommerceCityfacilitatorStationQueryResponseModel addSupportStartsItem(StationDetailInfo supportStartsItem) {
    if (this.supportStarts == null) {
      this.supportStarts = new ArrayList<>();
    }
    this.supportStarts.add(supportStartsItem);
    return this;
  }

   /**
   * 支持设为起点的站点列表
   * @return supportStarts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支持设为起点的站点列表")

  public List<StationDetailInfo> getSupportStarts() {
    return supportStarts;
  }


  public void setSupportStarts(List<StationDetailInfo> supportStarts) {
    this.supportStarts = supportStarts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceCityfacilitatorStationQueryResponseModel alipayCommerceCityfacilitatorStationQueryResponseModel = (AlipayCommerceCityfacilitatorStationQueryResponseModel) o;
    return Objects.equals(this.supportStarts, alipayCommerceCityfacilitatorStationQueryResponseModel.supportStarts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportStarts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceCityfacilitatorStationQueryResponseModel {\n");
    sb.append("    supportStarts: ").append(toIndentedString(supportStarts)).append("\n");
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
    openapiFields.add("support_starts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceCityfacilitatorStationQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceCityfacilitatorStationQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceCityfacilitatorStationQueryResponseModel is not found in the empty JSON string", AlipayCommerceCityfacilitatorStationQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceCityfacilitatorStationQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceCityfacilitatorStationQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraysupportStarts = jsonObj.getAsJsonArray("support_starts");
      if (jsonArraysupportStarts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("support_starts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `support_starts` to be an array in the JSON string but got `%s`", jsonObj.get("support_starts").toString()));
        }

        // validate the optional field `support_starts` (array)
        for (int i = 0; i < jsonArraysupportStarts.size(); i++) {
          StationDetailInfo.validateJsonObject(jsonArraysupportStarts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceCityfacilitatorStationQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceCityfacilitatorStationQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceCityfacilitatorStationQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceCityfacilitatorStationQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceCityfacilitatorStationQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceCityfacilitatorStationQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceCityfacilitatorStationQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceCityfacilitatorStationQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceCityfacilitatorStationQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceCityfacilitatorStationQueryResponseModel
  */
  public static AlipayCommerceCityfacilitatorStationQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceCityfacilitatorStationQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceCityfacilitatorStationQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

