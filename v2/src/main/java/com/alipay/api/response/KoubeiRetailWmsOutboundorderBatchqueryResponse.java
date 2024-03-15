package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OutboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:46:07
 */
public class KoubeiRetailWmsOutboundorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6513653125151136793L;

	/** 
	 * 出库通知单列表
	 */
	@ApiListField("outbound_order_vo_list")
	@ApiField("outbound_order_v_o")
	private List<OutboundOrderVO> outboundOrderVoList;

	public void setOutboundOrderVoList(List<OutboundOrderVO> outboundOrderVoList) {
		this.outboundOrderVoList = outboundOrderVoList;
	}
	public List<OutboundOrderVO> getOutboundOrderVoList( ) {
		return this.outboundOrderVoList;
	}

}
