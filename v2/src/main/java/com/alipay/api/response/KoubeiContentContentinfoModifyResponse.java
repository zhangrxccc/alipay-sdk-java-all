package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:01:09
 */
public class KoubeiContentContentinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6895144735346363439L;

	/** 
	 * 内容id
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 全链路Id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
