package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已经发放的券结果信息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 13:08:59
 */
public class SendVoucherInfoResult extends AlipayObject {

	private static final long serialVersionUID = 1847123439849549497L;

	/**
	 * 用户领券之后在服务商(商户)侧提供的券详情展示页面。在支付宝卡包中展示链接，用户点击可以跳转到服务商券详情页。 限制: 该字段在兑换券场景下必传。 链接必须是alipays开头的小程序链接，详见《小程序scheme链接介绍》https://opendocs.alipay.com/support/01rb18
	 */
	@ApiField("merchant_order_url")
	private String merchantOrderUrl;

	/**
	 * 服务商发奖后返回的券码列表. 限制： 单个code最长64位。 商户上传的券code列表，code允许包含的字符有0-9、a-z、A-Z、-、_、+、=、|。 如果发生券码后校验不通过.支付宝内部不会进行发奖。针对这种case会通知服务商进行整改，该笔交易支付宝内部不会发奖成功。
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getMerchantOrderUrl() {
		return this.merchantOrderUrl;
	}
	public void setMerchantOrderUrl(String merchantOrderUrl) {
		this.merchantOrderUrl = merchantOrderUrl;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
