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
 * AlipayOpenMiniQrcodeBindModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniQrcodeBindModel {
  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_PAGE_REDIRECTION = "page_redirection";
  @SerializedName(SERIALIZED_NAME_PAGE_REDIRECTION)
  private String pageRedirection;

  public static final String SERIALIZED_NAME_ROUTE_PATTERN = "route_pattern";
  @SerializedName(SERIALIZED_NAME_ROUTE_PATTERN)
  private String routePattern;

  public static final String SERIALIZED_NAME_ROUTE_URL = "route_url";
  @SerializedName(SERIALIZED_NAME_ROUTE_URL)
  private String routeUrl;

  public AlipayOpenMiniQrcodeBindModel() { 
  }

  public AlipayOpenMiniQrcodeBindModel mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * 匹配规则，仅支持EXACT（精确匹配）、FUZZY（模糊匹配）两个值。  精确匹配：根据填写的二维码地址精确匹配，地址完全一致时才能唤起小程序（如：配置二维码地址为https://www.alipay.com/my?id&#x3D;123，当用户扫这个地址的二维码可唤起小程序）。  模糊匹配：根据填写的二维码地址模糊匹配，只要地址前缀匹配即可唤起小程序（如：配置二维码地址为https://www.alipay.com/my/，当用户扫的二维码地址为https://www.alipay.com/my/id&#x3D;123,可唤起小程序）。
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FUZZY", value = "匹配规则，仅支持EXACT（精确匹配）、FUZZY（模糊匹配）两个值。  精确匹配：根据填写的二维码地址精确匹配，地址完全一致时才能唤起小程序（如：配置二维码地址为https://www.alipay.com/my?id=123，当用户扫这个地址的二维码可唤起小程序）。  模糊匹配：根据填写的二维码地址模糊匹配，只要地址前缀匹配即可唤起小程序（如：配置二维码地址为https://www.alipay.com/my/，当用户扫的二维码地址为https://www.alipay.com/my/id=123,可唤起小程序）。")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public AlipayOpenMiniQrcodeBindModel pageRedirection(String pageRedirection) {
    
    this.pageRedirection = pageRedirection;
    return this;
  }

   /**
   * 小程序功能页，配置扫描二维码后打开的小程序功能页面路径
   * @return pageRedirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pages/index/index", value = "小程序功能页，配置扫描二维码后打开的小程序功能页面路径")

  public String getPageRedirection() {
    return pageRedirection;
  }


  public void setPageRedirection(String pageRedirection) {
    this.pageRedirection = pageRedirection;
  }


  public AlipayOpenMiniQrcodeBindModel routePattern(String routePattern) {
    
    this.routePattern = routePattern;
    return this;
  }

   /**
   * 模式，用于描述通用的路由url格式，适用于同一个host下面存在大量路由的场景，主要用于提升路由性能，其中{0}、{1} 代表路径中的变量
   * @return routePattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://yoursite.com/merchant/{0}/shop/{1}", value = "模式，用于描述通用的路由url格式，适用于同一个host下面存在大量路由的场景，主要用于提升路由性能，其中{0}、{1} 代表路径中的变量")

  public String getRoutePattern() {
    return routePattern;
  }


  public void setRoutePattern(String routePattern) {
    this.routePattern = routePattern;
  }


  public AlipayOpenMiniQrcodeBindModel routeUrl(String routeUrl) {
    
    this.routeUrl = routeUrl;
    return this;
  }

   /**
   * 二维码域名，须通过ICP备案验证，支持http、https、ftp开头的链接
   * @return routeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.yoursite.com/", value = "二维码域名，须通过ICP备案验证，支持http、https、ftp开头的链接")

  public String getRouteUrl() {
    return routeUrl;
  }


  public void setRouteUrl(String routeUrl) {
    this.routeUrl = routeUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel = (AlipayOpenMiniQrcodeBindModel) o;
    return Objects.equals(this.mode, alipayOpenMiniQrcodeBindModel.mode) &&
        Objects.equals(this.pageRedirection, alipayOpenMiniQrcodeBindModel.pageRedirection) &&
        Objects.equals(this.routePattern, alipayOpenMiniQrcodeBindModel.routePattern) &&
        Objects.equals(this.routeUrl, alipayOpenMiniQrcodeBindModel.routeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, pageRedirection, routePattern, routeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniQrcodeBindModel {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    pageRedirection: ").append(toIndentedString(pageRedirection)).append("\n");
    sb.append("    routePattern: ").append(toIndentedString(routePattern)).append("\n");
    sb.append("    routeUrl: ").append(toIndentedString(routeUrl)).append("\n");
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
    openapiFields.add("mode");
    openapiFields.add("page_redirection");
    openapiFields.add("route_pattern");
    openapiFields.add("route_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniQrcodeBindModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniQrcodeBindModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniQrcodeBindModel is not found in the empty JSON string", AlipayOpenMiniQrcodeBindModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniQrcodeBindModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniQrcodeBindModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if (jsonObj.get("page_redirection") != null && !jsonObj.get("page_redirection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_redirection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_redirection").toString()));
      }
      if (jsonObj.get("route_pattern") != null && !jsonObj.get("route_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_pattern").toString()));
      }
      if (jsonObj.get("route_url") != null && !jsonObj.get("route_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("route_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniQrcodeBindModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniQrcodeBindModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniQrcodeBindModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniQrcodeBindModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniQrcodeBindModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniQrcodeBindModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniQrcodeBindModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniQrcodeBindModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniQrcodeBindModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniQrcodeBindModel
  */
  public static AlipayOpenMiniQrcodeBindModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniQrcodeBindModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniQrcodeBindModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

