package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsQuoteDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.quote.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:39:41
 */
public class AlipayInsSceneQuoteDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6531253529483446252L;

	/** 
	 * 报价详情
	 */
	@ApiField("quote_detail")
	private InsQuoteDTO quoteDetail;

	public void setQuoteDetail(InsQuoteDTO quoteDetail) {
		this.quoteDetail = quoteDetail;
	}
	public InsQuoteDTO getQuoteDetail( ) {
		return this.quoteDetail;
	}

}
