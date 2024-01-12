package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.sql.Clob;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 债券条款表
 * </p>
 *
 * @author gaocheng
 * @since 2023-09-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TBND")
public class Tbnd extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易代码
     */
    @TableId("I_CODE")
    private String iCode;

    /**
     * 资产类型
     */
    @TableField("A_TYPE")
    private String aType;

    /**
     * 市场类型
     */
    @TableField("M_TYPE")
    private String mType;

    /**
     * 上海交易所代码
     */
    @TableField("SH_CODE")
    private String shCode;

    /**
     * 深圳交易所代码
     */
    @TableField("SZ_CODE")
    private String szCode;

    /**
     * 银行间市场代码
     */
    @TableField("YH_CODE")
    private String yhCode;

    /**
     * 币种
     */
    @TableField("CURRENCY")
    private String currency;

    /**
     * 国家
     */
    @TableField("COUNTRY")
    private String country;

    /**
     * 报价方式，CP：净价方式；DP：全价方式；YD：到期收益率
     */
    @TableField("Q_TYPE")
    private String qType;

    /**
     * 名称
     */
    @TableField("B_NAME")
    private String bName;

    /**
     * 产品类型
     */
    @TableField("P_TYPE")
    private String pType;

    /**
     * 产品分类
     */
    @TableField("P_CLASS")
    private String pClass;

    /**
     * 债券面值
     */
    @TableField("B_PAR_VALUE")
    private Double bParValue;

    /**
     * 发行价格
     */
    @TableField("B_ISSUE_PRICE")
    private Double bIssuePrice;

    /**
     * 发行日期
     */
    @TableField("B_ISSUE_DATE")
    private String bIssueDate;

    /**
     * 上市日期
     */
    @TableField("B_LIST_DATE")
    private String bListDate;

    /**
     * 起息日期
     */
    @TableField("B_START_DATE")
    private String bStartDate;

    /**
     * 到期日期
     */
    @TableField("B_MTR_DATE")
    private String bMtrDate;

    /**
     * 期限
     */
    @TableField("B_TERM")
    private String bTerm;

    /**
     * 日期计算方式
     */
    @TableField("B_DAYCOUNT")
    private String bDaycount;

    /**
     * 标的交易代码
     */
    @TableField("I_CODE_BENCH")
    private String iCodeBench;

    /**
     * 标的资产类型
     */
    @TableField("A_TYPE_BENCH")
    private String aTypeBench;

    /**
     * 标的市场类型
     */
    @TableField("M_TYPE_BENCH")
    private String mTypeBench;

    /**
     * 发行方式，1：面值发行；2：贴现发行
     */
    @TableField("B_ISSUE_MODE")
    private String bIssueMode;

    /**
     * 息票类型，1：固定利率；2：浮动利率；3：零息票利率
     */
    @TableField("B_COUPON_TYPE")
    private String bCouponType;

    /**
     * 付息次数，每年的付息次数，如：1（年）、2（半年）、4（3个月）等，如果一次还本付息则为0
     */
    @TableField("B_CASH_TIMES")
    private Double bCashTimes;

    /**
     * 含权标识，4位含权标识（1、0）表示：第一位：是否可转股；第二位：是否可赎回；第三位：是否可回售；第四位：是否可转为相关债券（固息转浮息、浮息转固息）
     */
    @TableField("B_EMBOPT_TYPE")
    private String bEmboptType;

    /**
     * 本金偿还，0：本金不提前偿还；1：本金提前偿还
     */
    @TableField("B_AMORTIZING")
    private String bAmortizing;

    /**
     * 资产证券化产品类型，ABS；MBS；(空)
     */
    @TableField("B_AS_TYPE")
    private String bAsType;

    /**
     * 发行人
     */
    @TableField("B_ISSUER")
    private String bIssuer;

    /**
     * 担保人
     */
    @TableField("B_WARRANTOR")
    private String bWarrantor;

    /**
     * 清偿等级，表示对债权类金融工具进行清算时，偿还债务的优先次序，标准定义（由高到低）：Senior、SubTier1、SubUpperTier2、SubLowerTier2、SubTier3；简化定义：Senior（普通）、Subordinate（次级）。注：目前采用简化定义
     */
    @TableField("B_SENIORITY")
    private String bSeniority;

    /**
     * FPML
     */
    @TableField("B_FPML")
    private Clob bFpml;

    /**
     * 票面利率
     */
    @TableField("B_COUPON")
    private Double bCoupon;

    /**
     * 债券全称
     */
    @TableField("B_NAME_FULL")
    private String bNameFull;

    /**
     * 用户指定到期日
     */
    @TableField("B_ACTUAL_MTR_DATE")
    private String bActualMtrDate;

    /**
     * 债券内部代码
     */
    @TableField("D_CODE")
    private String dCode;

    /**
     * 债券分类
     */
    @TableField("B_P_CLASS")
    private String bPClass;

    /**
     * 实际发行量
     */
    @TableField("B_ACTUAL_ISSUE_AMOUNT")
    private Double bActualIssueAmount;

    /**
     * 中文拼音
     */
    @TableField("CHINESESPELL")
    private String chinesespell;

    /**
     * 票面精度
     */
    @TableField("B_COUPON_PREC")
    private Double bCouponPrec;

    /**
     * 托管场所
     */
    @TableField("HOST_MARKET")
    private String hostMarket;

    /**
     * 一级市场簿记场所
     */
    @TableField("BJ_MARKET")
    private String bjMarket;

    /**
     * 发行机构ID
     */
    @TableField("ISSUER_ID")
    private Double issuerId;

    /**
     * 担保机构ID
     */
    @TableField("WARRANTOR_ID")
    private Double warrantorId;

    /**
     * 是否删除
     */
    @TableField("IS_DELETE")
    private Double isDelete;

    /**
     * 是否已生效：1： 正常 2： 新增
     */
    @TableField("USABLE_FLAG")
    private Double usableFlag;

    /**
     * 备注
     */
    @TableField("MEMO")
    private String memo;

    /**
     * 修改用户
     */
    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 复核用户
     */
    @TableField("ACCOUNT_USER")
    private String accountUser;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private String updateTime;

    /**
     * 复核时间
     */
    @TableField("ACCOUNT_TIME")
    private String accountTime;

    /**
     * 导入日期
     */
    @TableField("IMP_DATE")
    private String impDate;

    /**
     * 导入时间
     */
    @TableField("IMP_TIME")
    private String impTime;

    /**
     * 管道编号
     */
    @TableField("PIPE_ID")
    private Double pipeId;

    /**
     * 首个付息日
     */
    @TableField("B_FST_PAY_DATE")
    private String bFstPayDate;

    /**
     * 首个规则计息区间开始日
     */
    @TableField("B_FST_REG_CALC_START_DATE")
    private String bFstRegCalcStartDate;

    /**
     * 首周期定息日
     */
    @TableField("B_INITIAL_FIXING_DATE")
    private String bInitialFixingDate;

    /**
     * 支付频率
     */
    @TableField("B_PAY_FREQ")
    private String bPayFreq;

    /**
     * 支付调整规则
     */
    @TableField("B_PAY_BIZDAY_CONVERTION")
    private String bPayBizdayConvertion;

    /**
     * 计息频率
     */
    @TableField("B_CALC_FREQ")
    private String bCalcFreq;

    /**
     * 计息调整规则
     */
    @TableField("B_CALC_BIZDAY_CONVERTION")
    private String bCalcBizdayConvertion;

    /**
     * 重置频率
     */
    @TableField("B_RESET_FREQ")
    private String bResetFreq;

    /**
     * 重置调整规则
     */
    @TableField("B_RESET_BIZDAY_CONVERTION")
    private String bResetBizdayConvertion;

    /**
     * 定息日偏移
     */
    @TableField("B_FIXING_DATES_OFFSET")
    private String bFixingDatesOffset;

    /**
     * 定息日调整规则
     */
    @TableField("B_FIXING_BIZDAY_CONVERTION")
    private String bFixingBizdayConvertion;

    /**
     * 定息精度，普通债券为4，少量债券为6
     */
    @TableField("B_FIXING_PRECISION")
    private Double bFixingPrecision;

    /**
     * 首周期定息利率
     */
    @TableField("B_INITIAL_RATE")
    private Double bInitialRate;

    /**
     * 初始利率倍数
     */
    @TableField("B_MULTIPLIER")
    private Double bMultiplier;

    /**
     * 初始利率上限
     */
    @TableField("B_CAP_RATE")
    private Double bCapRate;

    /**
     * 初始利率下限
     */
    @TableField("B_FLOOR_RATE")
    private Double bFloorRate;

    /**
     * 行权类型，A：美式 B：百慕大 E：欧式
     */
    @TableField("B_EXERCISE_STYLE")
    private String bExerciseStyle;

    /**
     * 首个行权日，含权债有效
     */
    @TableField("B_EXERCISE_DATE")
    private String bExerciseDate;

    /**
     * 首个执行价格，含权债有效
     */
    @TableField("B_STRIKE_PRICE")
    private Double bStrikePrice;

    /**
     * 首个补偿利率，含权债有效
     */
    @TableField("B_COMPENSATION_RATE")
    private Double bCompensationRate;

    /**
     * 会计产品分类
     */
    @TableField("P_CLASS_ACT")
    private String pClassAct;

    /**
     * 发行人代码
     */
    @TableField("B_ISSUER_CODE")
    private String bIssuerCode;

    /**
     * 特殊条款说明
     */
    @TableField("SPECIAL_DESC")
    private String specialDesc;

    /**
     * 增信方式
     */
    @TableField("TRUSTENHANCING_TYPE")
    private String trustenhancingType;

    /**
     * 上市公告日期
     */
    @TableField("B_ISSUE_LIST_DATE")
    private String bIssueListDate;

    /**
     * 发行费率
     */
    @TableField("ISSUE_FEERATE")
    private String issueFeerate;

    /**
     * 承销方式
     */
    @TableField("UNDERWRITING_TYPE")
    private String underwritingType;

    /**
     * 发行额度占比（%）
     */
    @TableField("B_ACTUAL_AMOUNT_RATE")
    private Double bActualAmountRate;

    /**
     * 债券扩展字段 第1位：是否可转股；第2位：是否可赎回；第3位：是否可回售；第4位：是否可转为相关债券（固息转浮息、浮息转固息)；第5位: 是否公开发行；第6位：是否永续；第7位：是否自贸区；第8位：是否权益类标识；第9位：利率债/信用债；第10位：减记条款；第11位：违约标记；第12位：临时债券标记
     */
    @TableField("B_EXTEND_TYPE")
    private String bExtendType;

    /**
     * 标准类型
     */
    @TableField("S_TYPE")
    private String sType;

    /**
     * 数据厂商债券分类
     */
    @TableField("P_CLASS_DV")
    private String pClassDv;

    /**
     * 中债债券分类
     */
    @TableField("P_CLASS_CCDC")
    private String pClassCcdc;

    /**
     * 报价面值，0：报价以债券面值报价；其它值为报价面值
     */
    @TableField("Q_PAR_VALUE")
    private Double qParValue;

    /**
     * 是否完整条款，1：不完整条款；0或空值：完整条款
     */
    @TableField("CONFIRM_TERM")
    private String confirmTerm;

    /**
     * 证券唯一编码
     */
    @TableField("SEC_CODE")
    private String secCode;

    /**
     * 是否公开发行，0：否；1：是
     */
    @TableField("PUBLIC_ISSUE")
    private String publicIssue;

    /**
     * 用户指定到期日
     */
    @TableField("B_USER_MTR_DATE")
    private String bUserMtrDate;

    /**
     * 前台应计利息计息基准
     */
    @TableField("AI_DAYCOUNT")
    private String aiDaycount;

    /**
     * 前台到期收益率计息基准
     */
    @TableField("YTM_DAYCOUNT")
    private String ytmDaycount;

    /**
     * 提前到期日
     */
    @TableField("B_EARLY_MTR_DATE")
    private String bEarlyMtrDate;

    /**
     * 是否违约 0:否 1:是
     */
    @TableField("IS_DEFAULT")
    private String isDefault;

    /**
     * 前台现金流计息基准
     */
    @TableField("CF_DAYCOUNT")
    private String cfDaycount;

    /**
     * 后台应计利息计息基准
     */
    @TableField("AI_DAYCOUNT_BACK")
    private String aiDaycountBack;

    /**
     * 后台到期收益率计息基准
     */
    @TableField("YTM_DAYCOUNT_BACK")
    private String ytmDaycountBack;

    /**
     * 后台现金流计息基准
     */
    @TableField("CF_DAYCOUNT_BACK")
    private String cfDaycountBack;

    /**
     * 是否城投债，0：否；1：是
     */
    @TableField("IS_CITY_INVESTMENT")
    private String isCityInvestment;

    /**
     * 是否永续债，0：否；1：是
     */
    @TableField("PERPETUAL")
    private String perpetual;

    /**
     * 法定到期日
     */
    @TableField("LEGAL_MTR_DATE")
    private String legalMtrDate;

    /**
     * 计划发行量
     */
    @TableField("B_PLAN_ISSUE_AMOUNT")
    private Double bPlanIssueAmount;

    /**
     * 最新债项评级
     */
    @TableField("B_EXT_RATING")
    private String bExtRating;

    /**
     * 最新债项评级机构
     */
    @TableField("B_EXT_RATING_INSTITUTION")
    private String bExtRatingInstitution;

    /**
     * 最新发行人评级
     */
    @TableField("B_ISSUER_EXT_RATING")
    private String bIssuerExtRating;

    /**
     * 最新发行人评级机构
     */
    @TableField("B_ISSUER_EXT_R_INSTITUTION")
    private String bIssuerExtRInstitution;

    /**
     * 债项首次评级
     */
    @TableField("B_FST_EXT_RATING")
    private String bFstExtRating;

    /**
     * 债项首次评级机构
     */
    @TableField("B_FST_EXT_RATING_INST")
    private String bFstExtRatingInst;

    /**
     * 发行人首次评级
     */
    @TableField("B_FST_ISSUER_EXT_RATING")
    private String bFstIssuerExtRating;

    /**
     * 发行人首次评级机构
     */
    @TableField("B_FST_ISSUER_EXT_R_INST")
    private String bFstIssuerExtRInst;

    /**
     * 基础资产类型名称(仅对ABS债券有效)
     */
    @TableField("B_AS_ASSET_TYPE_NAME")
    private String bAsAssetTypeName;

    /**
     * 参考收益率
     */
    @TableField("REF_YIELD")
    private Double refYield;

    /**
     * 摘牌日
     */
    @TableField("B_DELIST_DATE")
    private String bDelistDate;

    /**
     * ISIN码
     */
    @TableField("ISIN_CODE")
    private String isinCode;

    /**
     * 资产证券化类型，其中1开头的为’信贷资产证券化’，2开头的为’企业资产证券化’：1001：企业信贷资产；1002：汽车抵押贷款；1003：个人住房抵押贷款；1004：租赁资产；1005：信用卡应收账款；1006：个人消费贷款；1007：商业房地产抵押贷款；1008：中小企业贷款；1009：不良资产重组；2001：企业信贷资产；2002：租赁资产；2003：企业应收账款；2004：委托贷款；2005：信托受益权；2006：BT项目回购；2007：BOT项目；2008：入园凭证；2009：收费收益权；2010：REITs；2011：保理融资债权；2012：两融债权；2013：股票质押式回购债权；2014：购房尾款；2015：小额贷款；2016：住房公积金
     */
    @TableField("B_ABS_CLASS")
    private String bAbsClass;

    /**
     * 底层资产类型
     */
    @TableField("B_AS_ASSET_TYPE")
    private String bAsAssetType;

    /**
     * 累进利率 0：否 1：是
     */
    @TableField("IS_PROGRESS_RATE")
    private String isProgressRate;

    /**
     * 是否权益类，0：金融负债，1：权益工具
     */
    @TableField("IS_EQUITY_TOOL")
    private String isEquityTool;

    /**
     * 是否商业银行二级资本债，0：否；1：是
     */
    @TableField("IS_TIER2CAPITAL")
    private String isTier2capital;

    /**
     * 利息税率
     */
    @TableField("B_TAX_RATE")
    private Double bTaxRate;

    @TableField("COLUMN_123")
    private String column123;


}
