package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.finlease.consult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:46:45
 */
public class MybankCreditLoanapplyFinleaseConsultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6627696669989669378L;

	/** 
	 * 是否准入，true表示准则，false表示不准入
	 */
	@ApiField("admit")
	private Boolean admit;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

}
