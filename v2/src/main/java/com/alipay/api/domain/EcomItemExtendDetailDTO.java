package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商商品详情模型
 *
 * @author auto create
 * @since 1.0, 2024-02-22 17:05:49
 */
public class EcomItemExtendDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4274912663815889743L;

	/**
	 * cardType + 唯一 + 储值卡类目投保场景 + 通过上下游约定获取
枚举类型：
    STORED("STORED", "储值卡"),
    FREQUENCY("FREQUENCY", "次卡"),
    TERM("TERM", "周期卡"),
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 储值卡可用金额，单位分
	 */
	@ApiField("card_use_amount")
	private Long cardUseAmount;

	/**
	 * 储值卡可用次数
	 */
	@ApiField("card_use_count")
	private Long cardUseCount;

	/**
	 * 储值卡使用周期，单位天
	 */
	@ApiField("card_use_period")
	private Long cardUsePeriod;

	/**
	 * 充电桩编号
	 */
	@ApiField("charge_box_no")
	private String chargeBoxNo;

	/**
	 * 充电桩插座总数
	 */
	@ApiField("charge_box_plug_total")
	private Long chargeBoxPlugTotal;

	/**
	 * 充电桩设备类型
	 */
	@ApiField("charge_box_type")
	private String chargeBoxType;

	/**
	 * 充电站点详细地址
	 */
	@ApiField("charge_station_address")
	private String chargeStationAddress;

	/**
	 * 充电站点所在地区
	 */
	@ApiField("charge_station_area")
	private String chargeStationArea;

	/**
	 * 充电站点所在城市
	 */
	@ApiField("charge_station_city")
	private String chargeStationCity;

	/**
	 * 充电站点编号
	 */
	@ApiField("charge_station_no")
	private String chargeStationNo;

	/**
	 * 充电站点插座总数
	 */
	@ApiField("charge_station_plug_total")
	private Long chargeStationPlugTotal;

	/**
	 * 充电站点所在省份
	 */
	@ApiField("charge_station_prov")
	private String chargeStationProv;

	/**
	 * 充电站点所在镇、街道
	 */
	@ApiField("charge_station_town")
	private String chargeStationTown;

	/**
	 * 充电计费方式
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * extInfo
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 游戏账号
	 */
	@ApiField("game_account")
	private String gameAccount;

	/**
	 * 游戏账号所属客户端
	 */
	@ApiField("game_account_client")
	private String gameAccountClient;

	/**
	 * 游戏账号所属客户端id
	 */
	@ApiField("game_account_client_id")
	private String gameAccountClientId;

	/**
	 * 游戏id
	 */
	@ApiField("game_id")
	private String gameId;

	/**
	 * 游戏名称
	 */
	@ApiField("game_name")
	private String gameName;

	/**
	 * 游戏交易模式
	 */
	@ApiField("game_trade_mode")
	private String gameTradeMode;

	/**
	 * 设备是否支持锁定
	 */
	@ApiField("lockable_device")
	private Boolean lockableDevice;

	/**
	 * 宠物档案id
	 */
	@ApiField("pet_id")
	private String petId;

	/**
	 * 宠物档案类型
	 */
	@ApiField("pet_type")
	private String petType;

	/**
	 * 宠物档案版本号
	 */
	@ApiField("pet_version")
	private String petVersion;

	/**
	 * 插座编号
	 */
	@ApiField("plug_no")
	private String plugNo;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Long getCardUseAmount() {
		return this.cardUseAmount;
	}
	public void setCardUseAmount(Long cardUseAmount) {
		this.cardUseAmount = cardUseAmount;
	}

	public Long getCardUseCount() {
		return this.cardUseCount;
	}
	public void setCardUseCount(Long cardUseCount) {
		this.cardUseCount = cardUseCount;
	}

	public Long getCardUsePeriod() {
		return this.cardUsePeriod;
	}
	public void setCardUsePeriod(Long cardUsePeriod) {
		this.cardUsePeriod = cardUsePeriod;
	}

	public String getChargeBoxNo() {
		return this.chargeBoxNo;
	}
	public void setChargeBoxNo(String chargeBoxNo) {
		this.chargeBoxNo = chargeBoxNo;
	}

	public Long getChargeBoxPlugTotal() {
		return this.chargeBoxPlugTotal;
	}
	public void setChargeBoxPlugTotal(Long chargeBoxPlugTotal) {
		this.chargeBoxPlugTotal = chargeBoxPlugTotal;
	}

	public String getChargeBoxType() {
		return this.chargeBoxType;
	}
	public void setChargeBoxType(String chargeBoxType) {
		this.chargeBoxType = chargeBoxType;
	}

	public String getChargeStationAddress() {
		return this.chargeStationAddress;
	}
	public void setChargeStationAddress(String chargeStationAddress) {
		this.chargeStationAddress = chargeStationAddress;
	}

	public String getChargeStationArea() {
		return this.chargeStationArea;
	}
	public void setChargeStationArea(String chargeStationArea) {
		this.chargeStationArea = chargeStationArea;
	}

	public String getChargeStationCity() {
		return this.chargeStationCity;
	}
	public void setChargeStationCity(String chargeStationCity) {
		this.chargeStationCity = chargeStationCity;
	}

	public String getChargeStationNo() {
		return this.chargeStationNo;
	}
	public void setChargeStationNo(String chargeStationNo) {
		this.chargeStationNo = chargeStationNo;
	}

	public Long getChargeStationPlugTotal() {
		return this.chargeStationPlugTotal;
	}
	public void setChargeStationPlugTotal(Long chargeStationPlugTotal) {
		this.chargeStationPlugTotal = chargeStationPlugTotal;
	}

	public String getChargeStationProv() {
		return this.chargeStationProv;
	}
	public void setChargeStationProv(String chargeStationProv) {
		this.chargeStationProv = chargeStationProv;
	}

	public String getChargeStationTown() {
		return this.chargeStationTown;
	}
	public void setChargeStationTown(String chargeStationTown) {
		this.chargeStationTown = chargeStationTown;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGameAccount() {
		return this.gameAccount;
	}
	public void setGameAccount(String gameAccount) {
		this.gameAccount = gameAccount;
	}

	public String getGameAccountClient() {
		return this.gameAccountClient;
	}
	public void setGameAccountClient(String gameAccountClient) {
		this.gameAccountClient = gameAccountClient;
	}

	public String getGameAccountClientId() {
		return this.gameAccountClientId;
	}
	public void setGameAccountClientId(String gameAccountClientId) {
		this.gameAccountClientId = gameAccountClientId;
	}

	public String getGameId() {
		return this.gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return this.gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameTradeMode() {
		return this.gameTradeMode;
	}
	public void setGameTradeMode(String gameTradeMode) {
		this.gameTradeMode = gameTradeMode;
	}

	public Boolean getLockableDevice() {
		return this.lockableDevice;
	}
	public void setLockableDevice(Boolean lockableDevice) {
		this.lockableDevice = lockableDevice;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getPetType() {
		return this.petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetVersion() {
		return this.petVersion;
	}
	public void setPetVersion(String petVersion) {
		this.petVersion = petVersion;
	}

	public String getPlugNo() {
		return this.plugNo;
	}
	public void setPlugNo(String plugNo) {
		this.plugNo = plugNo;
	}

}
