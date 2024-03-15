package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除自定义域名
 *
 * @author auto create
 * @since 1.0, 2023-10-09 13:45:19
 */
public class AlipayCloudCloudrunStaticsiteDomainDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4839911981585189524L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 域名。请输入你的自定义域名。
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * env-000000000001
	 */
	@ApiField("env")
	private String env;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
