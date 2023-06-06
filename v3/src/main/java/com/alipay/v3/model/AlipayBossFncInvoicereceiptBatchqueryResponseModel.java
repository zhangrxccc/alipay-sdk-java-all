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
import com.alipay.v3.model.ArInvoiceReceiptOpenApiResponse;
import com.alipay.v3.model.MultiCurrencyMoneyOpenApi;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AlipayBossFncInvoicereceiptBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncInvoicereceiptBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_RESULT_SET = "result_set";
  @SerializedName(SERIALIZED_NAME_RESULT_SET)
  private List<ArInvoiceReceiptOpenApiResponse> resultSet = null;

  public static final String SERIALIZED_NAME_TOTAL_INV_AMT = "total_inv_amt";
  @SerializedName(SERIALIZED_NAME_TOTAL_INV_AMT)
  private MultiCurrencyMoneyOpenApi totalInvAmt;

  public static final String SERIALIZED_NAME_TOTAL_INVED_AMT = "total_inved_amt";
  @SerializedName(SERIALIZED_NAME_TOTAL_INVED_AMT)
  private MultiCurrencyMoneyOpenApi totalInvedAmt;

  public static final String SERIALIZED_NAME_TOTAL_LINK_INVOICE_AMT = "total_link_invoice_amt";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINK_INVOICE_AMT)
  private MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt;

  public AlipayBossFncInvoicereceiptBatchqueryResponseModel() { 
  }

  public AlipayBossFncInvoicereceiptBatchqueryResponseModel resultSet(List<ArInvoiceReceiptOpenApiResponse> resultSet) {
    
    this.resultSet = resultSet;
    return this;
  }

  public AlipayBossFncInvoicereceiptBatchqueryResponseModel addResultSetItem(ArInvoiceReceiptOpenApiResponse resultSetItem) {
    if (this.resultSet == null) {
      this.resultSet = new ArrayList<>();
    }
    this.resultSet.add(resultSetItem);
    return this;
  }

   /**
   * 返回结果对象：可开票单据
   * @return resultSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回结果对象：可开票单据")

  public List<ArInvoiceReceiptOpenApiResponse> getResultSet() {
    return resultSet;
  }


  public void setResultSet(List<ArInvoiceReceiptOpenApiResponse> resultSet) {
    this.resultSet = resultSet;
  }


  public AlipayBossFncInvoicereceiptBatchqueryResponseModel totalInvAmt(MultiCurrencyMoneyOpenApi totalInvAmt) {
    
    this.totalInvAmt = totalInvAmt;
    return this;
  }

   /**
   * Get totalInvAmt
   * @return totalInvAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getTotalInvAmt() {
    return totalInvAmt;
  }


  public void setTotalInvAmt(MultiCurrencyMoneyOpenApi totalInvAmt) {
    this.totalInvAmt = totalInvAmt;
  }


  public AlipayBossFncInvoicereceiptBatchqueryResponseModel totalInvedAmt(MultiCurrencyMoneyOpenApi totalInvedAmt) {
    
    this.totalInvedAmt = totalInvedAmt;
    return this;
  }

   /**
   * Get totalInvedAmt
   * @return totalInvedAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getTotalInvedAmt() {
    return totalInvedAmt;
  }


  public void setTotalInvedAmt(MultiCurrencyMoneyOpenApi totalInvedAmt) {
    this.totalInvedAmt = totalInvedAmt;
  }


  public AlipayBossFncInvoicereceiptBatchqueryResponseModel totalLinkInvoiceAmt(MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt) {
    
    this.totalLinkInvoiceAmt = totalLinkInvoiceAmt;
    return this;
  }

   /**
   * Get totalLinkInvoiceAmt
   * @return totalLinkInvoiceAmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiCurrencyMoneyOpenApi getTotalLinkInvoiceAmt() {
    return totalLinkInvoiceAmt;
  }


  public void setTotalLinkInvoiceAmt(MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt) {
    this.totalLinkInvoiceAmt = totalLinkInvoiceAmt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayBossFncInvoicereceiptBatchqueryResponseModel alipayBossFncInvoicereceiptBatchqueryResponseModel = (AlipayBossFncInvoicereceiptBatchqueryResponseModel) o;
    return Objects.equals(this.resultSet, alipayBossFncInvoicereceiptBatchqueryResponseModel.resultSet) &&
        Objects.equals(this.totalInvAmt, alipayBossFncInvoicereceiptBatchqueryResponseModel.totalInvAmt) &&
        Objects.equals(this.totalInvedAmt, alipayBossFncInvoicereceiptBatchqueryResponseModel.totalInvedAmt) &&
        Objects.equals(this.totalLinkInvoiceAmt, alipayBossFncInvoicereceiptBatchqueryResponseModel.totalLinkInvoiceAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSet, totalInvAmt, totalInvedAmt, totalLinkInvoiceAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncInvoicereceiptBatchqueryResponseModel {\n");
    sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
    sb.append("    totalInvAmt: ").append(toIndentedString(totalInvAmt)).append("\n");
    sb.append("    totalInvedAmt: ").append(toIndentedString(totalInvedAmt)).append("\n");
    sb.append("    totalLinkInvoiceAmt: ").append(toIndentedString(totalLinkInvoiceAmt)).append("\n");
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
    openapiFields.add("result_set");
    openapiFields.add("total_inv_amt");
    openapiFields.add("total_inved_amt");
    openapiFields.add("total_link_invoice_amt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncInvoicereceiptBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncInvoicereceiptBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncInvoicereceiptBatchqueryResponseModel is not found in the empty JSON string", AlipayBossFncInvoicereceiptBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayBossFncInvoicereceiptBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayBossFncInvoicereceiptBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayresultSet = jsonObj.getAsJsonArray("result_set");
      if (jsonArrayresultSet != null) {
        // ensure the json data is an array
        if (!jsonObj.get("result_set").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `result_set` to be an array in the JSON string but got `%s`", jsonObj.get("result_set").toString()));
        }

        // validate the optional field `result_set` (array)
        for (int i = 0; i < jsonArrayresultSet.size(); i++) {
          ArInvoiceReceiptOpenApiResponse.validateJsonObject(jsonArrayresultSet.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `total_inv_amt`
      if (jsonObj.getAsJsonObject("total_inv_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("total_inv_amt"));
      }
      // validate the optional field `total_inved_amt`
      if (jsonObj.getAsJsonObject("total_inved_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("total_inved_amt"));
      }
      // validate the optional field `total_link_invoice_amt`
      if (jsonObj.getAsJsonObject("total_link_invoice_amt") != null) {
        MultiCurrencyMoneyOpenApi.validateJsonObject(jsonObj.getAsJsonObject("total_link_invoice_amt"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncInvoicereceiptBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncInvoicereceiptBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncInvoicereceiptBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncInvoicereceiptBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncInvoicereceiptBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncInvoicereceiptBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayBossFncInvoicereceiptBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayBossFncInvoicereceiptBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncInvoicereceiptBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncInvoicereceiptBatchqueryResponseModel
  */
  public static AlipayBossFncInvoicereceiptBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncInvoicereceiptBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncInvoicereceiptBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

