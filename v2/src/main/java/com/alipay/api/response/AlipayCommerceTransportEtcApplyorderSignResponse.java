package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.applyorder.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-20 19:31:38
 */
public class AlipayCommerceTransportEtcApplyorderSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8148218165827247522L;

	/** 
	 * 代扣协议签约页面跳转链接
	 */
	@ApiField("etc_deduct_sign_page_url")
	private String etcDeductSignPageUrl;

	/** 
	 * 代扣协议签约凭证
	 */
	@ApiField("etc_deduct_sign_token")
	private String etcDeductSignToken;

	public void setEtcDeductSignPageUrl(String etcDeductSignPageUrl) {
		this.etcDeductSignPageUrl = etcDeductSignPageUrl;
	}
	public String getEtcDeductSignPageUrl( ) {
		return this.etcDeductSignPageUrl;
	}

	public void setEtcDeductSignToken(String etcDeductSignToken) {
		this.etcDeductSignToken = etcDeductSignToken;
	}
	public String getEtcDeductSignToken( ) {
		return this.etcDeductSignToken;
	}

}
