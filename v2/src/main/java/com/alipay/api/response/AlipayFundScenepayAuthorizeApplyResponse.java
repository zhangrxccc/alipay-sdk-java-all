package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.authorize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:17
 */
public class AlipayFundScenepayAuthorizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1866787693214152611L;

	/** 
	 * 授权申请凭证
	 */
	@ApiField("apply_token")
	private String applyToken;

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

}
