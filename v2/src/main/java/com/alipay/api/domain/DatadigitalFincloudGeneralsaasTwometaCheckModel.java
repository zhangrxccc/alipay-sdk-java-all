package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份证二要素核验
 *
 * @author auto create
 * @since 1.0, 2024-02-26 16:59:57
 */
public class DatadigitalFincloudGeneralsaasTwometaCheckModel extends AlipayObject {

	private static final long serialVersionUID = 5153752556832674593L;

	/**
	 * 用户姓名，与身份证上的姓名相匹配
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码，如大陆身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件信息类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 客户业务单据号
	 */
	@ApiField("outer_biz_no")
	private String outerBizNo;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOuterBizNo() {
		return this.outerBizNo;
	}
	public void setOuterBizNo(String outerBizNo) {
		this.outerBizNo = outerBizNo;
	}

}
