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
import com.alipay.v3.model.PaidOuterCardPriceDetailDTO;
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
 * PaidOuterCardSellingConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaidOuterCardSellingConfDTO {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_PRICE_DETAIL = "price_detail";
  @SerializedName(SERIALIZED_NAME_PRICE_DETAIL)
  private List<PaidOuterCardPriceDetailDTO> priceDetail = null;

  public static final String SERIALIZED_NAME_SELLING_URL = "selling_url";
  @SerializedName(SERIALIZED_NAME_SELLING_URL)
  private String sellingUrl;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public PaidOuterCardSellingConfDTO() { 
  }

  public PaidOuterCardSellingConfDTO endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 售卖结束时间。 格式：yyyy-MM-dd HH:mm:ss 如果永久有效则不传。
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "售卖结束时间。 格式：yyyy-MM-dd HH:mm:ss 如果永久有效则不传。")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public PaidOuterCardSellingConfDTO priceDetail(List<PaidOuterCardPriceDetailDTO> priceDetail) {
    
    this.priceDetail = priceDetail;
    return this;
  }

  public PaidOuterCardSellingConfDTO addPriceDetailItem(PaidOuterCardPriceDetailDTO priceDetailItem) {
    if (this.priceDetail == null) {
      this.priceDetail = new ArrayList<>();
    }
    this.priceDetail.add(priceDetailItem);
    return this;
  }

   /**
   * 售卖方案列表
   * @return priceDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "售卖方案列表")

  public List<PaidOuterCardPriceDetailDTO> getPriceDetail() {
    return priceDetail;
  }


  public void setPriceDetail(List<PaidOuterCardPriceDetailDTO> priceDetail) {
    this.priceDetail = priceDetail;
  }


  public PaidOuterCardSellingConfDTO sellingUrl(String sellingUrl) {
    
    this.sellingUrl = sellingUrl;
    return this;
  }

   /**
   * 售卖地址
   * @return sellingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "售卖地址")

  public String getSellingUrl() {
    return sellingUrl;
  }


  public void setSellingUrl(String sellingUrl) {
    this.sellingUrl = sellingUrl;
  }


  public PaidOuterCardSellingConfDTO startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 售卖开始时间。格式：yyyy-MM-dd HH:mm:ss
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "售卖开始时间。格式：yyyy-MM-dd HH:mm:ss")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaidOuterCardSellingConfDTO paidOuterCardSellingConfDTO = (PaidOuterCardSellingConfDTO) o;
    return Objects.equals(this.endDate, paidOuterCardSellingConfDTO.endDate) &&
        Objects.equals(this.priceDetail, paidOuterCardSellingConfDTO.priceDetail) &&
        Objects.equals(this.sellingUrl, paidOuterCardSellingConfDTO.sellingUrl) &&
        Objects.equals(this.startDate, paidOuterCardSellingConfDTO.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, priceDetail, sellingUrl, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaidOuterCardSellingConfDTO {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    priceDetail: ").append(toIndentedString(priceDetail)).append("\n");
    sb.append("    sellingUrl: ").append(toIndentedString(sellingUrl)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("price_detail");
    openapiFields.add("selling_url");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaidOuterCardSellingConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaidOuterCardSellingConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaidOuterCardSellingConfDTO is not found in the empty JSON string", PaidOuterCardSellingConfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaidOuterCardSellingConfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaidOuterCardSellingConfDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      JsonArray jsonArraypriceDetail = jsonObj.getAsJsonArray("price_detail");
      if (jsonArraypriceDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("price_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `price_detail` to be an array in the JSON string but got `%s`", jsonObj.get("price_detail").toString()));
        }

        // validate the optional field `price_detail` (array)
        for (int i = 0; i < jsonArraypriceDetail.size(); i++) {
          PaidOuterCardPriceDetailDTO.validateJsonObject(jsonArraypriceDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("selling_url") != null && !jsonObj.get("selling_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selling_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selling_url").toString()));
      }
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaidOuterCardSellingConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaidOuterCardSellingConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaidOuterCardSellingConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaidOuterCardSellingConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PaidOuterCardSellingConfDTO>() {
           @Override
           public void write(JsonWriter out, PaidOuterCardSellingConfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaidOuterCardSellingConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaidOuterCardSellingConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaidOuterCardSellingConfDTO
  * @throws IOException if the JSON string is invalid with respect to PaidOuterCardSellingConfDTO
  */
  public static PaidOuterCardSellingConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaidOuterCardSellingConfDTO.class);
  }

 /**
  * Convert an instance of PaidOuterCardSellingConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

