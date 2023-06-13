package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.alipayaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:04:35
 */
public class AlipayBusinessRelationAlipayaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3654984237534444838L;

	/** 
	 * 商业关系收单pid支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/** 
	 * 商业关系收单pid支付宝实名名称
	 */
	@ApiField("alipay_name")
	private String alipayName;

	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}
	public String getAlipayAccount( ) {
		return this.alipayAccount;
	}

	public void setAlipayName(String alipayName) {
		this.alipayName = alipayName;
	}
	public String getAlipayName( ) {
		return this.alipayName;
	}

}
