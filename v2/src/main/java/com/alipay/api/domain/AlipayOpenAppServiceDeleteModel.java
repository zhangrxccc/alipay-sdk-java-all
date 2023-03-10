package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务失效接口
 *
 * @author auto create
 * @since 1.0, 2023-02-13 11:12:13
 */
public class AlipayOpenAppServiceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5178219567791751242L;

	/**
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
