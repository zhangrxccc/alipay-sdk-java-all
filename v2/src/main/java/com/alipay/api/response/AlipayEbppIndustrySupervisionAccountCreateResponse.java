package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:11:57
 */
public class AlipayEbppIndustrySupervisionAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1387398976427553914L;

	/** 
	 * 商户子户账号
	 */
	@ApiField("merchant_account_no")
	private String merchantAccountNo;

	/** 
	 * 账户状态
	 */
	@ApiField("merchant_account_status")
	private String merchantAccountStatus;

	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}
	public String getMerchantAccountNo( ) {
		return this.merchantAccountNo;
	}

	public void setMerchantAccountStatus(String merchantAccountStatus) {
		this.merchantAccountStatus = merchantAccountStatus;
	}
	public String getMerchantAccountStatus( ) {
		return this.merchantAccountStatus;
	}

}
