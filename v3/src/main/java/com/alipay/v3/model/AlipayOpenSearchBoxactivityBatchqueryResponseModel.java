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
import com.alipay.v3.model.SearchBoxActivity;
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
 * AlipayOpenSearchBoxactivityBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchBoxactivityBatchqueryResponseModel {
  public static final String SERIALIZED_NAME_MODELS = "models";
  @SerializedName(SERIALIZED_NAME_MODELS)
  private List<SearchBoxActivity> models = null;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "page_number";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private String pageNumber;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayOpenSearchBoxactivityBatchqueryResponseModel() { 
  }

  public AlipayOpenSearchBoxactivityBatchqueryResponseModel models(List<SearchBoxActivity> models) {
    
    this.models = models;
    return this;
  }

  public AlipayOpenSearchBoxactivityBatchqueryResponseModel addModelsItem(SearchBoxActivity modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

   /**
   * 活动明细列表
   * @return models
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动明细列表")

  public List<SearchBoxActivity> getModels() {
    return models;
  }


  public void setModels(List<SearchBoxActivity> models) {
    this.models = models;
  }


  public AlipayOpenSearchBoxactivityBatchqueryResponseModel pageNumber(String pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * 当前页码
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码")

  public String getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }


  public AlipayOpenSearchBoxactivityBatchqueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "每页记录数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayOpenSearchBoxactivityBatchqueryResponseModel totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总记录数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "总记录数")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public AlipayOpenSearchBoxactivityBatchqueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "总页数")

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
    AlipayOpenSearchBoxactivityBatchqueryResponseModel alipayOpenSearchBoxactivityBatchqueryResponseModel = (AlipayOpenSearchBoxactivityBatchqueryResponseModel) o;
    return Objects.equals(this.models, alipayOpenSearchBoxactivityBatchqueryResponseModel.models) &&
        Objects.equals(this.pageNumber, alipayOpenSearchBoxactivityBatchqueryResponseModel.pageNumber) &&
        Objects.equals(this.pageSize, alipayOpenSearchBoxactivityBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.totalCount, alipayOpenSearchBoxactivityBatchqueryResponseModel.totalCount) &&
        Objects.equals(this.totalPageCount, alipayOpenSearchBoxactivityBatchqueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, pageNumber, pageSize, totalCount, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchBoxactivityBatchqueryResponseModel {\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
    openapiFields.add("models");
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
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchBoxactivityBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchBoxactivityBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchBoxactivityBatchqueryResponseModel is not found in the empty JSON string", AlipayOpenSearchBoxactivityBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchBoxactivityBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchBoxactivityBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymodels = jsonObj.getAsJsonArray("models");
      if (jsonArraymodels != null) {
        // ensure the json data is an array
        if (!jsonObj.get("models").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `models` to be an array in the JSON string but got `%s`", jsonObj.get("models").toString()));
        }

        // validate the optional field `models` (array)
        for (int i = 0; i < jsonArraymodels.size(); i++) {
          SearchBoxActivity.validateJsonObject(jsonArraymodels.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_number") != null && !jsonObj.get("page_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_number").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchBoxactivityBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchBoxactivityBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchBoxactivityBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchBoxactivityBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchBoxactivityBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchBoxactivityBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchBoxactivityBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchBoxactivityBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchBoxactivityBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchBoxactivityBatchqueryResponseModel
  */
  public static AlipayOpenSearchBoxactivityBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchBoxactivityBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchBoxactivityBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

