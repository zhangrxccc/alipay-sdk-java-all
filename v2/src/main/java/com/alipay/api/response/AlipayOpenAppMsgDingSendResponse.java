package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.msg.ding.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 19:52:44
 */
public class AlipayOpenAppMsgDingSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5715444451261151369L;

	/** 
	 * 企业消息的id
	 */
	@ApiField("msg_id")
	private String msgId;

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

}
