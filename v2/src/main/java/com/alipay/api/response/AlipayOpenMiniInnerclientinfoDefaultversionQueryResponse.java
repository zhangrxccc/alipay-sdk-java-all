package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MiniAppClientVersionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerclientinfo.defaultversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:02:34
 */
public class AlipayOpenMiniInnerclientinfoDefaultversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5613458975738833536L;

	/** 
	 * Android客户端版本信息
	 */
	@ApiField("android_client_version_info")
	private MiniAppClientVersionInfo androidClientVersionInfo;

	/** 
	 * iOS客户单版本号信息
	 */
	@ApiField("ios_client_version_info")
	private MiniAppClientVersionInfo iosClientVersionInfo;

	public void setAndroidClientVersionInfo(MiniAppClientVersionInfo androidClientVersionInfo) {
		this.androidClientVersionInfo = androidClientVersionInfo;
	}
	public MiniAppClientVersionInfo getAndroidClientVersionInfo( ) {
		return this.androidClientVersionInfo;
	}

	public void setIosClientVersionInfo(MiniAppClientVersionInfo iosClientVersionInfo) {
		this.iosClientVersionInfo = iosClientVersionInfo;
	}
	public MiniAppClientVersionInfo getIosClientVersionInfo( ) {
		return this.iosClientVersionInfo;
	}

}
