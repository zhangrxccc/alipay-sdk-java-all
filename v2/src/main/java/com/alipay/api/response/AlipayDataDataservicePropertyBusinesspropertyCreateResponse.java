package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.property.businessproperty.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:30:59
 */
public class AlipayDataDataservicePropertyBusinesspropertyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6868235482918424919L;

	/** 
	 * 业务画像标签id
	 */
	@ApiField("business_property_id")
	private String businessPropertyId;

	public void setBusinessPropertyId(String businessPropertyId) {
		this.businessPropertyId = businessPropertyId;
	}
	public String getBusinessPropertyId( ) {
		return this.businessPropertyId;
	}

}
