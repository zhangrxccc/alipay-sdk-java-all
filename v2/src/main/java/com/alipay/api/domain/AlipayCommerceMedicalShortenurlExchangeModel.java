package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗短链生成接口
 *
 * @author auto create
 * @since 1.0, 2023-10-25 21:09:10
 */
public class AlipayCommerceMedicalShortenurlExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 4539497999682732526L;

	/**
	 * 目标链接
	 */
	@ApiField("target_url")
	private String targetUrl;

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

}
