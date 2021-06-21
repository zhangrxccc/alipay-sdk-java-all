package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新版花呗分期商家贴息活动下架接口
 *
 * @author auto create
 * @since 1.0, 2020-11-23 10:58:44
 */
public class AlipayPcreditHuabeiMerchantActivityOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 2849621717498747635L;

	/**
	 * 商家活动ID，用于唯一确定一个活动
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 外部请求号,用于幂等管理
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
