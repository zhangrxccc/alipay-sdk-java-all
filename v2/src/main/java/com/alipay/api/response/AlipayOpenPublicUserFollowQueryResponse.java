package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.follow.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:56:50
 */
public class AlipayOpenPublicUserFollowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7464578676277785831L;

	/** 
	 * 用户是否关注。枚举值如下：
*T：代表已关注。
*F：代表未关注。
	 */
	@ApiField("is_follow")
	private String isFollow;

	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}
	public String getIsFollow( ) {
		return this.isFollow;
	}

}
