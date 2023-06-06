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
 * IndirectCertificateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndirectCertificateInfo {
  public static final String SERIALIZED_NAME_CERT_IMAGE = "cert_image";
  @SerializedName(SERIALIZED_NAME_CERT_IMAGE)
  private String certImage;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_CERT_TYPE = "cert_type";
  @SerializedName(SERIALIZED_NAME_CERT_TYPE)
  private String certType;

  public static final String SERIALIZED_NAME_EFFECT_TIME = "effect_time";
  @SerializedName(SERIALIZED_NAME_EFFECT_TIME)
  private String effectTime;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private String expireTime;

  public static final String SERIALIZED_NAME_LEGAL_PERSON_NAME = "legal_person_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_PERSON_NAME)
  private String legalPersonName;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_REGISTER_ADDRESS = "register_address";
  @SerializedName(SERIALIZED_NAME_REGISTER_ADDRESS)
  private String registerAddress;

  public IndirectCertificateInfo() { 
  }

  public IndirectCertificateInfo certImage(String certImage) {
    
    this.certImage = certImage;
    return this;
  }

   /**
   * 证照图片（使用图片上传接口）
   * @return certImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a5d373f6-3e79-405f-9993-fb7ea051c372.jpg", value = "证照图片（使用图片上传接口）")

  public String getCertImage() {
    return certImage;
  }


  public void setCertImage(String certImage) {
    this.certImage = certImage;
  }


  public IndirectCertificateInfo certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 证件编号
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0000001", value = "证件编号")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public IndirectCertificateInfo certType(String certType) {
    
    this.certType = certType;
    return this;
  }

   /**
   * 登记证书类型时必填，枚举：统一社会信用代码证书（UNIT_SOCIAL_CREDIT）、慈善组织公开募捐资格证书（CHARITY_ORG_SOLICIT），社会团体法人登记证书（SOCIAL_ORG_LEGAL），民办非企业单位登记证书（CIVIL_UN_ENT），基金会法人登记证书（FOUNDATION_LEGAL_PERSON），农民专业合作社法人营业执照（FARMERS_COOPERATE），宗教活动场所登记证（RELIGION_PLACES），其他证书/批文/证明（OTHER_REG_CERT）
   * @return certType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOCIAL_ORG_LEGAL", value = "登记证书类型时必填，枚举：统一社会信用代码证书（UNIT_SOCIAL_CREDIT）、慈善组织公开募捐资格证书（CHARITY_ORG_SOLICIT），社会团体法人登记证书（SOCIAL_ORG_LEGAL），民办非企业单位登记证书（CIVIL_UN_ENT），基金会法人登记证书（FOUNDATION_LEGAL_PERSON），农民专业合作社法人营业执照（FARMERS_COOPERATE），宗教活动场所登记证（RELIGION_PLACES），其他证书/批文/证明（OTHER_REG_CERT）")

  public String getCertType() {
    return certType;
  }


  public void setCertType(String certType) {
    this.certType = certType;
  }


  public IndirectCertificateInfo effectTime(String effectTime) {
    
    this.effectTime = effectTime;
    return this;
  }

   /**
   * 证照生效时间
   * @return effectTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1999-01-01", value = "证照生效时间")

  public String getEffectTime() {
    return effectTime;
  }


  public void setEffectTime(String effectTime) {
    this.effectTime = effectTime;
  }


  public IndirectCertificateInfo expireTime(String expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 证照过期时间
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-01，长期有效时传“forever”", value = "证照过期时间")

  public String getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  public IndirectCertificateInfo legalPersonName(String legalPersonName) {
    
    this.legalPersonName = legalPersonName;
    return this;
  }

   /**
   * 证照法人姓名
   * @return legalPersonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "李四", value = "证照法人姓名")

  public String getLegalPersonName() {
    return legalPersonName;
  }


  public void setLegalPersonName(String legalPersonName) {
    this.legalPersonName = legalPersonName;
  }


  public IndirectCertificateInfo merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 证照商户名称
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新新饭店", value = "证照商户名称")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public IndirectCertificateInfo registerAddress(String registerAddress) {
    
    this.registerAddress = registerAddress;
    return this;
  }

   /**
   * 证照注册地址
   * @return registerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省杭州市西湖区xxx街道xxx门牌号", value = "证照注册地址")

  public String getRegisterAddress() {
    return registerAddress;
  }


  public void setRegisterAddress(String registerAddress) {
    this.registerAddress = registerAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirectCertificateInfo indirectCertificateInfo = (IndirectCertificateInfo) o;
    return Objects.equals(this.certImage, indirectCertificateInfo.certImage) &&
        Objects.equals(this.certNo, indirectCertificateInfo.certNo) &&
        Objects.equals(this.certType, indirectCertificateInfo.certType) &&
        Objects.equals(this.effectTime, indirectCertificateInfo.effectTime) &&
        Objects.equals(this.expireTime, indirectCertificateInfo.expireTime) &&
        Objects.equals(this.legalPersonName, indirectCertificateInfo.legalPersonName) &&
        Objects.equals(this.merchantName, indirectCertificateInfo.merchantName) &&
        Objects.equals(this.registerAddress, indirectCertificateInfo.registerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certImage, certNo, certType, effectTime, expireTime, legalPersonName, merchantName, registerAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectCertificateInfo {\n");
    sb.append("    certImage: ").append(toIndentedString(certImage)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    legalPersonName: ").append(toIndentedString(legalPersonName)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    registerAddress: ").append(toIndentedString(registerAddress)).append("\n");
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
    openapiFields.add("cert_image");
    openapiFields.add("cert_no");
    openapiFields.add("cert_type");
    openapiFields.add("effect_time");
    openapiFields.add("expire_time");
    openapiFields.add("legal_person_name");
    openapiFields.add("merchant_name");
    openapiFields.add("register_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndirectCertificateInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndirectCertificateInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirectCertificateInfo is not found in the empty JSON string", IndirectCertificateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndirectCertificateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndirectCertificateInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cert_image") != null && !jsonObj.get("cert_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_image").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("cert_type") != null && !jsonObj.get("cert_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_type").toString()));
      }
      if (jsonObj.get("effect_time") != null && !jsonObj.get("effect_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect_time").toString()));
      }
      if (jsonObj.get("expire_time") != null && !jsonObj.get("expire_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expire_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expire_time").toString()));
      }
      if (jsonObj.get("legal_person_name") != null && !jsonObj.get("legal_person_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_person_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_person_name").toString()));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("register_address") != null && !jsonObj.get("register_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `register_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("register_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirectCertificateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirectCertificateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirectCertificateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirectCertificateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirectCertificateInfo>() {
           @Override
           public void write(JsonWriter out, IndirectCertificateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndirectCertificateInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndirectCertificateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndirectCertificateInfo
  * @throws IOException if the JSON string is invalid with respect to IndirectCertificateInfo
  */
  public static IndirectCertificateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirectCertificateInfo.class);
  }

 /**
  * Convert an instance of IndirectCertificateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

