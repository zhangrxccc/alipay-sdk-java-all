package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮服务标准化订单数据回流
 *
 * @author auto create
 * @since 1.0, 2021-06-17 14:01:04
 */
public class AlipayCommerceOperationIsvOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2439964465957635235L;

	/**
	 * 支付宝userid（用户在支付宝平台的2088开头16位id）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 点餐信息
	 */
	@ApiField("catering_order_info")
	private CateringOrderInfo cateringOrderInfo;

	/**
	 * 外卖配送信息，外卖场景必填
	 */
	@ApiField("delivery_info")
	private CateringDeliveryInfo deliveryInfo;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 自提：指预计自提结束时间；
外卖：指预计配送结束时间，预计送达开始时间在CateringDeliveryInfo填写
	 */
	@ApiField("estimate_end_time")
	private Date estimateEndTime;

	/**
	 * 预约单必填。
自提：指预计自提开始时间；
外卖：指预计配送开始时间，预计送达开始时间在CateringDeliveryInfo填写
	 */
	@ApiField("estimate_start_time")
	private Date estimateStartTime;

	/**
	 * 商品信息（除排队外必填）
	 */
	@ApiField("goods_info")
	private CateringGoodsInfo goodsInfo;

	/**
	 * 商品队列，前面排队的商品数量，如喜茶点单，前方还有66杯。
	 */
	@ApiField("goods_queue_num")
	private Long goodsQueueNum;

	/**
	 * 开发票跳转链接
	 */
	@ApiField("invoice_url")
	private String invoiceUrl;

	/**
	 * 环保标签，支持多标签，英文逗号隔开，目前支持标签：N_DISPOSABLE_CUP-自带杯；N_PACKAGED-不打包；N_STRAW-不用吸管；
	 */
	@ApiField("low_carbon_behavior")
	private String lowCarbonBehavior;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 订单总金额。
自提、外卖、点餐场景下，必填。
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单详情链接
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单扩展字段，示例展示场景：key：scene_type，value：NOTICE_TOUCH；key：cup_type，value:BRING_CUP
	 */
	@ApiListField("order_extra_info")
	@ApiField("extra_info")
	private List<ExtraInfo> orderExtraInfo;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modify_time")
	private Date orderModifyTime;

	/**
	 * 订单队列，前面排队的订单数量
	 */
	@ApiField("order_queue_num")
	private Long orderQueueNum;

	/**
	 * 订单类型，枚举支持
ALIPAY_APPLETS：支付宝小程序产生的订单
ALIPAY_POS：收银POS产生的支付宝订单
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 订单类型，枚举支持：
RESERVATION：预约单
INSTANT：实时单
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 交易支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 自提业务信息，自提场景下必填
	 */
	@ApiField("pick_up_info")
	private PickUpInfo pickUpInfo;

	/**
	 * 排队信息
	 */
	@ApiField("queue_info")
	private QueueInfo queueInfo;

	/**
	 * 返佣pid
	 */
	@ApiField("rebate_pid")
	private String rebatePid;

	/**
	 * 订单同步接口返回record_id（同一订单，非第一次同步 必填）
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 再来一单跳转链接，用户点击可进入商家小程序直接将上次购物的商品加入购物车
	 */
	@ApiField("reorder_url")
	private String reorderUrl;

	/**
	 * 服务标识
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 订单枚举。参考https://opendocs.alipay.com/pre-open/01vx42
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public CateringOrderInfo getCateringOrderInfo() {
		return this.cateringOrderInfo;
	}
	public void setCateringOrderInfo(CateringOrderInfo cateringOrderInfo) {
		this.cateringOrderInfo = cateringOrderInfo;
	}

	public CateringDeliveryInfo getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(CateringDeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Date getEstimateEndTime() {
		return this.estimateEndTime;
	}
	public void setEstimateEndTime(Date estimateEndTime) {
		this.estimateEndTime = estimateEndTime;
	}

	public Date getEstimateStartTime() {
		return this.estimateStartTime;
	}
	public void setEstimateStartTime(Date estimateStartTime) {
		this.estimateStartTime = estimateStartTime;
	}

	public CateringGoodsInfo getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(CateringGoodsInfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public Long getGoodsQueueNum() {
		return this.goodsQueueNum;
	}
	public void setGoodsQueueNum(Long goodsQueueNum) {
		this.goodsQueueNum = goodsQueueNum;
	}

	public String getInvoiceUrl() {
		return this.invoiceUrl;
	}
	public void setInvoiceUrl(String invoiceUrl) {
		this.invoiceUrl = invoiceUrl;
	}

	public String getLowCarbonBehavior() {
		return this.lowCarbonBehavior;
	}
	public void setLowCarbonBehavior(String lowCarbonBehavior) {
		this.lowCarbonBehavior = lowCarbonBehavior;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public List<ExtraInfo> getOrderExtraInfo() {
		return this.orderExtraInfo;
	}
	public void setOrderExtraInfo(List<ExtraInfo> orderExtraInfo) {
		this.orderExtraInfo = orderExtraInfo;
	}

	public Date getOrderModifyTime() {
		return this.orderModifyTime;
	}
	public void setOrderModifyTime(Date orderModifyTime) {
		this.orderModifyTime = orderModifyTime;
	}

	public Long getOrderQueueNum() {
		return this.orderQueueNum;
	}
	public void setOrderQueueNum(Long orderQueueNum) {
		this.orderQueueNum = orderQueueNum;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public PickUpInfo getPickUpInfo() {
		return this.pickUpInfo;
	}
	public void setPickUpInfo(PickUpInfo pickUpInfo) {
		this.pickUpInfo = pickUpInfo;
	}

	public QueueInfo getQueueInfo() {
		return this.queueInfo;
	}
	public void setQueueInfo(QueueInfo queueInfo) {
		this.queueInfo = queueInfo;
	}

	public String getRebatePid() {
		return this.rebatePid;
	}
	public void setRebatePid(String rebatePid) {
		this.rebatePid = rebatePid;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getReorderUrl() {
		return this.reorderUrl;
	}
	public void setReorderUrl(String reorderUrl) {
		this.reorderUrl = reorderUrl;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
