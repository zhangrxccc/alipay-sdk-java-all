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
 * AlipayEbppBillGetResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppBillGetResponseModel {
  public static final String SERIALIZED_NAME_ALIPAY_ORDER_NO = "alipay_order_no";
  @SerializedName(SERIALIZED_NAME_ALIPAY_ORDER_NO)
  private String alipayOrderNo;

  public static final String SERIALIZED_NAME_BILL_DATE = "bill_date";
  @SerializedName(SERIALIZED_NAME_BILL_DATE)
  private String billDate;

  public static final String SERIALIZED_NAME_BILL_KEY = "bill_key";
  @SerializedName(SERIALIZED_NAME_BILL_KEY)
  private String billKey;

  public static final String SERIALIZED_NAME_CHARGE_INST = "charge_inst";
  @SerializedName(SERIALIZED_NAME_CHARGE_INST)
  private String chargeInst;

  public static final String SERIALIZED_NAME_CHARGE_INST_NAME = "charge_inst_name";
  @SerializedName(SERIALIZED_NAME_CHARGE_INST_NAME)
  private String chargeInstName;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "merchant_order_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private String orderType;

  public static final String SERIALIZED_NAME_OWNER_NAME = "owner_name";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_PAY_TIME = "pay_time";
  @SerializedName(SERIALIZED_NAME_PAY_TIME)
  private String payTime;

  public static final String SERIALIZED_NAME_SERVICE_AMOUNT = "service_amount";
  @SerializedName(SERIALIZED_NAME_SERVICE_AMOUNT)
  private String serviceAmount;

  public static final String SERIALIZED_NAME_SUB_ORDER_TYPE = "sub_order_type";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_TYPE)
  private String subOrderType;

  public static final String SERIALIZED_NAME_TRAFFIC_LOCATION = "traffic_location";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_LOCATION)
  private String trafficLocation;

  public static final String SERIALIZED_NAME_TRAFFIC_REGULATIONS = "traffic_regulations";
  @SerializedName(SERIALIZED_NAME_TRAFFIC_REGULATIONS)
  private String trafficRegulations;

  public AlipayEbppBillGetResponseModel() { 
  }

  public AlipayEbppBillGetResponseModel alipayOrderNo(String alipayOrderNo) {
    
    this.alipayOrderNo = alipayOrderNo;
    return this;
  }

   /**
   * 支付宝的业务订单号，具有唯一性。
   * @return alipayOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201203088888888", value = "支付宝的业务订单号，具有唯一性。")

  public String getAlipayOrderNo() {
    return alipayOrderNo;
  }


  public void setAlipayOrderNo(String alipayOrderNo) {
    this.alipayOrderNo = alipayOrderNo;
  }


  public AlipayEbppBillGetResponseModel billDate(String billDate) {
    
    this.billDate = billDate;
    return this;
  }

   /**
   * 账单的账期，例如201203表示2012年3月的账单。
   * @return billDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201203", value = "账单的账期，例如201203表示2012年3月的账单。")

  public String getBillDate() {
    return billDate;
  }


  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }


  public AlipayEbppBillGetResponseModel billKey(String billKey) {
    
    this.billKey = billKey;
    return this;
  }

   /**
   * 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
   * @return billKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3388102012376451", value = "账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。")

  public String getBillKey() {
    return billKey;
  }


  public void setBillKey(String billKey) {
    this.billKey = billKey;
  }


  public AlipayEbppBillGetResponseModel chargeInst(String chargeInst) {
    
    this.chargeInst = chargeInst;
    return this;
  }

   /**
   * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
   * @return chargeInst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BJCEB", value = "支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。")

  public String getChargeInst() {
    return chargeInst;
  }


  public void setChargeInst(String chargeInst) {
    this.chargeInst = chargeInst;
  }


  public AlipayEbppBillGetResponseModel chargeInstName(String chargeInstName) {
    
    this.chargeInstName = chargeInstName;
    return this;
  }

   /**
   * 出账机构中文名称。
   * @return chargeInstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "北京光大", value = "出账机构中文名称。")

  public String getChargeInstName() {
    return chargeInstName;
  }


  public void setChargeInstName(String chargeInstName) {
    this.chargeInstName = chargeInstName;
  }


  public AlipayEbppBillGetResponseModel merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * 输出机构的业务流水号，需要保证唯一性。
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201203031234567", value = "输出机构的业务流水号，需要保证唯一性。")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public AlipayEbppBillGetResponseModel orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 账单的状态。 INIT:等待付款，SUCCESS:成功,FAILED:失败。
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S", value = "账单的状态。 INIT:等待付款，SUCCESS:成功,FAILED:失败。")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public AlipayEbppBillGetResponseModel orderType(String orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JF", value = "支付宝订单类型。公共事业缴纳JF,信用卡还款HK")

  public String getOrderType() {
    return orderType;
  }


  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public AlipayEbppBillGetResponseModel ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * 拥有该账单的用户姓名
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "织绫", value = "拥有该账单的用户姓名")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public AlipayEbppBillGetResponseModel payAmount(String payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23.45", value = "缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。")

  public String getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public AlipayEbppBillGetResponseModel payTime(String payTime) {
    
    this.payTime = payTime;
    return this;
  }

   /**
   * 付款时间
   * @return payTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-01-01 00:22:11", value = "付款时间")

  public String getPayTime() {
    return payTime;
  }


  public void setPayTime(String payTime) {
    this.payTime = payTime;
  }


  public AlipayEbppBillGetResponseModel serviceAmount(String serviceAmount) {
    
    this.serviceAmount = serviceAmount;
    return this;
  }

   /**
   * 账单的服务费
   * @return serviceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "账单的服务费")

  public String getServiceAmount() {
    return serviceAmount;
  }


  public void setServiceAmount(String serviceAmount) {
    this.serviceAmount = serviceAmount;
  }


  public AlipayEbppBillGetResponseModel subOrderType(String subOrderType) {
    
    this.subOrderType = subOrderType;
    return this;
  }

   /**
   * 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
   * @return subOrderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WATER", value = "子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。")

  public String getSubOrderType() {
    return subOrderType;
  }


  public void setSubOrderType(String subOrderType) {
    this.subOrderType = subOrderType;
  }


  public AlipayEbppBillGetResponseModel trafficLocation(String trafficLocation) {
    
    this.trafficLocation = trafficLocation;
    return this;
  }

   /**
   * 交通违章地点，sub_order_type&#x3D;TRAFFIC时有值
   * @return trafficLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江,杭徽高速", value = "交通违章地点，sub_order_type=TRAFFIC时有值")

  public String getTrafficLocation() {
    return trafficLocation;
  }


  public void setTrafficLocation(String trafficLocation) {
    this.trafficLocation = trafficLocation;
  }


  public AlipayEbppBillGetResponseModel trafficRegulations(String trafficRegulations) {
    
    this.trafficRegulations = trafficRegulations;
    return this;
  }

   /**
   * 违章行为，sub_order_type&#x3D;TRAFFIC时有值。
   * @return trafficRegulations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "违章停车", value = "违章行为，sub_order_type=TRAFFIC时有值。")

  public String getTrafficRegulations() {
    return trafficRegulations;
  }


  public void setTrafficRegulations(String trafficRegulations) {
    this.trafficRegulations = trafficRegulations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppBillGetResponseModel alipayEbppBillGetResponseModel = (AlipayEbppBillGetResponseModel) o;
    return Objects.equals(this.alipayOrderNo, alipayEbppBillGetResponseModel.alipayOrderNo) &&
        Objects.equals(this.billDate, alipayEbppBillGetResponseModel.billDate) &&
        Objects.equals(this.billKey, alipayEbppBillGetResponseModel.billKey) &&
        Objects.equals(this.chargeInst, alipayEbppBillGetResponseModel.chargeInst) &&
        Objects.equals(this.chargeInstName, alipayEbppBillGetResponseModel.chargeInstName) &&
        Objects.equals(this.merchantOrderNo, alipayEbppBillGetResponseModel.merchantOrderNo) &&
        Objects.equals(this.orderStatus, alipayEbppBillGetResponseModel.orderStatus) &&
        Objects.equals(this.orderType, alipayEbppBillGetResponseModel.orderType) &&
        Objects.equals(this.ownerName, alipayEbppBillGetResponseModel.ownerName) &&
        Objects.equals(this.payAmount, alipayEbppBillGetResponseModel.payAmount) &&
        Objects.equals(this.payTime, alipayEbppBillGetResponseModel.payTime) &&
        Objects.equals(this.serviceAmount, alipayEbppBillGetResponseModel.serviceAmount) &&
        Objects.equals(this.subOrderType, alipayEbppBillGetResponseModel.subOrderType) &&
        Objects.equals(this.trafficLocation, alipayEbppBillGetResponseModel.trafficLocation) &&
        Objects.equals(this.trafficRegulations, alipayEbppBillGetResponseModel.trafficRegulations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alipayOrderNo, billDate, billKey, chargeInst, chargeInstName, merchantOrderNo, orderStatus, orderType, ownerName, payAmount, payTime, serviceAmount, subOrderType, trafficLocation, trafficRegulations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppBillGetResponseModel {\n");
    sb.append("    alipayOrderNo: ").append(toIndentedString(alipayOrderNo)).append("\n");
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    billKey: ").append(toIndentedString(billKey)).append("\n");
    sb.append("    chargeInst: ").append(toIndentedString(chargeInst)).append("\n");
    sb.append("    chargeInstName: ").append(toIndentedString(chargeInstName)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    payTime: ").append(toIndentedString(payTime)).append("\n");
    sb.append("    serviceAmount: ").append(toIndentedString(serviceAmount)).append("\n");
    sb.append("    subOrderType: ").append(toIndentedString(subOrderType)).append("\n");
    sb.append("    trafficLocation: ").append(toIndentedString(trafficLocation)).append("\n");
    sb.append("    trafficRegulations: ").append(toIndentedString(trafficRegulations)).append("\n");
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
    openapiFields.add("alipay_order_no");
    openapiFields.add("bill_date");
    openapiFields.add("bill_key");
    openapiFields.add("charge_inst");
    openapiFields.add("charge_inst_name");
    openapiFields.add("merchant_order_no");
    openapiFields.add("order_status");
    openapiFields.add("order_type");
    openapiFields.add("owner_name");
    openapiFields.add("pay_amount");
    openapiFields.add("pay_time");
    openapiFields.add("service_amount");
    openapiFields.add("sub_order_type");
    openapiFields.add("traffic_location");
    openapiFields.add("traffic_regulations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppBillGetResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppBillGetResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppBillGetResponseModel is not found in the empty JSON string", AlipayEbppBillGetResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppBillGetResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppBillGetResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("alipay_order_no") != null && !jsonObj.get("alipay_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_order_no").toString()));
      }
      if (jsonObj.get("bill_date") != null && !jsonObj.get("bill_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_date").toString()));
      }
      if (jsonObj.get("bill_key") != null && !jsonObj.get("bill_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bill_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bill_key").toString()));
      }
      if (jsonObj.get("charge_inst") != null && !jsonObj.get("charge_inst").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_inst` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_inst").toString()));
      }
      if (jsonObj.get("charge_inst_name") != null && !jsonObj.get("charge_inst_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_inst_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_inst_name").toString()));
      }
      if (jsonObj.get("merchant_order_no") != null && !jsonObj.get("merchant_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_no").toString()));
      }
      if (jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if (jsonObj.get("order_type") != null && !jsonObj.get("order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_type").toString()));
      }
      if (jsonObj.get("owner_name") != null && !jsonObj.get("owner_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_name").toString()));
      }
      if (jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if (jsonObj.get("pay_time") != null && !jsonObj.get("pay_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_time").toString()));
      }
      if (jsonObj.get("service_amount") != null && !jsonObj.get("service_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_amount").toString()));
      }
      if (jsonObj.get("sub_order_type") != null && !jsonObj.get("sub_order_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_order_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_order_type").toString()));
      }
      if (jsonObj.get("traffic_location") != null && !jsonObj.get("traffic_location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traffic_location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traffic_location").toString()));
      }
      if (jsonObj.get("traffic_regulations") != null && !jsonObj.get("traffic_regulations").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traffic_regulations` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traffic_regulations").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppBillGetResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppBillGetResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppBillGetResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppBillGetResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppBillGetResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppBillGetResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppBillGetResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppBillGetResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppBillGetResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppBillGetResponseModel
  */
  public static AlipayEbppBillGetResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppBillGetResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppBillGetResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

