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
import com.alipay.v3.model.InvoiceItemContent;
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
 * AlipayEbppInvoiceDetailOutputQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceDetailOutputQueryResponseModel {
  public static final String SERIALIZED_NAME_ANTI_FAKE_CODE = "anti_fake_code";
  @SerializedName(SERIALIZED_NAME_ANTI_FAKE_CODE)
  private String antiFakeCode;

  public static final String SERIALIZED_NAME_EX_TAX_AMOUNT = "ex_tax_amount";
  @SerializedName(SERIALIZED_NAME_EX_TAX_AMOUNT)
  private String exTaxAmount;

  public static final String SERIALIZED_NAME_EXPENSE_STATUS = "expense_status";
  @SerializedName(SERIALIZED_NAME_EXPENSE_STATUS)
  private String expenseStatus;

  public static final String SERIALIZED_NAME_HAS_RISK = "has_risk";
  @SerializedName(SERIALIZED_NAME_HAS_RISK)
  private Boolean hasRisk;

  public static final String SERIALIZED_NAME_HAS_UPLOAD_PDF = "has_upload_pdf";
  @SerializedName(SERIALIZED_NAME_HAS_UPLOAD_PDF)
  private String hasUploadPdf;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private String invoiceAmount;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_IMG_URL = "invoice_img_url";
  @SerializedName(SERIALIZED_NAME_INVOICE_IMG_URL)
  private String invoiceImgUrl;

  public static final String SERIALIZED_NAME_INVOICE_ITEM_CONTENT_LIST = "invoice_item_content_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_ITEM_CONTENT_LIST)
  private List<InvoiceItemContent> invoiceItemContentList = null;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private String invoiceStatus;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private String invoiceType;

  public static final String SERIALIZED_NAME_PAYEE_ADDRESS = "payee_address";
  @SerializedName(SERIALIZED_NAME_PAYEE_ADDRESS)
  private String payeeAddress;

  public static final String SERIALIZED_NAME_PAYEE_BANK_ACCOUNT = "payee_bank_account";
  @SerializedName(SERIALIZED_NAME_PAYEE_BANK_ACCOUNT)
  private String payeeBankAccount;

  public static final String SERIALIZED_NAME_PAYEE_BANK_NAME = "payee_bank_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_BANK_NAME)
  private String payeeBankName;

  public static final String SERIALIZED_NAME_PAYEE_PHONE = "payee_phone";
  @SerializedName(SERIALIZED_NAME_PAYEE_PHONE)
  private String payeePhone;

  public static final String SERIALIZED_NAME_PAYEE_REGISTER_NAME = "payee_register_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_REGISTER_NAME)
  private String payeeRegisterName;

  public static final String SERIALIZED_NAME_PAYEE_TAX_NO = "payee_tax_no";
  @SerializedName(SERIALIZED_NAME_PAYEE_TAX_NO)
  private String payeeTaxNo;

  public static final String SERIALIZED_NAME_PAYER_ADDRESS = "payer_address";
  @SerializedName(SERIALIZED_NAME_PAYER_ADDRESS)
  private String payerAddress;

  public static final String SERIALIZED_NAME_PAYER_BANK_ACCOUNT = "payer_bank_account";
  @SerializedName(SERIALIZED_NAME_PAYER_BANK_ACCOUNT)
  private String payerBankAccount;

  public static final String SERIALIZED_NAME_PAYER_BANK_NAME = "payer_bank_name";
  @SerializedName(SERIALIZED_NAME_PAYER_BANK_NAME)
  private String payerBankName;

  public static final String SERIALIZED_NAME_PAYER_NAME = "payer_name";
  @SerializedName(SERIALIZED_NAME_PAYER_NAME)
  private String payerName;

  public static final String SERIALIZED_NAME_PAYER_PHONE = "payer_phone";
  @SerializedName(SERIALIZED_NAME_PAYER_PHONE)
  private String payerPhone;

  public static final String SERIALIZED_NAME_PAYER_TAX_NO = "payer_tax_no";
  @SerializedName(SERIALIZED_NAME_PAYER_TAX_NO)
  private String payerTaxNo;

  public static final String SERIALIZED_NAME_SUM_TAX_AMOUNT = "sum_tax_amount";
  @SerializedName(SERIALIZED_NAME_SUM_TAX_AMOUNT)
  private String sumTaxAmount;

  public static final String SERIALIZED_NAME_TAX_TYPE = "tax_type";
  @SerializedName(SERIALIZED_NAME_TAX_TYPE)
  private String taxType;

  public AlipayEbppInvoiceDetailOutputQueryResponseModel() { 
  }

  public AlipayEbppInvoiceDetailOutputQueryResponseModel antiFakeCode(String antiFakeCode) {
    
    this.antiFakeCode = antiFakeCode;
    return this;
  }

   /**
   * 防伪码，发票校验码
   * @return antiFakeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14345678908765433456", value = "防伪码，发票校验码")

  public String getAntiFakeCode() {
    return antiFakeCode;
  }


  public void setAntiFakeCode(String antiFakeCode) {
    this.antiFakeCode = antiFakeCode;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel exTaxAmount(String exTaxAmount) {
    
    this.exTaxAmount = exTaxAmount;
    return this;
  }

   /**
   * 不含税金额（废弃）
   * @return exTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "85.00", value = "不含税金额（废弃）")

  public String getExTaxAmount() {
    return exTaxAmount;
  }


  public void setExTaxAmount(String exTaxAmount) {
    this.exTaxAmount = exTaxAmount;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel expenseStatus(String expenseStatus) {
    
    this.expenseStatus = expenseStatus;
    return this;
  }

   /**
   * 发票报销状态  取值范围：  WAIT_EXPENSE－未报销  EXPENSE_PROCESSING－报销中  EXPENSE_FINISHED－已报销
   * @return expenseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAIT_APPLY", value = "发票报销状态  取值范围：  WAIT_EXPENSE－未报销  EXPENSE_PROCESSING－报销中  EXPENSE_FINISHED－已报销")

  public String getExpenseStatus() {
    return expenseStatus;
  }


  public void setExpenseStatus(String expenseStatus) {
    this.expenseStatus = expenseStatus;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel hasRisk(Boolean hasRisk) {
    
    this.hasRisk = hasRisk;
    return this;
  }

   /**
   * 该发票可能存在异常，请核实后使用  true:无异常  false:存在异常
   * @return hasRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "该发票可能存在异常，请核实后使用  true:无异常  false:存在异常")

  public Boolean getHasRisk() {
    return hasRisk;
  }


  public void setHasRisk(Boolean hasRisk) {
    this.hasRisk = hasRisk;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel hasUploadPdf(String hasUploadPdf) {
    
    this.hasUploadPdf = hasUploadPdf;
    return this;
  }

   /**
   * 是否已上传发票pdf文件  false－未上传  true－已上传
   * @return hasUploadPdf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否已上传发票pdf文件  false－未上传  true－已上传")

  public String getHasUploadPdf() {
    return hasUploadPdf;
  }


  public void setHasUploadPdf(String hasUploadPdf) {
    this.hasUploadPdf = hasUploadPdf;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceAmount(String invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 发票金额（价税合计金额）
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "发票金额（价税合计金额）")

  public String getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(String invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码 （全电票为空）
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "发票代码 （全电票为空）")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * 开票日期
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-07-10", value = "开票日期")

  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceImgUrl(String invoiceImgUrl) {
    
    this.invoiceImgUrl = invoiceImgUrl;
    return this;
  }

   /**
   * 发票缩略图地址
   * @return invoiceImgUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://img.test.com", value = "发票缩略图地址")

  public String getInvoiceImgUrl() {
    return invoiceImgUrl;
  }


  public void setInvoiceImgUrl(String invoiceImgUrl) {
    this.invoiceImgUrl = invoiceImgUrl;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceItemContentList(List<InvoiceItemContent> invoiceItemContentList) {
    
    this.invoiceItemContentList = invoiceItemContentList;
    return this;
  }

  public AlipayEbppInvoiceDetailOutputQueryResponseModel addInvoiceItemContentListItem(InvoiceItemContent invoiceItemContentListItem) {
    if (this.invoiceItemContentList == null) {
      this.invoiceItemContentList = new ArrayList<>();
    }
    this.invoiceItemContentList.add(invoiceItemContentListItem);
    return this;
  }

   /**
   * 发票内容项
   * @return invoiceItemContentList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票内容项")

  public List<InvoiceItemContent> getInvoiceItemContentList() {
    return invoiceItemContentList;
  }


  public void setInvoiceItemContentList(List<InvoiceItemContent> invoiceItemContentList) {
    this.invoiceItemContentList = invoiceItemContentList;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "发票号码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceStatus(String invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * 发票状态  SUCCEED－成功  EXPIRED－已失效  TRANSFERRED－已转交
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCEED", value = "发票状态  SUCCEED－成功  EXPIRED－已失效  TRANSFERRED－已转交")

  public String getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel invoiceType(String invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * 发票类型  值有两种情况：blue－蓝票 red－红票
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "blue", value = "发票类型  值有两种情况：blue－蓝票 red－红票")

  public String getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payeeAddress(String payeeAddress) {
    
    this.payeeAddress = payeeAddress;
    return this;
  }

   /**
   * 销售方地址
   * @return payeeAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江杭州万塘路18号", value = "销售方地址")

  public String getPayeeAddress() {
    return payeeAddress;
  }


  public void setPayeeAddress(String payeeAddress) {
    this.payeeAddress = payeeAddress;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payeeBankAccount(String payeeBankAccount) {
    
    this.payeeBankAccount = payeeBankAccount;
    return this;
  }

   /**
   * 销售方开户银行账号
   * @return payeeBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "销售方开户银行账号")

  public String getPayeeBankAccount() {
    return payeeBankAccount;
  }


  public void setPayeeBankAccount(String payeeBankAccount) {
    this.payeeBankAccount = payeeBankAccount;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payeeBankName(String payeeBankName) {
    
    this.payeeBankName = payeeBankName;
    return this;
  }

   /**
   * 销售方开户银行名称
   * @return payeeBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "建设银行", value = "销售方开户银行名称")

  public String getPayeeBankName() {
    return payeeBankName;
  }


  public void setPayeeBankName(String payeeBankName) {
    this.payeeBankName = payeeBankName;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payeePhone(String payeePhone) {
    
    this.payeePhone = payeePhone;
    return this;
  }

   /**
   * 销售方电话
   * @return payeePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "012-0000000", value = "销售方电话")

  public String getPayeePhone() {
    return payeePhone;
  }


  public void setPayeePhone(String payeePhone) {
    this.payeePhone = payeePhone;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payeeRegisterName(String payeeRegisterName) {
    
    this.payeeRegisterName = payeeRegisterName;
    return this;
  }

   /**
   * 销售方名称
   * @return payeeRegisterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "国力大酒店", value = "销售方名称")

  public String getPayeeRegisterName() {
    return payeeRegisterName;
  }


  public void setPayeeRegisterName(String payeeRegisterName) {
    this.payeeRegisterName = payeeRegisterName;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payeeTaxNo(String payeeTaxNo) {
    
    this.payeeTaxNo = payeeTaxNo;
    return this;
  }

   /**
   * 销售方税号
   * @return payeeTaxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "销售方税号")

  public String getPayeeTaxNo() {
    return payeeTaxNo;
  }


  public void setPayeeTaxNo(String payeeTaxNo) {
    this.payeeTaxNo = payeeTaxNo;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payerAddress(String payerAddress) {
    
    this.payerAddress = payerAddress;
    return this;
  }

   /**
   * 购买方地址
   * @return payerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江杭州西湖区天目山路222号", value = "购买方地址")

  public String getPayerAddress() {
    return payerAddress;
  }


  public void setPayerAddress(String payerAddress) {
    this.payerAddress = payerAddress;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payerBankAccount(String payerBankAccount) {
    
    this.payerBankAccount = payerBankAccount;
    return this;
  }

   /**
   * 购买方开户银行账号
   * @return payerBankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123556", value = "购买方开户银行账号")

  public String getPayerBankAccount() {
    return payerBankAccount;
  }


  public void setPayerBankAccount(String payerBankAccount) {
    this.payerBankAccount = payerBankAccount;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payerBankName(String payerBankName) {
    
    this.payerBankName = payerBankName;
    return this;
  }

   /**
   * 购买方开户银行名称
   * @return payerBankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "招商银行", value = "购买方开户银行名称")

  public String getPayerBankName() {
    return payerBankName;
  }


  public void setPayerBankName(String payerBankName) {
    this.payerBankName = payerBankName;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payerName(String payerName) {
    
    this.payerName = payerName;
    return this;
  }

   /**
   * 购买方名称
   * @return payerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝（中国）技术有限公司", value = "购买方名称")

  public String getPayerName() {
    return payerName;
  }


  public void setPayerName(String payerName) {
    this.payerName = payerName;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payerPhone(String payerPhone) {
    
    this.payerPhone = payerPhone;
    return this;
  }

   /**
   * 购买方电话
   * @return payerPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1893445555555", value = "购买方电话")

  public String getPayerPhone() {
    return payerPhone;
  }


  public void setPayerPhone(String payerPhone) {
    this.payerPhone = payerPhone;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel payerTaxNo(String payerTaxNo) {
    
    this.payerTaxNo = payerTaxNo;
    return this;
  }

   /**
   * 购买方税号
   * @return payerTaxNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "购买方税号")

  public String getPayerTaxNo() {
    return payerTaxNo;
  }


  public void setPayerTaxNo(String payerTaxNo) {
    this.payerTaxNo = payerTaxNo;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel sumTaxAmount(String sumTaxAmount) {
    
    this.sumTaxAmount = sumTaxAmount;
    return this;
  }

   /**
   * 合计税额（废弃）
   * @return sumTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15.00", value = "合计税额（废弃）")

  public String getSumTaxAmount() {
    return sumTaxAmount;
  }


  public void setSumTaxAmount(String sumTaxAmount) {
    this.sumTaxAmount = sumTaxAmount;
  }


  public AlipayEbppInvoiceDetailOutputQueryResponseModel taxType(String taxType) {
    
    this.taxType = taxType;
    return this;
  }

   /**
   * 票种 PLAIN：增值税电子普通发票 SPECIAL：增值税专用发票 ALL_ELECTRONIC_GENERAL：电子发票（普通发票） ALL_ELECTRONIC_SPECIAL：电子发票（增值税专用发票） PLAIN_INVOICE:增值税普通发票 PAPER_INVOICE:增值税普通发票（卷式） SALSE_INVOICE:机动车销售统一发票
   * @return taxType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PLAIN", value = "票种 PLAIN：增值税电子普通发票 SPECIAL：增值税专用发票 ALL_ELECTRONIC_GENERAL：电子发票（普通发票） ALL_ELECTRONIC_SPECIAL：电子发票（增值税专用发票） PLAIN_INVOICE:增值税普通发票 PAPER_INVOICE:增值税普通发票（卷式） SALSE_INVOICE:机动车销售统一发票")

  public String getTaxType() {
    return taxType;
  }


  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceDetailOutputQueryResponseModel alipayEbppInvoiceDetailOutputQueryResponseModel = (AlipayEbppInvoiceDetailOutputQueryResponseModel) o;
    return Objects.equals(this.antiFakeCode, alipayEbppInvoiceDetailOutputQueryResponseModel.antiFakeCode) &&
        Objects.equals(this.exTaxAmount, alipayEbppInvoiceDetailOutputQueryResponseModel.exTaxAmount) &&
        Objects.equals(this.expenseStatus, alipayEbppInvoiceDetailOutputQueryResponseModel.expenseStatus) &&
        Objects.equals(this.hasRisk, alipayEbppInvoiceDetailOutputQueryResponseModel.hasRisk) &&
        Objects.equals(this.hasUploadPdf, alipayEbppInvoiceDetailOutputQueryResponseModel.hasUploadPdf) &&
        Objects.equals(this.invoiceAmount, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceAmount) &&
        Objects.equals(this.invoiceCode, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceCode) &&
        Objects.equals(this.invoiceDate, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceDate) &&
        Objects.equals(this.invoiceImgUrl, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceImgUrl) &&
        Objects.equals(this.invoiceItemContentList, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceItemContentList) &&
        Objects.equals(this.invoiceNo, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceNo) &&
        Objects.equals(this.invoiceStatus, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceStatus) &&
        Objects.equals(this.invoiceType, alipayEbppInvoiceDetailOutputQueryResponseModel.invoiceType) &&
        Objects.equals(this.payeeAddress, alipayEbppInvoiceDetailOutputQueryResponseModel.payeeAddress) &&
        Objects.equals(this.payeeBankAccount, alipayEbppInvoiceDetailOutputQueryResponseModel.payeeBankAccount) &&
        Objects.equals(this.payeeBankName, alipayEbppInvoiceDetailOutputQueryResponseModel.payeeBankName) &&
        Objects.equals(this.payeePhone, alipayEbppInvoiceDetailOutputQueryResponseModel.payeePhone) &&
        Objects.equals(this.payeeRegisterName, alipayEbppInvoiceDetailOutputQueryResponseModel.payeeRegisterName) &&
        Objects.equals(this.payeeTaxNo, alipayEbppInvoiceDetailOutputQueryResponseModel.payeeTaxNo) &&
        Objects.equals(this.payerAddress, alipayEbppInvoiceDetailOutputQueryResponseModel.payerAddress) &&
        Objects.equals(this.payerBankAccount, alipayEbppInvoiceDetailOutputQueryResponseModel.payerBankAccount) &&
        Objects.equals(this.payerBankName, alipayEbppInvoiceDetailOutputQueryResponseModel.payerBankName) &&
        Objects.equals(this.payerName, alipayEbppInvoiceDetailOutputQueryResponseModel.payerName) &&
        Objects.equals(this.payerPhone, alipayEbppInvoiceDetailOutputQueryResponseModel.payerPhone) &&
        Objects.equals(this.payerTaxNo, alipayEbppInvoiceDetailOutputQueryResponseModel.payerTaxNo) &&
        Objects.equals(this.sumTaxAmount, alipayEbppInvoiceDetailOutputQueryResponseModel.sumTaxAmount) &&
        Objects.equals(this.taxType, alipayEbppInvoiceDetailOutputQueryResponseModel.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiFakeCode, exTaxAmount, expenseStatus, hasRisk, hasUploadPdf, invoiceAmount, invoiceCode, invoiceDate, invoiceImgUrl, invoiceItemContentList, invoiceNo, invoiceStatus, invoiceType, payeeAddress, payeeBankAccount, payeeBankName, payeePhone, payeeRegisterName, payeeTaxNo, payerAddress, payerBankAccount, payerBankName, payerName, payerPhone, payerTaxNo, sumTaxAmount, taxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceDetailOutputQueryResponseModel {\n");
    sb.append("    antiFakeCode: ").append(toIndentedString(antiFakeCode)).append("\n");
    sb.append("    exTaxAmount: ").append(toIndentedString(exTaxAmount)).append("\n");
    sb.append("    expenseStatus: ").append(toIndentedString(expenseStatus)).append("\n");
    sb.append("    hasRisk: ").append(toIndentedString(hasRisk)).append("\n");
    sb.append("    hasUploadPdf: ").append(toIndentedString(hasUploadPdf)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceImgUrl: ").append(toIndentedString(invoiceImgUrl)).append("\n");
    sb.append("    invoiceItemContentList: ").append(toIndentedString(invoiceItemContentList)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    payeeAddress: ").append(toIndentedString(payeeAddress)).append("\n");
    sb.append("    payeeBankAccount: ").append(toIndentedString(payeeBankAccount)).append("\n");
    sb.append("    payeeBankName: ").append(toIndentedString(payeeBankName)).append("\n");
    sb.append("    payeePhone: ").append(toIndentedString(payeePhone)).append("\n");
    sb.append("    payeeRegisterName: ").append(toIndentedString(payeeRegisterName)).append("\n");
    sb.append("    payeeTaxNo: ").append(toIndentedString(payeeTaxNo)).append("\n");
    sb.append("    payerAddress: ").append(toIndentedString(payerAddress)).append("\n");
    sb.append("    payerBankAccount: ").append(toIndentedString(payerBankAccount)).append("\n");
    sb.append("    payerBankName: ").append(toIndentedString(payerBankName)).append("\n");
    sb.append("    payerName: ").append(toIndentedString(payerName)).append("\n");
    sb.append("    payerPhone: ").append(toIndentedString(payerPhone)).append("\n");
    sb.append("    payerTaxNo: ").append(toIndentedString(payerTaxNo)).append("\n");
    sb.append("    sumTaxAmount: ").append(toIndentedString(sumTaxAmount)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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
    openapiFields.add("anti_fake_code");
    openapiFields.add("ex_tax_amount");
    openapiFields.add("expense_status");
    openapiFields.add("has_risk");
    openapiFields.add("has_upload_pdf");
    openapiFields.add("invoice_amount");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_date");
    openapiFields.add("invoice_img_url");
    openapiFields.add("invoice_item_content_list");
    openapiFields.add("invoice_no");
    openapiFields.add("invoice_status");
    openapiFields.add("invoice_type");
    openapiFields.add("payee_address");
    openapiFields.add("payee_bank_account");
    openapiFields.add("payee_bank_name");
    openapiFields.add("payee_phone");
    openapiFields.add("payee_register_name");
    openapiFields.add("payee_tax_no");
    openapiFields.add("payer_address");
    openapiFields.add("payer_bank_account");
    openapiFields.add("payer_bank_name");
    openapiFields.add("payer_name");
    openapiFields.add("payer_phone");
    openapiFields.add("payer_tax_no");
    openapiFields.add("sum_tax_amount");
    openapiFields.add("tax_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceDetailOutputQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceDetailOutputQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceDetailOutputQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceDetailOutputQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceDetailOutputQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceDetailOutputQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("anti_fake_code") != null && !jsonObj.get("anti_fake_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anti_fake_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anti_fake_code").toString()));
      }
      if (jsonObj.get("ex_tax_amount") != null && !jsonObj.get("ex_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ex_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ex_tax_amount").toString()));
      }
      if (jsonObj.get("expense_status") != null && !jsonObj.get("expense_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expense_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expense_status").toString()));
      }
      if (jsonObj.get("has_upload_pdf") != null && !jsonObj.get("has_upload_pdf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_upload_pdf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_upload_pdf").toString()));
      }
      if (jsonObj.get("invoice_amount") != null && !jsonObj.get("invoice_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_amount").toString()));
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      if (jsonObj.get("invoice_date") != null && !jsonObj.get("invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_date").toString()));
      }
      if (jsonObj.get("invoice_img_url") != null && !jsonObj.get("invoice_img_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_img_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_img_url").toString()));
      }
      JsonArray jsonArrayinvoiceItemContentList = jsonObj.getAsJsonArray("invoice_item_content_list");
      if (jsonArrayinvoiceItemContentList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("invoice_item_content_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `invoice_item_content_list` to be an array in the JSON string but got `%s`", jsonObj.get("invoice_item_content_list").toString()));
        }

        // validate the optional field `invoice_item_content_list` (array)
        for (int i = 0; i < jsonArrayinvoiceItemContentList.size(); i++) {
          InvoiceItemContent.validateJsonObject(jsonArrayinvoiceItemContentList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
      }
      if (jsonObj.get("invoice_status") != null && !jsonObj.get("invoice_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_status").toString()));
      }
      if (jsonObj.get("invoice_type") != null && !jsonObj.get("invoice_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_type").toString()));
      }
      if (jsonObj.get("payee_address") != null && !jsonObj.get("payee_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_address").toString()));
      }
      if (jsonObj.get("payee_bank_account") != null && !jsonObj.get("payee_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_bank_account").toString()));
      }
      if (jsonObj.get("payee_bank_name") != null && !jsonObj.get("payee_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_bank_name").toString()));
      }
      if (jsonObj.get("payee_phone") != null && !jsonObj.get("payee_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_phone").toString()));
      }
      if (jsonObj.get("payee_register_name") != null && !jsonObj.get("payee_register_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_register_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_register_name").toString()));
      }
      if (jsonObj.get("payee_tax_no") != null && !jsonObj.get("payee_tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_tax_no").toString()));
      }
      if (jsonObj.get("payer_address") != null && !jsonObj.get("payer_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_address").toString()));
      }
      if (jsonObj.get("payer_bank_account") != null && !jsonObj.get("payer_bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_bank_account").toString()));
      }
      if (jsonObj.get("payer_bank_name") != null && !jsonObj.get("payer_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_bank_name").toString()));
      }
      if (jsonObj.get("payer_name") != null && !jsonObj.get("payer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_name").toString()));
      }
      if (jsonObj.get("payer_phone") != null && !jsonObj.get("payer_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_phone").toString()));
      }
      if (jsonObj.get("payer_tax_no") != null && !jsonObj.get("payer_tax_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer_tax_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer_tax_no").toString()));
      }
      if (jsonObj.get("sum_tax_amount") != null && !jsonObj.get("sum_tax_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sum_tax_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sum_tax_amount").toString()));
      }
      if (jsonObj.get("tax_type") != null && !jsonObj.get("tax_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceDetailOutputQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceDetailOutputQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceDetailOutputQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceDetailOutputQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceDetailOutputQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceDetailOutputQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceDetailOutputQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceDetailOutputQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceDetailOutputQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceDetailOutputQueryResponseModel
  */
  public static AlipayEbppInvoiceDetailOutputQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceDetailOutputQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceDetailOutputQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

