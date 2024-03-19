package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.delete.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 10:06:49
 */
public class AlipayOpenOperationOpenbizmockDeleteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7542712116958793123L;

	/** 
	 * test
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
