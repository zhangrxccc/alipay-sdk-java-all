package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品同步结果查询
 *
 * @author auto create
 * @since 1.0, 2021-09-02 19:32:29
 */
public class AlipayOverseasTravelGoodsSyncresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2124195271316441318L;

	/**
	 * 外部商户或第三方的商品ID
	 */
	@ApiField("out_goods_id")
	private String outGoodsId;

	/**
	 * 外部店铺ID，对于特定行业可选，比如GOL线上商品的场景非必填
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 同步单据id，跨境电商场景必传
	 */
	@ApiField("sync_order_id")
	private String syncOrderId;

	public String getOutGoodsId() {
		return this.outGoodsId;
	}
	public void setOutGoodsId(String outGoodsId) {
		this.outGoodsId = outGoodsId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getSyncOrderId() {
		return this.syncOrderId;
	}
	public void setSyncOrderId(String syncOrderId) {
		this.syncOrderId = syncOrderId;
	}

}
