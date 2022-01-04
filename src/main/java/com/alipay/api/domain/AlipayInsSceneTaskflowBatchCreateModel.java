package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险消费门户权益流水创建
 *
 * @author auto create
 * @since 1.0, 2020-07-27 22:20:49
 */
public class AlipayInsSceneTaskflowBatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4581913241628845491L;

	/**
	 * 数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 扩展字段
	 */
	@ApiField("extra_map")
	private String extraMap;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 权益类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getExtraMap() {
		return this.extraMap;
	}
	public void setExtraMap(String extraMap) {
		this.extraMap = extraMap;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
