package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommunityPartnerRelationDataSyncDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.community.partner.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:19:32
 */
public class AlipayOpenAppCommunityPartnerSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6183383643123251961L;

	/** 
	 * 目标对象数据
	 */
	@ApiListField("target_list")
	@ApiField("community_partner_relation_data_sync_d_t_o")
	private List<CommunityPartnerRelationDataSyncDTO> targetList;

	public void setTargetList(List<CommunityPartnerRelationDataSyncDTO> targetList) {
		this.targetList = targetList;
	}
	public List<CommunityPartnerRelationDataSyncDTO> getTargetList( ) {
		return this.targetList;
	}

}
