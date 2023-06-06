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
import com.alipay.v3.model.WidgetActivityInfo;
import com.alipay.v3.model.WidgetGoodsInfo;
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
 * AlipayOpenMiniWidgetDataSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniWidgetDataSyncModel {
  public static final String SERIALIZED_NAME_ACTIVITY_LIST = "activity_list";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_LIST)
  private List<WidgetActivityInfo> activityList = null;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_GOODS_LIST = "goods_list";
  @SerializedName(SERIALIZED_NAME_GOODS_LIST)
  private List<WidgetGoodsInfo> goodsList = null;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public AlipayOpenMiniWidgetDataSyncModel() { 
  }

  public AlipayOpenMiniWidgetDataSyncModel activityList(List<WidgetActivityInfo> activityList) {
    
    this.activityList = activityList;
    return this;
  }

  public AlipayOpenMiniWidgetDataSyncModel addActivityListItem(WidgetActivityInfo activityListItem) {
    if (this.activityList == null) {
      this.activityList = new ArrayList<>();
    }
    this.activityList.add(activityListItem);
    return this;
  }

   /**
   * 活动信息列表
   * @return activityList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动信息列表")

  public List<WidgetActivityInfo> getActivityList() {
    return activityList;
  }


  public void setActivityList(List<WidgetActivityInfo> activityList) {
    this.activityList = activityList;
  }


  public AlipayOpenMiniWidgetDataSyncModel dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 数据类型，可选值：ACTIVITY(活动数据)、GOODS(商品数据)
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVITY", value = "数据类型，可选值：ACTIVITY(活动数据)、GOODS(商品数据)")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public AlipayOpenMiniWidgetDataSyncModel goodsList(List<WidgetGoodsInfo> goodsList) {
    
    this.goodsList = goodsList;
    return this;
  }

  public AlipayOpenMiniWidgetDataSyncModel addGoodsListItem(WidgetGoodsInfo goodsListItem) {
    if (this.goodsList == null) {
      this.goodsList = new ArrayList<>();
    }
    this.goodsList.add(goodsListItem);
    return this;
  }

   /**
   * 商品信息列表
   * @return goodsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品信息列表")

  public List<WidgetGoodsInfo> getGoodsList() {
    return goodsList;
  }


  public void setGoodsList(List<WidgetGoodsInfo> goodsList) {
    this.goodsList = goodsList;
  }


  public AlipayOpenMiniWidgetDataSyncModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 商家小程序ID
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017072607907880", value = "商家小程序ID")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenMiniWidgetDataSyncModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 小程序背后的商家，和mini_app_id要求对应
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxxxxx", value = "小程序背后的商家，和mini_app_id要求对应")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniWidgetDataSyncModel alipayOpenMiniWidgetDataSyncModel = (AlipayOpenMiniWidgetDataSyncModel) o;
    return Objects.equals(this.activityList, alipayOpenMiniWidgetDataSyncModel.activityList) &&
        Objects.equals(this.dataType, alipayOpenMiniWidgetDataSyncModel.dataType) &&
        Objects.equals(this.goodsList, alipayOpenMiniWidgetDataSyncModel.goodsList) &&
        Objects.equals(this.miniAppId, alipayOpenMiniWidgetDataSyncModel.miniAppId) &&
        Objects.equals(this.pid, alipayOpenMiniWidgetDataSyncModel.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityList, dataType, goodsList, miniAppId, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniWidgetDataSyncModel {\n");
    sb.append("    activityList: ").append(toIndentedString(activityList)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    goodsList: ").append(toIndentedString(goodsList)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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
    openapiFields.add("activity_list");
    openapiFields.add("data_type");
    openapiFields.add("goods_list");
    openapiFields.add("mini_app_id");
    openapiFields.add("pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniWidgetDataSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniWidgetDataSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniWidgetDataSyncModel is not found in the empty JSON string", AlipayOpenMiniWidgetDataSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniWidgetDataSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniWidgetDataSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayactivityList = jsonObj.getAsJsonArray("activity_list");
      if (jsonArrayactivityList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("activity_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `activity_list` to be an array in the JSON string but got `%s`", jsonObj.get("activity_list").toString()));
        }

        // validate the optional field `activity_list` (array)
        for (int i = 0; i < jsonArrayactivityList.size(); i++) {
          WidgetActivityInfo.validateJsonObject(jsonArrayactivityList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      JsonArray jsonArraygoodsList = jsonObj.getAsJsonArray("goods_list");
      if (jsonArraygoodsList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_list` to be an array in the JSON string but got `%s`", jsonObj.get("goods_list").toString()));
        }

        // validate the optional field `goods_list` (array)
        for (int i = 0; i < jsonArraygoodsList.size(); i++) {
          WidgetGoodsInfo.validateJsonObject(jsonArraygoodsList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniWidgetDataSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniWidgetDataSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniWidgetDataSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniWidgetDataSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniWidgetDataSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniWidgetDataSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniWidgetDataSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniWidgetDataSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniWidgetDataSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniWidgetDataSyncModel
  */
  public static AlipayOpenMiniWidgetDataSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniWidgetDataSyncModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniWidgetDataSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

