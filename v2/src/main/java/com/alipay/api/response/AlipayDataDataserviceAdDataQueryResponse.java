package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 19:05:59
 */
public class AlipayDataDataserviceAdDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1617553834385973866L;

	/** 
	 * 汇总结果数据列表
	 */
	@ApiListField("data_list")
	@ApiField("data_detail")
	private List<DataDetail> dataList;

	public void setDataList(List<DataDetail> dataList) {
		this.dataList = dataList;
	}
	public List<DataDetail> getDataList( ) {
		return this.dataList;
	}

}
