package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WarehouseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.warehouse.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsWarehouseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8471278177138531314L;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 仓库信息
	 */
	@ApiListField("warehouses")
	@ApiField("warehouse_v_o")
	private List<WarehouseVO> warehouses;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWarehouses(List<WarehouseVO> warehouses) {
		this.warehouses = warehouses;
	}
	public List<WarehouseVO> getWarehouses( ) {
		return this.warehouses;
	}

}
