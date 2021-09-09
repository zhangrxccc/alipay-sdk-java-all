package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.equity.shop.custrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-12 16:06:18
 */
public class AntfortuneEquityShopCustrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535485844329644442L;

	/** 
	 * 用户关注商户pid对应的财富号的时间
	 */
	@ApiField("follow_time")
	private String followTime;

	/** 
	 * 当前用户是否关注商户pid对应的财富号
	 */
	@ApiField("match_result")
	private Boolean matchResult;

	public void setFollowTime(String followTime) {
		this.followTime = followTime;
	}
	public String getFollowTime( ) {
		return this.followTime;
	}

	public void setMatchResult(Boolean matchResult) {
		this.matchResult = matchResult;
	}
	public Boolean getMatchResult( ) {
		return this.matchResult;
	}

}
