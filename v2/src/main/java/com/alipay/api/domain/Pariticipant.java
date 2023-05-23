package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询主体信息
 *
 * @author auto create
 * @since 1.0, 2023-02-22 00:26:29
 */
public class Pariticipant extends AlipayObject {

	private static final long serialVersionUID = 8482798252828633725L;

	/**
	 * 风控主体标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 风控主体标识类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 风控主体名称
	 */
	@ApiField("name")
	private String name;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
