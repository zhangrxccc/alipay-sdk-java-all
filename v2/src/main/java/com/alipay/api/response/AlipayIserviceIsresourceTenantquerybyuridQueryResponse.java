package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiTenantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.tenantquerybyurid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-26 10:41:56
 */
public class AlipayIserviceIsresourceTenantquerybyuridQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7667742331113654938L;

	/** 
	 * 相关的租户信息
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_tenant_info")
	private List<OpenApiTenantInfo> bizData;

	public void setBizData(List<OpenApiTenantInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiTenantInfo> getBizData( ) {
		return this.bizData;
	}

}
