package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopOrderModifyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.config.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 07:36:50
 */
public class KoubeiCateringConfigModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1899549358771569458L;

	/** 
	 * 每一个店铺修改的结果
	 */
	@ApiListField("config_result_list")
	@ApiField("shop_order_modify_result")
	private List<ShopOrderModifyResult> configResultList;

	public void setConfigResultList(List<ShopOrderModifyResult> configResultList) {
		this.configResultList = configResultList;
	}
	public List<ShopOrderModifyResult> getConfigResultList( ) {
		return this.configResultList;
	}

}
