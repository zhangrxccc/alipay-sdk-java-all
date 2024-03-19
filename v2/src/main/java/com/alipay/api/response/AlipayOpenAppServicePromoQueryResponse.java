package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ServicePromoBaseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:18:34
 */
public class AlipayOpenAppServicePromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2652123458898575483L;

	/** 
	 * 编辑中版本的服务场景素材详情
	 */
	@ApiField("editing_service_promo")
	private ServicePromoBaseVO editingServicePromo;

	/** 
	 * 生效版本的服务场景素材详情
	 */
	@ApiField("valid_service_promo")
	private ServicePromoBaseVO validServicePromo;

	public void setEditingServicePromo(ServicePromoBaseVO editingServicePromo) {
		this.editingServicePromo = editingServicePromo;
	}
	public ServicePromoBaseVO getEditingServicePromo( ) {
		return this.editingServicePromo;
	}

	public void setValidServicePromo(ServicePromoBaseVO validServicePromo) {
		this.validServicePromo = validServicePromo;
	}
	public ServicePromoBaseVO getValidServicePromo( ) {
		return this.validServicePromo;
	}

}
