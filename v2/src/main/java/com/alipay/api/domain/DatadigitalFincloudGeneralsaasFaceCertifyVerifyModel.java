package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身服务开始认证
 *
 * @author auto create
 * @since 1.0, 2023-05-17 09:45:13
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6158263118782731377L;

	/**
	 * 本次申请操作的唯一标识，由H5人脸核身初始化接口调用后生成，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
