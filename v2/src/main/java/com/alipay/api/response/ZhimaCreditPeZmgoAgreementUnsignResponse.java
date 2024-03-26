package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.agreement.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 13:38:16
 */
public class ZhimaCreditPeZmgoAgreementUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3612495546987145375L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 调用芝麻GO结算受理接口时，需要传入该值
	 */
	@ApiField("withhold_plan_no")
	private String withholdPlanNo;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setWithholdPlanNo(String withholdPlanNo) {
		this.withholdPlanNo = withholdPlanNo;
	}
	public String getWithholdPlanNo( ) {
		return this.withholdPlanNo;
	}

}
