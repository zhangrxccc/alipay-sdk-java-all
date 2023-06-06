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
import com.alipay.v3.model.JointAccountMemberRespDTO;
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
 * AlipayFundJointaccountMemberQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundJointaccountMemberQueryResponseModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_MEMBER_LIST = "member_list";
  @SerializedName(SERIALIZED_NAME_MEMBER_LIST)
  private List<JointAccountMemberRespDTO> memberList = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private String totalPageCount;

  public AlipayFundJointaccountMemberQueryResponseModel() { 
  }

  public AlipayFundJointaccountMemberQueryResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "共同账户ID")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayFundJointaccountMemberQueryResponseModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 场景码
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "场景码")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayFundJointaccountMemberQueryResponseModel memberList(List<JointAccountMemberRespDTO> memberList) {
    
    this.memberList = memberList;
    return this;
  }

  public AlipayFundJointaccountMemberQueryResponseModel addMemberListItem(JointAccountMemberRespDTO memberListItem) {
    if (this.memberList == null) {
      this.memberList = new ArrayList<>();
    }
    this.memberList.add(memberListItem);
    return this;
  }

   /**
   * 成员列表
   * @return memberList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "成员列表")

  public List<JointAccountMemberRespDTO> getMemberList() {
    return memberList;
  }


  public void setMemberList(List<JointAccountMemberRespDTO> memberList) {
    this.memberList = memberList;
  }


  public AlipayFundJointaccountMemberQueryResponseModel pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 页码
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "页码")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayFundJointaccountMemberQueryResponseModel pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页面记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "页面记录数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayFundJointaccountMemberQueryResponseModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE_PAY", value = "产品码")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayFundJointaccountMemberQueryResponseModel totalPageCount(String totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "总页数")

  public String getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(String totalPageCount) {
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
    AlipayFundJointaccountMemberQueryResponseModel alipayFundJointaccountMemberQueryResponseModel = (AlipayFundJointaccountMemberQueryResponseModel) o;
    return Objects.equals(this.accountId, alipayFundJointaccountMemberQueryResponseModel.accountId) &&
        Objects.equals(this.bizScene, alipayFundJointaccountMemberQueryResponseModel.bizScene) &&
        Objects.equals(this.memberList, alipayFundJointaccountMemberQueryResponseModel.memberList) &&
        Objects.equals(this.pageNum, alipayFundJointaccountMemberQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayFundJointaccountMemberQueryResponseModel.pageSize) &&
        Objects.equals(this.productCode, alipayFundJointaccountMemberQueryResponseModel.productCode) &&
        Objects.equals(this.totalPageCount, alipayFundJointaccountMemberQueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bizScene, memberList, pageNum, pageSize, productCode, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundJointaccountMemberQueryResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    memberList: ").append(toIndentedString(memberList)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("biz_scene");
    openapiFields.add("member_list");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("product_code");
    openapiFields.add("total_page_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundJointaccountMemberQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundJointaccountMemberQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundJointaccountMemberQueryResponseModel is not found in the empty JSON string", AlipayFundJointaccountMemberQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundJointaccountMemberQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundJointaccountMemberQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      JsonArray jsonArraymemberList = jsonObj.getAsJsonArray("member_list");
      if (jsonArraymemberList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("member_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `member_list` to be an array in the JSON string but got `%s`", jsonObj.get("member_list").toString()));
        }

        // validate the optional field `member_list` (array)
        for (int i = 0; i < jsonArraymemberList.size(); i++) {
          JointAccountMemberRespDTO.validateJsonObject(jsonArraymemberList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("total_page_count") != null && !jsonObj.get("total_page_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_page_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_page_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundJointaccountMemberQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundJointaccountMemberQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundJointaccountMemberQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundJointaccountMemberQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundJointaccountMemberQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundJointaccountMemberQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundJointaccountMemberQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundJointaccountMemberQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundJointaccountMemberQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundJointaccountMemberQueryResponseModel
  */
  public static AlipayFundJointaccountMemberQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundJointaccountMemberQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundJointaccountMemberQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

