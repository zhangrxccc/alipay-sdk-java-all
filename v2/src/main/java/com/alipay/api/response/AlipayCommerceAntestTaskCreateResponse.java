package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:47:53
 */
public class AlipayCommerceAntestTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8653984941988755489L;

	/** 
	 * 任务id
	 */
	@ApiField("batch_id")
	private Long batchId;

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getBatchId( ) {
		return this.batchId;
	}

}
