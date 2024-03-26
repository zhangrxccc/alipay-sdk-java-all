package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务信息参数
 *
 * @author auto create
 * @since 1.0, 2023-07-11 21:12:36
 */
public class BusinessParams extends AlipayObject {

	private static final long serialVersionUID = 3374329434864233351L;

	/**
	 * 实际订单时间，在乘车码场景，传入的是用户刷码乘车时间
	 */
	@ApiField("actual_order_time")
	private String actualOrderTime;

	/**
	 * 校园卡编号
	 */
	@ApiField("campus_card")
	private String campusCard;

	/**
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 因公付金额
	 */
	@ApiField("enterprise_pay_amount")
	private String enterprisePayAmount;

	/**
	 * 因公付业务信息
	 */
	@ApiField("enterprise_pay_info")
	private String enterprisePayInfo;

	/**
	 * 商户传入的交易税费。需要落地风控使用
	 */
	@ApiField("good_taxes")
	private String goodTaxes;

	/**
	 * 商户端创建订单的 IP，须上传正确的用户端外网 IP，支持 ipv4/ipv6 格式；
mc_create_trade_ip和mcCreateTradeIp（旧）参数描述相同，首选mc_create_trade_ip入参，请勿重复入参；
如已入参mcCreateTradeIp（旧），无需新增入参mc_create_trade_ip。
	 */
	@ApiField("mc_create_trade_ip")
	private String mcCreateTradeIp;

	/**
	 * 当需要在 商家平台（b.alipay.com）—数据中心 中查看对应业务场景下的数据明细可以通过该参数传入
支持传入的值：<a target="_blank" href="https://opendocs.alipay.com/mini/08by8k?pathHash=96e03412">小程序细分业务场景</a>
	 */
	@ApiField("tiny_app_merchant_biz_type")
	private String tinyAppMerchantBizType;

	public String getActualOrderTime() {
		return this.actualOrderTime;
	}
	public void setActualOrderTime(String actualOrderTime) {
		this.actualOrderTime = actualOrderTime;
	}

	public String getCampusCard() {
		return this.campusCard;
	}
	public void setCampusCard(String campusCard) {
		this.campusCard = campusCard;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getEnterprisePayAmount() {
		return this.enterprisePayAmount;
	}
	public void setEnterprisePayAmount(String enterprisePayAmount) {
		this.enterprisePayAmount = enterprisePayAmount;
	}

	public String getEnterprisePayInfo() {
		return this.enterprisePayInfo;
	}
	public void setEnterprisePayInfo(String enterprisePayInfo) {
		this.enterprisePayInfo = enterprisePayInfo;
	}

	public String getGoodTaxes() {
		return this.goodTaxes;
	}
	public void setGoodTaxes(String goodTaxes) {
		this.goodTaxes = goodTaxes;
	}

	public String getMcCreateTradeIp() {
		return this.mcCreateTradeIp;
	}
	public void setMcCreateTradeIp(String mcCreateTradeIp) {
		this.mcCreateTradeIp = mcCreateTradeIp;
	}

	public String getTinyAppMerchantBizType() {
		return this.tinyAppMerchantBizType;
	}
	public void setTinyAppMerchantBizType(String tinyAppMerchantBizType) {
		this.tinyAppMerchantBizType = tinyAppMerchantBizType;
	}

}
