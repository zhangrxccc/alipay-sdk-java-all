package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.experience.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:06:38
 */
public class AlipayInsMarketingExperienceAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1385956695871653619L;

	/** 
	 * 剩余可提现收益
	 */
	@ApiField("remaining_profit")
	private String remainingProfit;

	/** 
	 * 体验金总额
	 */
	@ApiField("total_experience_amount")
	private String totalExperienceAmount;

	public void setRemainingProfit(String remainingProfit) {
		this.remainingProfit = remainingProfit;
	}
	public String getRemainingProfit( ) {
		return this.remainingProfit;
	}

	public void setTotalExperienceAmount(String totalExperienceAmount) {
		this.totalExperienceAmount = totalExperienceAmount;
	}
	public String getTotalExperienceAmount( ) {
		return this.totalExperienceAmount;
	}

}
