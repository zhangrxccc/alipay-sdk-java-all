package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HealthDrugCatalogueItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.drugcatalogue.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:06:13
 */
public class AlipayInsSceneHealthDrugcatalogueBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2543973421816681568L;

	/** 
	 * 药品列表
	 */
	@ApiListField("drug_item_list")
	@ApiField("health_drug_catalogue_item")
	private List<HealthDrugCatalogueItem> drugItemList;

	public void setDrugItemList(List<HealthDrugCatalogueItem> drugItemList) {
		this.drugItemList = drugItemList;
	}
	public List<HealthDrugCatalogueItem> getDrugItemList( ) {
		return this.drugItemList;
	}

}
