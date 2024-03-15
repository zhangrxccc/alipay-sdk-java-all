package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-10 18:41:51
 */
public class AlipayOpenOperationOpenbizmockTestnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2732458126232655534L;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
