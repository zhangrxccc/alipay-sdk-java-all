package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.querycondition.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:38:50
 */
public class AnttechBlockchainQueryconditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7871321119828566625L;

	/** 
	 * 春天来了
	 */
	@ApiField("season")
	private String season;

	public void setSeason(String season) {
		this.season = season;
	}
	public String getSeason( ) {
		return this.season;
	}

}
