package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.supplier.homepageurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 10:41:58
 */
public class AlipayCommerceEcSupplierHomepageurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5791676726425913861L;

	/** 
	 * 供给首页链接
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
