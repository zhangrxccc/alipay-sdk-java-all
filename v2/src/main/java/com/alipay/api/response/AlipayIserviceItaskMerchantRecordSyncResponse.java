package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.merchant.record.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-24 15:41:41
 */
public class AlipayIserviceItaskMerchantRecordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5827255398136587786L;

	/** 
	 * 业务入参的biz_id
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
