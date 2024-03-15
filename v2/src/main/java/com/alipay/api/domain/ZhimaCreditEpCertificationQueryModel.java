package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用认证结果查询
 *
 * @author auto create
 * @since 1.0, 2023-09-15 13:57:51
 */
public class ZhimaCreditEpCertificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7434512632828594537L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
