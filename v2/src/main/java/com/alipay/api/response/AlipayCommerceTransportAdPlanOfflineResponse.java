package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.plan.offline response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:58:35
 */
public class AlipayCommerceTransportAdPlanOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379626324256389669L;

	/** 
	 * 广告计划下线结果 + 根据广告计划id操作计划下线，下线成功返回true，否则返回false
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
