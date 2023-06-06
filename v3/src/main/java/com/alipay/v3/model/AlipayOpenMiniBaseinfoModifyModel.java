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
 * AlipayOpenMiniBaseinfoModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniBaseinfoModifyModel {
  public static final String SERIALIZED_NAME_APP_CATEGORY_IDS = "app_category_ids";
  @SerializedName(SERIALIZED_NAME_APP_CATEGORY_IDS)
  private String appCategoryIds;

  public static final String SERIALIZED_NAME_APP_DESC = "app_desc";
  @SerializedName(SERIALIZED_NAME_APP_DESC)
  private String appDesc;

  public static final String SERIALIZED_NAME_APP_ENGLISH_NAME = "app_english_name";
  @SerializedName(SERIALIZED_NAME_APP_ENGLISH_NAME)
  private String appEnglishName;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_SLOGAN = "app_slogan";
  @SerializedName(SERIALIZED_NAME_APP_SLOGAN)
  private String appSlogan;

  public static final String SERIALIZED_NAME_MINI_CATEGORY_IDS = "mini_category_ids";
  @SerializedName(SERIALIZED_NAME_MINI_CATEGORY_IDS)
  private String miniCategoryIds;

  public static final String SERIALIZED_NAME_SERVICE_EMAIL = "service_email";
  @SerializedName(SERIALIZED_NAME_SERVICE_EMAIL)
  private String serviceEmail;

  public static final String SERIALIZED_NAME_SERVICE_PHONE = "service_phone";
  @SerializedName(SERIALIZED_NAME_SERVICE_PHONE)
  private String servicePhone;

  public AlipayOpenMiniBaseinfoModifyModel() { 
  }

  public AlipayOpenMiniBaseinfoModifyModel appCategoryIds(String appCategoryIds) {
    
    this.appCategoryIds = appCategoryIds;
    return this;
  }

   /**
   * 11_12;12_13。小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list 。
   * @return appCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11_12;12_13", value = "11_12;12_13。小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list 。")

  public String getAppCategoryIds() {
    return appCategoryIds;
  }


  public void setAppCategoryIds(String appCategoryIds) {
    this.appCategoryIds = appCategoryIds;
  }


  public AlipayOpenMiniBaseinfoModifyModel appDesc(String appDesc) {
    
    this.appDesc = appDesc;
    return this;
  }

   /**
   * 小程序描述，长度限制 20~400 个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息 
   * @return appDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个小程序的描述这是一个小程序的描述这是一个小程序的描述这是一个小程序的描述", value = "小程序描述，长度限制 20~400 个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息 ")

  public String getAppDesc() {
    return appDesc;
  }


  public void setAppDesc(String appDesc) {
    this.appDesc = appDesc;
  }


  public AlipayOpenMiniBaseinfoModifyModel appEnglishName(String appEnglishName) {
    
    this.appEnglishName = appEnglishName;
    return this;
  }

   /**
   * 小程序应用英文名称。长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过alipay.open.mini.baseinfo.query查询当前小程序信息
   * @return appEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "demoexample", value = "小程序应用英文名称。长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过alipay.open.mini.baseinfo.query查询当前小程序信息")

  public String getAppEnglishName() {
    return appEnglishName;
  }


  public void setAppEnglishName(String appEnglishName) {
    this.appEnglishName = appEnglishName;
  }


  public AlipayOpenMiniBaseinfoModifyModel appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称。长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过alipay.open.mini.baseinfo.query查询当前小程序信息
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州支小宝潮流女装店", value = "小程序名称。长度限制 3~30 个字符，仅支持包含中文、数字、英文、下划线、+、-。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过alipay.open.mini.baseinfo.query查询当前小程序信息")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AlipayOpenMiniBaseinfoModifyModel appSlogan(String appSlogan) {
    
    this.appSlogan = appSlogan;
    return this;
  }

   /**
   * 小程序简介，一句话描述小程序功能，长度限制 10~32个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过alipay.open.mini.baseinfo.query查询当前小程序信息
   * @return appSlogan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "专注潮流女装20年", value = "小程序简介，一句话描述小程序功能，长度限制 10~32个字符。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过alipay.open.mini.baseinfo.query查询当前小程序信息")

  public String getAppSlogan() {
    return appSlogan;
  }


  public void setAppSlogan(String appSlogan) {
    this.appSlogan = appSlogan;
  }


  public AlipayOpenMiniBaseinfoModifyModel miniCategoryIds(String miniCategoryIds) {
    
    this.miniCategoryIds = miniCategoryIds;
    return this;
  }

   /**
   * 新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query 接口查询mini_category_list。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息 注意：个人开发者不得使用企业类目。
   * @return miniCategoryIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XS1001_XS2001_XS3002;XS1011_XS2089;XS1002_XS2008_XS3024", value = "新小程序前台类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目，详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query 接口查询mini_category_list。 如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。如果前期没有设置过该信息，则本次为必填。可通过https://opendocs.alipay.com/mini/03l21r查询当前小程序信息 注意：个人开发者不得使用企业类目。")

  public String getMiniCategoryIds() {
    return miniCategoryIds;
  }


  public void setMiniCategoryIds(String miniCategoryIds) {
    this.miniCategoryIds = miniCategoryIds;
  }


  public AlipayOpenMiniBaseinfoModifyModel serviceEmail(String serviceEmail) {
    
    this.serviceEmail = serviceEmail;
    return this;
  }

   /**
   * 小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为可选字段，请按可选开发。
   * @return serviceEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@mail.com", value = "小程序客服邮箱，如果不填默认采用当前小程序的应用客服邮箱，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为可选字段，请按可选开发。")

  public String getServiceEmail() {
    return serviceEmail;
  }


  public void setServiceEmail(String serviceEmail) {
    this.serviceEmail = serviceEmail;
  }


  public AlipayOpenMiniBaseinfoModifyModel servicePhone(String servicePhone) {
    
    this.servicePhone = servicePhone;
    return this;
  }

   /**
   * 小程序客服电话，长度限制5~30个字符，仅支持包含数字和-。如果不填默认采用当前小程序的应用客服电话，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为必填字段，请按必填开发。
   * @return servicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13110101010", value = "小程序客服电话，长度限制5~30个字符，仅支持包含数字和-。如果不填默认采用当前小程序的应用客服电话，小程序客服电话和邮箱至少输入一个。如果前期已经设置过该信息，本次可不填，平台将会为你默认上传该信息。 注意：2021年7月1日后，该字段将逐步灰度为必填字段，请按必填开发。")

  public String getServicePhone() {
    return servicePhone;
  }


  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniBaseinfoModifyModel alipayOpenMiniBaseinfoModifyModel = (AlipayOpenMiniBaseinfoModifyModel) o;
    return Objects.equals(this.appCategoryIds, alipayOpenMiniBaseinfoModifyModel.appCategoryIds) &&
        Objects.equals(this.appDesc, alipayOpenMiniBaseinfoModifyModel.appDesc) &&
        Objects.equals(this.appEnglishName, alipayOpenMiniBaseinfoModifyModel.appEnglishName) &&
        Objects.equals(this.appName, alipayOpenMiniBaseinfoModifyModel.appName) &&
        Objects.equals(this.appSlogan, alipayOpenMiniBaseinfoModifyModel.appSlogan) &&
        Objects.equals(this.miniCategoryIds, alipayOpenMiniBaseinfoModifyModel.miniCategoryIds) &&
        Objects.equals(this.serviceEmail, alipayOpenMiniBaseinfoModifyModel.serviceEmail) &&
        Objects.equals(this.servicePhone, alipayOpenMiniBaseinfoModifyModel.servicePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCategoryIds, appDesc, appEnglishName, appName, appSlogan, miniCategoryIds, serviceEmail, servicePhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniBaseinfoModifyModel {\n");
    sb.append("    appCategoryIds: ").append(toIndentedString(appCategoryIds)).append("\n");
    sb.append("    appDesc: ").append(toIndentedString(appDesc)).append("\n");
    sb.append("    appEnglishName: ").append(toIndentedString(appEnglishName)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appSlogan: ").append(toIndentedString(appSlogan)).append("\n");
    sb.append("    miniCategoryIds: ").append(toIndentedString(miniCategoryIds)).append("\n");
    sb.append("    serviceEmail: ").append(toIndentedString(serviceEmail)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
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
    openapiFields.add("app_category_ids");
    openapiFields.add("app_desc");
    openapiFields.add("app_english_name");
    openapiFields.add("app_name");
    openapiFields.add("app_slogan");
    openapiFields.add("mini_category_ids");
    openapiFields.add("service_email");
    openapiFields.add("service_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniBaseinfoModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniBaseinfoModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniBaseinfoModifyModel is not found in the empty JSON string", AlipayOpenMiniBaseinfoModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniBaseinfoModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniBaseinfoModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_category_ids") != null && !jsonObj.get("app_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_category_ids").toString()));
      }
      if (jsonObj.get("app_desc") != null && !jsonObj.get("app_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_desc").toString()));
      }
      if (jsonObj.get("app_english_name") != null && !jsonObj.get("app_english_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_english_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_english_name").toString()));
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_slogan") != null && !jsonObj.get("app_slogan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_slogan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_slogan").toString()));
      }
      if (jsonObj.get("mini_category_ids") != null && !jsonObj.get("mini_category_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_category_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_category_ids").toString()));
      }
      if (jsonObj.get("service_email") != null && !jsonObj.get("service_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_email").toString()));
      }
      if (jsonObj.get("service_phone") != null && !jsonObj.get("service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniBaseinfoModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniBaseinfoModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniBaseinfoModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniBaseinfoModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniBaseinfoModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniBaseinfoModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniBaseinfoModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniBaseinfoModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniBaseinfoModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniBaseinfoModifyModel
  */
  public static AlipayOpenMiniBaseinfoModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniBaseinfoModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniBaseinfoModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

