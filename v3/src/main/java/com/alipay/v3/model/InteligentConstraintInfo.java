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
 * InteligentConstraintInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentConstraintInfo {
  public static final String SERIALIZED_NAME_CROWD_GROUP_ID = "crowd_group_id";
  @SerializedName(SERIALIZED_NAME_CROWD_GROUP_ID)
  private String crowdGroupId;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private String itemIds;

  public static final String SERIALIZED_NAME_MIN_COST = "min_cost";
  @SerializedName(SERIALIZED_NAME_MIN_COST)
  private String minCost;

  public static final String SERIALIZED_NAME_SUIT_SHOPS = "suit_shops";
  @SerializedName(SERIALIZED_NAME_SUIT_SHOPS)
  private List<String> suitShops = null;

  public static final String SERIALIZED_NAME_USER_WIN_COUNT = "user_win_count";
  @SerializedName(SERIALIZED_NAME_USER_WIN_COUNT)
  private String userWinCount;

  public static final String SERIALIZED_NAME_USER_WIN_FREQUENCY = "user_win_frequency";
  @SerializedName(SERIALIZED_NAME_USER_WIN_FREQUENCY)
  private String userWinFrequency;

  public InteligentConstraintInfo() { 
  }

  public InteligentConstraintInfo crowdGroupId(String crowdGroupId) {
    
    this.crowdGroupId = crowdGroupId;
    return this;
  }

   /**
   * 人群组id，目前只支持返回时带出。
   * @return crowdGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34324224", value = "人群组id，目前只支持返回时带出。")

  public String getCrowdGroupId() {
    return crowdGroupId;
  }


  public void setCrowdGroupId(String crowdGroupId) {
    this.crowdGroupId = crowdGroupId;
  }


  public InteligentConstraintInfo itemIds(String itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

   /**
   * 单品码列表  仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "212313,221322", value = "单品码列表  仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码")

  public String getItemIds() {
    return itemIds;
  }


  public void setItemIds(String itemIds) {
    this.itemIds = itemIds;
  }


  public InteligentConstraintInfo minCost(String minCost) {
    
    this.minCost = minCost;
    return this;
  }

   /**
   * 最低消费金额，单位元  仅在创建消费送礼包活动时设置
   * @return minCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "最低消费金额，单位元  仅在创建消费送礼包活动时设置")

  public String getMinCost() {
    return minCost;
  }


  public void setMinCost(String minCost) {
    this.minCost = minCost;
  }


  public InteligentConstraintInfo suitShops(List<String> suitShops) {
    
    this.suitShops = suitShops;
    return this;
  }

  public InteligentConstraintInfo addSuitShopsItem(String suitShopsItem) {
    if (this.suitShops == null) {
      this.suitShops = new ArrayList<>();
    }
    this.suitShops.add(suitShopsItem);
    return this;
  }

   /**
   * 活动适用的门店列表  仅品牌商发起的招商活动可为空  最多支持10w家门店
   * @return suitShops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015110600077000000002125023,2015110600077000000002125022", value = "活动适用的门店列表  仅品牌商发起的招商活动可为空  最多支持10w家门店")

  public List<String> getSuitShops() {
    return suitShops;
  }


  public void setSuitShops(List<String> suitShops) {
    this.suitShops = suitShops;
  }


  public InteligentConstraintInfo userWinCount(String userWinCount) {
    
    this.userWinCount = userWinCount;
    return this;
  }

   /**
   * 活动期间用户能够参与的次数限制  如果不设置则不限制参与次数
   * @return userWinCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "活动期间用户能够参与的次数限制  如果不设置则不限制参与次数")

  public String getUserWinCount() {
    return userWinCount;
  }


  public void setUserWinCount(String userWinCount) {
    this.userWinCount = userWinCount;
  }


  public InteligentConstraintInfo userWinFrequency(String userWinFrequency) {
    
    this.userWinFrequency = userWinFrequency;
    return this;
  }

   /**
   * 活动期间用户能够参与的频率限制  如果不设置则不限制参与频率  每日中奖1次: D||1   每周中奖2次: W||2   每月中奖3次: M||3
   * @return userWinFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "D||3", value = "活动期间用户能够参与的频率限制  如果不设置则不限制参与频率  每日中奖1次: D||1   每周中奖2次: W||2   每月中奖3次: M||3")

  public String getUserWinFrequency() {
    return userWinFrequency;
  }


  public void setUserWinFrequency(String userWinFrequency) {
    this.userWinFrequency = userWinFrequency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentConstraintInfo inteligentConstraintInfo = (InteligentConstraintInfo) o;
    return Objects.equals(this.crowdGroupId, inteligentConstraintInfo.crowdGroupId) &&
        Objects.equals(this.itemIds, inteligentConstraintInfo.itemIds) &&
        Objects.equals(this.minCost, inteligentConstraintInfo.minCost) &&
        Objects.equals(this.suitShops, inteligentConstraintInfo.suitShops) &&
        Objects.equals(this.userWinCount, inteligentConstraintInfo.userWinCount) &&
        Objects.equals(this.userWinFrequency, inteligentConstraintInfo.userWinFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crowdGroupId, itemIds, minCost, suitShops, userWinCount, userWinFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentConstraintInfo {\n");
    sb.append("    crowdGroupId: ").append(toIndentedString(crowdGroupId)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    minCost: ").append(toIndentedString(minCost)).append("\n");
    sb.append("    suitShops: ").append(toIndentedString(suitShops)).append("\n");
    sb.append("    userWinCount: ").append(toIndentedString(userWinCount)).append("\n");
    sb.append("    userWinFrequency: ").append(toIndentedString(userWinFrequency)).append("\n");
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
    openapiFields.add("crowd_group_id");
    openapiFields.add("item_ids");
    openapiFields.add("min_cost");
    openapiFields.add("suit_shops");
    openapiFields.add("user_win_count");
    openapiFields.add("user_win_frequency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentConstraintInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentConstraintInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentConstraintInfo is not found in the empty JSON string", InteligentConstraintInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentConstraintInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentConstraintInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("crowd_group_id") != null && !jsonObj.get("crowd_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd_group_id").toString()));
      }
      if (jsonObj.get("item_ids") != null && !jsonObj.get("item_ids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_ids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_ids").toString()));
      }
      if (jsonObj.get("min_cost") != null && !jsonObj.get("min_cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_cost").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("suit_shops") != null && !jsonObj.get("suit_shops").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `suit_shops` to be an array in the JSON string but got `%s`", jsonObj.get("suit_shops").toString()));
      }
      if (jsonObj.get("user_win_count") != null && !jsonObj.get("user_win_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_win_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_win_count").toString()));
      }
      if (jsonObj.get("user_win_frequency") != null && !jsonObj.get("user_win_frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_win_frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_win_frequency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentConstraintInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentConstraintInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentConstraintInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentConstraintInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentConstraintInfo>() {
           @Override
           public void write(JsonWriter out, InteligentConstraintInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentConstraintInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentConstraintInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentConstraintInfo
  * @throws IOException if the JSON string is invalid with respect to InteligentConstraintInfo
  */
  public static InteligentConstraintInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentConstraintInfo.class);
  }

 /**
  * Convert an instance of InteligentConstraintInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

