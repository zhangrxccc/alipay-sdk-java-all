package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户资源信息
 *
 * @author auto create
 * @since 1.0, 2023-05-25 11:48:33
 */
public class OpenApiUserResourceInfo extends AlipayObject {

	private static final long serialVersionUID = 7883154923466144466L;

	/**
	 * 客服小二的2088id
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * antbuservice域账号
	 */
	@ApiField("busvc_domain")
	private String busvcDomain;

	/**
	 * antbuserviceId
	 */
	@ApiField("busvc_id")
	private String busvcId;

	/**
	 * antbuservice工号
	 */
	@ApiField("busvc_no")
	private String busvcNo;

	/**
	 * 旧平台用户id
	 */
	@ApiField("clv_user_id")
	private Long clvUserId;

	/**
	 * 用户资源id
	 */
	@ApiField("ur_id")
	private String urId;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getBusvcDomain() {
		return this.busvcDomain;
	}
	public void setBusvcDomain(String busvcDomain) {
		this.busvcDomain = busvcDomain;
	}

	public String getBusvcId() {
		return this.busvcId;
	}
	public void setBusvcId(String busvcId) {
		this.busvcId = busvcId;
	}

	public String getBusvcNo() {
		return this.busvcNo;
	}
	public void setBusvcNo(String busvcNo) {
		this.busvcNo = busvcNo;
	}

	public Long getClvUserId() {
		return this.clvUserId;
	}
	public void setClvUserId(Long clvUserId) {
		this.clvUserId = clvUserId;
	}

	public String getUrId() {
		return this.urId;
	}
	public void setUrId(String urId) {
		this.urId = urId;
	}

}
