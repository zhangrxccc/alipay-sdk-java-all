package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.template.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-18 15:31:51
 */
public class AlipayFinancialnetAuthEcsignTemplateSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1248473839848535891L;

	/** 
	 * 合同模板ID，如果存在则为唯一值，由系统生成，在保存成功后会返回该值。
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
