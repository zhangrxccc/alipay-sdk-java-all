package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.commonsign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:37:27
 */
public class AlipayOpenAgentCommonsignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3592462347717129975L;

	/** 
	 * 签约单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
