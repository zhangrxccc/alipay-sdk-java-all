package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CategoryAndParentVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.allcategory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-29 10:27:00
 */
public class AlipayOpenAppItemAllcategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3644465478535428247L;

	/** 
	 * 类目信息
	 */
	@ApiListField("cats")
	@ApiField("category_and_parent_v_o")
	private List<CategoryAndParentVO> cats;

	public void setCats(List<CategoryAndParentVO> cats) {
		this.cats = cats;
	}
	public List<CategoryAndParentVO> getCats( ) {
		return this.cats;
	}

}
