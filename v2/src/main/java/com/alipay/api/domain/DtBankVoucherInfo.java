package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通用渠道红包活动信息
 *
 * @author auto create
 * @since 1.0, 2023-06-20 18:17:19
 */
public class DtBankVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 1685271476541449386L;

	/**
	 * 红包有效时间
	 */
	@ApiField("coupon_available_time")
	private DtBankCouponAvailableTime couponAvailableTime;

	/**
	 * 红包使用说明文案
	 */
	@ApiListField("coupon_instruction_list")
	@ApiField("string")
	private List<String> couponInstructionList;

	public DtBankCouponAvailableTime getCouponAvailableTime() {
		return this.couponAvailableTime;
	}
	public void setCouponAvailableTime(DtBankCouponAvailableTime couponAvailableTime) {
		this.couponAvailableTime = couponAvailableTime;
	}

	public List<String> getCouponInstructionList() {
		return this.couponInstructionList;
	}
	public void setCouponInstructionList(List<String> couponInstructionList) {
		this.couponInstructionList = couponInstructionList;
	}

}
