package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userquerybyclvuids.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:36:43
 */
public class AlipayIserviceIsresourceUserquerybyclvuidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1561827281858246579L;

	/** 
	 * 相关用户信息
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_user_info")
	private List<OpenApiUserInfo> bizData;

	public void setBizData(List<OpenApiUserInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiUserInfo> getBizData( ) {
		return this.bizData;
	}

}
