package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:00:22
 */
public class AlipayOpenServicemarketOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1339388141613341797L;

	/** 
	 * 服务市场订单号
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
