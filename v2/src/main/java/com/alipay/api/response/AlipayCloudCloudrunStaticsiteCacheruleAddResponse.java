package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CacheRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.cacherule.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 13:56:45
 */
public class AlipayCloudCloudrunStaticsiteCacheruleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3147157354955382548L;

	/** 
	 * 缓存配置
	 */
	@ApiField("cacherule")
	private CacheRule cacherule;

	public void setCacherule(CacheRule cacherule) {
		this.cacherule = cacherule;
	}
	public CacheRule getCacherule( ) {
		return this.cacherule;
	}

}
