package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.market.student.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-26 19:56:56
 */
public class AlipayCloudCloudbaseMarketStudentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5799338854883328274L;

	/** 
	 * 是否成功
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
