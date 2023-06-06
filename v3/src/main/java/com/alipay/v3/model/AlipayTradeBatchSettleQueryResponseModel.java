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
import com.alipay.v3.model.BatchSettleDetail;
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
 * AlipayTradeBatchSettleQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeBatchSettleQueryResponseModel {
  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_SETTLE_DETAIL = "settle_detail";
  @SerializedName(SERIALIZED_NAME_SETTLE_DETAIL)
  private List<BatchSettleDetail> settleDetail = null;

  public static final String SERIALIZED_NAME_SETTLE_NO = "settle_no";
  @SerializedName(SERIALIZED_NAME_SETTLE_NO)
  private String settleNo;

  public AlipayTradeBatchSettleQueryResponseModel() { 
  }

  public AlipayTradeBatchSettleQueryResponseModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 批量结算时传入的外部流水号
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20190101", value = "批量结算时传入的外部流水号")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeBatchSettleQueryResponseModel settleDetail(List<BatchSettleDetail> settleDetail) {
    
    this.settleDetail = settleDetail;
    return this;
  }

  public AlipayTradeBatchSettleQueryResponseModel addSettleDetailItem(BatchSettleDetail settleDetailItem) {
    if (this.settleDetail == null) {
      this.settleDetail = new ArrayList<>();
    }
    this.settleDetail.add(settleDetailItem);
    return this;
  }

   /**
   * 批量结算详情
   * @return settleDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "批量结算详情")

  public List<BatchSettleDetail> getSettleDetail() {
    return settleDetail;
  }


  public void setSettleDetail(List<BatchSettleDetail> settleDetail) {
    this.settleDetail = settleDetail;
  }


  public AlipayTradeBatchSettleQueryResponseModel settleNo(String settleNo) {
    
    this.settleNo = settleNo;
    return this;
  }

   /**
   * 结算单据号
   * @return settleNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019050510032002040000053220", value = "结算单据号")

  public String getSettleNo() {
    return settleNo;
  }


  public void setSettleNo(String settleNo) {
    this.settleNo = settleNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeBatchSettleQueryResponseModel alipayTradeBatchSettleQueryResponseModel = (AlipayTradeBatchSettleQueryResponseModel) o;
    return Objects.equals(this.outRequestNo, alipayTradeBatchSettleQueryResponseModel.outRequestNo) &&
        Objects.equals(this.settleDetail, alipayTradeBatchSettleQueryResponseModel.settleDetail) &&
        Objects.equals(this.settleNo, alipayTradeBatchSettleQueryResponseModel.settleNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outRequestNo, settleDetail, settleNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeBatchSettleQueryResponseModel {\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    settleDetail: ").append(toIndentedString(settleDetail)).append("\n");
    sb.append("    settleNo: ").append(toIndentedString(settleNo)).append("\n");
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
    openapiFields.add("out_request_no");
    openapiFields.add("settle_detail");
    openapiFields.add("settle_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeBatchSettleQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeBatchSettleQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeBatchSettleQueryResponseModel is not found in the empty JSON string", AlipayTradeBatchSettleQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeBatchSettleQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeBatchSettleQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      JsonArray jsonArraysettleDetail = jsonObj.getAsJsonArray("settle_detail");
      if (jsonArraysettleDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("settle_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `settle_detail` to be an array in the JSON string but got `%s`", jsonObj.get("settle_detail").toString()));
        }

        // validate the optional field `settle_detail` (array)
        for (int i = 0; i < jsonArraysettleDetail.size(); i++) {
          BatchSettleDetail.validateJsonObject(jsonArraysettleDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("settle_no") != null && !jsonObj.get("settle_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeBatchSettleQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeBatchSettleQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeBatchSettleQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeBatchSettleQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeBatchSettleQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeBatchSettleQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeBatchSettleQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeBatchSettleQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeBatchSettleQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeBatchSettleQueryResponseModel
  */
  public static AlipayTradeBatchSettleQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeBatchSettleQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeBatchSettleQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

