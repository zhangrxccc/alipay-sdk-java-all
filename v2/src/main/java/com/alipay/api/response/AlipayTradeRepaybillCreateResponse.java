package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-29 11:13:45
 */
public class AlipayTradeRepaybillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8227467481648928642L;

	/** 
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

}
