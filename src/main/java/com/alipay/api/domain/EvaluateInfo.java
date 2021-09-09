package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评价信息
 *
 * @author auto create
 * @since 1.0, 2021-08-17 19:45:29
 */
public class EvaluateInfo extends AlipayObject {

	private static final long serialVersionUID = 2788736898236518699L;

	/**
	 * 评价内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 评价分
	 */
	@ApiField("driver_score")
	private String driverScore;

	/**
	 * 评价id
	 */
	@ApiField("id")
	private String id;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDriverScore() {
		return this.driverScore;
	}
	public void setDriverScore(String driverScore) {
		this.driverScore = driverScore;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
