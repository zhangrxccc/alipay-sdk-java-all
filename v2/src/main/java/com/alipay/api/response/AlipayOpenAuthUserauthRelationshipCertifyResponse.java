package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relationship.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:36:49
 */
public class AlipayOpenAuthUserauthRelationshipCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7758249984394865227L;

	/** 
	 * 授权关系有效性校验，true:有效，false:无效
	 */
	@ApiField("effective")
	private Boolean effective;

	public void setEffective(Boolean effective) {
		this.effective = effective;
	}
	public Boolean getEffective( ) {
		return this.effective;
	}

}
