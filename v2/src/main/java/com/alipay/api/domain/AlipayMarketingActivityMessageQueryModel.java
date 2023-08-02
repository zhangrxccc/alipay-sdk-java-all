package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询营销事件通知应用
 *
 * @author auto create
 * @since 1.0, 2023-06-28 08:54:13
 */
public class AlipayMarketingActivityMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5797681514647427145L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 支付宝商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
