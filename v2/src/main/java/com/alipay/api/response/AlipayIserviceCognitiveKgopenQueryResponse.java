package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.kgopen.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:13:15
 */
public class AlipayIserviceCognitiveKgopenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4652921257985465898L;

	/** 
	 * 返回数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
