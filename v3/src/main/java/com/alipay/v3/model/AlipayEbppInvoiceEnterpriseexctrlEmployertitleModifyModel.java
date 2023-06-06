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
 * AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_TAX_REGISTER_NO = "tax_register_no";
  @SerializedName(SERIALIZED_NAME_TAX_REGISTER_NO)
  private String taxRegisterNo;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TITLE_ID = "title_id";
  @SerializedName(SERIALIZED_NAME_TITLE_ID)
  private String titleId;

  public static final String SERIALIZED_NAME_TITLE_NAME = "title_name";
  @SerializedName(SERIALIZED_NAME_TITLE_NAME)
  private String titleName;

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel() { 
  }

  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户id，与enterprise_id两者必填其一
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxx", value = "共同账户id，与enterprise_id两者必填其一")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "***省***市****区", value = "详细地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9900000000000", value = "授权签约协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel bankAccount(String bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * 开户行账号
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "622000********", value = "开户行账号")

  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * 开户行
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "******", value = "开户行")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id，与account_id两者必填其一
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxxxxx", value = "企业id，与account_id两者必填其一")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel taxRegisterNo(String taxRegisterNo) {
    
    this.taxRegisterNo = taxRegisterNo;
    return this;
  }

   /**
   * 税号
   * @return taxRegisterNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "税号")

  public String getTaxRegisterNo() {
    return taxRegisterNo;
  }


  public void setTaxRegisterNo(String taxRegisterNo) {
    this.taxRegisterNo = taxRegisterNo;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 电话
   * @return telephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0739-56*****", value = "电话")

  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel titleId(String titleId) {
    
    this.titleId = titleId;
    return this;
  }

   /**
   * 抬头ID
   * @return titleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "****", value = "抬头ID")

  public String getTitleId() {
    return titleId;
  }


  public void setTitleId(String titleId) {
    this.titleId = titleId;
  }


  public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel titleName(String titleName) {
    
    this.titleName = titleName;
    return this;
  }

   /**
   * 企业抬头名称
   * @return titleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*****有限公司", value = "企业抬头名称")

  public String getTitleName() {
    return titleName;
  }


  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel = (AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.accountId) &&
        Objects.equals(this.address, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.address) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.agreementNo) &&
        Objects.equals(this.bankAccount, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.bankAccount) &&
        Objects.equals(this.bankName, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.bankName) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.enterpriseId) &&
        Objects.equals(this.taxRegisterNo, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.taxRegisterNo) &&
        Objects.equals(this.telephone, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.telephone) &&
        Objects.equals(this.titleId, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.titleId) &&
        Objects.equals(this.titleName, alipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.titleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, address, agreementNo, bankAccount, bankName, enterpriseId, taxRegisterNo, telephone, titleId, titleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    taxRegisterNo: ").append(toIndentedString(taxRegisterNo)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
    sb.append("    titleName: ").append(toIndentedString(titleName)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("agreement_no");
    openapiFields.add("bank_account");
    openapiFields.add("bank_name");
    openapiFields.add("enterprise_id");
    openapiFields.add("tax_register_no");
    openapiFields.add("telephone");
    openapiFields.add("title_id");
    openapiFields.add("title_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel is not found in the empty JSON string", AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if (jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("tax_register_no") != null && !jsonObj.get("tax_register_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_register_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_register_no").toString()));
      }
      if (jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if (jsonObj.get("title_id") != null && !jsonObj.get("title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_id").toString()));
      }
      if (jsonObj.get("title_name") != null && !jsonObj.get("title_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel
  */
  public static AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceEnterpriseexctrlEmployertitleModifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

