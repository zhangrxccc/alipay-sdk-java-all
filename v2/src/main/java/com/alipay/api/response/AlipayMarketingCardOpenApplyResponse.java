package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.open.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-16 13:52:27
 */
public class AlipayMarketingCardOpenApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7867697318847777586L;

	/** 
	 * 商户卡信息（包括支付宝分配的业务卡号）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}
	public MerchantCard getCardInfo( ) {
		return this.cardInfo;
	}

}
