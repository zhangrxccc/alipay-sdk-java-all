package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询亚运行程单
 *
 * @author auto create
 * @since 1.0, 2022-06-05 21:00:34
 */
public class AlipayUserAsaingameScheduleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1131966948488718135L;

	/**
	 * 查询场景
	 */
	@ApiField("scene")
	private String scene;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
