package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.shortenurl.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-27 10:06:54
 */
public class AlipayCommerceMedicalShortenurlExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5517168718829826371L;

	/** 
	 * 业务错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 短链
	 */
	@ApiField("shorten_url")
	private String shortenUrl;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setShortenUrl(String shortenUrl) {
		this.shortenUrl = shortenUrl;
	}
	public String getShortenUrl( ) {
		return this.shortenUrl;
	}

}
