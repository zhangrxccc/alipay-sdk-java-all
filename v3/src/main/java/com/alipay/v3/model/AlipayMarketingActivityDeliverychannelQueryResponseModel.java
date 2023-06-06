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
import com.alipay.v3.model.DeliveryChannelInfo;
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
 * AlipayMarketingActivityDeliverychannelQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityDeliverychannelQueryResponseModel {
  public static final String SERIALIZED_NAME_DELIVERY_CHANNEL_INFO_LIST = "delivery_channel_info_list";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CHANNEL_INFO_LIST)
  private List<DeliveryChannelInfo> deliveryChannelInfoList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public AlipayMarketingActivityDeliverychannelQueryResponseModel() { 
  }

  public AlipayMarketingActivityDeliverychannelQueryResponseModel deliveryChannelInfoList(List<DeliveryChannelInfo> deliveryChannelInfoList) {
    
    this.deliveryChannelInfoList = deliveryChannelInfoList;
    return this;
  }

  public AlipayMarketingActivityDeliverychannelQueryResponseModel addDeliveryChannelInfoListItem(DeliveryChannelInfo deliveryChannelInfoListItem) {
    if (this.deliveryChannelInfoList == null) {
      this.deliveryChannelInfoList = new ArrayList<>();
    }
    this.deliveryChannelInfoList.add(deliveryChannelInfoListItem);
    return this;
  }

   /**
   * 可投放的渠道信息列表。 用于表达当前可以投放的渠道列表信息
   * @return deliveryChannelInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可投放的渠道信息列表。 用于表达当前可以投放的渠道列表信息")

  public List<DeliveryChannelInfo> getDeliveryChannelInfoList() {
    return deliveryChannelInfoList;
  }


  public void setDeliveryChannelInfoList(List<DeliveryChannelInfo> deliveryChannelInfoList) {
    this.deliveryChannelInfoList = deliveryChannelInfoList;
  }


  public AlipayMarketingActivityDeliverychannelQueryResponseModel pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 查询的页码。 特别说明： 页码从1开始。
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "查询的页码。 特别说明： 页码从1开始。")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityDeliverychannelQueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页查询个数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "每页查询个数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingActivityDeliverychannelQueryResponseModel totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 可返回的渠道总数
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "可返回的渠道总数")

  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityDeliverychannelQueryResponseModel alipayMarketingActivityDeliverychannelQueryResponseModel = (AlipayMarketingActivityDeliverychannelQueryResponseModel) o;
    return Objects.equals(this.deliveryChannelInfoList, alipayMarketingActivityDeliverychannelQueryResponseModel.deliveryChannelInfoList) &&
        Objects.equals(this.pageNum, alipayMarketingActivityDeliverychannelQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityDeliverychannelQueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayMarketingActivityDeliverychannelQueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryChannelInfoList, pageNum, pageSize, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityDeliverychannelQueryResponseModel {\n");
    sb.append("    deliveryChannelInfoList: ").append(toIndentedString(deliveryChannelInfoList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("delivery_channel_info_list");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityDeliverychannelQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityDeliverychannelQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityDeliverychannelQueryResponseModel is not found in the empty JSON string", AlipayMarketingActivityDeliverychannelQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityDeliverychannelQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityDeliverychannelQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydeliveryChannelInfoList = jsonObj.getAsJsonArray("delivery_channel_info_list");
      if (jsonArraydeliveryChannelInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("delivery_channel_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `delivery_channel_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("delivery_channel_info_list").toString()));
        }

        // validate the optional field `delivery_channel_info_list` (array)
        for (int i = 0; i < jsonArraydeliveryChannelInfoList.size(); i++) {
          DeliveryChannelInfo.validateJsonObject(jsonArraydeliveryChannelInfoList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("total_size") != null && !jsonObj.get("total_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityDeliverychannelQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityDeliverychannelQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityDeliverychannelQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityDeliverychannelQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityDeliverychannelQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityDeliverychannelQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityDeliverychannelQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityDeliverychannelQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityDeliverychannelQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityDeliverychannelQueryResponseModel
  */
  public static AlipayMarketingActivityDeliverychannelQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityDeliverychannelQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityDeliverychannelQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

