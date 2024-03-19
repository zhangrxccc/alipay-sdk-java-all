package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失效商家人群包
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:56:26
 */
public class AlipayMerchantQipanCrowdInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 8867511751273736356L;

	/**
	 * 支付宝人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

}
