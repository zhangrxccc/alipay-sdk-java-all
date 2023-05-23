package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.stress.heartbeat.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-18 19:30:29
 */
public class AlipayEbppStressHeartbeatUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5172537741831434934L;

	/** 
	 * 下一个状态的状态码
	 */
	@ApiField("next_status")
	private String nextStatus;

	/** 
	 * 上报是否成功标识
	 */
	@ApiField("success")
	private Boolean success;

	public void setNextStatus(String nextStatus) {
		this.nextStatus = nextStatus;
	}
	public String getNextStatus( ) {
		return this.nextStatus;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
