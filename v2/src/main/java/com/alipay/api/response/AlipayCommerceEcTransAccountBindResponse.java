package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-23 17:56:51
 */
public class AlipayCommerceEcTransAccountBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2132756593549239631L;

	/** 
	 * 授权签约链接
	 */
	@ApiField("authorize_link")
	private String authorizeLink;

	public void setAuthorizeLink(String authorizeLink) {
		this.authorizeLink = authorizeLink;
	}
	public String getAuthorizeLink( ) {
		return this.authorizeLink;
	}

}
