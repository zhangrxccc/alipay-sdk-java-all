package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.meterial.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:06:10
 */
public class AlipayEbppMerchantMeterialUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7773357979326889687L;

	/** 
	 * 文件对应的MD5值, 用于文件完整性校验
	 */
	@ApiField("md_5")
	private String md5;

	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getMd5( ) {
		return this.md5;
	}

}
