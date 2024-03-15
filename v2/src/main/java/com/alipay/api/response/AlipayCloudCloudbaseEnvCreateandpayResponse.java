package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 20:23:17
 */
public class AlipayCloudCloudbaseEnvCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2367753864359152448L;

	/** 
	 * 全局环境变量ID
	 */
	@ApiField("env_id")
	private String envId;

	public void setEnvId(String envId) {
		this.envId = envId;
	}
	public String getEnvId( ) {
		return this.envId;
	}

}
