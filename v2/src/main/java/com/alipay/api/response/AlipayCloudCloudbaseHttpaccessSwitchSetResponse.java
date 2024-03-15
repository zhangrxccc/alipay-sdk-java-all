package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.switch.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 23:36:41
 */
public class AlipayCloudCloudbaseHttpaccessSwitchSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1593673576946116669L;

	/** 
	 * 设置结果
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
