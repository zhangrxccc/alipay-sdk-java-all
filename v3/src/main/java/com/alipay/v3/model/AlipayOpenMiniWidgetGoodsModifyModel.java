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
 * AlipayOpenMiniWidgetGoodsModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniWidgetGoodsModifyModel {
  public static final String SERIALIZED_NAME_BUYING_URL = "buying_url";
  @SerializedName(SERIALIZED_NAME_BUYING_URL)
  private String buyingUrl;

  public static final String SERIALIZED_NAME_GOODS_BRAND = "goods_brand";
  @SerializedName(SERIALIZED_NAME_GOODS_BRAND)
  private String goodsBrand;

  public static final String SERIALIZED_NAME_GOODS_COMMENT = "goods_comment";
  @SerializedName(SERIALIZED_NAME_GOODS_COMMENT)
  private String goodsComment;

  public static final String SERIALIZED_NAME_GOODS_DESCRIPTION_LABEL = "goods_description_label";
  @SerializedName(SERIALIZED_NAME_GOODS_DESCRIPTION_LABEL)
  private String goodsDescriptionLabel;

  public static final String SERIALIZED_NAME_GOODS_ID = "goods_id";
  @SerializedName(SERIALIZED_NAME_GOODS_ID)
  private String goodsId;

  public static final String SERIALIZED_NAME_GOODS_LABEL = "goods_label";
  @SerializedName(SERIALIZED_NAME_GOODS_LABEL)
  private String goodsLabel;

  public static final String SERIALIZED_NAME_GOODS_NAME = "goods_name";
  @SerializedName(SERIALIZED_NAME_GOODS_NAME)
  private String goodsName;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goods_type";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_MAIN_PIC_URL = "main_pic_url";
  @SerializedName(SERIALIZED_NAME_MAIN_PIC_URL)
  private String mainPicUrl;

  public static final String SERIALIZED_NAME_NEED_PUBLIC_PROMO = "need_public_promo";
  @SerializedName(SERIALIZED_NAME_NEED_PUBLIC_PROMO)
  private Boolean needPublicPromo;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "order_number";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_ORIGINAL_PRICE = "original_price";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_PRICE)
  private String originalPrice;

  public static final String SERIALIZED_NAME_PUBLISH_CITIES = "publish_cities";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CITIES)
  private String publishCities;

  public static final String SERIALIZED_NAME_SELL_PRICE = "sell_price";
  @SerializedName(SERIALIZED_NAME_SELL_PRICE)
  private String sellPrice;

  public static final String SERIALIZED_NAME_SELL_TAG_LIST = "sell_tag_list";
  @SerializedName(SERIALIZED_NAME_SELL_TAG_LIST)
  private List<String> sellTagList = null;

  public AlipayOpenMiniWidgetGoodsModifyModel() { 
  }

  public AlipayOpenMiniWidgetGoodsModifyModel buyingUrl(String buyingUrl) {
    
    this.buyingUrl = buyingUrl;
    return this;
  }

   /**
   * 需要修改的商品小程序购买链接
   * @return buyingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://platformapi/startapp?appId= 2017072607907880&page=pages/index/index?param=xxxx", value = "需要修改的商品小程序购买链接")

  public String getBuyingUrl() {
    return buyingUrl;
  }


  public void setBuyingUrl(String buyingUrl) {
    this.buyingUrl = buyingUrl;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsBrand(String goodsBrand) {
    
    this.goodsBrand = goodsBrand;
    return this;
  }

   /**
   * 需要修改的商品品牌
   * @return goodsBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基", value = "需要修改的商品品牌")

  public String getGoodsBrand() {
    return goodsBrand;
  }


  public void setGoodsBrand(String goodsBrand) {
    this.goodsBrand = goodsBrand;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsComment(String goodsComment) {
    
    this.goodsComment = goodsComment;
    return this;
  }

   /**
   * 需要修改的商品辅助说明文案
   * @return goodsComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个商品辅助说明文案", value = "需要修改的商品辅助说明文案")

  public String getGoodsComment() {
    return goodsComment;
  }


  public void setGoodsComment(String goodsComment) {
    this.goodsComment = goodsComment;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsDescriptionLabel(String goodsDescriptionLabel) {
    
    this.goodsDescriptionLabel = goodsDescriptionLabel;
    return this;
  }

   /**
   * 需要修改的商品说明标签（如-随心退）
   * @return goodsDescriptionLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "随心退", value = "需要修改的商品说明标签（如-随心退）")

  public String getGoodsDescriptionLabel() {
    return goodsDescriptionLabel;
  }


  public void setGoodsDescriptionLabel(String goodsDescriptionLabel) {
    this.goodsDescriptionLabel = goodsDescriptionLabel;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsId(String goodsId) {
    
    this.goodsId = goodsId;
    return this;
  }

   /**
   * 商品的唯一标识，根据该字段修改商品
   * @return goodsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8948968498", value = "商品的唯一标识，根据该字段修改商品")

  public String getGoodsId() {
    return goodsId;
  }


  public void setGoodsId(String goodsId) {
    this.goodsId = goodsId;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsLabel(String goodsLabel) {
    
    this.goodsLabel = goodsLabel;
    return this;
  }

   /**
   * 需要修改的商品营销标签（如-限量特价），每个商品仅支持一个营销标签
   * @return goodsLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "限量特价", value = "需要修改的商品营销标签（如-限量特价），每个商品仅支持一个营销标签")

  public String getGoodsLabel() {
    return goodsLabel;
  }


  public void setGoodsLabel(String goodsLabel) {
    this.goodsLabel = goodsLabel;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsName(String goodsName) {
    
    this.goodsName = goodsName;
    return this;
  }

   /**
   * 需要修改的商品名称
   * @return goodsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是一个商品名称", value = "需要修改的商品名称")

  public String getGoodsName() {
    return goodsName;
  }


  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * 需要修改的商品所属品类
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "服装", value = "需要修改的商品所属品类")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel mainPicUrl(String mainPicUrl) {
    
    this.mainPicUrl = mainPicUrl;
    return this;
  }

   /**
   * 需要修改的商品主图片地址
   * @return mainPicUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxx.xxx.com/xxx.jpg", value = "需要修改的商品主图片地址")

  public String getMainPicUrl() {
    return mainPicUrl;
  }


  public void setMainPicUrl(String mainPicUrl) {
    this.mainPicUrl = mainPicUrl;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel needPublicPromo(Boolean needPublicPromo) {
    
    this.needPublicPromo = needPublicPromo;
    return this;
  }

   /**
   * 是否需要进行公域推广
   * @return needPublicPromo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否需要进行公域推广")

  public Boolean getNeedPublicPromo() {
    return needPublicPromo;
  }


  public void setNeedPublicPromo(Boolean needPublicPromo) {
    this.needPublicPromo = needPublicPromo;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * 需要修改的商品排序，自然整数, 数字越小越靠前
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "需要修改的商品排序，自然整数, 数字越小越靠前")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel originalPrice(String originalPrice) {
    
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * 需要修改的商品原价，单位\&quot;元\&quot;，传入数字，不需要传入\&quot;元\&quot;
   * @return originalPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.88", value = "需要修改的商品原价，单位\"元\"，传入数字，不需要传入\"元\"")

  public String getOriginalPrice() {
    return originalPrice;
  }


  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel publishCities(String publishCities) {
    
    this.publishCities = publishCities;
    return this;
  }

   /**
   * 需要修改的商品投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入
   * @return publishCities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110000", value = "需要修改的商品投放城市的列表，详见https://www.mca.gov.cn/article/sj/xzqh/2020/2020/202007170301.html，有多个用英文,分隔。如果没有限制则不传入")

  public String getPublishCities() {
    return publishCities;
  }


  public void setPublishCities(String publishCities) {
    this.publishCities = publishCities;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel sellPrice(String sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * 需要修改的商品售价，位\&quot;元\&quot;，传入数字，不需要传入\&quot;元\&quot;
   * @return sellPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "66.66", value = "需要修改的商品售价，位\"元\"，传入数字，不需要传入\"元\"")

  public String getSellPrice() {
    return sellPrice;
  }


  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }


  public AlipayOpenMiniWidgetGoodsModifyModel sellTagList(List<String> sellTagList) {
    
    this.sellTagList = sellTagList;
    return this;
  }

  public AlipayOpenMiniWidgetGoodsModifyModel addSellTagListItem(String sellTagListItem) {
    if (this.sellTagList == null) {
      this.sellTagList = new ArrayList<>();
    }
    this.sellTagList.add(sellTagListItem);
    return this;
  }

   /**
   * 需要修改的商品卖点标签
   * @return sellTagList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"特惠\",\"热卖\"]", value = "需要修改的商品卖点标签")

  public List<String> getSellTagList() {
    return sellTagList;
  }


  public void setSellTagList(List<String> sellTagList) {
    this.sellTagList = sellTagList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel = (AlipayOpenMiniWidgetGoodsModifyModel) o;
    return Objects.equals(this.buyingUrl, alipayOpenMiniWidgetGoodsModifyModel.buyingUrl) &&
        Objects.equals(this.goodsBrand, alipayOpenMiniWidgetGoodsModifyModel.goodsBrand) &&
        Objects.equals(this.goodsComment, alipayOpenMiniWidgetGoodsModifyModel.goodsComment) &&
        Objects.equals(this.goodsDescriptionLabel, alipayOpenMiniWidgetGoodsModifyModel.goodsDescriptionLabel) &&
        Objects.equals(this.goodsId, alipayOpenMiniWidgetGoodsModifyModel.goodsId) &&
        Objects.equals(this.goodsLabel, alipayOpenMiniWidgetGoodsModifyModel.goodsLabel) &&
        Objects.equals(this.goodsName, alipayOpenMiniWidgetGoodsModifyModel.goodsName) &&
        Objects.equals(this.goodsType, alipayOpenMiniWidgetGoodsModifyModel.goodsType) &&
        Objects.equals(this.mainPicUrl, alipayOpenMiniWidgetGoodsModifyModel.mainPicUrl) &&
        Objects.equals(this.needPublicPromo, alipayOpenMiniWidgetGoodsModifyModel.needPublicPromo) &&
        Objects.equals(this.orderNumber, alipayOpenMiniWidgetGoodsModifyModel.orderNumber) &&
        Objects.equals(this.originalPrice, alipayOpenMiniWidgetGoodsModifyModel.originalPrice) &&
        Objects.equals(this.publishCities, alipayOpenMiniWidgetGoodsModifyModel.publishCities) &&
        Objects.equals(this.sellPrice, alipayOpenMiniWidgetGoodsModifyModel.sellPrice) &&
        Objects.equals(this.sellTagList, alipayOpenMiniWidgetGoodsModifyModel.sellTagList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyingUrl, goodsBrand, goodsComment, goodsDescriptionLabel, goodsId, goodsLabel, goodsName, goodsType, mainPicUrl, needPublicPromo, orderNumber, originalPrice, publishCities, sellPrice, sellTagList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniWidgetGoodsModifyModel {\n");
    sb.append("    buyingUrl: ").append(toIndentedString(buyingUrl)).append("\n");
    sb.append("    goodsBrand: ").append(toIndentedString(goodsBrand)).append("\n");
    sb.append("    goodsComment: ").append(toIndentedString(goodsComment)).append("\n");
    sb.append("    goodsDescriptionLabel: ").append(toIndentedString(goodsDescriptionLabel)).append("\n");
    sb.append("    goodsId: ").append(toIndentedString(goodsId)).append("\n");
    sb.append("    goodsLabel: ").append(toIndentedString(goodsLabel)).append("\n");
    sb.append("    goodsName: ").append(toIndentedString(goodsName)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    mainPicUrl: ").append(toIndentedString(mainPicUrl)).append("\n");
    sb.append("    needPublicPromo: ").append(toIndentedString(needPublicPromo)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    publishCities: ").append(toIndentedString(publishCities)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    sellTagList: ").append(toIndentedString(sellTagList)).append("\n");
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
    openapiFields.add("buying_url");
    openapiFields.add("goods_brand");
    openapiFields.add("goods_comment");
    openapiFields.add("goods_description_label");
    openapiFields.add("goods_id");
    openapiFields.add("goods_label");
    openapiFields.add("goods_name");
    openapiFields.add("goods_type");
    openapiFields.add("main_pic_url");
    openapiFields.add("need_public_promo");
    openapiFields.add("order_number");
    openapiFields.add("original_price");
    openapiFields.add("publish_cities");
    openapiFields.add("sell_price");
    openapiFields.add("sell_tag_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniWidgetGoodsModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniWidgetGoodsModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniWidgetGoodsModifyModel is not found in the empty JSON string", AlipayOpenMiniWidgetGoodsModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniWidgetGoodsModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniWidgetGoodsModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("buying_url") != null && !jsonObj.get("buying_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buying_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buying_url").toString()));
      }
      if (jsonObj.get("goods_brand") != null && !jsonObj.get("goods_brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_brand").toString()));
      }
      if (jsonObj.get("goods_comment") != null && !jsonObj.get("goods_comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_comment").toString()));
      }
      if (jsonObj.get("goods_description_label") != null && !jsonObj.get("goods_description_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_description_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_description_label").toString()));
      }
      if (jsonObj.get("goods_id") != null && !jsonObj.get("goods_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_id").toString()));
      }
      if (jsonObj.get("goods_label") != null && !jsonObj.get("goods_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_label").toString()));
      }
      if (jsonObj.get("goods_name") != null && !jsonObj.get("goods_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_name").toString()));
      }
      if (jsonObj.get("goods_type") != null && !jsonObj.get("goods_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goods_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goods_type").toString()));
      }
      if (jsonObj.get("main_pic_url") != null && !jsonObj.get("main_pic_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_pic_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_pic_url").toString()));
      }
      if (jsonObj.get("original_price") != null && !jsonObj.get("original_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_price").toString()));
      }
      if (jsonObj.get("publish_cities") != null && !jsonObj.get("publish_cities").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_cities` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_cities").toString()));
      }
      if (jsonObj.get("sell_price") != null && !jsonObj.get("sell_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sell_price").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("sell_tag_list") != null && !jsonObj.get("sell_tag_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sell_tag_list` to be an array in the JSON string but got `%s`", jsonObj.get("sell_tag_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniWidgetGoodsModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniWidgetGoodsModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniWidgetGoodsModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniWidgetGoodsModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniWidgetGoodsModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniWidgetGoodsModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniWidgetGoodsModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniWidgetGoodsModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniWidgetGoodsModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniWidgetGoodsModifyModel
  */
  public static AlipayOpenMiniWidgetGoodsModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniWidgetGoodsModifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniWidgetGoodsModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

