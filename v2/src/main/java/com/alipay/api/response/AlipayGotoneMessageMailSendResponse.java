package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.gotone.message.mail.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-14 11:31:39
 */
public class AlipayGotoneMessageMailSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8255484957213394431L;

	/** 
	 * θΏεη»ζ
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
