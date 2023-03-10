package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DefiCustUserDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.customer.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:54:29
 */
public class AnttechBlockchainDefinCustomerUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6866654114695438454L;

	/** 
	 * 用户信息
	 */
	@ApiListField("user_info_list")
	@ApiField("defi_cust_user_d_t_o")
	private List<DefiCustUserDTO> userInfoList;

	public void setUserInfoList(List<DefiCustUserDTO> userInfoList) {
		this.userInfoList = userInfoList;
	}
	public List<DefiCustUserDTO> getUserInfoList( ) {
		return this.userInfoList;
	}

}
