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
 * MerchantBaseEnterOpenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantBaseEnterOpenModel {
  public static final String SERIALIZED_NAME_LOGO_INFO = "logo_info";
  @SerializedName(SERIALIZED_NAME_LOGO_INFO)
  private String logoInfo;

  public static final String SERIALIZED_NAME_M_NAME = "m_name";
  @SerializedName(SERIALIZED_NAME_M_NAME)
  private String mName;

  public static final String SERIALIZED_NAME_M_SHORT_NAME = "m_short_name";
  @SerializedName(SERIALIZED_NAME_M_SHORT_NAME)
  private String mShortName;

  public MerchantBaseEnterOpenModel() { 
  }

  public MerchantBaseEnterOpenModel logoInfo(String logoInfo) {
    
    this.logoInfo = logoInfo;
    return this;
  }

   /**
   * 商户logo文件流信息，该字段为文件流经base64编码后得到的字符串。
   * @return logoInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAA...", value = "商户logo文件流信息，该字段为文件流经base64编码后得到的字符串。")

  public String getLogoInfo() {
    return logoInfo;
  }


  public void setLogoInfo(String logoInfo) {
    this.logoInfo = logoInfo;
  }


  public MerchantBaseEnterOpenModel mName(String mName) {
    
    this.mName = mName;
    return this;
  }

   /**
   * 商户品牌全称。
   * @return mName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "蚂蚁金融服务集团", value = "商户品牌全称。")

  public String getmName() {
    return mName;
  }


  public void setmName(String mName) {
    this.mName = mName;
  }


  public MerchantBaseEnterOpenModel mShortName(String mShortName) {
    
    this.mShortName = mShortName;
    return this;
  }

   /**
   * 商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
   * @return mShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MYJF", value = "商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。")

  public String getmShortName() {
    return mShortName;
  }


  public void setmShortName(String mShortName) {
    this.mShortName = mShortName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantBaseEnterOpenModel merchantBaseEnterOpenModel = (MerchantBaseEnterOpenModel) o;
    return Objects.equals(this.logoInfo, merchantBaseEnterOpenModel.logoInfo) &&
        Objects.equals(this.mName, merchantBaseEnterOpenModel.mName) &&
        Objects.equals(this.mShortName, merchantBaseEnterOpenModel.mShortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoInfo, mName, mShortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantBaseEnterOpenModel {\n");
    sb.append("    logoInfo: ").append(toIndentedString(logoInfo)).append("\n");
    sb.append("    mName: ").append(toIndentedString(mName)).append("\n");
    sb.append("    mShortName: ").append(toIndentedString(mShortName)).append("\n");
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
    openapiFields.add("logo_info");
    openapiFields.add("m_name");
    openapiFields.add("m_short_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantBaseEnterOpenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantBaseEnterOpenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantBaseEnterOpenModel is not found in the empty JSON string", MerchantBaseEnterOpenModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantBaseEnterOpenModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantBaseEnterOpenModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("logo_info") != null && !jsonObj.get("logo_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_info").toString()));
      }
      if (jsonObj.get("m_name") != null && !jsonObj.get("m_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_name").toString()));
      }
      if (jsonObj.get("m_short_name") != null && !jsonObj.get("m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_short_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantBaseEnterOpenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantBaseEnterOpenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantBaseEnterOpenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantBaseEnterOpenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantBaseEnterOpenModel>() {
           @Override
           public void write(JsonWriter out, MerchantBaseEnterOpenModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantBaseEnterOpenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantBaseEnterOpenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantBaseEnterOpenModel
  * @throws IOException if the JSON string is invalid with respect to MerchantBaseEnterOpenModel
  */
  public static MerchantBaseEnterOpenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantBaseEnterOpenModel.class);
  }

 /**
  * Convert an instance of MerchantBaseEnterOpenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

