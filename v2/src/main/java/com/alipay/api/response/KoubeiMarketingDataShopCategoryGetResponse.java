package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Category;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.shop.category.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:30:18
 */
public class KoubeiMarketingDataShopCategoryGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1464749655246271872L;

	/** 
	 * 指定数量的店铺分类信息
	 */
	@ApiListField("category_list")
	@ApiField("category")
	private List<Category> categoryList;

	/** 
	 * 剩余的店铺分类
	 */
	@ApiField("other")
	private Category other;

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	public List<Category> getCategoryList( ) {
		return this.categoryList;
	}

	public void setOther(Category other) {
		this.other = other;
	}
	public Category getOther( ) {
		return this.other;
	}

}
