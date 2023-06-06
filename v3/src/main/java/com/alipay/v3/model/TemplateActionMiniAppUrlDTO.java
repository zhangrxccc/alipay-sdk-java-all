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
 * TemplateActionMiniAppUrlDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateActionMiniAppUrlDTO {
  public static final String SERIALIZED_NAME_DISPLAY_ON_LIST = "display_on_list";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ON_LIST)
  private String displayOnList;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_PAGE_PARAM = "mini_page_param";
  @SerializedName(SERIALIZED_NAME_MINI_PAGE_PARAM)
  private String miniPageParam;

  public static final String SERIALIZED_NAME_MINI_QUERY_PARAM = "mini_query_param";
  @SerializedName(SERIALIZED_NAME_MINI_QUERY_PARAM)
  private String miniQueryParam;

  public TemplateActionMiniAppUrlDTO() { 
  }

  public TemplateActionMiniAppUrlDTO displayOnList(String displayOnList) {
    
    this.displayOnList = displayOnList;
    return this;
  }

   /**
   * 行动点按钮是否在列表页展示，true 或 false，不填则默认false；  列表页可以配置展示最多2项小程序跳转行动点。
   * @return displayOnList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "行动点按钮是否在列表页展示，true 或 false，不填则默认false；  列表页可以配置展示最多2项小程序跳转行动点。")

  public String getDisplayOnList() {
    return displayOnList;
  }


  public void setDisplayOnList(String displayOnList) {
    this.displayOnList = displayOnList;
  }


  public TemplateActionMiniAppUrlDTO miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 小程序appId
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序appId")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public TemplateActionMiniAppUrlDTO miniPageParam(String miniPageParam) {
    
    this.miniPageParam = miniPageParam;
    return this;
  }

   /**
   * 指定小程序页面，不填则默认跳转至对应小程序首页
   * @return miniPageParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定小程序页面，不填则默认跳转至对应小程序首页")

  public String getMiniPageParam() {
    return miniPageParam;
  }


  public void setMiniPageParam(String miniPageParam) {
    this.miniPageParam = miniPageParam;
  }


  public TemplateActionMiniAppUrlDTO miniQueryParam(String miniQueryParam) {
    
    this.miniQueryParam = miniQueryParam;
    return this;
  }

   /**
   * query参数，商户自定义传参，填入值将以\&quot;query\&quot;为参数名提交至指定小程序页面
   * @return miniQueryParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "query参数，商户自定义传参，填入值将以\"query\"为参数名提交至指定小程序页面")

  public String getMiniQueryParam() {
    return miniQueryParam;
  }


  public void setMiniQueryParam(String miniQueryParam) {
    this.miniQueryParam = miniQueryParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateActionMiniAppUrlDTO templateActionMiniAppUrlDTO = (TemplateActionMiniAppUrlDTO) o;
    return Objects.equals(this.displayOnList, templateActionMiniAppUrlDTO.displayOnList) &&
        Objects.equals(this.miniAppId, templateActionMiniAppUrlDTO.miniAppId) &&
        Objects.equals(this.miniPageParam, templateActionMiniAppUrlDTO.miniPageParam) &&
        Objects.equals(this.miniQueryParam, templateActionMiniAppUrlDTO.miniQueryParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayOnList, miniAppId, miniPageParam, miniQueryParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateActionMiniAppUrlDTO {\n");
    sb.append("    displayOnList: ").append(toIndentedString(displayOnList)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniPageParam: ").append(toIndentedString(miniPageParam)).append("\n");
    sb.append("    miniQueryParam: ").append(toIndentedString(miniQueryParam)).append("\n");
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
    openapiFields.add("display_on_list");
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_page_param");
    openapiFields.add("mini_query_param");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateActionMiniAppUrlDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateActionMiniAppUrlDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateActionMiniAppUrlDTO is not found in the empty JSON string", TemplateActionMiniAppUrlDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateActionMiniAppUrlDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateActionMiniAppUrlDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("display_on_list") != null && !jsonObj.get("display_on_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_on_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_on_list").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_page_param") != null && !jsonObj.get("mini_page_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_page_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_page_param").toString()));
      }
      if (jsonObj.get("mini_query_param") != null && !jsonObj.get("mini_query_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_query_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_query_param").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateActionMiniAppUrlDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateActionMiniAppUrlDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateActionMiniAppUrlDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateActionMiniAppUrlDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateActionMiniAppUrlDTO>() {
           @Override
           public void write(JsonWriter out, TemplateActionMiniAppUrlDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateActionMiniAppUrlDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateActionMiniAppUrlDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateActionMiniAppUrlDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateActionMiniAppUrlDTO
  */
  public static TemplateActionMiniAppUrlDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateActionMiniAppUrlDTO.class);
  }

 /**
  * Convert an instance of TemplateActionMiniAppUrlDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

