package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.pid.unwriteoff.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:50:25
 */
public class AlipayBossFncPidUnwriteoffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6315564462249325723L;

	/** 
	 * true表示正在核销，false表示当前没有核销的单据
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
