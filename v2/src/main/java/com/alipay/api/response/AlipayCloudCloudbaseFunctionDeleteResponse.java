package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:42
 */
public class AlipayCloudCloudbaseFunctionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3767478999148549956L;

	/** 
	 * 删除结果
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
