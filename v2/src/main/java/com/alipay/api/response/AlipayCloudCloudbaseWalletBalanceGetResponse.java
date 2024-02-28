package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.balance.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 20:25:03
 */
public class AlipayCloudCloudbaseWalletBalanceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8567534546889254895L;

	/** 
	 * 可用余额(分)
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 未支付余额(分)
	 */
	@ApiField("unpaid_amount")
	private String unpaidAmount;

	/** 
	 * 钱包余额(分)
	 */
	@ApiField("wallet_amount")
	private String walletAmount;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setUnpaidAmount(String unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}
	public String getUnpaidAmount( ) {
		return this.unpaidAmount;
	}

	public void setWalletAmount(String walletAmount) {
		this.walletAmount = walletAmount;
	}
	public String getWalletAmount( ) {
		return this.walletAmount;
	}

}
