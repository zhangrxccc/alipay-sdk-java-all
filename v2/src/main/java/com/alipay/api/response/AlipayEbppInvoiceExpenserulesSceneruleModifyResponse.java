package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.scenerule.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 21:03:18
 */
public class AlipayEbppInvoiceExpenserulesSceneruleModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6464182738176745531L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
