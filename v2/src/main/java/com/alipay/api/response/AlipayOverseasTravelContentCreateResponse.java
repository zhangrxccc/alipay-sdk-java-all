package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:36:56
 */
public class AlipayOverseasTravelContentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3434519448738831793L;

	/** 
	 * 可选，仅当请求中的modified_date等于已落地内容的modified_date并且内容状态一致，认为幂等成功，返回Success
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
