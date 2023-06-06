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
 * AlipayCommerceEcEmployeeInviteQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEmployeeInviteQueryResponseModel {
  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_MINI_APP_SIGN_URL = "mini_app_sign_url";
  @SerializedName(SERIALIZED_NAME_MINI_APP_SIGN_URL)
  private String miniAppSignUrl;

  public static final String SERIALIZED_NAME_SIGN_URL = "sign_url";
  @SerializedName(SERIALIZED_NAME_SIGN_URL)
  private String signUrl;

  public AlipayCommerceEcEmployeeInviteQueryResponseModel() { 
  }

  public AlipayCommerceEcEmployeeInviteQueryResponseModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208847489339", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcEmployeeInviteQueryResponseModel miniAppSignUrl(String miniAppSignUrl) {
    
    this.miniAppSignUrl = miniAppSignUrl;
    return this;
  }

   /**
   * 支付宝服务商小程序跳入企业码小程序签约链接
   * @return miniAppSignUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pages/open/authorize/individual-auth/index?token=xxxxea2ac30656af68522fa596335a3642364d9994270ba&scene=PCC_STANDARD", value = "支付宝服务商小程序跳入企业码小程序签约链接")

  public String getMiniAppSignUrl() {
    return miniAppSignUrl;
  }


  public void setMiniAppSignUrl(String miniAppSignUrl) {
    this.miniAppSignUrl = miniAppSignUrl;
  }


  public AlipayCommerceEcEmployeeInviteQueryResponseModel signUrl(String signUrl) {
    
    this.signUrl = signUrl;
    return this;
  }

   /**
   * 邀请链接
   * @return signUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://sjddkk.com", value = "邀请链接")

  public String getSignUrl() {
    return signUrl;
  }


  public void setSignUrl(String signUrl) {
    this.signUrl = signUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcEmployeeInviteQueryResponseModel alipayCommerceEcEmployeeInviteQueryResponseModel = (AlipayCommerceEcEmployeeInviteQueryResponseModel) o;
    return Objects.equals(this.enterpriseId, alipayCommerceEcEmployeeInviteQueryResponseModel.enterpriseId) &&
        Objects.equals(this.miniAppSignUrl, alipayCommerceEcEmployeeInviteQueryResponseModel.miniAppSignUrl) &&
        Objects.equals(this.signUrl, alipayCommerceEcEmployeeInviteQueryResponseModel.signUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterpriseId, miniAppSignUrl, signUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEmployeeInviteQueryResponseModel {\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    miniAppSignUrl: ").append(toIndentedString(miniAppSignUrl)).append("\n");
    sb.append("    signUrl: ").append(toIndentedString(signUrl)).append("\n");
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
    openapiFields.add("enterprise_id");
    openapiFields.add("mini_app_sign_url");
    openapiFields.add("sign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEmployeeInviteQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEmployeeInviteQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEmployeeInviteQueryResponseModel is not found in the empty JSON string", AlipayCommerceEcEmployeeInviteQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcEmployeeInviteQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcEmployeeInviteQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("mini_app_sign_url") != null && !jsonObj.get("mini_app_sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_sign_url").toString()));
      }
      if (jsonObj.get("sign_url") != null && !jsonObj.get("sign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEmployeeInviteQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEmployeeInviteQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEmployeeInviteQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEmployeeInviteQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEmployeeInviteQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEmployeeInviteQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcEmployeeInviteQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcEmployeeInviteQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEmployeeInviteQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEmployeeInviteQueryResponseModel
  */
  public static AlipayCommerceEcEmployeeInviteQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEmployeeInviteQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEmployeeInviteQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

