package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:44:09
 */
public class KoubeiCateringPosMaterialDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4547828183451136426L;

	/** 
	 * 配料id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
