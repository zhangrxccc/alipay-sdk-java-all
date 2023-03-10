package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.match.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-08 10:31:19
 */
public class AlipayFincoreComplianceTemplateMatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8297812114427435594L;

	/** 
	 * 模版编码列表
	 */
	@ApiField("template_codes")
	private String templateCodes;

	public void setTemplateCodes(String templateCodes) {
		this.templateCodes = templateCodes;
	}
	public String getTemplateCodes( ) {
		return this.templateCodes;
	}

}
