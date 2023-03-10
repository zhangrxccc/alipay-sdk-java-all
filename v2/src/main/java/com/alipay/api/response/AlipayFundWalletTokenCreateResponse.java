package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-07 21:51:39
 */
public class AlipayFundWalletTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3367124667525199563L;

	/** 
	 * 绑定凭证
	 */
	@ApiField("bind_token")
	private String bindToken;

	/** 
	 * 绑定链接
	 */
	@ApiField("bind_url")
	private String bindUrl;

	public void setBindToken(String bindToken) {
		this.bindToken = bindToken;
	}
	public String getBindToken( ) {
		return this.bindToken;
	}

	public void setBindUrl(String bindUrl) {
		this.bindUrl = bindUrl;
	}
	public String getBindUrl( ) {
		return this.bindUrl;
	}

}
