package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.task.template.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:42:53
 */
public class AlipayCommerceTaskTemplatePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 2692143125453955799L;

	/** 
	 * 任务模版
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
