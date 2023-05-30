package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 其他出资方明细
 *
 * @author auto create
 * @since 1.0, 2023-04-10 12:19:04
 */
public class ContributeDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2138576429679447227L;

	/**
	 * 其他出资方金额
	 */
	@ApiField("contribute_amount")
	private String contributeAmount;

	/**
	 * 出资方类型，如品牌商出资、支付宝平台出资...
	 */
	@ApiField("contribute_type")
	private String contributeType;

	public String getContributeAmount() {
		return this.contributeAmount;
	}
	public void setContributeAmount(String contributeAmount) {
		this.contributeAmount = contributeAmount;
	}

	public String getContributeType() {
		return this.contributeType;
	}
	public void setContributeType(String contributeType) {
		this.contributeType = contributeType;
	}

}
