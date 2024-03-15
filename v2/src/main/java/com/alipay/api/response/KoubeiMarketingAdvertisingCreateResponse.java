package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:48:59
 */
public class KoubeiMarketingAdvertisingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2568963437938248562L;

	/** 
	 * 创建广告唯一标识
	 */
	@ApiField("ad_id")
	private String adId;

	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdId( ) {
		return this.adId;
	}

}
