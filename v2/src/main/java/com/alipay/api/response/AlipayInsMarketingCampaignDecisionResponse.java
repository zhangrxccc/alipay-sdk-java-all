package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsMktCampaignDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.decision response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:49:22
 */
public class AlipayInsMarketingCampaignDecisionResponse extends AlipayResponse {

	private static final long serialVersionUID = 7876676751536758639L;

	/** 
	 * 保险营销标的关联的活动列表
	 */
	@ApiListField("mkt_campaigns")
	@ApiField("ins_mkt_campaign_d_t_o")
	private List<InsMktCampaignDTO> mktCampaigns;

	public void setMktCampaigns(List<InsMktCampaignDTO> mktCampaigns) {
		this.mktCampaigns = mktCampaigns;
	}
	public List<InsMktCampaignDTO> getMktCampaigns( ) {
		return this.mktCampaigns;
	}

}
