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
import com.alipay.v3.model.KeyWordInfo;
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
 * AlipayOpenSearchAppkeywordBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchAppkeywordBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_KEY_WORD_INFO = "key_word_info";
  @SerializedName(SERIALIZED_NAME_KEY_WORD_INFO)
  private List<KeyWordInfo> keyWordInfo = null;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayOpenSearchAppkeywordBatchqueryResponseModel() { 
  }

  public AlipayOpenSearchAppkeywordBatchqueryResponseModel keyWordInfo(List<KeyWordInfo> keyWordInfo) {
    
    this.keyWordInfo = keyWordInfo;
    return this;
  }

  public AlipayOpenSearchAppkeywordBatchqueryResponseModel addKeyWordInfoItem(KeyWordInfo keyWordInfoItem) {
    if (this.keyWordInfo == null) {
      this.keyWordInfo = new ArrayList<>();
    }
    this.keyWordInfo.add(keyWordInfoItem);
    return this;
  }

   /**
   * 审核通过关键词明细
   * @return keyWordInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核通过关键词明细")

  public List<KeyWordInfo> getKeyWordInfo() {
    return keyWordInfo;
  }


  public void setKeyWordInfo(List<KeyWordInfo> keyWordInfo) {
    this.keyWordInfo = keyWordInfo;
  }


  public AlipayOpenSearchAppkeywordBatchqueryResponseModel pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * 第几页
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "第几页")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public AlipayOpenSearchAppkeywordBatchqueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页条数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页条数")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOpenSearchAppkeywordBatchqueryResponseModel totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总条数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "总条数")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public AlipayOpenSearchAppkeywordBatchqueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "总页数")

  public Integer getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchAppkeywordBatchqueryResponseModel alipayOpenSearchAppkeywordBatchqueryResponseModel = (AlipayOpenSearchAppkeywordBatchqueryResponseModel) o;
    return Objects.equals(this.keyWordInfo, alipayOpenSearchAppkeywordBatchqueryResponseModel.keyWordInfo) &&
        Objects.equals(this.pageNumber, alipayOpenSearchAppkeywordBatchqueryResponseModel.pageNumber) &&
        Objects.equals(this.pageSize, alipayOpenSearchAppkeywordBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.totalCount, alipayOpenSearchAppkeywordBatchqueryResponseModel.totalCount) &&
        Objects.equals(this.totalPageCount, alipayOpenSearchAppkeywordBatchqueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyWordInfo, pageNumber, pageSize, totalCount, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchAppkeywordBatchqueryResponseModel {\n");
    sb.append("    keyWordInfo: ").append(toIndentedString(keyWordInfo)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
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
    openapiFields.add("key_word_info");
    openapiFields.add("page_number");
    openapiFields.add("page_size");
    openapiFields.add("total_count");
    openapiFields.add("total_page_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchAppkeywordBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchAppkeywordBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchAppkeywordBatchqueryResponseModel is not found in the empty JSON string", AlipayOpenSearchAppkeywordBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchAppkeywordBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchAppkeywordBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraykeyWordInfo = jsonObj.getAsJsonArray("key_word_info");
      if (jsonArraykeyWordInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("key_word_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `key_word_info` to be an array in the JSON string but got `%s`", jsonObj.get("key_word_info").toString()));
        }

        // validate the optional field `key_word_info` (array)
        for (int i = 0; i < jsonArraykeyWordInfo.size(); i++) {
          KeyWordInfo.validateJsonObject(jsonArraykeyWordInfo.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchAppkeywordBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchAppkeywordBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchAppkeywordBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchAppkeywordBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchAppkeywordBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchAppkeywordBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchAppkeywordBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchAppkeywordBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchAppkeywordBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchAppkeywordBatchqueryResponseModel
  */
  public static AlipayOpenSearchAppkeywordBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchAppkeywordBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchAppkeywordBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

