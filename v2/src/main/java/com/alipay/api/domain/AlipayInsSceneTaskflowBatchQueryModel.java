package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询权益流水列表
 *
 * @author auto create
 * @since 1.0, 2022-12-19 17:37:15
 */
public class AlipayInsSceneTaskflowBatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7384621811522646691L;

	/**
	 * 支付宝账号openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
