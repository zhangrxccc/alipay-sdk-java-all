package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ErrorDishStallEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stallerror.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:36:26
 */
public class KoubeiCateringPosStallerrorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8852376974673344823L;

	/** 
	 * 档口异常菜品集合模型
	 */
	@ApiField("error_dish_stall_entity")
	private ErrorDishStallEntity errorDishStallEntity;

	public void setErrorDishStallEntity(ErrorDishStallEntity errorDishStallEntity) {
		this.errorDishStallEntity = errorDishStallEntity;
	}
	public ErrorDishStallEntity getErrorDishStallEntity( ) {
		return this.errorDishStallEntity;
	}

}
