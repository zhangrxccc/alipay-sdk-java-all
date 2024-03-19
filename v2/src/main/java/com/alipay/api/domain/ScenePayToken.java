package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付凭证
 *
 * @author auto create
 * @since 1.0, 2024-03-12 14:15:58
 */
public class ScenePayToken extends AlipayObject {

	private static final long serialVersionUID = 4742677188322923426L;

	/**
	 * 场景支付凭证
	 */
	@ApiField("scene_pay_token")
	private String scenePayToken;

	/**
	 * 场景支付二维码
	 */
	@ApiField("scene_pay_token_type")
	private String scenePayTokenType;

	public String getScenePayToken() {
		return this.scenePayToken;
	}
	public void setScenePayToken(String scenePayToken) {
		this.scenePayToken = scenePayToken;
	}

	public String getScenePayTokenType() {
		return this.scenePayTokenType;
	}
	public void setScenePayTokenType(String scenePayTokenType) {
		this.scenePayTokenType = scenePayTokenType;
	}

}
