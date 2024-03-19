package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userwithimage.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-18 20:31:58
 */
public class AlipayOpenIotvspUserwithimageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4594446922279697336L;

	/** 
	 * 相似脸vid
	 */
	@ApiField("similar_vid")
	private String similarVid;

	/** 
	 * 用户唯一标识
	 */
	@ApiField("vid")
	private String vid;

	public void setSimilarVid(String similarVid) {
		this.similarVid = similarVid;
	}
	public String getSimilarVid( ) {
		return this.similarVid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid( ) {
		return this.vid;
	}

}
