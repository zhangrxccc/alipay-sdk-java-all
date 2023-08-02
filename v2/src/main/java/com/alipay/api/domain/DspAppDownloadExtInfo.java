package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用下载扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-05-18 11:45:44
 */
public class DspAppDownloadExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7382997951287338427L;

	/**
	 * 应用名称
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 应用下载属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
