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
 * BusinessParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessParams {
  public static final String SERIALIZED_NAME_ACTUAL_ORDER_TIME = "actual_order_time";
  @SerializedName(SERIALIZED_NAME_ACTUAL_ORDER_TIME)
  private String actualOrderTime;

  public static final String SERIALIZED_NAME_CAMPUS_CARD = "campus_card";
  @SerializedName(SERIALIZED_NAME_CAMPUS_CARD)
  private String campusCard;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_ENTERPRISE_PAY_AMOUNT = "enterprise_pay_amount";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_PAY_AMOUNT)
  private String enterprisePayAmount;

  public static final String SERIALIZED_NAME_ENTERPRISE_PAY_INFO = "enterprise_pay_info";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_PAY_INFO)
  private String enterprisePayInfo;

  public static final String SERIALIZED_NAME_GOOD_TAXES = "good_taxes";
  @SerializedName(SERIALIZED_NAME_GOOD_TAXES)
  private String goodTaxes;

  public static final String SERIALIZED_NAME_MC_CREATE_TRADE_IP = "mc_create_trade_ip";
  @SerializedName(SERIALIZED_NAME_MC_CREATE_TRADE_IP)
  private String mcCreateTradeIp;

  public BusinessParams() { 
  }

  public BusinessParams actualOrderTime(String actualOrderTime) {
    
    this.actualOrderTime = actualOrderTime;
    return this;
  }

   /**
   * 实际订单时间，在乘车码场景，传入的是用户刷码乘车时间
   * @return actualOrderTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实际订单时间，在乘车码场景，传入的是用户刷码乘车时间")

  public String getActualOrderTime() {
    return actualOrderTime;
  }


  public void setActualOrderTime(String actualOrderTime) {
    this.actualOrderTime = actualOrderTime;
  }


  public BusinessParams campusCard(String campusCard) {
    
    this.campusCard = campusCard;
    return this;
  }

   /**
   * 校园卡编号
   * @return campusCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "校园卡编号")

  public String getCampusCard() {
    return campusCard;
  }


  public void setCampusCard(String campusCard) {
    this.campusCard = campusCard;
  }


  public BusinessParams cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * 虚拟卡卡类型
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "虚拟卡卡类型")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public BusinessParams enterprisePayAmount(String enterprisePayAmount) {
    
    this.enterprisePayAmount = enterprisePayAmount;
    return this;
  }

   /**
   * 因公付金额
   * @return enterprisePayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "因公付金额")

  public String getEnterprisePayAmount() {
    return enterprisePayAmount;
  }


  public void setEnterprisePayAmount(String enterprisePayAmount) {
    this.enterprisePayAmount = enterprisePayAmount;
  }


  public BusinessParams enterprisePayInfo(String enterprisePayInfo) {
    
    this.enterprisePayInfo = enterprisePayInfo;
    return this;
  }

   /**
   * 因公付业务信息
   * @return enterprisePayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "因公付业务信息")

  public String getEnterprisePayInfo() {
    return enterprisePayInfo;
  }


  public void setEnterprisePayInfo(String enterprisePayInfo) {
    this.enterprisePayInfo = enterprisePayInfo;
  }


  public BusinessParams goodTaxes(String goodTaxes) {
    
    this.goodTaxes = goodTaxes;
    return this;
  }

   /**
   * 商户传入的交易税费。需要落地风控使用
   * @return goodTaxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户传入的交易税费。需要落地风控使用")

  public String getGoodTaxes() {
    return goodTaxes;
  }


  public void setGoodTaxes(String goodTaxes) {
    this.goodTaxes = goodTaxes;
  }


  public BusinessParams mcCreateTradeIp(String mcCreateTradeIp) {
    
    this.mcCreateTradeIp = mcCreateTradeIp;
    return this;
  }

   /**
   * 商户端创建订单的 IP，须上传正确的用户端外网 IP，支持 ipv4/ipv6 格式； mc_create_trade_ip和mcCreateTradeIp（旧）参数描述相同，首选mc_create_trade_ip入参，请勿重复入参； 如已入参mcCreateTradeIp（旧），无需新增入参mc_create_trade_ip。
   * @return mcCreateTradeIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户端创建订单的 IP，须上传正确的用户端外网 IP，支持 ipv4/ipv6 格式； mc_create_trade_ip和mcCreateTradeIp（旧）参数描述相同，首选mc_create_trade_ip入参，请勿重复入参； 如已入参mcCreateTradeIp（旧），无需新增入参mc_create_trade_ip。")

  public String getMcCreateTradeIp() {
    return mcCreateTradeIp;
  }


  public void setMcCreateTradeIp(String mcCreateTradeIp) {
    this.mcCreateTradeIp = mcCreateTradeIp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessParams businessParams = (BusinessParams) o;
    return Objects.equals(this.actualOrderTime, businessParams.actualOrderTime) &&
        Objects.equals(this.campusCard, businessParams.campusCard) &&
        Objects.equals(this.cardType, businessParams.cardType) &&
        Objects.equals(this.enterprisePayAmount, businessParams.enterprisePayAmount) &&
        Objects.equals(this.enterprisePayInfo, businessParams.enterprisePayInfo) &&
        Objects.equals(this.goodTaxes, businessParams.goodTaxes) &&
        Objects.equals(this.mcCreateTradeIp, businessParams.mcCreateTradeIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualOrderTime, campusCard, cardType, enterprisePayAmount, enterprisePayInfo, goodTaxes, mcCreateTradeIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessParams {\n");
    sb.append("    actualOrderTime: ").append(toIndentedString(actualOrderTime)).append("\n");
    sb.append("    campusCard: ").append(toIndentedString(campusCard)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    enterprisePayAmount: ").append(toIndentedString(enterprisePayAmount)).append("\n");
    sb.append("    enterprisePayInfo: ").append(toIndentedString(enterprisePayInfo)).append("\n");
    sb.append("    goodTaxes: ").append(toIndentedString(goodTaxes)).append("\n");
    sb.append("    mcCreateTradeIp: ").append(toIndentedString(mcCreateTradeIp)).append("\n");
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
    openapiFields.add("actual_order_time");
    openapiFields.add("campus_card");
    openapiFields.add("card_type");
    openapiFields.add("enterprise_pay_amount");
    openapiFields.add("enterprise_pay_info");
    openapiFields.add("good_taxes");
    openapiFields.add("mc_create_trade_ip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessParams is not found in the empty JSON string", BusinessParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("actual_order_time") != null && !jsonObj.get("actual_order_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actual_order_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actual_order_time").toString()));
      }
      if (jsonObj.get("campus_card") != null && !jsonObj.get("campus_card").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campus_card` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campus_card").toString()));
      }
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if (jsonObj.get("enterprise_pay_amount") != null && !jsonObj.get("enterprise_pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_pay_amount").toString()));
      }
      if (jsonObj.get("enterprise_pay_info") != null && !jsonObj.get("enterprise_pay_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_pay_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_pay_info").toString()));
      }
      if (jsonObj.get("good_taxes") != null && !jsonObj.get("good_taxes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `good_taxes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("good_taxes").toString()));
      }
      if (jsonObj.get("mc_create_trade_ip") != null && !jsonObj.get("mc_create_trade_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mc_create_trade_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mc_create_trade_ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessParams.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessParams>() {
           @Override
           public void write(JsonWriter out, BusinessParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessParams
  * @throws IOException if the JSON string is invalid with respect to BusinessParams
  */
  public static BusinessParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessParams.class);
  }

 /**
  * Convert an instance of BusinessParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

