package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.group.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:55:20
 */
public class AlipayOpenPublicMessageGroupSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1533685495389526431L;

	/** 
	 * 2013121100055554f1000b64-3f05-4581-a5e1-16e29d242950
	 */
	@ApiField("message_id")
	private String messageId;

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessageId( ) {
		return this.messageId;
	}

}
