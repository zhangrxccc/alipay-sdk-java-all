package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:46:59
 */
public class AlipayMarketingVoucherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6725987132557899887L;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
