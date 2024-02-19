package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.task.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 12:51:40
 */
public class AlipayCommerceWaterTaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2626213566682119875L;

	/** 
	 * 任务更新结果
	 */
	@ApiField("task_result")
	private Boolean taskResult;

	public void setTaskResult(Boolean taskResult) {
		this.taskResult = taskResult;
	}
	public Boolean getTaskResult( ) {
		return this.taskResult;
	}

}
