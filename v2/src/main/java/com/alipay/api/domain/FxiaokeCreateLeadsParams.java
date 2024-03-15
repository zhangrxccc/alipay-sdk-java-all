package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 纷享销客创建商机的参数和返回值
 *
 * @author auto create
 * @since 1.0, 2023-10-24 09:53:51
 */
public class FxiaokeCreateLeadsParams extends AlipayObject {

	private static final long serialVersionUID = 8188562144194447219L;

	/**
	 * 实际主导方
	 */
	@ApiField("actual_lead_party")
	private String actualLeadParty;

	/**
	 * 阿里云BPID,多个，以英文逗号隔开
	 */
	@ApiField("ali_cloud_bpid_list")
	private String aliCloudBpidList;

	/**
	 * 招标类型
	 */
	@ApiField("bid_type")
	private String bidType;

	/**
	 * CBM工号列表
	 */
	@ApiListField("cbm_work_no_list")
	@ApiField("string")
	private List<String> cbmWorkNoList;

	/**
	 * 云平台区域 (公共云)
	 */
	@ApiField("cloud_platform_region")
	private String cloudPlatformRegion;

	/**
	 * 创建人的工号
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * crm客户编码
	 */
	@ApiField("crm_customer_id")
	private String crmCustomerId;

	/**
	 * crm客户行业
	 */
	@ApiField("crm_customer_industry")
	private String crmCustomerIndustry;

	/**
	 * crm客户名称
	 */
	@ApiField("crm_customer_name")
	private String crmCustomerName;

	/**
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 平台类型（公共云）
	 */
	@ApiField("deploy_platform")
	private String deployPlatform;

	/**
	 * 部署方式
	 */
	@ApiField("deploy_type")
	private String deployType;

	/**
	 * 预计招标(挂网)时间
	 */
	@ApiField("expect_bid_date")
	private Date expectBidDate;

	/**
	 * 预计签约日期
	 */
	@ApiField("expect_sign_date")
	private Date expectSignDate;

	/**
	 * id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 是否招投标0是1否
	 */
	@ApiField("is_bid")
	private String isBid;

	/**
	 * 是否出具投标授权函 0 是 1 否
	 */
	@ApiField("is_issue_for_bid")
	private Long isIssueForBid;

	/**
	 * 商机编码
	 */
	@ApiField("leads_code")
	private String leadsCode;

	/**
	 * 商机来源伙伴pid
	 */
	@ApiField("leads_source_partner_id")
	private String leadsSourcePartnerId;

	/**
	 * 其他合作伙伴（二代）
	 */
	@ApiListField("other_partner_pid_list")
	@ApiField("string")
	private List<String> otherPartnerPidList;

	/**
	 * 对方签约主体
	 */
	@ApiField("other_party_sign_subject")
	private String otherPartySignSubject;

	/**
	 * 对方签约主体id
	 */
	@ApiField("other_party_sign_subject_id")
	private String otherPartySignSubjectId;

	/**
	 * 我方签约主体
	 */
	@ApiField("our_sign_subject")
	private String ourSignSubject;

	/**
	 * 合作伙伴pid(阿里云伙伴签约路径下需要填写）
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 合作伙伴名称(阿里云伙伴签约路径下需要填写）
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 预计个集群对应存储空间大小（公共云）
	 */
	@ApiField("predict_clusters_storage_capacity")
	private Long predictClustersStorageCapacity;

	/**
	 * 计个集群对应存储空间大小的单位：GB/TB（公共云）
	 */
	@ApiField("predict_clusters_storage_unit")
	private String predictClustersStorageUnit;

	/**
	 * 预计开通集群数量（台）（公共云）
	 */
	@ApiField("predict_clusters_units_count")
	private Long predictClustersUnitsCount;

	/**
	 * 预计开通实例规格（核数C) （公共云）
	 */
	@ApiField("predict_instance_core_count")
	private Long predictInstanceCoreCount;

	/**
	 * 产品家族
	 */
	@ApiField("product_family")
	private String productFamily;

	/**
	 * 商机项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 公有云：触达中/交流中/测试中/商务中/使用中/Upsell/下线
专有云：潜在商机/确认商机/方案沟通/商务谈判?中标/签约中	已签约/项目关闭
	 */
	@ApiField("project_phase")
	private String projectPhase;

	/**
	 * 传入商品类目列表
	 */
	@ApiListField("record_list")
	@ApiField("fxiaoke_create_or_update_leads_predict_record_item_request")
	private List<FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest> recordList;

	/**
	 * 关联的框架项目商机id（如果是订单项目，需要关联一个框架项目
	 */
	@ApiField("related_leads_id")
	private String relatedLeadsId;

	/**
	 * 资源底座（公共云）
	 */
	@ApiField("resource_foundation")
	private String resourceFoundation;

	/**
	 * 签约路径
	 */
	@ApiField("sign_path")
	private String signPath;

	/**
	 * 签约概率
	 */
	@ApiField("sign_probability")
	private String signProbability;

	/**
	 * 软件订阅时长乘以十，主要为了解决0.5年的问题
下游预测订单消费了商机本体的订阅时长，暂时重构工作量大，消费场景下，需要自行 / 10
	 */
	@ApiField("software_subscription_years_expand_ten")
	private String softwareSubscriptionYearsExpandTen;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 商机类型，枚举值{独立项目0，框架项目1，订单项目2}
	 */
	@ApiField("type")
	private String type;

	public String getActualLeadParty() {
		return this.actualLeadParty;
	}
	public void setActualLeadParty(String actualLeadParty) {
		this.actualLeadParty = actualLeadParty;
	}

	public String getAliCloudBpidList() {
		return this.aliCloudBpidList;
	}
	public void setAliCloudBpidList(String aliCloudBpidList) {
		this.aliCloudBpidList = aliCloudBpidList;
	}

	public String getBidType() {
		return this.bidType;
	}
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	public List<String> getCbmWorkNoList() {
		return this.cbmWorkNoList;
	}
	public void setCbmWorkNoList(List<String> cbmWorkNoList) {
		this.cbmWorkNoList = cbmWorkNoList;
	}

	public String getCloudPlatformRegion() {
		return this.cloudPlatformRegion;
	}
	public void setCloudPlatformRegion(String cloudPlatformRegion) {
		this.cloudPlatformRegion = cloudPlatformRegion;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCrmCustomerId() {
		return this.crmCustomerId;
	}
	public void setCrmCustomerId(String crmCustomerId) {
		this.crmCustomerId = crmCustomerId;
	}

	public String getCrmCustomerIndustry() {
		return this.crmCustomerIndustry;
	}
	public void setCrmCustomerIndustry(String crmCustomerIndustry) {
		this.crmCustomerIndustry = crmCustomerIndustry;
	}

	public String getCrmCustomerName() {
		return this.crmCustomerName;
	}
	public void setCrmCustomerName(String crmCustomerName) {
		this.crmCustomerName = crmCustomerName;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDeployPlatform() {
		return this.deployPlatform;
	}
	public void setDeployPlatform(String deployPlatform) {
		this.deployPlatform = deployPlatform;
	}

	public String getDeployType() {
		return this.deployType;
	}
	public void setDeployType(String deployType) {
		this.deployType = deployType;
	}

	public Date getExpectBidDate() {
		return this.expectBidDate;
	}
	public void setExpectBidDate(Date expectBidDate) {
		this.expectBidDate = expectBidDate;
	}

	public Date getExpectSignDate() {
		return this.expectSignDate;
	}
	public void setExpectSignDate(Date expectSignDate) {
		this.expectSignDate = expectSignDate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIsBid() {
		return this.isBid;
	}
	public void setIsBid(String isBid) {
		this.isBid = isBid;
	}

	public Long getIsIssueForBid() {
		return this.isIssueForBid;
	}
	public void setIsIssueForBid(Long isIssueForBid) {
		this.isIssueForBid = isIssueForBid;
	}

	public String getLeadsCode() {
		return this.leadsCode;
	}
	public void setLeadsCode(String leadsCode) {
		this.leadsCode = leadsCode;
	}

	public String getLeadsSourcePartnerId() {
		return this.leadsSourcePartnerId;
	}
	public void setLeadsSourcePartnerId(String leadsSourcePartnerId) {
		this.leadsSourcePartnerId = leadsSourcePartnerId;
	}

	public List<String> getOtherPartnerPidList() {
		return this.otherPartnerPidList;
	}
	public void setOtherPartnerPidList(List<String> otherPartnerPidList) {
		this.otherPartnerPidList = otherPartnerPidList;
	}

	public String getOtherPartySignSubject() {
		return this.otherPartySignSubject;
	}
	public void setOtherPartySignSubject(String otherPartySignSubject) {
		this.otherPartySignSubject = otherPartySignSubject;
	}

	public String getOtherPartySignSubjectId() {
		return this.otherPartySignSubjectId;
	}
	public void setOtherPartySignSubjectId(String otherPartySignSubjectId) {
		this.otherPartySignSubjectId = otherPartySignSubjectId;
	}

	public String getOurSignSubject() {
		return this.ourSignSubject;
	}
	public void setOurSignSubject(String ourSignSubject) {
		this.ourSignSubject = ourSignSubject;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public Long getPredictClustersStorageCapacity() {
		return this.predictClustersStorageCapacity;
	}
	public void setPredictClustersStorageCapacity(Long predictClustersStorageCapacity) {
		this.predictClustersStorageCapacity = predictClustersStorageCapacity;
	}

	public String getPredictClustersStorageUnit() {
		return this.predictClustersStorageUnit;
	}
	public void setPredictClustersStorageUnit(String predictClustersStorageUnit) {
		this.predictClustersStorageUnit = predictClustersStorageUnit;
	}

	public Long getPredictClustersUnitsCount() {
		return this.predictClustersUnitsCount;
	}
	public void setPredictClustersUnitsCount(Long predictClustersUnitsCount) {
		this.predictClustersUnitsCount = predictClustersUnitsCount;
	}

	public Long getPredictInstanceCoreCount() {
		return this.predictInstanceCoreCount;
	}
	public void setPredictInstanceCoreCount(Long predictInstanceCoreCount) {
		this.predictInstanceCoreCount = predictInstanceCoreCount;
	}

	public String getProductFamily() {
		return this.productFamily;
	}
	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectPhase() {
		return this.projectPhase;
	}
	public void setProjectPhase(String projectPhase) {
		this.projectPhase = projectPhase;
	}

	public List<FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest> getRecordList() {
		return this.recordList;
	}
	public void setRecordList(List<FxiaokeCreateOrUpdateLeadsPredictRecordItemRequest> recordList) {
		this.recordList = recordList;
	}

	public String getRelatedLeadsId() {
		return this.relatedLeadsId;
	}
	public void setRelatedLeadsId(String relatedLeadsId) {
		this.relatedLeadsId = relatedLeadsId;
	}

	public String getResourceFoundation() {
		return this.resourceFoundation;
	}
	public void setResourceFoundation(String resourceFoundation) {
		this.resourceFoundation = resourceFoundation;
	}

	public String getSignPath() {
		return this.signPath;
	}
	public void setSignPath(String signPath) {
		this.signPath = signPath;
	}

	public String getSignProbability() {
		return this.signProbability;
	}
	public void setSignProbability(String signProbability) {
		this.signProbability = signProbability;
	}

	public String getSoftwareSubscriptionYearsExpandTen() {
		return this.softwareSubscriptionYearsExpandTen;
	}
	public void setSoftwareSubscriptionYearsExpandTen(String softwareSubscriptionYearsExpandTen) {
		this.softwareSubscriptionYearsExpandTen = softwareSubscriptionYearsExpandTen;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
