package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.action.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:49:52
 */
public class AlipayUserCertifyActionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4533412994968674288L;

	/** 
	 * 返回给商户的支付宝业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

}
