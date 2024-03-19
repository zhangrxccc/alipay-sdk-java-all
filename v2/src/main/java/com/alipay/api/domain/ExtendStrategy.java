package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现使用的扩展策略
 *
 * @author auto create
 * @since 1.0, 2023-12-01 15:47:43
 */
public class ExtendStrategy extends AlipayObject {

	private static final long serialVersionUID = 3253559895552513251L;

	/**
	 * 账户信息
	 */
	@ApiField("participant_form")
	private ParticipantForm participantForm;

	/**
	 * 提现策略，当前支持同人账户提现（策略key: withdrawToSamePersonAccount）
	 */
	@ApiField("strategy")
	private String strategy;

	public ParticipantForm getParticipantForm() {
		return this.participantForm;
	}
	public void setParticipantForm(ParticipantForm participantForm) {
		this.participantForm = participantForm;
	}

	public String getStrategy() {
		return this.strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

}
