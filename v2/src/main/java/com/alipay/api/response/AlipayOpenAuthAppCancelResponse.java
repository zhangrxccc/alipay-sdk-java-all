package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:41:40
 */
public class AlipayOpenAuthAppCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6629281862451871278L;

	/** 
	 * 取消授权结果
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
