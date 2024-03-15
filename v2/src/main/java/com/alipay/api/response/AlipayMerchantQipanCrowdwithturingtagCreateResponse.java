package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.crowdwithturingtag.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:42:01
 */
public class AlipayMerchantQipanCrowdwithturingtagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247573537944575574L;

	/** 
	 * 圈选出的人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

}
