package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.caas.blacklist.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:08:38
 */
public class AlipayFincoreComplianceCaasBlacklistConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3392776136887375189L;

	/** 
	 * result_code + 咨询的结果code + 枚举值：ALLOW（允许，标识未在黑名单中）、NOT_ALLOW（标识在黑名单中）、UN_PROCESS（标识服务降级or未有准确结果，需要调用方兜底处理）
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
