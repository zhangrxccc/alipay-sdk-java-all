package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.voicemodel.syncvoice.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-05 14:52:29
 */
public class AlipayCommerceIotVoicemodelSyncvoiceSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5583792697478943519L;

	/** 
	 * 调用的任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
