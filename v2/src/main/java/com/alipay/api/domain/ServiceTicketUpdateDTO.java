package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务工单更新模型
 *
 * @author auto create
 * @since 1.0, 2024-03-19 16:03:39
 */
public class ServiceTicketUpdateDTO extends AlipayObject {

	private static final long serialVersionUID = 5361164666389757377L;

	/**
	 * 事件时间
	 */
	@ApiField("action_time")
	private String actionTime;

	/**
	 * 订单状态
	 */
	@ApiField("event_action")
	private String eventAction;

	public String getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getEventAction() {
		return this.eventAction;
	}
	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

}
