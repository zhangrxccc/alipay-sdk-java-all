package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.verificationcode.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-13 14:55:03
 */
public class AnttechOceanbaseVerificationcodeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7451475669267595914L;

	/** 
	 * 验证码类型枚举：MESSAGE_CODE短信验证码；EMAIL_CODE邮件验证码。
	 */
	@ApiField("type")
	private String type;

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
