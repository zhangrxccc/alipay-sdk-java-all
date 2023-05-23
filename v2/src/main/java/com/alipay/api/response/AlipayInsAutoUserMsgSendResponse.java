package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:16:57
 */
public class AlipayInsAutoUserMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7733839885557813246L;

	/** 
	 * 描述是否可以重试
	 */
	@ApiField("can_retry")
	private Boolean canRetry;

	public void setCanRetry(Boolean canRetry) {
		this.canRetry = canRetry;
	}
	public Boolean getCanRetry( ) {
		return this.canRetry;
	}

}
