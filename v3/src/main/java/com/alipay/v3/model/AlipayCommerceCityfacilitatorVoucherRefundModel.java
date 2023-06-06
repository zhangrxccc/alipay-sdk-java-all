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
 * AlipayCommerceCityfacilitatorVoucherRefundModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceCityfacilitatorVoucherRefundModel {
  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayCommerceCityfacilitatorVoucherRefundModel() { 
  }

  public AlipayCommerceCityfacilitatorVoucherRefundModel cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码请参考查询 &lt;a href&#x3D;\&quot;http://www.mca.gov.cn/article/sj/xzqh/\&quot;&gt;中华人民共和国行政区划代码&lt;/a&gt;。 已支持城市：广州 440100，深圳 440300，杭州330100。
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "440300", value = "城市编码请参考查询 <a href=\"http://www.mca.gov.cn/article/sj/xzqh/\">中华人民共和国行政区划代码</a>。 已支持城市：广州 440100，深圳 440300，杭州330100。")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AlipayCommerceCityfacilitatorVoucherRefundModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016031521001004390263523925", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceCityfacilitatorVoucherRefundModel alipayCommerceCityfacilitatorVoucherRefundModel = (AlipayCommerceCityfacilitatorVoucherRefundModel) o;
    return Objects.equals(this.cityCode, alipayCommerceCityfacilitatorVoucherRefundModel.cityCode) &&
        Objects.equals(this.tradeNo, alipayCommerceCityfacilitatorVoucherRefundModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityCode, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceCityfacilitatorVoucherRefundModel {\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("city_code");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceCityfacilitatorVoucherRefundModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceCityfacilitatorVoucherRefundModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceCityfacilitatorVoucherRefundModel is not found in the empty JSON string", AlipayCommerceCityfacilitatorVoucherRefundModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceCityfacilitatorVoucherRefundModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceCityfacilitatorVoucherRefundModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceCityfacilitatorVoucherRefundModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceCityfacilitatorVoucherRefundModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceCityfacilitatorVoucherRefundModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceCityfacilitatorVoucherRefundModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceCityfacilitatorVoucherRefundModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceCityfacilitatorVoucherRefundModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceCityfacilitatorVoucherRefundModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceCityfacilitatorVoucherRefundModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceCityfacilitatorVoucherRefundModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceCityfacilitatorVoucherRefundModel
  */
  public static AlipayCommerceCityfacilitatorVoucherRefundModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceCityfacilitatorVoucherRefundModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceCityfacilitatorVoucherRefundModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

