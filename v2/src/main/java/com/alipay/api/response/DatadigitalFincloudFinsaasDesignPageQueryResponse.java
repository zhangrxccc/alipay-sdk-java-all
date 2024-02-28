package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.design.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:41:32
 */
public class DatadigitalFincloudFinsaasDesignPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2262122822133754911L;

	/** 
	 * pageCode
	 */
	@ApiField("page_code")
	private String pageCode;

	/** 
	 * 页面id
	 */
	@ApiField("page_id")
	private Long pageId;

	/** 
	 * 页面详情
	 */
	@ApiField("page_info")
	private PageInfoDTO pageInfo;

	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}
	public String getPageCode( ) {
		return this.pageCode;
	}

	public void setPageId(Long pageId) {
		this.pageId = pageId;
	}
	public Long getPageId( ) {
		return this.pageId;
	}

	public void setPageInfo(PageInfoDTO pageInfo) {
		this.pageInfo = pageInfo;
	}
	public PageInfoDTO getPageInfo( ) {
		return this.pageInfo;
	}

}
