package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.spaceinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:45:26
 */
public class AlipayEcoMycarParkingSpaceinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3243523622277412112L;

	/** 
	 * 同步结果：0 成功，1 失败
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
