package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.riskctl.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:30:02
 */
public class AnttechBlockchainDefinDataserviceRiskctlSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8362989193127412677L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
