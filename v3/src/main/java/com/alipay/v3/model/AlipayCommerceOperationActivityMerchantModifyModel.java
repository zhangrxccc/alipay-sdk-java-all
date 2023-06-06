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
 * AlipayCommerceOperationActivityMerchantModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceOperationActivityMerchantModifyModel {
  public static final String SERIALIZED_NAME_CONSUMPTION_THRESHOLD = "consumption_threshold";
  @SerializedName(SERIALIZED_NAME_CONSUMPTION_THRESHOLD)
  private Integer consumptionThreshold;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AlipayCommerceOperationActivityMerchantModifyModel() { 
  }

  public AlipayCommerceOperationActivityMerchantModifyModel consumptionThreshold(Integer consumptionThreshold) {
    
    this.consumptionThreshold = consumptionThreshold;
    return this;
  }

   /**
   * 消费门槛，单位分
   * @return consumptionThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "消费门槛，单位分")

  public Integer getConsumptionThreshold() {
    return consumptionThreshold;
  }


  public void setConsumptionThreshold(Integer consumptionThreshold) {
    this.consumptionThreshold = consumptionThreshold;
  }


  public AlipayCommerceOperationActivityMerchantModifyModel discountAmount(Integer discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额，单位分
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "优惠金额，单位分")

  public Integer getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }


  public AlipayCommerceOperationActivityMerchantModifyModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * NORMAL 常规类型，不限制, RESTRICTED 限制报名条件
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NORMAL", value = "NORMAL 常规类型，不限制, RESTRICTED 限制报名条件")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceOperationActivityMerchantModifyModel alipayCommerceOperationActivityMerchantModifyModel = (AlipayCommerceOperationActivityMerchantModifyModel) o;
    return Objects.equals(this.consumptionThreshold, alipayCommerceOperationActivityMerchantModifyModel.consumptionThreshold) &&
        Objects.equals(this.discountAmount, alipayCommerceOperationActivityMerchantModifyModel.discountAmount) &&
        Objects.equals(this.type, alipayCommerceOperationActivityMerchantModifyModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumptionThreshold, discountAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceOperationActivityMerchantModifyModel {\n");
    sb.append("    consumptionThreshold: ").append(toIndentedString(consumptionThreshold)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("consumption_threshold");
    openapiFields.add("discount_amount");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceOperationActivityMerchantModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceOperationActivityMerchantModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceOperationActivityMerchantModifyModel is not found in the empty JSON string", AlipayCommerceOperationActivityMerchantModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceOperationActivityMerchantModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceOperationActivityMerchantModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceOperationActivityMerchantModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceOperationActivityMerchantModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceOperationActivityMerchantModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceOperationActivityMerchantModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceOperationActivityMerchantModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceOperationActivityMerchantModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceOperationActivityMerchantModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceOperationActivityMerchantModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceOperationActivityMerchantModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceOperationActivityMerchantModifyModel
  */
  public static AlipayCommerceOperationActivityMerchantModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceOperationActivityMerchantModifyModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceOperationActivityMerchantModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

