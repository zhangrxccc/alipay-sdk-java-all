package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BsEnrollParticipant;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.enroll.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:56
 */
public class AlipayCommerceOperationBsEnrollSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4389843261633315992L;

	/** 
	 * 处理失败的参与者列表
	 */
	@ApiListField("failed_participants")
	@ApiField("bs_enroll_participant")
	private List<BsEnrollParticipant> failedParticipants;

	public void setFailedParticipants(List<BsEnrollParticipant> failedParticipants) {
		this.failedParticipants = failedParticipants;
	}
	public List<BsEnrollParticipant> getFailedParticipants( ) {
		return this.failedParticipants;
	}

}
