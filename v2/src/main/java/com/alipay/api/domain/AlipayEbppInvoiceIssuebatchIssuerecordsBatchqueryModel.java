package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手工发放发放明细分页查询
 *
 * @author auto create
 * @since 1.0, 2023-05-11 17:45:18
 */
public class AlipayEbppInvoiceIssuebatchIssuerecordsBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6473945139692591171L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度ID
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 发放批次ID，创建手工发放时返回的issue_batch_id
	 */
	@ApiField("issue_batch_id")
	private String issueBatchId;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getIssueBatchId() {
		return this.issueBatchId;
	}
	public void setIssueBatchId(String issueBatchId) {
		this.issueBatchId = issueBatchId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
