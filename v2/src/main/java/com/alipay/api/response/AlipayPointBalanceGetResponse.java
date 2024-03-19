package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.balance.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 16:37:43
 */
public class AlipayPointBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6188847417174616854L;

	/** 
	 * 用户的集分宝余额
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}
	public Long getPointAmount( ) {
		return this.pointAmount;
	}

}
