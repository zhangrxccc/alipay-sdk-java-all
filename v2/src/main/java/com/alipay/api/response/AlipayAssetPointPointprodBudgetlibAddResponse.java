package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:46:20
 */
public class AlipayAssetPointPointprodBudgetlibAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1327462717394677688L;

	/** 
	 * 当order_no发生幂等时返回的错误信息
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
