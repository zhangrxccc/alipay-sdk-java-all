package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecomsue.outsource.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:19
 */
public class AlipayEbppInvoiceExpensecomsueOutsourceNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379572891989642356L;

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
