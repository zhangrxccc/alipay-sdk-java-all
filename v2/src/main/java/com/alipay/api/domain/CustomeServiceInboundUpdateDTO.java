package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单-阿云客服呼入更新模型
 *
 * @author auto create
 * @since 1.0, 2024-03-19 16:03:32
 */
public class CustomeServiceInboundUpdateDTO extends AlipayObject {

	private static final long serialVersionUID = 2213838572724838496L;

	/**
	 * 事件时间
	 */
	@ApiField("action_time")
	private String actionTime;

	/**
	 * 渠道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 事件动作
	 */
	@ApiField("event_action")
	private String eventAction;

	/**
	 * 事件内容
	 */
	@ApiField("event_content")
	private String eventContent;

	/**
	 * 坐席id
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 坐席类型
	 */
	@ApiField("seat_type")
	private String seatType;

	/**
	 * 技能组id
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 技能组类型
	 */
	@ApiField("skill_group_type")
	private String skillGroupType;

	/**
	 * 用户id
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * 用户类型
	 */
	@ApiField("visitor_type")
	private String visitorType;

	public String getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getEventAction() {
		return this.eventAction;
	}
	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public String getEventContent() {
		return this.eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public String getSeatId() {
		return this.seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatType() {
		return this.seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getSkillGroupType() {
		return this.skillGroupType;
	}
	public void setSkillGroupType(String skillGroupType) {
		this.skillGroupType = skillGroupType;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorType() {
		return this.visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

}
