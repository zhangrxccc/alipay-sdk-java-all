package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:26:44
 */
public class AlipayBusinessRelationShopDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7189641811571693792L;

	/** 
	 * 删除的商业关系门店id
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
