package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.welfarefoundation.updatevolunteers.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:48
 */
public class AlipayDigitalmgmtWelfarefoundationUpdatevolunteersCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8271495981416252165L;

	/** 
	 * 操作结果
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
