package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.scene.release response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-24 14:16:55
 */
public class TechriskInnovateMpcpromoSceneReleaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8239598925483456946L;

	/** 
	 * 非法商品id列表
	 */
	@ApiListField("illegal_goods_list")
	@ApiField("string")
	private List<String> illegalGoodsList;

	public void setIllegalGoodsList(List<String> illegalGoodsList) {
		this.illegalGoodsList = illegalGoodsList;
	}
	public List<String> getIllegalGoodsList( ) {
		return this.illegalGoodsList;
	}

}
