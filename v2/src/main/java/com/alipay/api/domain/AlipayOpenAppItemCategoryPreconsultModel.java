package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目预咨询接口
 *
 * @author auto create
 * @since 1.0, 2023-11-14 19:18:04
 */
public class AlipayOpenAppItemCategoryPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 2185969516594255314L;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
