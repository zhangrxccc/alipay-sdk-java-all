package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消预订单
 *
 * @author auto create
 * @since 1.0, 2021-04-30 16:46:37
 */
public class AlipayOverseasOpenPreorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8453459665681789564L;

	/**
	 * 机构信息
	 */
	@ApiField("agent_info")
	private TuitionISVAgentInfoDTO agentInfo;

	/**
	 * 单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public TuitionISVAgentInfoDTO getAgentInfo() {
		return this.agentInfo;
	}
	public void setAgentInfo(TuitionISVAgentInfoDTO agentInfo) {
		this.agentInfo = agentInfo;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

}
