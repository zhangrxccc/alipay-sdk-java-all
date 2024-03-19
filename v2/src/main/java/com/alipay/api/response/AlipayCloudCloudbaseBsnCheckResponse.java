package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.bsn.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 20:22:11
 */
public class AlipayCloudCloudbaseBsnCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 5581666393483623138L;

	/** 
	 * 检查是否满足备案服务码申请条件结果
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
