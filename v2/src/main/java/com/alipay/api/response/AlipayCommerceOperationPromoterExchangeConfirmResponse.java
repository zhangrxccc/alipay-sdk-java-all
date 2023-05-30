package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemExchangeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.exchange.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:16:33
 */
public class AlipayCommerceOperationPromoterExchangeConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3214863192571515235L;

	/** 
	 * 积分兑换奖品信息
	 */
	@ApiField("item_exchange_info")
	private ItemExchangeInfo itemExchangeInfo;

	public void setItemExchangeInfo(ItemExchangeInfo itemExchangeInfo) {
		this.itemExchangeInfo = itemExchangeInfo;
	}
	public ItemExchangeInfo getItemExchangeInfo( ) {
		return this.itemExchangeInfo;
	}

}
