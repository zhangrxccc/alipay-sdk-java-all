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
import com.alipay.v3.model.LibraryInfo;
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
 * AlipayIserviceCcmSwLibraryBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmSwLibraryBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_LIBRARIES = "libraries";
  @SerializedName(SERIALIZED_NAME_LIBRARIES)
  private List<LibraryInfo> libraries = null;

  public AlipayIserviceCcmSwLibraryBatchqueryResponseModel() { 
  }

  public AlipayIserviceCcmSwLibraryBatchqueryResponseModel libraries(List<LibraryInfo> libraries) {
    
    this.libraries = libraries;
    return this;
  }

  public AlipayIserviceCcmSwLibraryBatchqueryResponseModel addLibrariesItem(LibraryInfo librariesItem) {
    if (this.libraries == null) {
      this.libraries = new ArrayList<>();
    }
    this.libraries.add(librariesItem);
    return this;
  }

   /**
   * 知识库集合
   * @return libraries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "知识库集合")

  public List<LibraryInfo> getLibraries() {
    return libraries;
  }


  public void setLibraries(List<LibraryInfo> libraries) {
    this.libraries = libraries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmSwLibraryBatchqueryResponseModel alipayIserviceCcmSwLibraryBatchqueryResponseModel = (AlipayIserviceCcmSwLibraryBatchqueryResponseModel) o;
    return Objects.equals(this.libraries, alipayIserviceCcmSwLibraryBatchqueryResponseModel.libraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmSwLibraryBatchqueryResponseModel {\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
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
    openapiFields.add("libraries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmSwLibraryBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmSwLibraryBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmSwLibraryBatchqueryResponseModel is not found in the empty JSON string", AlipayIserviceCcmSwLibraryBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmSwLibraryBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmSwLibraryBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraylibraries = jsonObj.getAsJsonArray("libraries");
      if (jsonArraylibraries != null) {
        // ensure the json data is an array
        if (!jsonObj.get("libraries").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `libraries` to be an array in the JSON string but got `%s`", jsonObj.get("libraries").toString()));
        }

        // validate the optional field `libraries` (array)
        for (int i = 0; i < jsonArraylibraries.size(); i++) {
          LibraryInfo.validateJsonObject(jsonArraylibraries.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmSwLibraryBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmSwLibraryBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmSwLibraryBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmSwLibraryBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmSwLibraryBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmSwLibraryBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmSwLibraryBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmSwLibraryBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmSwLibraryBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmSwLibraryBatchqueryResponseModel
  */
  public static AlipayIserviceCcmSwLibraryBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmSwLibraryBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmSwLibraryBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

