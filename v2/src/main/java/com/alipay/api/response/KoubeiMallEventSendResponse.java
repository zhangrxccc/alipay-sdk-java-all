package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:31:31
 */
public class KoubeiMallEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7286863274569326244L;

	/** 
	 * 事件ID
	 */
	@ApiField("event_id")
	private String eventId;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

}
