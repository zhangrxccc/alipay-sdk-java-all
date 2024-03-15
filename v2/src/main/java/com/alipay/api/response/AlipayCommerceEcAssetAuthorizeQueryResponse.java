package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.asset.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-10 15:06:44
 */
public class AlipayCommerceEcAssetAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7249486213195123625L;

	/** 
	 * 申请时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/** 
	 * 资产类型
枚举值
网商授信:EBE_MYBANK_CREDIT
拉卡拉授信：ENT_LAC_CREDIT
	 */
	@ApiField("asset_type")
	private String assetType;

	/** 
	 * 剩余可用额度，单位元，精确到分
	 */
	@ApiField("available_limit")
	private String availableLimit;

	/** 
	 * 授信额度，申请完成时必填，必须为整数
	 */
	@ApiField("capital_limit")
	private String capitalLimit;

	/** 
	 * 额度有效期，格式"yyyy-MM-dd"
	 */
	@ApiField("expiration_date")
	private Date expirationDate;

	/** 
	 * 授信申请状态
枚举值
申请中: APPLYING
申请通过: PASSED
申请失败：REJECTED
申请取消：CANCEL
	 */
	@ApiField("status")
	private String status;

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getApplyTime( ) {
		return this.applyTime;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getAssetType( ) {
		return this.assetType;
	}

	public void setAvailableLimit(String availableLimit) {
		this.availableLimit = availableLimit;
	}
	public String getAvailableLimit( ) {
		return this.availableLimit;
	}

	public void setCapitalLimit(String capitalLimit) {
		this.capitalLimit = capitalLimit;
	}
	public String getCapitalLimit( ) {
		return this.capitalLimit;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Date getExpirationDate( ) {
		return this.expirationDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
