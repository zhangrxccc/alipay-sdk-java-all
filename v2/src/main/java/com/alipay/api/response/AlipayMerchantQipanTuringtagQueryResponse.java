package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CrowdOperationNode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.turingtag.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:42:01
 */
public class AlipayMerchantQipanTuringtagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8257852153267353853L;

	/** 
	 * 节点列表
	 */
	@ApiListField("node_list")
	@ApiField("crowd_operation_node")
	private List<CrowdOperationNode> nodeList;

	public void setNodeList(List<CrowdOperationNode> nodeList) {
		this.nodeList = nodeList;
	}
	public List<CrowdOperationNode> getNodeList( ) {
		return this.nodeList;
	}

}
