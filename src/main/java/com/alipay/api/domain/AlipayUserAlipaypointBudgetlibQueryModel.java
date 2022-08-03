package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询集分宝预算库详情
 *
 * @author auto create
 * @since 1.0, 2022-07-07 16:47:50
 */
public class AlipayUserAlipaypointBudgetlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7625277298544758817L;

	/**
	 * 集分宝预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	public String getBudgetCode() {
		return this.budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

}
