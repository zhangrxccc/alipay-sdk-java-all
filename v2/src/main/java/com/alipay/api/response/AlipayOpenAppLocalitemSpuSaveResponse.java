package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.localitem.spu.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-30 20:21:56
 */
public class AlipayOpenAppLocalitemSpuSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4552993666348125298L;

	/** 
	 * 标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}
	public String getSpuId( ) {
		return this.spuId;
	}

}
