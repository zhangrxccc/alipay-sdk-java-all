package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前后端埋点
 *
 * @author auto create
 * @since 1.0, 2023-10-10 20:55:20
 */
public class AlipayOpenOperationOpenapiEnventrackingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2591735748373893796L;

	/**
	 * 参数描述
	 */
	@ApiField("u_tset")
	private String uTset;

	public String getuTset() {
		return this.uTset;
	}
	public void setuTset(String uTset) {
		this.uTset = uTset;
	}

}
