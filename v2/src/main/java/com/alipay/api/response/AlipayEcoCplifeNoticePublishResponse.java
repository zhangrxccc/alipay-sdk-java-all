package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:20:39
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7829545975225118877L;

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
