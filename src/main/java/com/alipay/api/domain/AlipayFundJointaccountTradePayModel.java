package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业跳转到支付宝端内小程序进行线下支付
 *
 * @author auto create
 * @since 1.0, 2021-06-08 21:58:26
 */
public class AlipayFundJointaccountTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 4282842217697361384L;

	/**
	 * 企业账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳端扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否隐藏付款码页面相关功能性操作按钮
	 */
	@ApiField("hide_menu")
	private String hideMenu;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付方式：
scan-正扫
qrcode-反扫
	 */
	@ApiField("type")
	private String type;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHideMenu() {
		return this.hideMenu;
	}
	public void setHideMenu(String hideMenu) {
		this.hideMenu = hideMenu;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
