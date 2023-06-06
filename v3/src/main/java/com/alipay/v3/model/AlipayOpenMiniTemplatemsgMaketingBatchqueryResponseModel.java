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
import com.alipay.v3.model.MarketingDeliveryDetail;
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
 * AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_MARKETING_DELIVERY_DETAIL_LIST = "marketing_delivery_detail_list";
  @SerializedName(SERIALIZED_NAME_MARKETING_DELIVERY_DETAIL_LIST)
  private List<MarketingDeliveryDetail> marketingDeliveryDetailList = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel() { 
  }

  public AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel marketingDeliveryDetailList(List<MarketingDeliveryDetail> marketingDeliveryDetailList) {
    
    this.marketingDeliveryDetailList = marketingDeliveryDetailList;
    return this;
  }

  public AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel addMarketingDeliveryDetailListItem(MarketingDeliveryDetail marketingDeliveryDetailListItem) {
    if (this.marketingDeliveryDetailList == null) {
      this.marketingDeliveryDetailList = new ArrayList<>();
    }
    this.marketingDeliveryDetailList.add(marketingDeliveryDetailListItem);
    return this;
  }

   /**
   * 投放详情列表
   * @return marketingDeliveryDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "投放详情列表")

  public List<MarketingDeliveryDetail> getMarketingDeliveryDetailList() {
    return marketingDeliveryDetailList;
  }


  public void setMarketingDeliveryDetailList(List<MarketingDeliveryDetail> marketingDeliveryDetailList) {
    this.marketingDeliveryDetailList = marketingDeliveryDetailList;
  }


  public AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * 投放详情总条数
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "投放详情总条数")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel alipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel = (AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel) o;
    return Objects.equals(this.marketingDeliveryDetailList, alipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.marketingDeliveryDetailList) &&
        Objects.equals(this.total, alipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingDeliveryDetailList, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel {\n");
    sb.append("    marketingDeliveryDetailList: ").append(toIndentedString(marketingDeliveryDetailList)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("marketing_delivery_detail_list");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel is not found in the empty JSON string", AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymarketingDeliveryDetailList = jsonObj.getAsJsonArray("marketing_delivery_detail_list");
      if (jsonArraymarketingDeliveryDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("marketing_delivery_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `marketing_delivery_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("marketing_delivery_detail_list").toString()));
        }

        // validate the optional field `marketing_delivery_detail_list` (array)
        for (int i = 0; i < jsonArraymarketingDeliveryDetailList.size(); i++) {
          MarketingDeliveryDetail.validateJsonObject(jsonArraymarketingDeliveryDetailList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel
  */
  public static AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniTemplatemsgMaketingBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

