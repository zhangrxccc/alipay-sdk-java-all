package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.deductionorder.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:21
 */
public class AlipayCommerceDeductionorderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7126999179112137831L;

	/** 
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
