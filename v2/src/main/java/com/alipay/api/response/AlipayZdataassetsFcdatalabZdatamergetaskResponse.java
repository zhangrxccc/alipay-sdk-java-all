package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataassets.fcdatalab.zdatamergetask response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 17:44:49
 */
public class AlipayZdataassetsFcdatalabZdatamergetaskResponse extends AlipayResponse {

	private static final long serialVersionUID = 3232951243493466756L;

	/** 
	 * θΏεη»ζ
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
