package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-15 11:41:49
 */
public class AlipayOpenAppServiceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5847747511234693788L;

	/** 
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
