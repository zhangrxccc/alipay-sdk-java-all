package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.activity.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:56:39
 */
public class AlipayInsSceneHealthActivitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2656887841523493318L;

	/** 
	 * 申请编号，成功返回原申请编号，失败为空
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
