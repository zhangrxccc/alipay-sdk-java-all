package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.promo.ticket.push response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:54:28
 */
public class AlipayEcoMycarPromoTicketPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 3282989897624834199L;

	/** 
	 * 处理结果返回码
	 */
	@ApiField("sp_apply_no")
	private String spApplyNo;

	public void setSpApplyNo(String spApplyNo) {
		this.spApplyNo = spApplyNo;
	}
	public String getSpApplyNo( ) {
		return this.spApplyNo;
	}

}
