package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenVoucherDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.delay response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-22 14:11:38
 */
public class AlipayMarketingVoucherDelayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6523461737767143124L;

	/** 
	 * 被延期的券
	 */
	@ApiField("voucher")
	private OpenVoucherDTO voucher;

	public void setVoucher(OpenVoucherDTO voucher) {
		this.voucher = voucher;
	}
	public OpenVoucherDTO getVoucher( ) {
		return this.voucher;
	}

}
