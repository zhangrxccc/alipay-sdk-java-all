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
 * IsvMerchantSalesDetailRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IsvMerchantSalesDetailRequest {
  public static final String SERIALIZED_NAME_COUPONS_QUANTITY = "coupons_quantity";
  @SerializedName(SERIALIZED_NAME_COUPONS_QUANTITY)
  private String couponsQuantity;

  public static final String SERIALIZED_NAME_DEVICE_DETAIL = "device_detail";
  @SerializedName(SERIALIZED_NAME_DEVICE_DETAIL)
  private String deviceDetail;

  public static final String SERIALIZED_NAME_MERCHANT_PID = "merchant_pid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PID)
  private String merchantPid;

  public static final String SERIALIZED_NAME_MINI_APPID = "mini_appid";
  @SerializedName(SERIALIZED_NAME_MINI_APPID)
  private String miniAppid;

  public static final String SERIALIZED_NAME_OPERATION_PLACE = "operation_place";
  @SerializedName(SERIALIZED_NAME_OPERATION_PLACE)
  private String operationPlace;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PROMOTOR_PID = "promotor_pid";
  @SerializedName(SERIALIZED_NAME_PROMOTOR_PID)
  private String promotorPid;

  public static final String SERIALIZED_NAME_SALES_AMOUNT = "sales_amount";
  @SerializedName(SERIALIZED_NAME_SALES_AMOUNT)
  private String salesAmount;

  public static final String SERIALIZED_NAME_SALES_QUANTITY = "sales_quantity";
  @SerializedName(SERIALIZED_NAME_SALES_QUANTITY)
  private String salesQuantity;

  public static final String SERIALIZED_NAME_SUB_PROMOTOR_PID = "sub_promotor_pid";
  @SerializedName(SERIALIZED_NAME_SUB_PROMOTOR_PID)
  private String subPromotorPid;

  public static final String SERIALIZED_NAME_WRITE_OFF_AMOUNT = "write_off_amount";
  @SerializedName(SERIALIZED_NAME_WRITE_OFF_AMOUNT)
  private String writeOffAmount;

  public static final String SERIALIZED_NAME_WRITE_OFF_QUANTITY = "write_off_quantity";
  @SerializedName(SERIALIZED_NAME_WRITE_OFF_QUANTITY)
  private String writeOffQuantity;

  public IsvMerchantSalesDetailRequest() { 
  }

  public IsvMerchantSalesDetailRequest couponsQuantity(String couponsQuantity) {
    
    this.couponsQuantity = couponsQuantity;
    return this;
  }

   /**
   * 配券数
   * @return couponsQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "配券数")

  public String getCouponsQuantity() {
    return couponsQuantity;
  }


  public void setCouponsQuantity(String couponsQuantity) {
    this.couponsQuantity = couponsQuantity;
  }


  public IsvMerchantSalesDetailRequest deviceDetail(String deviceDetail) {
    
    this.deviceDetail = deviceDetail;
    return this;
  }

   /**
   * 设备详情
   * @return deviceDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "此处为该设备的详细描述", value = "设备详情")

  public String getDeviceDetail() {
    return deviceDetail;
  }


  public void setDeviceDetail(String deviceDetail) {
    this.deviceDetail = deviceDetail;
  }


  public IsvMerchantSalesDetailRequest merchantPid(String merchantPid) {
    
    this.merchantPid = merchantPid;
    return this;
  }

   /**
   * 商户pid
   * @return merchantPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "商户pid")

  public String getMerchantPid() {
    return merchantPid;
  }


  public void setMerchantPid(String merchantPid) {
    this.merchantPid = merchantPid;
  }


  public IsvMerchantSalesDetailRequest miniAppid(String miniAppid) {
    
    this.miniAppid = miniAppid;
    return this;
  }

   /**
   * 小程序appid，若推广的商品不为小程序，则不传此参数
   * @return miniAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018082861168647", value = "小程序appid，若推广的商品不为小程序，则不传此参数")

  public String getMiniAppid() {
    return miniAppid;
  }


  public void setMiniAppid(String miniAppid) {
    this.miniAppid = miniAppid;
  }


  public IsvMerchantSalesDetailRequest operationPlace(String operationPlace) {
    
    this.operationPlace = operationPlace;
    return this;
  }

   /**
   * 作业地
   * @return operationPlace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省杭州市西湖区蚂蚁A空间", value = "作业地")

  public String getOperationPlace() {
    return operationPlace;
  }


  public void setOperationPlace(String operationPlace) {
    this.operationPlace = operationPlace;
  }


  public IsvMerchantSalesDetailRequest outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务号，传isv系统生成的账单号，需要保证唯一
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021000000000", value = "外部业务号，传isv系统生成的账单号，需要保证唯一")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public IsvMerchantSalesDetailRequest promotorPid(String promotorPid) {
    
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


  public IsvMerchantSalesDetailRequest salesAmount(String salesAmount) {
    
    this.salesAmount = salesAmount;
    return this;
  }

   /**
   * 销售金额，这里填写的是整数，单位为分，比如1元，那么输入100
   * @return salesAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "销售金额，这里填写的是整数，单位为分，比如1元，那么输入100")

  public String getSalesAmount() {
    return salesAmount;
  }


  public void setSalesAmount(String salesAmount) {
    this.salesAmount = salesAmount;
  }


  public IsvMerchantSalesDetailRequest salesQuantity(String salesQuantity) {
    
    this.salesQuantity = salesQuantity;
    return this;
  }

   /**
   * 销售笔数
   * @return salesQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "销售笔数")

  public String getSalesQuantity() {
    return salesQuantity;
  }


  public void setSalesQuantity(String salesQuantity) {
    this.salesQuantity = salesQuantity;
  }


  public IsvMerchantSalesDetailRequest subPromotorPid(String subPromotorPid) {
    
    this.subPromotorPid = subPromotorPid;
    return this;
  }

   /**
   * 推广服务商(S2)子账号pid
   * @return subPromotorPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088301912341234", value = "推广服务商(S2)子账号pid")

  public String getSubPromotorPid() {
    return subPromotorPid;
  }


  public void setSubPromotorPid(String subPromotorPid) {
    this.subPromotorPid = subPromotorPid;
  }


  public IsvMerchantSalesDetailRequest writeOffAmount(String writeOffAmount) {
    
    this.writeOffAmount = writeOffAmount;
    return this;
  }

   /**
   * 核销金额，这里填写的是整数，单位为分，比如1元，那么输入100
   * @return writeOffAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "核销金额，这里填写的是整数，单位为分，比如1元，那么输入100")

  public String getWriteOffAmount() {
    return writeOffAmount;
  }


  public void setWriteOffAmount(String writeOffAmount) {
    this.writeOffAmount = writeOffAmount;
  }


  public IsvMerchantSalesDetailRequest writeOffQuantity(String writeOffQuantity) {
    
    this.writeOffQuantity = writeOffQuantity;
    return this;
  }

   /**
   * 核销数
   * @return writeOffQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "核销数")

  public String getWriteOffQuantity() {
    return writeOffQuantity;
  }


  public void setWriteOffQuantity(String writeOffQuantity) {
    this.writeOffQuantity = writeOffQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsvMerchantSalesDetailRequest isvMerchantSalesDetailRequest = (IsvMerchantSalesDetailRequest) o;
    return Objects.equals(this.couponsQuantity, isvMerchantSalesDetailRequest.couponsQuantity) &&
        Objects.equals(this.deviceDetail, isvMerchantSalesDetailRequest.deviceDetail) &&
        Objects.equals(this.merchantPid, isvMerchantSalesDetailRequest.merchantPid) &&
        Objects.equals(this.miniAppid, isvMerchantSalesDetailRequest.miniAppid) &&
        Objects.equals(this.operationPlace, isvMerchantSalesDetailRequest.operationPlace) &&
        Objects.equals(this.outBizNo, isvMerchantSalesDetailRequest.outBizNo) &&
        Objects.equals(this.promotorPid, isvMerchantSalesDetailRequest.promotorPid) &&
        Objects.equals(this.salesAmount, isvMerchantSalesDetailRequest.salesAmount) &&
        Objects.equals(this.salesQuantity, isvMerchantSalesDetailRequest.salesQuantity) &&
        Objects.equals(this.subPromotorPid, isvMerchantSalesDetailRequest.subPromotorPid) &&
        Objects.equals(this.writeOffAmount, isvMerchantSalesDetailRequest.writeOffAmount) &&
        Objects.equals(this.writeOffQuantity, isvMerchantSalesDetailRequest.writeOffQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponsQuantity, deviceDetail, merchantPid, miniAppid, operationPlace, outBizNo, promotorPid, salesAmount, salesQuantity, subPromotorPid, writeOffAmount, writeOffQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsvMerchantSalesDetailRequest {\n");
    sb.append("    couponsQuantity: ").append(toIndentedString(couponsQuantity)).append("\n");
    sb.append("    deviceDetail: ").append(toIndentedString(deviceDetail)).append("\n");
    sb.append("    merchantPid: ").append(toIndentedString(merchantPid)).append("\n");
    sb.append("    miniAppid: ").append(toIndentedString(miniAppid)).append("\n");
    sb.append("    operationPlace: ").append(toIndentedString(operationPlace)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    promotorPid: ").append(toIndentedString(promotorPid)).append("\n");
    sb.append("    salesAmount: ").append(toIndentedString(salesAmount)).append("\n");
    sb.append("    salesQuantity: ").append(toIndentedString(salesQuantity)).append("\n");
    sb.append("    subPromotorPid: ").append(toIndentedString(subPromotorPid)).append("\n");
    sb.append("    writeOffAmount: ").append(toIndentedString(writeOffAmount)).append("\n");
    sb.append("    writeOffQuantity: ").append(toIndentedString(writeOffQuantity)).append("\n");
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
    openapiFields.add("coupons_quantity");
    openapiFields.add("device_detail");
    openapiFields.add("merchant_pid");
    openapiFields.add("mini_appid");
    openapiFields.add("operation_place");
    openapiFields.add("out_biz_no");
    openapiFields.add("promotor_pid");
    openapiFields.add("sales_amount");
    openapiFields.add("sales_quantity");
    openapiFields.add("sub_promotor_pid");
    openapiFields.add("write_off_amount");
    openapiFields.add("write_off_quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IsvMerchantSalesDetailRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IsvMerchantSalesDetailRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IsvMerchantSalesDetailRequest is not found in the empty JSON string", IsvMerchantSalesDetailRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IsvMerchantSalesDetailRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IsvMerchantSalesDetailRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("coupons_quantity") != null && !jsonObj.get("coupons_quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupons_quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupons_quantity").toString()));
      }
      if (jsonObj.get("device_detail") != null && !jsonObj.get("device_detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_detail").toString()));
      }
      if (jsonObj.get("merchant_pid") != null && !jsonObj.get("merchant_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pid").toString()));
      }
      if (jsonObj.get("mini_appid") != null && !jsonObj.get("mini_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_appid").toString()));
      }
      if (jsonObj.get("operation_place") != null && !jsonObj.get("operation_place").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_place` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_place").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("promotor_pid") != null && !jsonObj.get("promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promotor_pid").toString()));
      }
      if (jsonObj.get("sales_amount") != null && !jsonObj.get("sales_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sales_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sales_amount").toString()));
      }
      if (jsonObj.get("sales_quantity") != null && !jsonObj.get("sales_quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sales_quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sales_quantity").toString()));
      }
      if (jsonObj.get("sub_promotor_pid") != null && !jsonObj.get("sub_promotor_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_promotor_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_promotor_pid").toString()));
      }
      if (jsonObj.get("write_off_amount") != null && !jsonObj.get("write_off_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `write_off_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("write_off_amount").toString()));
      }
      if (jsonObj.get("write_off_quantity") != null && !jsonObj.get("write_off_quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `write_off_quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("write_off_quantity").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IsvMerchantSalesDetailRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IsvMerchantSalesDetailRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IsvMerchantSalesDetailRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IsvMerchantSalesDetailRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IsvMerchantSalesDetailRequest>() {
           @Override
           public void write(JsonWriter out, IsvMerchantSalesDetailRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IsvMerchantSalesDetailRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IsvMerchantSalesDetailRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IsvMerchantSalesDetailRequest
  * @throws IOException if the JSON string is invalid with respect to IsvMerchantSalesDetailRequest
  */
  public static IsvMerchantSalesDetailRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IsvMerchantSalesDetailRequest.class);
  }

 /**
  * Convert an instance of IsvMerchantSalesDetailRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

