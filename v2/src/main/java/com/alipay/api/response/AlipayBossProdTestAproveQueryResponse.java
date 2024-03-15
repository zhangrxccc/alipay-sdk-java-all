package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.test.aprove.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:38
 */
public class AlipayBossProdTestAproveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1627945512322627895L;

	/** 
	 * test
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/** 
	 * test
	 */
	@ApiField("out_uid")
	private String outUid;

	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}
	public String getOutOpenId( ) {
		return this.outOpenId;
	}

	public void setOutUid(String outUid) {
		this.outUid = outUid;
	}
	public String getOutUid( ) {
		return this.outUid;
	}

}
