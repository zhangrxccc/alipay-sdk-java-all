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
import com.alipay.v3.model.MultiCurrencyMoneyOpenApi;
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
 * ArInvoiceLineOpenApiResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArInvoiceLineOpenApiResponse {
  public static final String SERIALIZED_NAME_AMT = "amt";
  @SerializedName(SERIALIZED_NAME_AMT)
  private MultiCurrencyMoneyOpenApi amt;

  public static final String SERIALIZED_NAME_DUTY_FREE_FLAG = "duty_free_flag";
  @SerializedName(SERIALIZED_NAME_DUTY_FREE_FLAG)
  private String dutyFreeFlag;

  public static final String SERIALIZED_NAME_INCL_TAX_UNIT_AMT = "incl_tax_unit_amt";
  @SerializedName(SERIALIZED_NAME_INCL_TAX_UNIT_AMT)
  private Integer inclTaxUnitAmt;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private String invoiceId;

  public static final String SERIALIZED_NAME_INVOICE_LINE_ID = "invoice_line_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_LINE_ID)
  private String invoiceLineId;

  public static final String SERIALIZED_NAME_MEASUREMENT_UNIT = "measurement_unit";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_UNIT)
  private String measurementUnit;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_SPECIFICATION = "product_specification";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SPECIFICATION)
  private String productSpecification;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_TAX_AMT = "tax_amt";
  @SerializedName(SERIALIZED_NAME_TAX_AMT)
  private MultiCurrencyMoneyOpenApi taxAmt;

  public static final String SERIALIZED_NAME_TAX_EXCLUSIVE_AMT = "tax_exclusive_amt";
  @SerializedName(SERIALIZED_NAME_TAX_EXCLUSIVE_AMT)
  private MultiCurrencyMoneyOpenApi taxExclusiveAmt;

  public static final String SERIALIZED_NAME_TAX_RATE = "tax_rate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Integer taxRate;

  public static final String SERIALIZED_NAME_UNIT_AMT = "unit_amt";
  @SerializedName(SERIALIZED_NAME_UNIT_AMT)
  private Integer unitAmt;

  public ArInvoiceLineOpenApiResponse() { 
  }

  public ArInvoiceLineOpenApiResponse amt(MultiCurrencyMoneyOpenApi amt) {
    
    this.amt = amt;
    return this;
  }

   /**
   * Get amt
   * @return amt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getAmt() {
    return amt;
  }


  public void setAmt(MultiCurrencyMoneyOpenApi amt) {
    this.amt = amt;
  }


  public ArInvoiceLineOpenApiResponse dutyFreeFlag(String dutyFreeFlag) {
    
    this.dutyFreeFlag = dutyFreeFlag;
    return this;
  }

   /**
   * 免税标识
   * @return dutyFreeFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "免税标识")

  public String getDutyFreeFlag() {
    return dutyFreeFlag;
  }


  public void setDutyFreeFlag(String dutyFreeFlag) {
    this.dutyFreeFlag = dutyFreeFlag;
  }


  public ArInvoiceLineOpenApiResponse inclTaxUnitAmt(Integer inclTaxUnitAmt) {
    
    this.inclTaxUnitAmt = inclTaxUnitAmt;
    return this;
  }

   /**
   * 含税单价
   * @return inclTaxUnitAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "含税单价")

  public Integer getInclTaxUnitAmt() {
    return inclTaxUnitAmt;
  }


  public void setInclTaxUnitAmt(Integer inclTaxUnitAmt) {
    this.inclTaxUnitAmt = inclTaxUnitAmt;
  }


  public ArInvoiceLineOpenApiResponse invoiceId(String invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * 关联的发票ID
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "关联的发票ID")

  public String getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }


  public ArInvoiceLineOpenApiResponse invoiceLineId(String invoiceLineId) {
    
    this.invoiceLineId = invoiceLineId;
    return this;
  }

   /**
   * 发票行iD
   * @return invoiceLineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票行iD")

  public String getInvoiceLineId() {
    return invoiceLineId;
  }


  public void setInvoiceLineId(String invoiceLineId) {
    this.invoiceLineId = invoiceLineId;
  }


  public ArInvoiceLineOpenApiResponse measurementUnit(String measurementUnit) {
    
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * 计量单位
   * @return measurementUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "计量单位")

  public String getMeasurementUnit() {
    return measurementUnit;
  }


  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }


  public ArInvoiceLineOpenApiResponse productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 货物或劳务名称
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "货物或劳务名称")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public ArInvoiceLineOpenApiResponse productSpecification(String productSpecification) {
    
    this.productSpecification = productSpecification;
    return this;
  }

   /**
   * 规格型号
   * @return productSpecification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规格型号")

  public String getProductSpecification() {
    return productSpecification;
  }


  public void setProductSpecification(String productSpecification) {
    this.productSpecification = productSpecification;
  }


  public ArInvoiceLineOpenApiResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 数量
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数量")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ArInvoiceLineOpenApiResponse taxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
    
    this.taxAmt = taxAmt;
    return this;
  }

   /**
   * Get taxAmt
   * @return taxAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getTaxAmt() {
    return taxAmt;
  }


  public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
    this.taxAmt = taxAmt;
  }


  public ArInvoiceLineOpenApiResponse taxExclusiveAmt(MultiCurrencyMoneyOpenApi taxExclusiveAmt) {
    
    this.taxExclusiveAmt = taxExclusiveAmt;
    return this;
  }

   /**
   * Get taxExclusiveAmt
   * @return taxExclusiveAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getTaxExclusiveAmt() {
    return taxExclusiveAmt;
  }


  public void setTaxExclusiveAmt(MultiCurrencyMoneyOpenApi taxExclusiveAmt) {
    this.taxExclusiveAmt = taxExclusiveAmt;
  }


  public ArInvoiceLineOpenApiResponse taxRate(Integer taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * 税率
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "税率")

  public Integer getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(Integer taxRate) {
    this.taxRate = taxRate;
  }


  public ArInvoiceLineOpenApiResponse unitAmt(Integer unitAmt) {
    
    this.unitAmt = unitAmt;
    return this;
  }

   /**
   * 单价
   * @return unitAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单价")

  public Integer getUnitAmt() {
    return unitAmt;
  }


  public void setUnitAmt(Integer unitAmt) {
    this.unitAmt = unitAmt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArInvoiceLineOpenApiResponse arInvoiceLineOpenApiResponse = (ArInvoiceLineOpenApiResponse) o;
    return Objects.equals(this.amt, arInvoiceLineOpenApiResponse.amt) &&
        Objects.equals(this.dutyFreeFlag, arInvoiceLineOpenApiResponse.dutyFreeFlag) &&
        Objects.equals(this.inclTaxUnitAmt, arInvoiceLineOpenApiResponse.inclTaxUnitAmt) &&
        Objects.equals(this.invoiceId, arInvoiceLineOpenApiResponse.invoiceId) &&
        Objects.equals(this.invoiceLineId, arInvoiceLineOpenApiResponse.invoiceLineId) &&
        Objects.equals(this.measurementUnit, arInvoiceLineOpenApiResponse.measurementUnit) &&
        Objects.equals(this.productName, arInvoiceLineOpenApiResponse.productName) &&
        Objects.equals(this.productSpecification, arInvoiceLineOpenApiResponse.productSpecification) &&
        Objects.equals(this.quantity, arInvoiceLineOpenApiResponse.quantity) &&
        Objects.equals(this.taxAmt, arInvoiceLineOpenApiResponse.taxAmt) &&
        Objects.equals(this.taxExclusiveAmt, arInvoiceLineOpenApiResponse.taxExclusiveAmt) &&
        Objects.equals(this.taxRate, arInvoiceLineOpenApiResponse.taxRate) &&
        Objects.equals(this.unitAmt, arInvoiceLineOpenApiResponse.unitAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amt, dutyFreeFlag, inclTaxUnitAmt, invoiceId, invoiceLineId, measurementUnit, productName, productSpecification, quantity, taxAmt, taxExclusiveAmt, taxRate, unitAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArInvoiceLineOpenApiResponse {\n");
    sb.append("    amt: ").append(toIndentedString(amt)).append("\n");
    sb.append("    dutyFreeFlag: ").append(toIndentedString(dutyFreeFlag)).append("\n");
    sb.append("    inclTaxUnitAmt: ").append(toIndentedString(inclTaxUnitAmt)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceLineId: ").append(toIndentedString(invoiceLineId)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    taxAmt: ").append(toIndentedString(taxAmt)).append("\n");
    sb.append("    taxExclusiveAmt: ").append(toIndentedString(taxExclusiveAmt)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    unitAmt: ").append(toIndentedString(unitAmt)).append("\n");
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
    openapiFields.add("amt");
    openapiFields.add("duty_free_flag");
    openapiFields.add("incl_tax_unit_amt");
    openapiFields.add("invoice_id");
    openapiFields.add("invoice_line_id");
    openapiFields.add("measurement_unit");
    openapiFields.add("product_name");
    openapiFields.add("product_specification");
    openapiFields.add("quantity");
    openapiFields.add("tax_amt");
    openapiFields.add("tax_exclusive_amt");
    openapiFields.add("tax_rate");
    openapiFields.add("unit_amt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArInvoiceLineOpenApiResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArInvoiceLineOpenApiResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArInvoiceLineOpenApiResponse is not found in the empty JSON string", ArInvoiceLineOpenApiResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ArInvoiceLineOpenApiResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArInvoiceLineOpenApiResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `amt`
      if (jsonObj.getAsJsonObject("amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("amt"));
      }
      if (jsonObj.get("duty_free_flag") != null && !jsonObj.get("duty_free_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duty_free_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duty_free_flag").toString()));
      }
      if (jsonObj.get("invoice_id") != null && !jsonObj.get("invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_id").toString()));
      }
      if (jsonObj.get("invoice_line_id") != null && !jsonObj.get("invoice_line_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_line_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_line_id").toString()));
      }
      if (jsonObj.get("measurement_unit") != null && !jsonObj.get("measurement_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measurement_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measurement_unit").toString()));
      }
      if (jsonObj.get("product_name") != null && !jsonObj.get("product_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_name").toString()));
      }
      if (jsonObj.get("product_specification") != null && !jsonObj.get("product_specification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_specification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_specification").toString()));
      }
      // validate the optional field `tax_amt`
      if (jsonObj.getAsJsonObject("tax_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("tax_amt"));
      }
      // validate the optional field `tax_exclusive_amt`
      if (jsonObj.getAsJsonObject("tax_exclusive_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("tax_exclusive_amt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArInvoiceLineOpenApiResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArInvoiceLineOpenApiResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArInvoiceLineOpenApiResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArInvoiceLineOpenApiResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ArInvoiceLineOpenApiResponse>() {
           @Override
           public void write(JsonWriter out, ArInvoiceLineOpenApiResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArInvoiceLineOpenApiResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArInvoiceLineOpenApiResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArInvoiceLineOpenApiResponse
  * @throws IOException if the JSON string is invalid with respect to ArInvoiceLineOpenApiResponse
  */
  public static ArInvoiceLineOpenApiResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArInvoiceLineOpenApiResponse.class);
  }

 /**
  * Convert an instance of ArInvoiceLineOpenApiResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

