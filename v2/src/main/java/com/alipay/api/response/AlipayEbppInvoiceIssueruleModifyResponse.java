package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.issuerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 15:36:58
 */
public class AlipayEbppInvoiceIssueruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8532666514797275713L;

	/** 
	 * 修改结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
