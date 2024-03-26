package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸检测初始化
 *
 * @author auto create
 * @since 1.0, 2023-12-13 19:30:50
 */
public class DatadigitalFincloudGeneralsaasFaceCheckInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1891993875326645399L;

	/**
	 * DATA_DIGITAL_BIZ_CODE_FACE_CHECK_LIVE，代表活体检测。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 客户业务单据号。
	 */
	@ApiField("outer_order_no")
	private String outerOrderNo;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}
	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
	}

}
