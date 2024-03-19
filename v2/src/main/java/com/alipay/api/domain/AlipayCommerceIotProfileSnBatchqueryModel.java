package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询申请单中的设备sn
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:51:21
 */
public class AlipayCommerceIotProfileSnBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5213439598162114916L;

	/**
	 * 申请单id
	 */
	@ApiField("apply_id")
	private Long applyId;

	public Long getApplyId() {
		return this.applyId;
	}
	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}

}
