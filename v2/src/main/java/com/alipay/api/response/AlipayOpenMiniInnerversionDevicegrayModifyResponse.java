package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.devicegray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:06:44
 */
public class AlipayOpenMiniInnerversionDevicegrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1265875286384853552L;

	/** 
	 * 灰度code
	 */
	@ApiField("gray_code")
	private String grayCode;

	public void setGrayCode(String grayCode) {
		this.grayCode = grayCode;
	}
	public String getGrayCode( ) {
		return this.grayCode;
	}

}
