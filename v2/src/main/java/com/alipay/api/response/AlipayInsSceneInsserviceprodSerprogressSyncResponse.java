package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serprogress.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-24 14:43:17
 */
public class AlipayInsSceneInsserviceprodSerprogressSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6812213484839322656L;

	/** 
	 * 进度明细编号(业务主键)
	 */
	@ApiField("progress_no")
	private String progressNo;

	public void setProgressNo(String progressNo) {
		this.progressNo = progressNo;
	}
	public String getProgressNo( ) {
		return this.progressNo;
	}

}
