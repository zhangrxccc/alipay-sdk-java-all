package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2024-03-21 13:41:32
 */
public class CarResponse extends AlipayObject {

	private static final long serialVersionUID = 7862169341358164258L;

	/**
	 * 车辆品牌
	 */
	@ApiField("car_brand")
	private String carBrand;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 车辆类型
Car/小型汽车, E_Car/新能源小型汽车, Veh/大型汽车, E_Veh/新能源大型汽车, Van/两三轮摩托车, Other/其他
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 车档案ID
	 */
	@ApiField("vin")
	private String vin;

	public String getCarBrand() {
		return this.carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
