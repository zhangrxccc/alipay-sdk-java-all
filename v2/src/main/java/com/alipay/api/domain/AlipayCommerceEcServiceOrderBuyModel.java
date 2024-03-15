package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码服务订购
 *
 * @author auto create
 * @since 1.0, 2023-03-28 16:55:28
 */
public class AlipayCommerceEcServiceOrderBuyModel extends AlipayObject {

	private static final long serialVersionUID = 5337422536386526683L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 订购服务的主体ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 订购角色类型
	 */
	@ApiField("buyer_role_type")
	private String buyerRoleType;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 订购的服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerRoleType() {
		return this.buyerRoleType;
	}
	public void setBuyerRoleType(String buyerRoleType) {
		this.buyerRoleType = buyerRoleType;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
