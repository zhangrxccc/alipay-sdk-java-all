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
 * AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel {
  public static final String SERIALIZED_NAME_APP_LOGO = "app_logo";
  @SerializedName(SERIALIZED_NAME_APP_LOGO)
  private String appLogo;

  public AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel() { 
  }

  public AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel appLogo(String appLogo) {
    
    this.appLogo = appLogo;
    return this;
  }

   /**
   * 上传图片结果地址。 图片要求： 1、不能超过256kb 2、支持的图片格式为jpg、jpeg、png 3、长宽比例必须为为1:1
   * @return appLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://appstoreisvpic.alipayobjects.com/6c19accf-1343-4c5d-be62-3964144b3944.png", value = "上传图片结果地址。 图片要求： 1、不能超过256kb 2、支持的图片格式为jpg、jpeg、png 3、长宽比例必须为为1:1")

  public String getAppLogo() {
    return appLogo;
  }


  public void setAppLogo(String appLogo) {
    this.appLogo = appLogo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel alipayOpenMiniInnerbaseinfoApplogoUploadResponseModel = (AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel) o;
    return Objects.equals(this.appLogo, alipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.appLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLogo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel {\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
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
    openapiFields.add("app_logo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel is not found in the empty JSON string", AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_logo") != null && !jsonObj.get("app_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_logo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel
  */
  public static AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniInnerbaseinfoApplogoUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

