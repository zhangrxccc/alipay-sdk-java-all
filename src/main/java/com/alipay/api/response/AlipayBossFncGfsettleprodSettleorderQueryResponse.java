package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayRcvSettleOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.settleorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-28 14:24:58
 */
public class AlipayBossFncGfsettleprodSettleorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8691579769198896376L;

	/** 
	 * 结果
	 */
	@ApiListField("result_set")
	@ApiField("pay_rcv_settle_order_d_t_o")
	private List<PayRcvSettleOrderDTO> resultSet;

	public void setResultSet(List<PayRcvSettleOrderDTO> resultSet) {
		this.resultSet = resultSet;
	}
	public List<PayRcvSettleOrderDTO> getResultSet( ) {
		return this.resultSet;
	}

}
