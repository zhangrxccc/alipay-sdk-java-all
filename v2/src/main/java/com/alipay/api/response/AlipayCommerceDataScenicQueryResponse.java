package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaginationScenicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.scenic.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:59
 */
public class AlipayCommerceDataScenicQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1773318955257237724L;

	/** 
	 * 景区分页信息
	 */
	@ApiField("pagination_scenic_info")
	private PaginationScenicInfo paginationScenicInfo;

	public void setPaginationScenicInfo(PaginationScenicInfo paginationScenicInfo) {
		this.paginationScenicInfo = paginationScenicInfo;
	}
	public PaginationScenicInfo getPaginationScenicInfo( ) {
		return this.paginationScenicInfo;
	}

}
