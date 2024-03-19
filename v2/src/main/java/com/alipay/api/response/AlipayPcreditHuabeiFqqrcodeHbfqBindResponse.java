package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.fqqrcode.hbfq.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-11 16:49:29
 */
public class AlipayPcreditHuabeiFqqrcodeHbfqBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1636923987456282339L;

	/** 
	 * 本次绑码操作是否成功,成功为true,失败为false.
	 */
	@ApiField("bind")
	private Boolean bind;

	public void setBind(Boolean bind) {
		this.bind = bind;
	}
	public Boolean getBind( ) {
		return this.bind;
	}

}
