package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.contract.merchant.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 06:11:43
 */
public class AlipayFinancialnetAuthContractMerchantSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2488495517435885887L;

	/** 
	 * 合约批次号
	 */
	@ApiField("contract_batch_no")
	private String contractBatchNo;

	/** 
	 * 合约号
	 */
	@ApiListField("contract_no_list")
	@ApiField("string")
	private List<String> contractNoList;

	public void setContractBatchNo(String contractBatchNo) {
		this.contractBatchNo = contractBatchNo;
	}
	public String getContractBatchNo( ) {
		return this.contractBatchNo;
	}

	public void setContractNoList(List<String> contractNoList) {
		this.contractNoList = contractNoList;
	}
	public List<String> getContractNoList( ) {
		return this.contractNoList;
	}

}
