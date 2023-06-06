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
 * AlipayOpenSpMerchantInconsistentApproveModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpMerchantInconsistentApproveModel {
  public static final String SERIALIZED_NAME_BACK_CARD = "back_card";
  @SerializedName(SERIALIZED_NAME_BACK_CARD)
  private String backCard;

  public static final String SERIALIZED_NAME_COMMITMENT_LETTER = "commitment_letter";
  @SerializedName(SERIALIZED_NAME_COMMITMENT_LETTER)
  private String commitmentLetter;

  public static final String SERIALIZED_NAME_FRONT_CARD = "front_card";
  @SerializedName(SERIALIZED_NAME_FRONT_CARD)
  private String frontCard;

  public static final String SERIALIZED_NAME_HANDHELD_BUSINESS_LICENSE = "handheld_business_license";
  @SerializedName(SERIALIZED_NAME_HANDHELD_BUSINESS_LICENSE)
  private String handheldBusinessLicense;

  public static final String SERIALIZED_NAME_HANDHELD_CARD = "handheld_card";
  @SerializedName(SERIALIZED_NAME_HANDHELD_CARD)
  private String handheldCard;

  public static final String SERIALIZED_NAME_ITEM_CODE = "item_code";
  @SerializedName(SERIALIZED_NAME_ITEM_CODE)
  private String itemCode;

  public static final String SERIALIZED_NAME_MERCHANT_PID = "merchant_pid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PID)
  private String merchantPid;

  public static final String SERIALIZED_NAME_MINI_APPID = "mini_appid";
  @SerializedName(SERIALIZED_NAME_MINI_APPID)
  private String miniAppid;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PROMOTOR_PID = "promotor_pid";
  @SerializedName(SERIALIZED_NAME_PROMOTOR_PID)
  private String promotorPid;

  public AlipayOpenSpMerchantInconsistentApproveModel() { 
  }

  public AlipayOpenSpMerchantInconsistentApproveModel backCard(String backCard) {
    
    this.backCard = backCard;
    return this;
  }

   /**
   * 身份证背面照，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01ea4t\&quot;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。
   * @return backCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "身份证背面照，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href=\"https://opendocs.alipay.com/apis/01ea4t\">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。")

  public String getBackCard() {
    return backCard;
  }


  public void setBackCard(String backCard) {
    this.backCard = backCard;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel commitmentLetter(String commitmentLetter) {
    
    this.commitmentLetter = commitmentLetter;
    return this;
  }

   /**
   * 实际经营人承诺函照片，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01ea4t\&quot;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。
   * @return commitmentLetter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "实际经营人承诺函照片，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href=\"https://opendocs.alipay.com/apis/01ea4t\">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。")

  public String getCommitmentLetter() {
    return commitmentLetter;
  }


  public void setCommitmentLetter(String commitmentLetter) {
    this.commitmentLetter = commitmentLetter;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel frontCard(String frontCard) {
    
    this.frontCard = frontCard;
    return this;
  }

   /**
   * 身份证正面照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式. 请传&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01ea4t\&quot;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。
   * @return frontCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "身份证正面照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式. 请传<a href=\"https://opendocs.alipay.com/apis/01ea4t\">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。")

  public String getFrontCard() {
    return frontCard;
  }


  public void setFrontCard(String frontCard) {
    this.frontCard = frontCard;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel handheldBusinessLicense(String handheldBusinessLicense) {
    
    this.handheldBusinessLicense = handheldBusinessLicense;
    return this;
  }

   /**
   * 手持营业执照合照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01ea4t\&quot;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。
   * @return handheldBusinessLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "手持营业执照合照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href=\"https://opendocs.alipay.com/apis/01ea4t\">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。")

  public String getHandheldBusinessLicense() {
    return handheldBusinessLicense;
  }


  public void setHandheldBusinessLicense(String handheldBusinessLicense) {
    this.handheldBusinessLicense = handheldBusinessLicense;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel handheldCard(String handheldCard) {
    
    this.handheldCard = handheldCard;
    return this;
  }

   /**
   * 手持身份证合照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/apis/01ea4t\&quot;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。
   * @return handheldCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "手持身份证合照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href=\"https://opendocs.alipay.com/apis/01ea4t\">alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见报名资质要求。")

  public String getHandheldCard() {
    return handheldCard;
  }


  public void setHandheldCard(String handheldCard) {
    this.handheldCard = handheldCard;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel itemCode(String itemCode) {
    
    this.itemCode = itemCode;
    return this;
  }

   /**
   * 服务优选商品编码
   * @return itemCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SS010301000000001234", value = "服务优选商品编码")

  public String getItemCode() {
    return itemCode;
  }


  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel merchantPid(String merchantPid) {
    
    this.merchantPid = merchantPid;
    return this;
  }

   /**
   * 商家pid
   * @return merchantPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "商家pid")

  public String getMerchantPid() {
    return merchantPid;
  }


  public void setMerchantPid(String merchantPid) {
    this.merchantPid = merchantPid;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel miniAppid(String miniAppid) {
    
    this.miniAppid = miniAppid;
    return this;
  }

   /**
   * 商家小程序appId
   * @return miniAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021060612341234", value = "商家小程序appId")

  public String getMiniAppid() {
    return miniAppid;
  }


  public void setMiniAppid(String miniAppid) {
    this.miniAppid = miniAppid;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号，需不重复
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088100010001000", value = "外部业务号，需不重复")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenSpMerchantInconsistentApproveModel promotorPid(String promotorPid) {
    
    this.promotorPid = promotorPid;
    return this;
  }

   /**
   * 推广服务商(S2)pid
   * @return promotorPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "推广服务商(S2)pid")

  public String getPromotorPid() {
    return promotorPid;
  }


  public void setPromotorPid(String promotorPid) {
    this.promotorPid = promotorPid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpMerchantInconsistentApproveModel alipayOpenSpMerchantInconsistentApproveModel = (AlipayOpenSpMerchantInconsistentApproveModel) o;
    return Objects.equals(this.backCard, alipayOpenSpMerchantInconsistentApproveModel.backCard) &&
        Objects.equals(this.commitmentLetter, alipayOpenSpMerchantInconsistentApproveModel.commitmentLetter) &&
        Objects.equals(this.frontCard, alipayOpenSpMerchantInconsistentApproveModel.frontCard) &&
        Objects.equals(this.handheldBusinessLicense, alipayOpenSpMerchantInconsistentApproveModel.handheldBusinessLicense) &&
        Objects.equals(this.handheldCard, alipayOpenSpMerchantInconsistentApproveModel.handheldCard) &&
        Objects.equals(this.itemCode, alipayOpenSpMerchantInconsistentApproveModel.itemCode) &&
        Objects.equals(this.merchantPid, alipayOpenSpMerchantInconsistentApproveModel.merchantPid) &&
        Objects.equals(this.miniAppid, alipayOpenSpMerchantInconsistentApproveModel.miniAppid) &&
        Objects.equals(this.outBizNo, alipayOpenSpMerchantInconsistentApproveModel.outBizNo) &&
        Objects.equals(this.promotorPid, alipayOpenSpMerchantInconsistentApproveModel.promotorPid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backCard, commitmentLetter, frontCard, handheldBusinessLicense, handheldCard, itemCode, merchantPid, miniAppid, outBizNo, promotorPid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpMerchantInconsistentApproveModel {\n");
    sb.append("    backCard: ").append(toIndentedString(backCard)).append("\n");
    sb.append("    commitmentLetter: ").append(toIndentedString(commitmentLetter)).append("\n");
    sb.append("    frontCard: ").append(toIndentedString(frontCard)).append("\n");
    sb.append("    handheldBusinessLicense: ").append(toIndentedString(handheldBusinessLicense)).append("\n");
    sb.append("    handheldCard: ").append(toIndentedString(handheldCard)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    merchantPid: ").append(toIndentedString(merchantPid)).append("\n");
    sb.append("    miniAppid: ").append(toIndentedString(miniAppid)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    promotorPid: ").append(toIndentedString(promotorPid)).append("\n");
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
    openapiFields.add("back_card");
    openapiFields.add("commitment_letter");
    openapiFields.add("front_card");
    openapiFields.add("handheld_business_license");
    openapiFields.add("handheld_card");
    openapiFields.add("item_code");
    openapiFields.add("merchant_pid");
    openapiFields.add("mini_appid");
    openapiFields.add("out_biz_no");
    openapiFields.add("promotor_pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpMerchantInconsistentApproveModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpMerchantInconsistentApproveModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpMerchantInconsistentApproveModel is not found in the empty JSON string", AlipayOpenSpMerchantInconsistentApproveModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpMerchantInconsistentApproveModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpMerchantInconsistentApproveModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("back_card") != null && !jsonObj.get("back_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `back_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("back_card").toString()));
      }
      if (jsonObj.get("commitment_letter") != null && !jsonObj.get("commitment_letter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitment_letter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commitment_letter").toString()));
      }
      if (jsonObj.get("front_card") != null && !jsonObj.get("front_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `front_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("front_card").toString()));
      }
      if (jsonObj.get("handheld_business_license") != null && !jsonObj.get("handheld_business_license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handheld_business_license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handheld_business_license").toString()));
      }
      if (jsonObj.get("handheld_card") != null && !jsonObj.get("handheld_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handheld_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handheld_card").toString()));
      }
      if (jsonObj.get("item_code") != null && !jsonObj.get("item_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_code").toString()));
      }
      if (jsonObj.get("merchant_pid") != null && !jsonObj.get("merchant_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pid").toString()));
      }
      if (jsonObj.get("mini_appid") != null && !jsonObj.get("mini_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_appid").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("promotor_pid") != null && !jsonObj.get("promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotor_pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpMerchantInconsistentApproveModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpMerchantInconsistentApproveModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpMerchantInconsistentApproveModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpMerchantInconsistentApproveModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpMerchantInconsistentApproveModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpMerchantInconsistentApproveModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpMerchantInconsistentApproveModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpMerchantInconsistentApproveModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpMerchantInconsistentApproveModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpMerchantInconsistentApproveModel
  */
  public static AlipayOpenSpMerchantInconsistentApproveModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpMerchantInconsistentApproveModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpMerchantInconsistentApproveModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

