package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.monitor.metric.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-07 14:06:58
 */
public class AlipayCloudCloudbaseMonitorMetricQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1316246436111514574L;

	/** 
	 * 指标数据（数据样例：[[1693819500000,\"0.0\"],[1693820100000,\"0.0\"]]），整体内部数据展示为【时间戳，数值】的方式
	 */
	@ApiField("metrics")
	private String metrics;

	public void setMetrics(String metrics) {
		this.metrics = metrics;
	}
	public String getMetrics( ) {
		return this.metrics;
	}

}
