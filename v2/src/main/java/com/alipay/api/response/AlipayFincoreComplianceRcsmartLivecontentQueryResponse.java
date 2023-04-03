package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LiveInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcsmart.livecontent.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:16:47
 */
public class AlipayFincoreComplianceRcsmartLivecontentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7353296686831687459L;

	/** 
	 * 直播信息列表
	 */
	@ApiListField("live_info_list")
	@ApiField("live_info")
	private List<LiveInfo> liveInfoList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setLiveInfoList(List<LiveInfo> liveInfoList) {
		this.liveInfoList = liveInfoList;
	}
	public List<LiveInfo> getLiveInfoList( ) {
		return this.liveInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
