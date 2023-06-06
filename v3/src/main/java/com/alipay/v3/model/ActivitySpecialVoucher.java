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
 * ActivitySpecialVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivitySpecialVoucher {
  public static final String SERIALIZED_NAME_FLOOR_AMOUNT = "floor_amount";
  @SerializedName(SERIALIZED_NAME_FLOOR_AMOUNT)
  private String floorAmount;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_ORIGIN_AMOUNT = "origin_amount";
  @SerializedName(SERIALIZED_NAME_ORIGIN_AMOUNT)
  private String originAmount;

  public static final String SERIALIZED_NAME_SPECIAL_AMOUNT = "special_amount";
  @SerializedName(SERIALIZED_NAME_SPECIAL_AMOUNT)
  private String specialAmount;

  public ActivitySpecialVoucher() { 
  }

  public ActivitySpecialVoucher floorAmount(String floorAmount) {
    
    this.floorAmount = floorAmount;
    return this;
  }

   /**
   * 门槛金额。
   * @return floorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门槛金额。")

  public String getFloorAmount() {
    return floorAmount;
  }


  public void setFloorAmount(String floorAmount) {
    this.floorAmount = floorAmount;
  }


  public ActivitySpecialVoucher goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 商品名称。说明：该字段可不填，填入 origin_amount 则必填。
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品名称。说明：该字段可不填，填入 origin_amount 则必填。")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public ActivitySpecialVoucher originAmount(String originAmount) {
    
    this.originAmount = originAmount;
    return this;
  }

   /**
   * 原价。
   * @return originAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原价。")

  public String getOriginAmount() {
    return originAmount;
  }


  public void setOriginAmount(String originAmount) {
    this.originAmount = originAmount;
  }


  public ActivitySpecialVoucher specialAmount(String specialAmount) {
    
    this.specialAmount = specialAmount;
    return this;
  }

   /**
   * 特价，即：原价-特价&#x3D;优惠金额。
   * @return specialAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "特价，即：原价-特价=优惠金额。")

  public String getSpecialAmount() {
    return specialAmount;
  }


  public void setSpecialAmount(String specialAmount) {
    this.specialAmount = specialAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivitySpecialVoucher activitySpecialVoucher = (ActivitySpecialVoucher) o;
    return Objects.equals(this.floorAmount, activitySpecialVoucher.floorAmount) &&
        Objects.equals(this.goodsName, activitySpecialVoucher.goodsName) &&
        Objects.equals(this.originAmount, activitySpecialVoucher.originAmount) &&
        Objects.equals(this.specialAmount, activitySpecialVoucher.specialAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floorAmount, goodsName, originAmount, specialAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySpecialVoucher {\n");
    sb.append("    floorAmount: ").append(toIndentedString(floorAmount)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    originAmount: ").append(toIndentedString(originAmount)).append("\n");
    sb.append("    specialAmount: ").append(toIndentedString(specialAmount)).append("\n");
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
    openapiFields.add("floor_amount");
    openapiFields.add("goods_name");
    openapiFields.add("origin_amount");
    openapiFields.add("special_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivitySpecialVoucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivitySpecialVoucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivitySpecialVoucher is not found in the empty JSON string", ActivitySpecialVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivitySpecialVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivitySpecialVoucher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("floor_amount") != null && !jsonObj.get("floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("floor_amount").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("origin_amount") != null && !jsonObj.get("origin_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_amount").toString()));
      }
      if (jsonObj.get("special_amount") != null && !jsonObj.get("special_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `special_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("special_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivitySpecialVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivitySpecialVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivitySpecialVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivitySpecialVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivitySpecialVoucher>() {
           @Override
           public void write(JsonWriter out, ActivitySpecialVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivitySpecialVoucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivitySpecialVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivitySpecialVoucher
  * @throws IOException if the JSON string is invalid with respect to ActivitySpecialVoucher
  */
  public static ActivitySpecialVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivitySpecialVoucher.class);
  }

 /**
  * Convert an instance of ActivitySpecialVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

