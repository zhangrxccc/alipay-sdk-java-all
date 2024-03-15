package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-18 14:56:46
 */
public class AlipayCloudCloudbaseHttpaccessBindModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5542418546161452713L;

	/** 
	 * 是否修改成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
