package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容状态查询
 *
 * @author auto create
 * @since 1.0, 2023-02-27 21:11:16
 */
public class AlipaySocialBaseContentlibStandardcontentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1696268628461991848L;

	/**
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 生活号+号ID，只有MCN机构为达人号ID查询内容才需要传入
	 */
	@ApiField("public_id")
	private String publicId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
