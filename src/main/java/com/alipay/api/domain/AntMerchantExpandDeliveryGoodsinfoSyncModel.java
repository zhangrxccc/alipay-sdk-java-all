package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流发货校验接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 16:01:43
 */
public class AntMerchantExpandDeliveryGoodsinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5842463811915155724L;

	/**
	 * 配送指令ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 扩展信息，map的json String
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 发货标签，全局唯一
	 */
	@ApiField("send_goods_tag")
	private String sendGoodsTag;

	/**
	 * 标签类型
	 */
	@ApiField("tag_type")
	private String tagType;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getSendGoodsTag() {
		return this.sendGoodsTag;
	}
	public void setSendGoodsTag(String sendGoodsTag) {
		this.sendGoodsTag = sendGoodsTag;
	}

	public String getTagType() {
		return this.tagType;
	}
	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

}
