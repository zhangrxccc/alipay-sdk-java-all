package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiTenantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.tenantquerybytntid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-26 10:41:56
 */
public class AlipayIserviceIsresourceTenantquerybytntidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6617528967277651535L;

	/** 
	 * 查询的租户信息
	 */
	@ApiField("biz_data")
	private OpenApiTenantInfo bizData;

	public void setBizData(OpenApiTenantInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiTenantInfo getBizData( ) {
		return this.bizData;
	}

}
