package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.business.analysis.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 18:07:37
 */
public class AlipayDataDataserviceBusinessAnalysisCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3327942537973592327L;

	/** 
	 * 商圈分析任务ID，唯一
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
