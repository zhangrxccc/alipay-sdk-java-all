package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:53
 */
public class AlipayCommerceOperationTimescardRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5721439626398672444L;

	/** 
	 * 可退金额，精确到分
	 */
	@ApiField("refundable_amount")
	private String refundableAmount;

	public void setRefundableAmount(String refundableAmount) {
		this.refundableAmount = refundableAmount;
	}
	public String getRefundableAmount( ) {
		return this.refundableAmount;
	}

}
