package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.userlist.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:45:46
 */
public class MybankCreditLoanapplyUserlistUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7377666638771336298L;

	/** 
	 * 请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
