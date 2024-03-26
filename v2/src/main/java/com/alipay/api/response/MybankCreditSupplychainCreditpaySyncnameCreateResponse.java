package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.syncname.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:13:40
 */
public class MybankCreditSupplychainCreditpaySyncnameCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2234421979918962111L;

	/** 
	 * 业务序列号
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

}
