package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.appkeyword.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 18:27:01
 */
public class AlipayOpenSearchAppkeywordApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5392775238631612984L;

	/** 
	 * 提报之后的后台审核工单的id
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
