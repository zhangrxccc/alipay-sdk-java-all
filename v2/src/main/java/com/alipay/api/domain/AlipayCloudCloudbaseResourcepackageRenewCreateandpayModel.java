package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 续费下单并支付
 *
 * @author auto create
 * @since 1.0, 2023-10-30 17:06:44
 */
public class AlipayCloudCloudbaseResourcepackageRenewCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 7371849443782622747L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 续费周期数(月)
	 */
	@ApiField("renew_month")
	private Long renewMonth;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public Long getRenewMonth() {
		return this.renewMonth;
	}
	public void setRenewMonth(Long renewMonth) {
		this.renewMonth = renewMonth;
	}

}
