package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资规则模型
 *
 * @author auto create
 * @since 1.0, 2023-02-22 16:46:25
 */
public class FundRuleModelDTO extends AlipayObject {

	private static final long serialVersionUID = 4263556733328693163L;

	/**
	 * 出资协议号，由出资协议创建时获取
	 */
	@ApiField("fund_agreement_no")
	private String fundAgreementNo;

	/**
	 * 出资金额
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	public String getFundAgreementNo() {
		return this.fundAgreementNo;
	}
	public void setFundAgreementNo(String fundAgreementNo) {
		this.fundAgreementNo = fundAgreementNo;
	}

	public String getFundAmount() {
		return this.fundAmount;
	}
	public void setFundAmount(String fundAmount) {
		this.fundAmount = fundAmount;
	}

}
