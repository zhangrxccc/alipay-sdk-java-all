package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MiniAppBaseInfoQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:28:42
 */
public class AlipayOpenMiniInnerbaseinfoListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5192598155692945672L;

	/** 
	 * 小程序列表
	 */
	@ApiField("mini_app_list")
	private MiniAppBaseInfoQueryResponse miniAppList;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setMiniAppList(MiniAppBaseInfoQueryResponse miniAppList) {
		this.miniAppList = miniAppList;
	}
	public MiniAppBaseInfoQueryResponse getMiniAppList( ) {
		return this.miniAppList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
