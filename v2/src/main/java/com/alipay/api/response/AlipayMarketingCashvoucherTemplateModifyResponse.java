package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashvoucher.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:57:20
 */
public class AlipayMarketingCashvoucherTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1769975966148337893L;

	/** 
	 * 模板修改时的状态，I表示草稿状态所有入参都修改了，S表示生效状态仅修改了publish_end_time
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
