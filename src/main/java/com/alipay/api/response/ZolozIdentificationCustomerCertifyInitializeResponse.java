package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certify.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-16 19:20:24
 */
public class ZolozIdentificationCustomerCertifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1548663668144617344L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 实人认证id
	 */
	@ApiField("zim_id")
	private String zimId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setZimId(String zimId) {
		this.zimId = zimId;
	}
	public String getZimId( ) {
		return this.zimId;
	}

}
