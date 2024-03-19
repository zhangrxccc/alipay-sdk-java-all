package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:19:51
 */
public class AntMerchantExpandItemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4143611122481766772L;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

}
