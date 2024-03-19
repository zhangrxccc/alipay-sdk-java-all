package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包提现扩展参数
 *
 * @author auto create
 * @since 1.0, 2024-03-08 17:44:23
 */
public class WithdrawExtend extends AlipayObject {

	private static final long serialVersionUID = 7141914137865526136L;

	/**
	 * 专项金额
	 */
	@ApiField("category_condition")
	private String categoryCondition;

	public String getCategoryCondition() {
		return this.categoryCondition;
	}
	public void setCategoryCondition(String categoryCondition) {
		this.categoryCondition = categoryCondition;
	}

}
