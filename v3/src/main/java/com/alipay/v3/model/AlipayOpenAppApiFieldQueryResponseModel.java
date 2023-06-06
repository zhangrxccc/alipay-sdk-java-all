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
import com.alipay.v3.model.AuthFieldResponse;
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
 * AlipayOpenAppApiFieldQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppApiFieldQueryResponseModel {
  public static final String SERIALIZED_NAME_AUTH_FIELD_RESPONSE = "auth_field_response";
  @SerializedName(SERIALIZED_NAME_AUTH_FIELD_RESPONSE)
  private AuthFieldResponse authFieldResponse;

  public AlipayOpenAppApiFieldQueryResponseModel() { 
  }

  public AlipayOpenAppApiFieldQueryResponseModel authFieldResponse(AuthFieldResponse authFieldResponse) {
    
    this.authFieldResponse = authFieldResponse;
    return this;
  }

   /**
   * Get authFieldResponse
   * @return authFieldResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthFieldResponse getAuthFieldResponse() {
    return authFieldResponse;
  }


  public void setAuthFieldResponse(AuthFieldResponse authFieldResponse) {
    this.authFieldResponse = authFieldResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAppApiFieldQueryResponseModel alipayOpenAppApiFieldQueryResponseModel = (AlipayOpenAppApiFieldQueryResponseModel) o;
    return Objects.equals(this.authFieldResponse, alipayOpenAppApiFieldQueryResponseModel.authFieldResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authFieldResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppApiFieldQueryResponseModel {\n");
    sb.append("    authFieldResponse: ").append(toIndentedString(authFieldResponse)).append("\n");
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
    openapiFields.add("auth_field_response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppApiFieldQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppApiFieldQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppApiFieldQueryResponseModel is not found in the empty JSON string", AlipayOpenAppApiFieldQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAppApiFieldQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAppApiFieldQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `auth_field_response`
      if (jsonObj.getAsJsonObject("auth_field_response") != null) {
        AuthFieldResponse.validateJsonObject(jsonObj.getAsJsonObject("auth_field_response"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppApiFieldQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppApiFieldQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppApiFieldQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppApiFieldQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppApiFieldQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppApiFieldQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAppApiFieldQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAppApiFieldQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppApiFieldQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppApiFieldQueryResponseModel
  */
  public static AlipayOpenAppApiFieldQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppApiFieldQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppApiFieldQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

