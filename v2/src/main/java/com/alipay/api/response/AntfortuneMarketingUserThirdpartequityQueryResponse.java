package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FinEquityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.user.thirdpartequity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:41:53
 */
public class AntfortuneMarketingUserThirdpartequityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7125576356255983638L;

	/** 
	 * 权益基础信息
	 */
	@ApiListField("equity_info")
	@ApiField("fin_equity_info")
	private List<FinEquityInfo> equityInfo;

	/** 
	 * 是否推荐重试
	 */
	@ApiField("should_retry")
	private Boolean shouldRetry;

	public void setEquityInfo(List<FinEquityInfo> equityInfo) {
		this.equityInfo = equityInfo;
	}
	public List<FinEquityInfo> getEquityInfo( ) {
		return this.equityInfo;
	}

	public void setShouldRetry(Boolean shouldRetry) {
		this.shouldRetry = shouldRetry;
	}
	public Boolean getShouldRetry( ) {
		return this.shouldRetry;
	}

}
