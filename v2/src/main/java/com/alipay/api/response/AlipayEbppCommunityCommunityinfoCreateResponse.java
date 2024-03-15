package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.communityinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:41
 */
public class AlipayEbppCommunityCommunityinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6722973487283264742L;

	/** 
	 * 小区名字拼音首字母大写+YYYYMMDD+防重位
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/** 
	 * 支付宝app中的该小区跳转地址
	 */
	@ApiField("community_url")
	private String communityUrl;

	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}
	public String getCommunityShortName( ) {
		return this.communityShortName;
	}

	public void setCommunityUrl(String communityUrl) {
		this.communityUrl = communityUrl;
	}
	public String getCommunityUrl( ) {
		return this.communityUrl;
	}

}
