package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseservice.bindservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:11:45
 */
public class AlipayEbppInvoiceEnterpriseserviceBindserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1685896185297283165L;

	/** 
	 * 服务产品列表
	 */
	@ApiListField("service_product_list")
	@ApiField("service_product_info")
	private List<ServiceProductInfo> serviceProductList;

	public void setServiceProductList(List<ServiceProductInfo> serviceProductList) {
		this.serviceProductList = serviceProductList;
	}
	public List<ServiceProductInfo> getServiceProductList( ) {
		return this.serviceProductList;
	}

}
