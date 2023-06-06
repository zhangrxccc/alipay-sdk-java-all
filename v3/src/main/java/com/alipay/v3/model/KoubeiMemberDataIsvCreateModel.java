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
import com.alipay.v3.model.MemberShip;
import com.alipay.v3.model.OuterMemberInfo;
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
 * KoubeiMemberDataIsvCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KoubeiMemberDataIsvCreateModel {
  public static final String SERIALIZED_NAME_GMT_MEMBER_CARD_LAST_ACTIVE = "gmt_member_card_last_active";
  @SerializedName(SERIALIZED_NAME_GMT_MEMBER_CARD_LAST_ACTIVE)
  private String gmtMemberCardLastActive;

  public static final String SERIALIZED_NAME_GMT_MERBER_CARD_CREATE = "gmt_merber_card_create";
  @SerializedName(SERIALIZED_NAME_GMT_MERBER_CARD_CREATE)
  private String gmtMerberCardCreate;

  public static final String SERIALIZED_NAME_MEMBER_CARD_ID = "member_card_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_CARD_ID)
  private String memberCardId;

  public static final String SERIALIZED_NAME_MEMBER_CARD_TYPE = "member_card_type";
  @SerializedName(SERIALIZED_NAME_MEMBER_CARD_TYPE)
  private String memberCardType;

  public static final String SERIALIZED_NAME_MEMBER_SHIP = "member_ship";
  @SerializedName(SERIALIZED_NAME_MEMBER_SHIP)
  private MemberShip memberShip;

  public static final String SERIALIZED_NAME_MEMBER_SOURCE = "member_source";
  @SerializedName(SERIALIZED_NAME_MEMBER_SOURCE)
  private String memberSource;

  public static final String SERIALIZED_NAME_MEMBER_SOURCE_DESC = "member_source_desc";
  @SerializedName(SERIALIZED_NAME_MEMBER_SOURCE_DESC)
  private String memberSourceDesc;

  public static final String SERIALIZED_NAME_MEMBER_STATUS = "member_status";
  @SerializedName(SERIALIZED_NAME_MEMBER_STATUS)
  private String memberStatus;

  public static final String SERIALIZED_NAME_OUTER_MEMBER_INFO = "outer_member_info";
  @SerializedName(SERIALIZED_NAME_OUTER_MEMBER_INFO)
  private OuterMemberInfo outerMemberInfo;

  public static final String SERIALIZED_NAME_PARTER_ID = "parter_id";
  @SerializedName(SERIALIZED_NAME_PARTER_ID)
  private String parterId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public KoubeiMemberDataIsvCreateModel() { 
  }

  public KoubeiMemberDataIsvCreateModel gmtMemberCardLastActive(String gmtMemberCardLastActive) {
    
    this.gmtMemberCardLastActive = gmtMemberCardLastActive;
    return this;
  }

   /**
   * 会员卡最近一次激活时间，格式：yyyy-MM-dd HH:MM:ss
   * @return gmtMemberCardLastActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-02-17  20:11:54", value = "会员卡最近一次激活时间，格式：yyyy-MM-dd HH:MM:ss")

  public String getGmtMemberCardLastActive() {
    return gmtMemberCardLastActive;
  }


  public void setGmtMemberCardLastActive(String gmtMemberCardLastActive) {
    this.gmtMemberCardLastActive = gmtMemberCardLastActive;
  }


  public KoubeiMemberDataIsvCreateModel gmtMerberCardCreate(String gmtMerberCardCreate) {
    
    this.gmtMerberCardCreate = gmtMerberCardCreate;
    return this;
  }

   /**
   * 会员卡领取时间（开卡时间），格式：yyyy-MM-dd HH:mm:ss
   * @return gmtMerberCardCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-02-17  20:11:54", value = "会员卡领取时间（开卡时间），格式：yyyy-MM-dd HH:mm:ss")

  public String getGmtMerberCardCreate() {
    return gmtMerberCardCreate;
  }


  public void setGmtMerberCardCreate(String gmtMerberCardCreate) {
    this.gmtMerberCardCreate = gmtMerberCardCreate;
  }


  public KoubeiMemberDataIsvCreateModel memberCardId(String memberCardId) {
    
    this.memberCardId = memberCardId;
    return this;
  }

   /**
   * 会员卡卡号：唯一标识会员卡的ID，partner_id+member_card_id是唯一主键，若partner_id+member_card_id已存在，则做更新会员卡操作。
   * @return memberCardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014323100009", value = "会员卡卡号：唯一标识会员卡的ID，partner_id+member_card_id是唯一主键，若partner_id+member_card_id已存在，则做更新会员卡操作。")

  public String getMemberCardId() {
    return memberCardId;
  }


  public void setMemberCardId(String memberCardId) {
    this.memberCardId = memberCardId;
  }


  public KoubeiMemberDataIsvCreateModel memberCardType(String memberCardType) {
    
    this.memberCardType = memberCardType;
    return this;
  }

   /**
   * 会员卡类型：  微卡、炫酷卡、儿童卡、璀璨卡、金卡银卡、白金卡等
   * @return memberCardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "微卡", value = "会员卡类型：  微卡、炫酷卡、儿童卡、璀璨卡、金卡银卡、白金卡等")

  public String getMemberCardType() {
    return memberCardType;
  }


  public void setMemberCardType(String memberCardType) {
    this.memberCardType = memberCardType;
  }


  public KoubeiMemberDataIsvCreateModel memberShip(MemberShip memberShip) {
    
    this.memberShip = memberShip;
    return this;
  }

   /**
   * Get memberShip
   * @return memberShip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MemberShip getMemberShip() {
    return memberShip;
  }


  public void setMemberShip(MemberShip memberShip) {
    this.memberShip = memberShip;
  }


  public KoubeiMemberDataIsvCreateModel memberSource(String memberSource) {
    
    this.memberSource = memberSource;
    return this;
  }

   /**
   * 会员来源：  1：weixin（微信）；2：alipay（支付宝）；3：offline（线下会员卡）；4：other（其他）
   * @return memberSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipay", value = "会员来源：  1：weixin（微信）；2：alipay（支付宝）；3：offline（线下会员卡）；4：other（其他）")

  public String getMemberSource() {
    return memberSource;
  }


  public void setMemberSource(String memberSource) {
    this.memberSource = memberSource;
  }


  public KoubeiMemberDataIsvCreateModel memberSourceDesc(String memberSourceDesc) {
    
    this.memberSourceDesc = memberSourceDesc;
    return this;
  }

   /**
   * 会员来源描述：如美团、饿了么等
   * @return memberSourceDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "美团", value = "会员来源描述：如美团、饿了么等")

  public String getMemberSourceDesc() {
    return memberSourceDesc;
  }


  public void setMemberSourceDesc(String memberSourceDesc) {
    this.memberSourceDesc = memberSourceDesc;
  }


  public KoubeiMemberDataIsvCreateModel memberStatus(String memberStatus) {
    
    this.memberStatus = memberStatus;
    return this;
  }

   /**
   * 会员状态：  1：生效；0：失效
   * @return memberStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "会员状态：  1：生效；0：失效")

  public String getMemberStatus() {
    return memberStatus;
  }


  public void setMemberStatus(String memberStatus) {
    this.memberStatus = memberStatus;
  }


  public KoubeiMemberDataIsvCreateModel outerMemberInfo(OuterMemberInfo outerMemberInfo) {
    
    this.outerMemberInfo = outerMemberInfo;
    return this;
  }

   /**
   * Get outerMemberInfo
   * @return outerMemberInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OuterMemberInfo getOuterMemberInfo() {
    return outerMemberInfo;
  }


  public void setOuterMemberInfo(OuterMemberInfo outerMemberInfo) {
    this.outerMemberInfo = outerMemberInfo;
  }


  public KoubeiMemberDataIsvCreateModel parterId(String parterId) {
    
    this.parterId = parterId;
    return this;
  }

   /**
   * 商户的PID
   * @return parterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088902248579233", value = "商户的PID")

  public String getParterId() {
    return parterId;
  }


  public void setParterId(String parterId) {
    this.parterId = parterId;
  }


  public KoubeiMemberDataIsvCreateModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 会员卡领取的门店ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016101700077000000003436443", value = "会员卡领取的门店ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KoubeiMemberDataIsvCreateModel koubeiMemberDataIsvCreateModel = (KoubeiMemberDataIsvCreateModel) o;
    return Objects.equals(this.gmtMemberCardLastActive, koubeiMemberDataIsvCreateModel.gmtMemberCardLastActive) &&
        Objects.equals(this.gmtMerberCardCreate, koubeiMemberDataIsvCreateModel.gmtMerberCardCreate) &&
        Objects.equals(this.memberCardId, koubeiMemberDataIsvCreateModel.memberCardId) &&
        Objects.equals(this.memberCardType, koubeiMemberDataIsvCreateModel.memberCardType) &&
        Objects.equals(this.memberShip, koubeiMemberDataIsvCreateModel.memberShip) &&
        Objects.equals(this.memberSource, koubeiMemberDataIsvCreateModel.memberSource) &&
        Objects.equals(this.memberSourceDesc, koubeiMemberDataIsvCreateModel.memberSourceDesc) &&
        Objects.equals(this.memberStatus, koubeiMemberDataIsvCreateModel.memberStatus) &&
        Objects.equals(this.outerMemberInfo, koubeiMemberDataIsvCreateModel.outerMemberInfo) &&
        Objects.equals(this.parterId, koubeiMemberDataIsvCreateModel.parterId) &&
        Objects.equals(this.shopId, koubeiMemberDataIsvCreateModel.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmtMemberCardLastActive, gmtMerberCardCreate, memberCardId, memberCardType, memberShip, memberSource, memberSourceDesc, memberStatus, outerMemberInfo, parterId, shopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KoubeiMemberDataIsvCreateModel {\n");
    sb.append("    gmtMemberCardLastActive: ").append(toIndentedString(gmtMemberCardLastActive)).append("\n");
    sb.append("    gmtMerberCardCreate: ").append(toIndentedString(gmtMerberCardCreate)).append("\n");
    sb.append("    memberCardId: ").append(toIndentedString(memberCardId)).append("\n");
    sb.append("    memberCardType: ").append(toIndentedString(memberCardType)).append("\n");
    sb.append("    memberShip: ").append(toIndentedString(memberShip)).append("\n");
    sb.append("    memberSource: ").append(toIndentedString(memberSource)).append("\n");
    sb.append("    memberSourceDesc: ").append(toIndentedString(memberSourceDesc)).append("\n");
    sb.append("    memberStatus: ").append(toIndentedString(memberStatus)).append("\n");
    sb.append("    outerMemberInfo: ").append(toIndentedString(outerMemberInfo)).append("\n");
    sb.append("    parterId: ").append(toIndentedString(parterId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("gmt_member_card_last_active");
    openapiFields.add("gmt_merber_card_create");
    openapiFields.add("member_card_id");
    openapiFields.add("member_card_type");
    openapiFields.add("member_ship");
    openapiFields.add("member_source");
    openapiFields.add("member_source_desc");
    openapiFields.add("member_status");
    openapiFields.add("outer_member_info");
    openapiFields.add("parter_id");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KoubeiMemberDataIsvCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KoubeiMemberDataIsvCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KoubeiMemberDataIsvCreateModel is not found in the empty JSON string", KoubeiMemberDataIsvCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KoubeiMemberDataIsvCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KoubeiMemberDataIsvCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("gmt_member_card_last_active") != null && !jsonObj.get("gmt_member_card_last_active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_member_card_last_active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_member_card_last_active").toString()));
      }
      if (jsonObj.get("gmt_merber_card_create") != null && !jsonObj.get("gmt_merber_card_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_merber_card_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_merber_card_create").toString()));
      }
      if (jsonObj.get("member_card_id") != null && !jsonObj.get("member_card_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_card_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_card_id").toString()));
      }
      if (jsonObj.get("member_card_type") != null && !jsonObj.get("member_card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_card_type").toString()));
      }
      // validate the optional field `member_ship`
      if (jsonObj.getAsJsonObject("member_ship") != null) {
        MemberShip.validateJsonObject(jsonObj.getAsJsonObject("member_ship"));
      }
      if (jsonObj.get("member_source") != null && !jsonObj.get("member_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_source").toString()));
      }
      if (jsonObj.get("member_source_desc") != null && !jsonObj.get("member_source_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_source_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_source_desc").toString()));
      }
      if (jsonObj.get("member_status") != null && !jsonObj.get("member_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_status").toString()));
      }
      // validate the optional field `outer_member_info`
      if (jsonObj.getAsJsonObject("outer_member_info") != null) {
        OuterMemberInfo.validateJsonObject(jsonObj.getAsJsonObject("outer_member_info"));
      }
      if (jsonObj.get("parter_id") != null && !jsonObj.get("parter_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parter_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parter_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KoubeiMemberDataIsvCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KoubeiMemberDataIsvCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KoubeiMemberDataIsvCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KoubeiMemberDataIsvCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KoubeiMemberDataIsvCreateModel>() {
           @Override
           public void write(JsonWriter out, KoubeiMemberDataIsvCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KoubeiMemberDataIsvCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KoubeiMemberDataIsvCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KoubeiMemberDataIsvCreateModel
  * @throws IOException if the JSON string is invalid with respect to KoubeiMemberDataIsvCreateModel
  */
  public static KoubeiMemberDataIsvCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KoubeiMemberDataIsvCreateModel.class);
  }

 /**
  * Convert an instance of KoubeiMemberDataIsvCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

