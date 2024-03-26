package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenPolicyDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.singleissue.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-25 11:21:59
 */
public class AlipayInsSceneEcommerceSingleissueApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4712785251335336867L;

	/** 
	 * 保单摘要数据
	 */
	@ApiField("policy_digest")
	private InsOpenPolicyDigestDTO policyDigest;

	public void setPolicyDigest(InsOpenPolicyDigestDTO policyDigest) {
		this.policyDigest = policyDigest;
	}
	public InsOpenPolicyDigestDTO getPolicyDigest( ) {
		return this.policyDigest;
	}

}
