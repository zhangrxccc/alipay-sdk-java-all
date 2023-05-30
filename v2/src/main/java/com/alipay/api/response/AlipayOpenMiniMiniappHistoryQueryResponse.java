package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppHistoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:11:58
 */
public class AlipayOpenMiniMiniappHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5156334726934276796L;

	/** 
	 * 小程序最近使用记录列表
	 */
	@ApiListField("mini_app_history_infos")
	@ApiField("mini_app_history_info")
	private List<MiniAppHistoryInfo> miniAppHistoryInfos;

	public void setMiniAppHistoryInfos(List<MiniAppHistoryInfo> miniAppHistoryInfos) {
		this.miniAppHistoryInfos = miniAppHistoryInfos;
	}
	public List<MiniAppHistoryInfo> getMiniAppHistoryInfos( ) {
		return this.miniAppHistoryInfos;
	}

}
