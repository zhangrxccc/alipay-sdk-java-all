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
 * VoucherSendRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendRuleInfo {
  public static final String SERIALIZED_NAME_MAX_QUANTITY_BY_DAY = "max_quantity_by_day";
  @SerializedName(SERIALIZED_NAME_MAX_QUANTITY_BY_DAY)
  private Integer maxQuantityByDay;

  public static final String SERIALIZED_NAME_NATURAL_PERSON_LIMIT = "natural_person_limit";
  @SerializedName(SERIALIZED_NAME_NATURAL_PERSON_LIMIT)
  private Boolean naturalPersonLimit;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_LIMIT = "phone_number_limit";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_LIMIT)
  private Boolean phoneNumberLimit;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_NEED_INPUT_LIMIT = "phone_number_need_input_limit";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_NEED_INPUT_LIMIT)
  private Boolean phoneNumberNeedInputLimit;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME = "publish_end_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME)
  private String publishEndTime;

  public static final String SERIALIZED_NAME_PUBLISH_START_TIME = "publish_start_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START_TIME)
  private String publishStartTime;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER = "quantity_limit_per_user";
  @SerializedName(SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER)
  private Integer quantityLimitPerUser;

  public static final String SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE = "quantity_limit_per_user_period_type";
  @SerializedName(SERIALIZED_NAME_QUANTITY_LIMIT_PER_USER_PERIOD_TYPE)
  private String quantityLimitPerUserPeriodType;

  public static final String SERIALIZED_NAME_REAL_NAME_LIMIT = "real_name_limit";
  @SerializedName(SERIALIZED_NAME_REAL_NAME_LIMIT)
  private Boolean realNameLimit;

  public VoucherSendRuleInfo() { 
  }

  public VoucherSendRuleInfo maxQuantityByDay(Integer maxQuantityByDay) {
    
    this.maxQuantityByDay = maxQuantityByDay;
    return this;
  }

   /**
   * 设置此字段，允许指定单天最大发券数量。
   * @return maxQuantityByDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设置此字段，允许指定单天最大发券数量。")

  public Integer getMaxQuantityByDay() {
    return maxQuantityByDay;
  }


  public void setMaxQuantityByDay(Integer maxQuantityByDay) {
    this.maxQuantityByDay = maxQuantityByDay;
  }


  public VoucherSendRuleInfo naturalPersonLimit(Boolean naturalPersonLimit) {
    
    this.naturalPersonLimit = naturalPersonLimit;
    return this;
  }

   /**
   * 是否开启自然人领取限制。 自然人表示按照身份证纬度进行领取限制。
   * @return naturalPersonLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否开启自然人领取限制。 自然人表示按照身份证纬度进行领取限制。")

  public Boolean getNaturalPersonLimit() {
    return naturalPersonLimit;
  }


  public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
    this.naturalPersonLimit = naturalPersonLimit;
  }


  public VoucherSendRuleInfo phoneNumberLimit(Boolean phoneNumberLimit) {
    
    this.phoneNumberLimit = phoneNumberLimit;
    return this;
  }

   /**
   * 是否开启电话号码领取限制。
   * @return phoneNumberLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否开启电话号码领取限制。")

  public Boolean getPhoneNumberLimit() {
    return phoneNumberLimit;
  }


  public void setPhoneNumberLimit(Boolean phoneNumberLimit) {
    this.phoneNumberLimit = phoneNumberLimit;
  }


  public VoucherSendRuleInfo phoneNumberNeedInputLimit(Boolean phoneNumberNeedInputLimit) {
    
    this.phoneNumberNeedInputLimit = phoneNumberNeedInputLimit;
    return this;
  }

   /**
   * 下单时是否需要用户填写手机号码
   * @return phoneNumberNeedInputLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下单时是否需要用户填写手机号码")

  public Boolean getPhoneNumberNeedInputLimit() {
    return phoneNumberNeedInputLimit;
  }


  public void setPhoneNumberNeedInputLimit(Boolean phoneNumberNeedInputLimit) {
    this.phoneNumberNeedInputLimit = phoneNumberNeedInputLimit;
  }


  public VoucherSendRuleInfo publishEndTime(String publishEndTime) {
    
    this.publishEndTime = publishEndTime;
    return this;
  }

   /**
   * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss
   * @return publishEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishEndTime() {
    return publishEndTime;
  }


  public void setPublishEndTime(String publishEndTime) {
    this.publishEndTime = publishEndTime;
  }


  public VoucherSendRuleInfo publishStartTime(String publishStartTime) {
    
    this.publishStartTime = publishStartTime;
    return this;
  }

   /**
   * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
   * @return publishStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getPublishStartTime() {
    return publishStartTime;
  }


  public void setPublishStartTime(String publishStartTime) {
    this.publishStartTime = publishStartTime;
  }


  public VoucherSendRuleInfo quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 发行券的数量。
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发行券的数量。")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public VoucherSendRuleInfo quantityLimitPerUser(Integer quantityLimitPerUser) {
    
    this.quantityLimitPerUser = quantityLimitPerUser;
    return this;
  }

   /**
   * 每人领取限制。 默认按照支付宝账号进行领取限制; 不填写或填入0表示没有领取限制.
   * @return quantityLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "每人领取限制。 默认按照支付宝账号进行领取限制; 不填写或填入0表示没有领取限制.")

  public Integer getQuantityLimitPerUser() {
    return quantityLimitPerUser;
  }


  public void setQuantityLimitPerUser(Integer quantityLimitPerUser) {
    this.quantityLimitPerUser = quantityLimitPerUser;
  }


  public VoucherSendRuleInfo quantityLimitPerUserPeriodType(String quantityLimitPerUserPeriodType) {
    
    this.quantityLimitPerUserPeriodType = quantityLimitPerUserPeriodType;
    return this;
  }

   /**
   * 周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE
   * @return quantityLimitPerUserPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期限领配置,限制每人在固定周期内领取张数(voucher_quantity_limit_per_user),默认LIFE_CYCLE")

  public String getQuantityLimitPerUserPeriodType() {
    return quantityLimitPerUserPeriodType;
  }


  public void setQuantityLimitPerUserPeriodType(String quantityLimitPerUserPeriodType) {
    this.quantityLimitPerUserPeriodType = quantityLimitPerUserPeriodType;
  }


  public VoucherSendRuleInfo realNameLimit(Boolean realNameLimit) {
    
    this.realNameLimit = realNameLimit;
    return this;
  }

   /**
   * 限制支付宝实名用户才能领取支付券,默认为false表示不限制 枚举值 true\\false
   * @return realNameLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "限制支付宝实名用户才能领取支付券,默认为false表示不限制 枚举值 true\\false")

  public Boolean getRealNameLimit() {
    return realNameLimit;
  }


  public void setRealNameLimit(Boolean realNameLimit) {
    this.realNameLimit = realNameLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSendRuleInfo voucherSendRuleInfo = (VoucherSendRuleInfo) o;
    return Objects.equals(this.maxQuantityByDay, voucherSendRuleInfo.maxQuantityByDay) &&
        Objects.equals(this.naturalPersonLimit, voucherSendRuleInfo.naturalPersonLimit) &&
        Objects.equals(this.phoneNumberLimit, voucherSendRuleInfo.phoneNumberLimit) &&
        Objects.equals(this.phoneNumberNeedInputLimit, voucherSendRuleInfo.phoneNumberNeedInputLimit) &&
        Objects.equals(this.publishEndTime, voucherSendRuleInfo.publishEndTime) &&
        Objects.equals(this.publishStartTime, voucherSendRuleInfo.publishStartTime) &&
        Objects.equals(this.quantity, voucherSendRuleInfo.quantity) &&
        Objects.equals(this.quantityLimitPerUser, voucherSendRuleInfo.quantityLimitPerUser) &&
        Objects.equals(this.quantityLimitPerUserPeriodType, voucherSendRuleInfo.quantityLimitPerUserPeriodType) &&
        Objects.equals(this.realNameLimit, voucherSendRuleInfo.realNameLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxQuantityByDay, naturalPersonLimit, phoneNumberLimit, phoneNumberNeedInputLimit, publishEndTime, publishStartTime, quantity, quantityLimitPerUser, quantityLimitPerUserPeriodType, realNameLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendRuleInfo {\n");
    sb.append("    maxQuantityByDay: ").append(toIndentedString(maxQuantityByDay)).append("\n");
    sb.append("    naturalPersonLimit: ").append(toIndentedString(naturalPersonLimit)).append("\n");
    sb.append("    phoneNumberLimit: ").append(toIndentedString(phoneNumberLimit)).append("\n");
    sb.append("    phoneNumberNeedInputLimit: ").append(toIndentedString(phoneNumberNeedInputLimit)).append("\n");
    sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
    sb.append("    publishStartTime: ").append(toIndentedString(publishStartTime)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityLimitPerUser: ").append(toIndentedString(quantityLimitPerUser)).append("\n");
    sb.append("    quantityLimitPerUserPeriodType: ").append(toIndentedString(quantityLimitPerUserPeriodType)).append("\n");
    sb.append("    realNameLimit: ").append(toIndentedString(realNameLimit)).append("\n");
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
    openapiFields.add("max_quantity_by_day");
    openapiFields.add("natural_person_limit");
    openapiFields.add("phone_number_limit");
    openapiFields.add("phone_number_need_input_limit");
    openapiFields.add("publish_end_time");
    openapiFields.add("publish_start_time");
    openapiFields.add("quantity");
    openapiFields.add("quantity_limit_per_user");
    openapiFields.add("quantity_limit_per_user_period_type");
    openapiFields.add("real_name_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendRuleInfo is not found in the empty JSON string", VoucherSendRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSendRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSendRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("publish_end_time") != null && !jsonObj.get("publish_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time").toString()));
      }
      if (jsonObj.get("publish_start_time") != null && !jsonObj.get("publish_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start_time").toString()));
      }
      if (jsonObj.get("quantity_limit_per_user_period_type") != null && !jsonObj.get("quantity_limit_per_user_period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity_limit_per_user_period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity_limit_per_user_period_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendRuleInfo>() {
           @Override
           public void write(JsonWriter out, VoucherSendRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSendRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSendRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendRuleInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherSendRuleInfo
  */
  public static VoucherSendRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendRuleInfo.class);
  }

 /**
  * Convert an instance of VoucherSendRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

