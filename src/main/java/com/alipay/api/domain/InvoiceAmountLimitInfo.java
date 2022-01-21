package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票限额信息
 *
 * @author auto create
 * @since 1.0, 2020-05-21 14:50:35
 */
public class InvoiceAmountLimitInfo extends AlipayObject {

	private static final long serialVersionUID = 3146197654993494317L;

	/**
	 * 单张发票限额，单位元
	 */
	@ApiField("amount_limit")
	private String amountLimit;

	/**
	 * 税号可开发票类型，列表类型。 可选值： 增值税电子普通发票：PLAIN, 增值税专用发票：SPECIAL， 增值税普通发票：PLAIN_INVOICE，增值税普通发票(卷式)：PAPER_INVOICE
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 月发票限额，单位元
	 */
	@ApiField("month_amount_limit")
	private String monthAmountLimit;

	public String getAmountLimit() {
		return this.amountLimit;
	}
	public void setAmountLimit(String amountLimit) {
		this.amountLimit = amountLimit;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getMonthAmountLimit() {
		return this.monthAmountLimit;
	}
	public void setMonthAmountLimit(String monthAmountLimit) {
		this.monthAmountLimit = monthAmountLimit;
	}

}
