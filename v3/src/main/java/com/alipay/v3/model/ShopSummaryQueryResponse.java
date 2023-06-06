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
import com.alipay.v3.model.ShopCategoryInfo;
import com.alipay.v3.model.ShopCommentInfo;
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
 * ShopSummaryQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShopSummaryQueryResponse {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BRANCH_SHOP_NAME = "branch_shop_name";
  @SerializedName(SERIALIZED_NAME_BRANCH_SHOP_NAME)
  private String branchShopName;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_BUSINESS_TIME = "business_time";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TIME)
  private String businessTime;

  public static final String SERIALIZED_NAME_CATEGORY_INFOS = "category_infos";
  @SerializedName(SERIALIZED_NAME_CATEGORY_INFOS)
  private List<ShopCategoryInfo> categoryInfos = null;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_IS_SHOW = "is_show";
  @SerializedName(SERIALIZED_NAME_IS_SHOW)
  private String isShow;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_MAIN_IMAGE = "main_image";
  @SerializedName(SERIALIZED_NAME_MAIN_IMAGE)
  private String mainImage;

  public static final String SERIALIZED_NAME_MAIN_SHOP_NAME = "main_shop_name";
  @SerializedName(SERIALIZED_NAME_MAIN_SHOP_NAME)
  private String mainShopName;

  public static final String SERIALIZED_NAME_PER_PAY = "per_pay";
  @SerializedName(SERIALIZED_NAME_PER_PAY)
  private String perPay;

  public static final String SERIALIZED_NAME_PIC_COLL = "pic_coll";
  @SerializedName(SERIALIZED_NAME_PIC_COLL)
  private String picColl;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_SHOP_COMMENT_INFO = "shop_comment_info";
  @SerializedName(SERIALIZED_NAME_SHOP_COMMENT_INFO)
  private ShopCommentInfo shopCommentInfo;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public static final String SERIALIZED_NAME_SHOP_TYPE = "shop_type";
  @SerializedName(SERIALIZED_NAME_SHOP_TYPE)
  private String shopType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ShopSummaryQueryResponse() { 
  }

  public ShopSummaryQueryResponse address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 门店地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "万塘路18号黄龙时代广场", value = "门店地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ShopSummaryQueryResponse branchShopName(String branchShopName) {
    
    this.branchShopName = branchShopName;
    return this;
  }

   /**
   * 分店名
   * @return branchShopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "万塘路店", value = "分店名")

  public String getBranchShopName() {
    return branchShopName;
  }


  public void setBranchShopName(String branchShopName) {
    this.branchShopName = branchShopName;
  }


  public ShopSummaryQueryResponse brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名，不填写则默认为其它品牌
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "肯德基", value = "品牌名，不填写则默认为其它品牌")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public ShopSummaryQueryResponse businessTime(String businessTime) {
    
    this.businessTime = businessTime;
    return this;
  }

   /**
   * 经营时间
   * @return businessTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10:00-14:00", value = "经营时间")

  public String getBusinessTime() {
    return businessTime;
  }


  public void setBusinessTime(String businessTime) {
    this.businessTime = businessTime;
  }


  public ShopSummaryQueryResponse categoryInfos(List<ShopCategoryInfo> categoryInfos) {
    
    this.categoryInfos = categoryInfos;
    return this;
  }

  public ShopSummaryQueryResponse addCategoryInfosItem(ShopCategoryInfo categoryInfosItem) {
    if (this.categoryInfos == null) {
      this.categoryInfos = new ArrayList<>();
    }
    this.categoryInfos.add(categoryInfosItem);
    return this;
  }

   /**
   * 门店类目列表
   * @return categoryInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店类目列表")

  public List<ShopCategoryInfo> getCategoryInfos() {
    return categoryInfos;
  }


  public void setCategoryInfos(List<ShopCategoryInfo> categoryInfos) {
    this.categoryInfos = categoryInfos;
  }


  public ShopSummaryQueryResponse cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码，国标码，详见国家统计局数据 &lt;a href&#x3D;\&quot;http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip\&quot;&gt;点此下载&lt;/a&gt;
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "140500", value = "城市编码，国标码，详见国家统计局数据 <a href=\"http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip\">点此下载</a>")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public ShopSummaryQueryResponse districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 区县编码，国标码，详见国家统计局数据 &lt;a href&#x3D;\&quot;http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip\&quot;&gt;点此下载&lt;/a&gt;
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "140521", value = "区县编码，国标码，详见国家统计局数据 <a href=\"http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip\">点此下载</a>")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public ShopSummaryQueryResponse extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * json 字符串表示额外信息;    order_biz_mode: 点餐营业模式, REGULAR-正餐、LIGHT_FAST-轻快餐;  pre_order: 预点餐服务可用状态, 1-服务可用、0-服务不可用  order: 到店点餐服务可用状态：1-服务可用、0-服务不可用
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"order_biz_mode\":\"REGULAR\",\"order\":\"1\",\"pre_order\":\"1\"}", value = "json 字符串表示额外信息;    order_biz_mode: 点餐营业模式, REGULAR-正餐、LIGHT_FAST-轻快餐;  pre_order: 预点餐服务可用状态, 1-服务可用、0-服务不可用  order: 到店点餐服务可用状态：1-服务可用、0-服务不可用")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public ShopSummaryQueryResponse gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-06-23 21:15:04.593", value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public ShopSummaryQueryResponse isShow(String isShow) {
    
    this.isShow = isShow;
    return this;
  }

   /**
   * 门店是否在客户端显示，T表示显示，F表示隐藏
   * @return isShow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T", value = "门店是否在客户端显示，T表示显示，F表示隐藏")

  public String getIsShow() {
    return isShow;
  }


  public void setIsShow(String isShow) {
    this.isShow = isShow;
  }


  public ShopSummaryQueryResponse latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度，只有在query_type&#x3D;KB_PROMOTER非空
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31.226948", value = "纬度，只有在query_type=KB_PROMOTER非空")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public ShopSummaryQueryResponse longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度，只有在query_type&#x3D;KB_PROMOTER非空
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "121.549728", value = "经度，只有在query_type=KB_PROMOTER非空")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public ShopSummaryQueryResponse mainImage(String mainImage) {
    
    this.mainImage = mainImage;
    return this;
  }

   /**
   * 门店首图
   * @return mainImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AM-uJRh2SRKz9N0r9zW4wQAAACMAAQEC", value = "门店首图")

  public String getMainImage() {
    return mainImage;
  }


  public void setMainImage(String mainImage) {
    this.mainImage = mainImage;
  }


  public ShopSummaryQueryResponse mainShopName(String mainShopName) {
    
    this.mainShopName = mainShopName;
    return this;
  }

   /**
   * 主门店名
   * @return mainShopName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "海底捞", value = "主门店名")

  public String getMainShopName() {
    return mainShopName;
  }


  public void setMainShopName(String mainShopName) {
    this.mainShopName = mainShopName;
  }


  public ShopSummaryQueryResponse perPay(String perPay) {
    
    this.perPay = perPay;
    return this;
  }

   /**
   * 人均价格。单位是分。例如：2000，表示20元
   * @return perPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "人均价格。单位是分。例如：2000，表示20元")

  public String getPerPay() {
    return perPay;
  }


  public void setPerPay(String perPay) {
    this.perPay = perPay;
  }


  public ShopSummaryQueryResponse picColl(String picColl) {
    
    this.picColl = picColl;
    return this;
  }

   /**
   * 图片集，是map转化成的json串，key是图片id,value是图片url
   * @return picColl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"IUFIDASFIEUIOFKSFIUFE83IEI\":\"http://object.alipay.com/getpic.do?kjkdjkjj\"}", value = "图片集，是map转化成的json串，key是图片id,value是图片url")

  public String getPicColl() {
    return picColl;
  }


  public void setPicColl(String picColl) {
    this.picColl = picColl;
  }


  public ShopSummaryQueryResponse provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码，国标码，详见国家统计局数据 &lt;a href&#x3D;\&quot;http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip\&quot;&gt;点此下载&lt;/a&gt;
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "110000", value = "省份编码，国标码，详见国家统计局数据 <a href=\"http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip\">点此下载</a>")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public ShopSummaryQueryResponse shopCommentInfo(ShopCommentInfo shopCommentInfo) {
    
    this.shopCommentInfo = shopCommentInfo;
    return this;
  }

   /**
   * Get shopCommentInfo
   * @return shopCommentInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShopCommentInfo getShopCommentInfo() {
    return shopCommentInfo;
  }


  public void setShopCommentInfo(ShopCommentInfo shopCommentInfo) {
    this.shopCommentInfo = shopCommentInfo;
  }


  public ShopSummaryQueryResponse shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 门店ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052100077000000000120773", value = "门店ID")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public ShopSummaryQueryResponse shopType(String shopType) {
    
    this.shopType = shopType;
    return this;
  }

   /**
   * COMMON（普通门店）、MALL（商圈）
   * @return shopType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMMON", value = "COMMON（普通门店）、MALL（商圈）")

  public String getShopType() {
    return shopType;
  }


  public void setShopType(String shopType) {
    this.shopType = shopType;
  }


  public ShopSummaryQueryResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 门店状态，OPEN：营业中、PAUSE：暂停营业、FREEZE：已冻结、CLOSE:门店已关闭
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN", value = "门店状态，OPEN：营业中、PAUSE：暂停营业、FREEZE：已冻结、CLOSE:门店已关闭")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopSummaryQueryResponse shopSummaryQueryResponse = (ShopSummaryQueryResponse) o;
    return Objects.equals(this.address, shopSummaryQueryResponse.address) &&
        Objects.equals(this.branchShopName, shopSummaryQueryResponse.branchShopName) &&
        Objects.equals(this.brandName, shopSummaryQueryResponse.brandName) &&
        Objects.equals(this.businessTime, shopSummaryQueryResponse.businessTime) &&
        Objects.equals(this.categoryInfos, shopSummaryQueryResponse.categoryInfos) &&
        Objects.equals(this.cityCode, shopSummaryQueryResponse.cityCode) &&
        Objects.equals(this.districtCode, shopSummaryQueryResponse.districtCode) &&
        Objects.equals(this.extInfo, shopSummaryQueryResponse.extInfo) &&
        Objects.equals(this.gmtCreate, shopSummaryQueryResponse.gmtCreate) &&
        Objects.equals(this.isShow, shopSummaryQueryResponse.isShow) &&
        Objects.equals(this.latitude, shopSummaryQueryResponse.latitude) &&
        Objects.equals(this.longitude, shopSummaryQueryResponse.longitude) &&
        Objects.equals(this.mainImage, shopSummaryQueryResponse.mainImage) &&
        Objects.equals(this.mainShopName, shopSummaryQueryResponse.mainShopName) &&
        Objects.equals(this.perPay, shopSummaryQueryResponse.perPay) &&
        Objects.equals(this.picColl, shopSummaryQueryResponse.picColl) &&
        Objects.equals(this.provinceCode, shopSummaryQueryResponse.provinceCode) &&
        Objects.equals(this.shopCommentInfo, shopSummaryQueryResponse.shopCommentInfo) &&
        Objects.equals(this.shopId, shopSummaryQueryResponse.shopId) &&
        Objects.equals(this.shopType, shopSummaryQueryResponse.shopType) &&
        Objects.equals(this.status, shopSummaryQueryResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, branchShopName, brandName, businessTime, categoryInfos, cityCode, districtCode, extInfo, gmtCreate, isShow, latitude, longitude, mainImage, mainShopName, perPay, picColl, provinceCode, shopCommentInfo, shopId, shopType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopSummaryQueryResponse {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    branchShopName: ").append(toIndentedString(branchShopName)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    businessTime: ").append(toIndentedString(businessTime)).append("\n");
    sb.append("    categoryInfos: ").append(toIndentedString(categoryInfos)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
    sb.append("    mainShopName: ").append(toIndentedString(mainShopName)).append("\n");
    sb.append("    perPay: ").append(toIndentedString(perPay)).append("\n");
    sb.append("    picColl: ").append(toIndentedString(picColl)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    shopCommentInfo: ").append(toIndentedString(shopCommentInfo)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    shopType: ").append(toIndentedString(shopType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("branch_shop_name");
    openapiFields.add("brand_name");
    openapiFields.add("business_time");
    openapiFields.add("category_infos");
    openapiFields.add("city_code");
    openapiFields.add("district_code");
    openapiFields.add("ext_info");
    openapiFields.add("gmt_create");
    openapiFields.add("is_show");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("main_image");
    openapiFields.add("main_shop_name");
    openapiFields.add("per_pay");
    openapiFields.add("pic_coll");
    openapiFields.add("province_code");
    openapiFields.add("shop_comment_info");
    openapiFields.add("shop_id");
    openapiFields.add("shop_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShopSummaryQueryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ShopSummaryQueryResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShopSummaryQueryResponse is not found in the empty JSON string", ShopSummaryQueryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShopSummaryQueryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShopSummaryQueryResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("branch_shop_name") != null && !jsonObj.get("branch_shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch_shop_name").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("business_time") != null && !jsonObj.get("business_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_time").toString()));
      }
      JsonArray jsonArraycategoryInfos = jsonObj.getAsJsonArray("category_infos");
      if (jsonArraycategoryInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("category_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `category_infos` to be an array in the JSON string but got `%s`", jsonObj.get("category_infos").toString()));
        }

        // validate the optional field `category_infos` (array)
        for (int i = 0; i < jsonArraycategoryInfos.size(); i++) {
          ShopCategoryInfo.validateJsonObject(jsonArraycategoryInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("is_show") != null && !jsonObj.get("is_show").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `is_show` to be a primitive type in the JSON string but got `%s`", jsonObj.get("is_show").toString()));
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("main_image") != null && !jsonObj.get("main_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_image").toString()));
      }
      if (jsonObj.get("main_shop_name") != null && !jsonObj.get("main_shop_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_shop_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_shop_name").toString()));
      }
      if (jsonObj.get("per_pay") != null && !jsonObj.get("per_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `per_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("per_pay").toString()));
      }
      if (jsonObj.get("pic_coll") != null && !jsonObj.get("pic_coll").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pic_coll` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pic_coll").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      // validate the optional field `shop_comment_info`
      if (jsonObj.getAsJsonObject("shop_comment_info") != null) {
        ShopCommentInfo.validateJsonObject(jsonObj.getAsJsonObject("shop_comment_info"));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
      if (jsonObj.get("shop_type") != null && !jsonObj.get("shop_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShopSummaryQueryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShopSummaryQueryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShopSummaryQueryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShopSummaryQueryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ShopSummaryQueryResponse>() {
           @Override
           public void write(JsonWriter out, ShopSummaryQueryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShopSummaryQueryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShopSummaryQueryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShopSummaryQueryResponse
  * @throws IOException if the JSON string is invalid with respect to ShopSummaryQueryResponse
  */
  public static ShopSummaryQueryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShopSummaryQueryResponse.class);
  }

 /**
  * Convert an instance of ShopSummaryQueryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

