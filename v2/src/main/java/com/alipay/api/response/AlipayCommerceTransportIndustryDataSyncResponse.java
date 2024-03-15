package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.industry.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 18:16:58
 */
public class AlipayCommerceTransportIndustryDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8328627175115589944L;

	/** 
	 * 数据同步接口响应，根据请求场景、事件类型的变化而不同
	 */
	@ApiField("sync_response")
	private String syncResponse;

	public void setSyncResponse(String syncResponse) {
		this.syncResponse = syncResponse;
	}
	public String getSyncResponse( ) {
		return this.syncResponse;
	}

}
