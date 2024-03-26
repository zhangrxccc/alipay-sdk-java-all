package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流单摘要
 *
 * @author auto create
 * @since 1.0, 2023-10-24 15:33:42
 */
public class InsOpenLogisticsDigestDTO extends AlipayObject {

	private static final long serialVersionUID = 8893538339315546837L;

	/**
	 * 认证码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 认证码类型
1. NONE (不需要验证码)
2. QR_CODE (二维码)
3. NUMBER (数字码)
4. CANCEL_NUMBER (取消数字码)
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_company_code")
	private String logisticsCompanyCode;

	/**
	 * 物流商名称
	 */
	@ApiField("logistics_company_name")
	private String logisticsCompanyName;

	/**
	 * 物流商快递单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 物流状态:0:已下单;1:已揽收;5:入库;2:已签收;8:已投柜;9:待取件;
	 */
	@ApiField("logistics_status")
	private Long logisticsStatus;

	/**
	 * 预约取件截止时间
	 */
	@ApiField("reserve_end_time")
	private Date reserveEndTime;

	/**
	 * 用户预约取件起始时间
	 */
	@ApiField("reserve_start_time")
	private Date reserveStartTime;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getLogisticsCompanyCode() {
		return this.logisticsCompanyCode;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode) {
		this.logisticsCompanyCode = logisticsCompanyCode;
	}

	public String getLogisticsCompanyName() {
		return this.logisticsCompanyName;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public Long getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(Long logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public Date getReserveEndTime() {
		return this.reserveEndTime;
	}
	public void setReserveEndTime(Date reserveEndTime) {
		this.reserveEndTime = reserveEndTime;
	}

	public Date getReserveStartTime() {
		return this.reserveStartTime;
	}
	public void setReserveStartTime(Date reserveStartTime) {
		this.reserveStartTime = reserveStartTime;
	}

}
