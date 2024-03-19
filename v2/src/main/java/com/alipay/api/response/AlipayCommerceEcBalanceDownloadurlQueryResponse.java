package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.balance.downloadurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-04 13:34:45
 */
public class AlipayCommerceEcBalanceDownloadurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3532941585653497467L;

	/** 
	 * 对账单下载地址链接
	 */
	@ApiField("bill_download_url")
	private String billDownloadUrl;

	public void setBillDownloadUrl(String billDownloadUrl) {
		this.billDownloadUrl = billDownloadUrl;
	}
	public String getBillDownloadUrl( ) {
		return this.billDownloadUrl;
	}

}
