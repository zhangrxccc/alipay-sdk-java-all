package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 17:11:57
 */
public class AlipayCommerceEcTransAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1667523818996484947L;

	/** 
	 * 资金专户账号ID
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}
	public String getAccountBookId( ) {
		return this.accountBookId;
	}

}
