package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景中商品添加
 *
 * @author auto create
 * @since 1.0, 2023-05-24 09:15:04
 */
public class TechriskInnovateMpcpromoSceneAddModel extends AlipayObject {

	private static final long serialVersionUID = 6613688295471191761L;

	/**
	 * 商品id列表
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	public List<String> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
