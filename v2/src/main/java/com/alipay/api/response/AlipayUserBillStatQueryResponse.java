package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.bill.stat.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:45:10
 */
public class AlipayUserBillStatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5711579887922843941L;

	/** 
	 * 实付金额，单位元
	 */
	@ApiField("expenditure_amount")
	private String expenditureAmount;

	/** 
	 * 实收金额，单位元
	 */
	@ApiField("income_amount")
	private String incomeAmount;

	public void setExpenditureAmount(String expenditureAmount) {
		this.expenditureAmount = expenditureAmount;
	}
	public String getExpenditureAmount( ) {
		return this.expenditureAmount;
	}

	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	public String getIncomeAmount( ) {
		return this.incomeAmount;
	}

}
