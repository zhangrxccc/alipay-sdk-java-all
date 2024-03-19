package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单物流信息请求
 *
 * @author auto create
 * @since 1.0, 2020-06-20 11:02:46
 */
public class OrderLogisticsInformationRequest extends AlipayObject {

	private static final long serialVersionUID = 1487361558143834767L;

	/**
	 * 物流公司编号。物流公司编号值请查看<a href="https://opendocs.alipay.com/mini/00au7e?highlight_field=logistics_code" target="_blank">产品文档</a>
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
