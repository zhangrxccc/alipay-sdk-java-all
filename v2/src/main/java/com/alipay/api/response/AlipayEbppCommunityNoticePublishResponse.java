package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:35:27
 */
public class AlipayEbppCommunityNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8857315869211411154L;

	/** 
	 * 公告id
	 */
	@ApiField("alipay_notice_id")
	private Long alipayNoticeId;

	public void setAlipayNoticeId(Long alipayNoticeId) {
		this.alipayNoticeId = alipayNoticeId;
	}
	public Long getAlipayNoticeId( ) {
		return this.alipayNoticeId;
	}

}
