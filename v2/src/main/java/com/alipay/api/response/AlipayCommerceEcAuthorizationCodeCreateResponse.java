package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenAccessCodeDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.authorization.code.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 11:52:19
 */
public class AlipayCommerceEcAuthorizationCodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2195211867197627694L;

	/** 
	 * 授权码authCode信息
	 */
	@ApiField("open_access_code_dto")
	private OpenAccessCodeDTO openAccessCodeDto;

	public void setOpenAccessCodeDto(OpenAccessCodeDTO openAccessCodeDto) {
		this.openAccessCodeDto = openAccessCodeDto;
	}
	public OpenAccessCodeDTO getOpenAccessCodeDto( ) {
		return this.openAccessCodeDto;
	}

}
