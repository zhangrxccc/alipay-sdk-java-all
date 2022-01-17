package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BaseWebResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.yeb.entityequity.verify response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-12 10:55:30
 */
public class AntfortuneYebEntityequityVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2533274127261991784L;

	/** 
	 * web层返回对象封装
	 */
	@ApiField("response")
	private BaseWebResponse response;

	public void setResponse(BaseWebResponse response) {
		this.response = response;
	}
	public BaseWebResponse getResponse( ) {
		return this.response;
	}

}
