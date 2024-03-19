package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容商品批量查询
 *
 * @author auto create
 * @since 1.0, 2023-02-22 15:11:07
 */
public class AlipayOpenAppAppcontentItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6886788276118235231L;

	/**
	 * 商品ID列表；最多20个ID
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

}
