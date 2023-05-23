package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceServiceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.servicemodel.servicelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:44:43
 */
public class AlipayCommerceIotServicemodelServicelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879992918862337284L;

	/** 
	 * 设备服务列表
	 */
	@ApiListField("list")
	@ApiField("device_service_v_o")
	private List<DeviceServiceVO> list;

	public void setList(List<DeviceServiceVO> list) {
		this.list = list;
	}
	public List<DeviceServiceVO> getList( ) {
		return this.list;
	}

}
