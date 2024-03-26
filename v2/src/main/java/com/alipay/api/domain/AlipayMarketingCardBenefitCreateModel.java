package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益创建
 *
 * @author auto create
 * @since 1.0, 2022-11-08 21:22:40
 */
public class AlipayMarketingCardBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6897292624263647314L;

	/**
	 * 会员卡模板外部权益
	 */
	@ApiField("mcard_template_benefit")
	private McardTemplateBenefit mcardTemplateBenefit;

	public McardTemplateBenefit getMcardTemplateBenefit() {
		return this.mcardTemplateBenefit;
	}
	public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}

}
