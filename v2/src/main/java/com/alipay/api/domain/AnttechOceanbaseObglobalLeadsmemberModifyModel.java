package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给纷享销客的更新商机成员的接口
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:22:10
 */
public class AnttechOceanbaseObglobalLeadsmemberModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3755586886183239692L;

	/**
	 * 提供给纷享销客的更新商机成员的接口的参数
	 */
	@ApiField("fxiaoke_update_leads_member_request")
	private FxiaokeOperateLeadsMemberParams fxiaokeUpdateLeadsMemberRequest;

	public FxiaokeOperateLeadsMemberParams getFxiaokeUpdateLeadsMemberRequest() {
		return this.fxiaokeUpdateLeadsMemberRequest;
	}
	public void setFxiaokeUpdateLeadsMemberRequest(FxiaokeOperateLeadsMemberParams fxiaokeUpdateLeadsMemberRequest) {
		this.fxiaokeUpdateLeadsMemberRequest = fxiaokeUpdateLeadsMemberRequest;
	}

}
