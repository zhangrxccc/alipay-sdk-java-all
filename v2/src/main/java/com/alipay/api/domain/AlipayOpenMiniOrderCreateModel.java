package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易组件业务单创建
 *
 * @author auto create
 * @since 1.0, 2023-05-10 22:27:33
 */
public class AlipayOpenMiniOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1378946675627246722L;

	/**
	 * 订单收货地址
	 */
	@ApiField("address_info")
	private MiniReceiverAddressInfoDTO addressInfo;

	/**
	 * 商户传入业务信息，具体值要和支付宝约定，应用于安全，营销等参数直传场景，格式为json格式
	 */
	@ApiField("business_params")
	private MiniBusinessParamsDTO businessParams;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息; 注：交易的买家与卖家不能相同。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝登录账号。 buyer_logon_id和buyer_id两者传其一，和buyer_id不能同时为空，建议通过buyer_id来传递买家信息。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 联系人信息
	 */
	@ApiField("contact_info")
	private ContactInfoDTO contactInfo;

	/**
	 * 默认退货地址
	 */
	@ApiField("default_receiving_address")
	private MiniReceiverAddressInfoDTO defaultReceivingAddress;

	/**
	 * 物流信息--预留字段
	 */
	@ApiField("delivery_detail")
	private LogisticsInfoDTO deliveryDetail;

	/**
	 * 订单扩展字段
	 */
	@ApiField("ext_info")
	private MiniOrderExtInfoDTO extInfo;

	/**
	 * 订单类型
	 */
	@ApiField("merchant_biz_type")
	private String merchantBizType;

	/**
	 * 订单信息
	 */
	@ApiField("order_detail")
	private MiniOrderDetailDTO orderDetail;

	/**
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商家小程序对应的订单详情页路径地址 value。仅需传入小程序页面路径即可。同一笔订单的链接必须与第一次传入的地址相同，且需是小程序内部页面路径，例如：/pages/index/index?orderId=10190608609185。
	 */
	@ApiField("path")
	private String path;

	/**
	 * 当需要指定收款账号时，通过该参数传入，如果该值为空，则默认为商户签约账号对应的支付宝用户ID。 收款账号优先级规则：门店绑定的收款账户>请求传入的seller_id>商户签约账号对应的支付宝用户ID； 注：直付通和机构间联场景下seller_id无需传入或者保持跟pid一致； 如果传入的seller_id与pid不一致，需要联系支付宝小二配置收款关系；
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单相对超时时间。从交易创建时间开始计算。
该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
默认值为3h。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("title")
	private String title;

	public MiniReceiverAddressInfoDTO getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(MiniReceiverAddressInfoDTO addressInfo) {
		this.addressInfo = addressInfo;
	}

	public MiniBusinessParamsDTO getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(MiniBusinessParamsDTO businessParams) {
		this.businessParams = businessParams;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerLogonId() {
		return this.buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public ContactInfoDTO getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(ContactInfoDTO contactInfo) {
		this.contactInfo = contactInfo;
	}

	public MiniReceiverAddressInfoDTO getDefaultReceivingAddress() {
		return this.defaultReceivingAddress;
	}
	public void setDefaultReceivingAddress(MiniReceiverAddressInfoDTO defaultReceivingAddress) {
		this.defaultReceivingAddress = defaultReceivingAddress;
	}

	public LogisticsInfoDTO getDeliveryDetail() {
		return this.deliveryDetail;
	}
	public void setDeliveryDetail(LogisticsInfoDTO deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}

	public MiniOrderExtInfoDTO getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(MiniOrderExtInfoDTO extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantBizType() {
		return this.merchantBizType;
	}
	public void setMerchantBizType(String merchantBizType) {
		this.merchantBizType = merchantBizType;
	}

	public MiniOrderDetailDTO getOrderDetail() {
		return this.orderDetail;
	}
	public void setOrderDetail(MiniOrderDetailDTO orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
