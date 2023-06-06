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
import com.alipay.v3.model.AuthorizeDetailDTO;
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
 * AuthorizedRuleDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizedRuleDTO {
  public static final String SERIALIZED_NAME_AUTHORIZED_DETAIL_LIST = "authorized_detail_list";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DETAIL_LIST)
  private List<AuthorizeDetailDTO> authorizedDetailList = null;

  public static final String SERIALIZED_NAME_AUTHORIZED_TYPE = "authorized_type";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_TYPE)
  private String authorizedType;

  public AuthorizedRuleDTO() { 
  }

  public AuthorizedRuleDTO authorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
    
    this.authorizedDetailList = authorizedDetailList;
    return this;
  }

  public AuthorizedRuleDTO addAuthorizedDetailListItem(AuthorizeDetailDTO authorizedDetailListItem) {
    if (this.authorizedDetailList == null) {
      this.authorizedDetailList = new ArrayList<>();
    }
    this.authorizedDetailList.add(authorizedDetailListItem);
    return this;
  }

   /**
   * 授权商户列表
   * @return authorizedDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "授权商户列表")

  public List<AuthorizeDetailDTO> getAuthorizedDetailList() {
    return authorizedDetailList;
  }


  public void setAuthorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
    this.authorizedDetailList = authorizedDetailList;
  }


  public AuthorizedRuleDTO authorizedType(String authorizedType) {
    
    this.authorizedType = authorizedType;
    return this;
  }

   /**
   * WHITELIST-白名单 ALL-全部
   * @return authorizedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WHITELIST-白名单 ALL-全部")

  public String getAuthorizedType() {
    return authorizedType;
  }


  public void setAuthorizedType(String authorizedType) {
    this.authorizedType = authorizedType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedRuleDTO authorizedRuleDTO = (AuthorizedRuleDTO) o;
    return Objects.equals(this.authorizedDetailList, authorizedRuleDTO.authorizedDetailList) &&
        Objects.equals(this.authorizedType, authorizedRuleDTO.authorizedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedDetailList, authorizedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedRuleDTO {\n");
    sb.append("    authorizedDetailList: ").append(toIndentedString(authorizedDetailList)).append("\n");
    sb.append("    authorizedType: ").append(toIndentedString(authorizedType)).append("\n");
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
    openapiFields.add("authorized_detail_list");
    openapiFields.add("authorized_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizedRuleDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizedRuleDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizedRuleDTO is not found in the empty JSON string", AuthorizedRuleDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizedRuleDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizedRuleDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayauthorizedDetailList = jsonObj.getAsJsonArray("authorized_detail_list");
      if (jsonArrayauthorizedDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("authorized_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `authorized_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("authorized_detail_list").toString()));
        }

        // validate the optional field `authorized_detail_list` (array)
        for (int i = 0; i < jsonArrayauthorizedDetailList.size(); i++) {
          AuthorizeDetailDTO.validateJsonObject(jsonArrayauthorizedDetailList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("authorized_type") != null && !jsonObj.get("authorized_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorized_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorized_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizedRuleDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizedRuleDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizedRuleDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizedRuleDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizedRuleDTO>() {
           @Override
           public void write(JsonWriter out, AuthorizedRuleDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizedRuleDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizedRuleDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizedRuleDTO
  * @throws IOException if the JSON string is invalid with respect to AuthorizedRuleDTO
  */
  public static AuthorizedRuleDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizedRuleDTO.class);
  }

 /**
  * Convert an instance of AuthorizedRuleDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

