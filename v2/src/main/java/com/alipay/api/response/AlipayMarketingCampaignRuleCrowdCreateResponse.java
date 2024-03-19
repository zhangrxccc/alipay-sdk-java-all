package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:32:44
 */
public class AlipayMarketingCampaignRuleCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2129614958256336823L;

	/** 
	 * 圈人规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}
	public String getRuleid( ) {
		return this.ruleid;
	}

}
