package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-26 16:38:13
 */
public class AlipayBusinessRelationShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5243848711269891146L;

	/** 
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}
	public String getRealShopId( ) {
		return this.realShopId;
	}

}
