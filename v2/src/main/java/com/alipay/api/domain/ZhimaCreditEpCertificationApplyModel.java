package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用认证页面申请（页面接口）
 *
 * @author auto create
 * @since 1.0, 2023-11-02 21:01:19
 */
public class ZhimaCreditEpCertificationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1642719947958632954L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 商户指定的设备类型，不填则前端根据实际设备类型自动路由
	 */
	@ApiField("device_type")
	private String deviceType;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

}
