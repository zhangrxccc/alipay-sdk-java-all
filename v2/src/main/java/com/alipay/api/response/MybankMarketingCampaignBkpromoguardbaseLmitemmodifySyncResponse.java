package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.bkpromoguardbase.lmitemmodify.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-08 10:46:38
 */
public class MybankMarketingCampaignBkpromoguardbaseLmitemmodifySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5181913678483688265L;

	/** 
	 * request_id + 唯一 + LinkedMall商品修改同步场景 +返回请求中的服务标识
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
