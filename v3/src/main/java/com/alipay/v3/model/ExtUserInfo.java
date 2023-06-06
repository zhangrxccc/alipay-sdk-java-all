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
 * ExtUserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtUserInfo {
  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_FIX_BUYER = "fix_buyer";
  @SerializedName(SERIALIZED_NAME_FIX_BUYER)
  private String fixBuyer;

  public static final String SERIALIZED_NAME_IDENTITY_HASH = "identity_hash";
  @SerializedName(SERIALIZED_NAME_IDENTITY_HASH)
  private String identityHash;

  public static final String SERIALIZED_NAME_MIN_AGE = "min_age";
  @SerializedName(SERIALIZED_NAME_MIN_AGE)
  private String minAge;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEED_CHECK_INFO = "need_check_info";
  @SerializedName(SERIALIZED_NAME_NEED_CHECK_INFO)
  private String needCheckInfo;

  public ExtUserInfo() { 
  }

  public ExtUserInfo certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 买家证件号。 注：need_check_info&#x3D;T或fix_buyer&#x3D;T时该参数才有效，支付宝会比较买家在支付宝留存的证件号码与该参数传入的值是否匹配。
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "买家证件号。 注：need_check_info=T或fix_buyer=T时该参数才有效，支付宝会比较买家在支付宝留存的证件号码与该参数传入的值是否匹配。")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public ExtUserInfo certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 指定买家证件类型。 枚举值： IDENTITY_CARD：身份证； PASSPORT：护照； OFFICER_CARD：军官证； SOLDIER_CARD：士兵证； HOKOU：户口本。如有其它类型需要支持，请与蚂蚁金服工作人员联系。 注： need_check_info&#x3D;T或fix_buyer&#x3D;T时该参数才有效，支付宝会比较买家在支付宝留存的证件类型与该参数传入的值是否匹配。
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定买家证件类型。 枚举值： IDENTITY_CARD：身份证； PASSPORT：护照； OFFICER_CARD：军官证； SOLDIER_CARD：士兵证； HOKOU：户口本。如有其它类型需要支持，请与蚂蚁金服工作人员联系。 注： need_check_info=T或fix_buyer=T时该参数才有效，支付宝会比较买家在支付宝留存的证件类型与该参数传入的值是否匹配。")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public ExtUserInfo fixBuyer(String fixBuyer) {
    
    this.fixBuyer = fixBuyer;
    return this;
  }

   /**
   * 是否强制校验买家身份。 需要强制校验传：T; 不需要强制校验传：F或者不传； 当传T时，接口上必须指定cert_type、cert_no和name信息且支付宝会校验传入的信息跟支付买家的信息都匹配，否则报错。 默认为不校验。
   * @return fixBuyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否强制校验买家身份。 需要强制校验传：T; 不需要强制校验传：F或者不传； 当传T时，接口上必须指定cert_type、cert_no和name信息且支付宝会校验传入的信息跟支付买家的信息都匹配，否则报错。 默认为不校验。")

  public String getFixBuyer() {
    return fixBuyer;
  }


  public void setFixBuyer(String fixBuyer) {
    this.fixBuyer = fixBuyer;
  }


  public ExtUserInfo identityHash(String identityHash) {
    
    this.identityHash = identityHash;
    return this;
  }

   /**
   * 买家加密身份信息。当指定了此参数且指定need_check_info&#x3D;T时，支付宝会对买家身份进行校验，校验逻辑为买家姓名、买家证件号拼接后的字符串，以sha256算法utf-8编码计算hash，若与传入的值不匹配则会拦截本次支付。注意：如果同时指定了用户明文身份信息（name，cert_type，cert_no中任意一个），则忽略identity_hash以明文参数校验。
   * @return identityHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "买家加密身份信息。当指定了此参数且指定need_check_info=T时，支付宝会对买家身份进行校验，校验逻辑为买家姓名、买家证件号拼接后的字符串，以sha256算法utf-8编码计算hash，若与传入的值不匹配则会拦截本次支付。注意：如果同时指定了用户明文身份信息（name，cert_type，cert_no中任意一个），则忽略identity_hash以明文参数校验。")

  public String getIdentityHash() {
    return identityHash;
  }


  public void setIdentityHash(String identityHash) {
    this.identityHash = identityHash;
  }


  public ExtUserInfo minAge(String minAge) {
    
    this.minAge = minAge;
    return this;
  }

   /**
   * 允许的最小买家年龄。 买家年龄必须大于等于所传数值  注： 1. need_check_info&#x3D;T时该参数才有效 2. min_age为整数，必须大于等于0
   * @return minAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "允许的最小买家年龄。 买家年龄必须大于等于所传数值  注： 1. need_check_info=T时该参数才有效 2. min_age为整数，必须大于等于0")

  public String getMinAge() {
    return minAge;
  }


  public void setMinAge(String minAge) {
    this.minAge = minAge;
  }


  public ExtUserInfo mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 指定买家手机号。 注：该参数暂不校验
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定买家手机号。 注：该参数暂不校验")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public ExtUserInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 指定买家姓名。 注： need_check_info&#x3D;T或fix_buyer&#x3D;T时该参数才有效
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定买家姓名。 注： need_check_info=T或fix_buyer=T时该参数才有效")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExtUserInfo needCheckInfo(String needCheckInfo) {
    
    this.needCheckInfo = needCheckInfo;
    return this;
  }

   /**
   * 是否强制校验买家信息； 需要强制校验传：T; 不需要强制校验传：F或者不传； 当传T时，支付宝会校验支付买家的信息与接口上传递的cert_type、cert_no、name或age是否匹配，只有接口传递了信息才会进行对应项的校验；只要有任何一项信息校验不匹配交易都会失败。如果传递了need_check_info，但是没有传任何校验项，则不进行任何校验。 默认为不校验。
   * @return needCheckInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否强制校验买家信息； 需要强制校验传：T; 不需要强制校验传：F或者不传； 当传T时，支付宝会校验支付买家的信息与接口上传递的cert_type、cert_no、name或age是否匹配，只有接口传递了信息才会进行对应项的校验；只要有任何一项信息校验不匹配交易都会失败。如果传递了need_check_info，但是没有传任何校验项，则不进行任何校验。 默认为不校验。")

  public String getNeedCheckInfo() {
    return needCheckInfo;
  }


  public void setNeedCheckInfo(String needCheckInfo) {
    this.needCheckInfo = needCheckInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtUserInfo extUserInfo = (ExtUserInfo) o;
    return Objects.equals(this.certNo, extUserInfo.certNo) &&
        Objects.equals(this.certType, extUserInfo.certType) &&
        Objects.equals(this.fixBuyer, extUserInfo.fixBuyer) &&
        Objects.equals(this.identityHash, extUserInfo.identityHash) &&
        Objects.equals(this.minAge, extUserInfo.minAge) &&
        Objects.equals(this.mobile, extUserInfo.mobile) &&
        Objects.equals(this.name, extUserInfo.name) &&
        Objects.equals(this.needCheckInfo, extUserInfo.needCheckInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certNo, certType, fixBuyer, identityHash, minAge, mobile, name, needCheckInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtUserInfo {\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    fixBuyer: ").append(toIndentedString(fixBuyer)).append("\n");
    sb.append("    identityHash: ").append(toIndentedString(identityHash)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    needCheckInfo: ").append(toIndentedString(needCheckInfo)).append("\n");
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
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("fix_buyer");
    openapiFields.add("identity_hash");
    openapiFields.add("min_age");
    openapiFields.add("mobile");
    openapiFields.add("name");
    openapiFields.add("need_check_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtUserInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExtUserInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtUserInfo is not found in the empty JSON string", ExtUserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExtUserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtUserInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("fix_buyer") != null && !jsonObj.get("fix_buyer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fix_buyer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fix_buyer").toString()));
      }
      if (jsonObj.get("identity_hash") != null && !jsonObj.get("identity_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_hash").toString()));
      }
      if (jsonObj.get("min_age") != null && !jsonObj.get("min_age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_age").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("need_check_info") != null && !jsonObj.get("need_check_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_check_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_check_info").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtUserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtUserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtUserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtUserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtUserInfo>() {
           @Override
           public void write(JsonWriter out, ExtUserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtUserInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtUserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtUserInfo
  * @throws IOException if the JSON string is invalid with respect to ExtUserInfo
  */
  public static ExtUserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtUserInfo.class);
  }

 /**
  * Convert an instance of ExtUserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

