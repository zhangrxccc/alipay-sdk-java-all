package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.sign.flow.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:25:04
 */
public class AlipayEcoSignFlowCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4462788879418648371L;

	/** 
	 * 流程Id
	 */
	@ApiField("flow_id")
	private String flowId;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

}
