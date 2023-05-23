package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateNewModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-08 15:41:50
 */
public class AlipayFincoreComplianceTemplateTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6116978183484292251L;

	/** 
	 * 模板列表
	 */
	@ApiListField("template_new_models")
	@ApiField("template_new_model_d_t_o")
	private List<TemplateNewModelDTO> templateNewModels;

	public void setTemplateNewModels(List<TemplateNewModelDTO> templateNewModels) {
		this.templateNewModels = templateNewModels;
	}
	public List<TemplateNewModelDTO> getTemplateNewModels( ) {
		return this.templateNewModels;
	}

}
