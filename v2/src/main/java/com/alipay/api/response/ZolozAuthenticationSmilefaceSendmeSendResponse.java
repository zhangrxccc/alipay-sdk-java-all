package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.smileface.sendme.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:11:00
 */
public class ZolozAuthenticationSmilefaceSendmeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2135286237256313297L;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
