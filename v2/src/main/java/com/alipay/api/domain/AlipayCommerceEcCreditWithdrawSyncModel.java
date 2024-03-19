package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资方授信审批结果同步
 *
 * @author auto create
 * @since 1.0, 2023-10-10 15:11:17
 */
public class AlipayCommerceEcCreditWithdrawSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4534324459495322445L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_pay_no")
	private String alipayPayNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * bank_bill_no: 银行转账单号, 取款成功时填写
withdraw_serial_no: 资方内部取款单号, 取款成功时填写
	 */
	@ApiField("ext_info")
	private BankOrderInfo extInfo;

	/**
	 * 审核失败原因，情况状态为APPROVE_FAIL时必填
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 取款方的真实业务订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 请款状态，枚举
审核通过：APPROVE_PASS
审核失败：APPROVE_FAIL
取款成功: WITHDRAW_SUCCESS
	 */
	@ApiField("result")
	private String result;

	public String getAlipayPayNo() {
		return this.alipayPayNo;
	}
	public void setAlipayPayNo(String alipayPayNo) {
		this.alipayPayNo = alipayPayNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public BankOrderInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(BankOrderInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
