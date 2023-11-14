package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扣款单扣款
 *
 * @author auto create
 * @since 1.0, 2023-10-30 13:36:27
 */
public class AlipayCommerceDeductionorderPayModel extends AlipayObject {

	private static final long serialVersionUID = 8745218718211114219L;

	/**
	 * 扣款单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

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
