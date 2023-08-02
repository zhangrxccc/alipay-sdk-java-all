package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油订单券信息
 *
 * @author auto create
 * @since 1.0, 2023-05-17 15:53:17
 */
public class FuelVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 7216331841727232948L;

	/**
	 * 券归属的活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 支付宝出资部分的金额 单位分
	 */
	@ApiField("alipay_amount")
	private Long alipayAmount;

	/**
	 * 券的面额 单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 商家出资的金额 单位分
	 */
	@ApiField("merchant_amount")
	private Long merchantAmount;

	/**
	 * 订单使用的券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Long getAlipayAmount() {
		return this.alipayAmount;
	}
	public void setAlipayAmount(Long alipayAmount) {
		this.alipayAmount = alipayAmount;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getMerchantAmount() {
		return this.merchantAmount;
	}
	public void setMerchantAmount(Long merchantAmount) {
		this.merchantAmount = merchantAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
