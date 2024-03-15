package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.region.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:36
 */
public class AlipayInsCooperationRegionQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6322974512165562174L;

	/** 
	 * 快捷投保产品二维码图片链接URL
	 */
	@ApiField("code_url")
	private String codeUrl;

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}
	public String getCodeUrl( ) {
		return this.codeUrl;
	}

}
