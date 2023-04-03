package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:53:57
 */
public class AlipayAccountExrateConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4263255875458853457L;

	/** 
	 * scheduler配置的自定义键值对
	 */
	@ApiField("task_context")
	private String taskContext;

	/** 
	 * scheduler的状态码
	 */
	@ApiField("task_status")
	private String taskStatus;

	/** 
	 * scheduler的配置类型
	 */
	@ApiField("task_type")
	private String taskType;

	public void setTaskContext(String taskContext) {
		this.taskContext = taskContext;
	}
	public String getTaskContext( ) {
		return this.taskContext;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskType( ) {
		return this.taskType;
	}

}
