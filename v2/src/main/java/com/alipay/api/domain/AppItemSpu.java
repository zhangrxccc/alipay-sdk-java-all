package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品spu
 *
 * @author auto create
 * @since 1.0, 2023-03-07 10:15:00
 */
public class AppItemSpu extends AlipayObject {

	private static final long serialVersionUID = 2665773232197394785L;

	/**
	 * 商品条形码信息
	 */
	@ApiField("bar_code_info")
	private BarcodeInfo barCodeInfo;

	/**
	 * 能否被搜索，可被搜索（true）,不可被搜索（false），默认 true 可以被搜索。示例值 true，最大长度 16。
	 */
	@ApiField("can_be_search")
	private Boolean canBeSearch;

	/**
	 * 商品类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 自定义属性
	 */
	@ApiListField("feature")
	@ApiField("app_item_feature")
	private List<AppItemFeature> feature;

	/**
	 * 商品子图 URL 列表，不超过 3 个图片，图片宽度及宽高比，建议值：图片宽度必须大于 750px，宽高比建议 4:3 - 1:1 之间
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 商家侧spu商品 ID，要求 APPID 下全局唯一。最大长度 100。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品主图，图片宽度及宽高比，建议值：图片宽度必须大于 750px，宽高比建议 4:3 - 1:1 之间，最大长度 128。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 支付宝平台侧spu商品 ID
	 */
	@ApiField("platform_item_id")
	private String platformItemId;

	/**
	 * 商品价格
	 */
	@ApiField("price")
	private AppItemSPUPrice price;

	/**
	 * 商品spu库存信息
	 */
	@ApiField("spu_stock")
	private SpuStock spuStock;

	/**
	 * 商品详情页相对URL，接口方会自动将该相对地址拼接到商家小程序地址后面，示例传参：&page=test
拼接后链接为：alipays://platformapi/startApp?appId=88888&page=test。示例值 &page=test，最大长度 256
	 */
	@ApiField("src_path")
	private String srcPath;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public BarcodeInfo getBarCodeInfo() {
		return this.barCodeInfo;
	}
	public void setBarCodeInfo(BarcodeInfo barCodeInfo) {
		this.barCodeInfo = barCodeInfo;
	}

	public Boolean getCanBeSearch() {
		return this.canBeSearch;
	}
	public void setCanBeSearch(Boolean canBeSearch) {
		this.canBeSearch = canBeSearch;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<AppItemFeature> getFeature() {
		return this.feature;
	}
	public void setFeature(List<AppItemFeature> feature) {
		this.feature = feature;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getPlatformItemId() {
		return this.platformItemId;
	}
	public void setPlatformItemId(String platformItemId) {
		this.platformItemId = platformItemId;
	}

	public AppItemSPUPrice getPrice() {
		return this.price;
	}
	public void setPrice(AppItemSPUPrice price) {
		this.price = price;
	}

	public SpuStock getSpuStock() {
		return this.spuStock;
	}
	public void setSpuStock(SpuStock spuStock) {
		this.spuStock = spuStock;
	}

	public String getSrcPath() {
		return this.srcPath;
	}
	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
