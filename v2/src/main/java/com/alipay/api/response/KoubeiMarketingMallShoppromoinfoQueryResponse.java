package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopPromoInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.mall.shoppromoinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:28:14
 */
public class KoubeiMarketingMallShoppromoinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8898611478499359971L;

	/** 
	 * 店铺营销信息详情
	 */
	@ApiListField("shop_promo_infos")
	@ApiField("shop_promo_info")
	private List<ShopPromoInfo> shopPromoInfos;

	public void setShopPromoInfos(List<ShopPromoInfo> shopPromoInfos) {
		this.shopPromoInfos = shopPromoInfos;
	}
	public List<ShopPromoInfo> getShopPromoInfos( ) {
		return this.shopPromoInfos;
	}

}
