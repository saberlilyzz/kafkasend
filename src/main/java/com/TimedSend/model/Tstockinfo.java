package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2022-10-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TSTOCKINFO")
public class Tstockinfo extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 证券内码
     */
    @TableId("VC_INTER_CODE")
    private String vcInterCode;

    /**
     * 日期
     */
    @TableField("L_DATE")
    private BigDecimal lDate;

    /**
     * 交易市场编号
     */
    @TableField("C_MARKET_NO")
    private String cMarketNo;

    /**
     * *申报代码
     */
    @TableField("VC_REPORT_CODE")
    private String vcReportCode;

    /**
     * 证券名称
     */
    @TableField("VC_STOCK_NAME")
    private String vcStockName;

    /**
     * 证券拼音码
     */
    @TableField("VC_STOCK_SPELL")
    private String vcStockSpell;

    /**
     * 证券全称
     */
    @TableField("VC_STOCK_FULLNAME")
    private String vcStockFullname;

    /**
     * 证券类别
     */
    @TableField("C_STOCK_TYPE")
    private String cStockType;

    /**
     * 资产类别
     */
    @TableField("C_ASSET_CLASS")
    private String cAssetClass;

    /**
     * 涨停板比例
     */
    @TableField("EN_UPLIMITED_RATIO")
    private BigDecimal enUplimitedRatio;

    /**
     * 跌停板比例
     */
    @TableField("EN_DOWNLIMITED_RATIO")
    private BigDecimal enDownlimitedRatio;

    /**
     * 涨停板价格
     */
    @TableField("EN_UPLIMITED_PRICE")
    private BigDecimal enUplimitedPrice;

    /**
     * 跌停板价格
     */
    @TableField("EN_DOWNLIMITED_PRICE")
    private BigDecimal enDownlimitedPrice;

    /**
     * 价格模式
     */
    @TableField("C_DEFAULT_PRICE")
    private String cDefaultPrice;

    /**
     * 委托冻结代码
     */
    @TableField("VC_FROZEN_CODE")
    private String vcFrozenCode;

    /**
     * 委托关联冻结代码
     */
    @TableField("VC_RELATIVE_FROZEN_CODE")
    private String vcRelativeFrozenCode;

    /**
     * 配售关联代码
     */
    @TableField("VC_ASSIGN_CODE")
    private String vcAssignCode;

    /**
     * 资产关联代码
     */
    @TableField("VC_ASSET_RELATIVE_CODE")
    private String vcAssetRelativeCode;

    /**
     * 配对关联代码1
     */
    @TableField("VC_MATCH_RELATIVE1_CODE")
    private String vcMatchRelative1Code;

    /**
     * 配对关联代码2
     */
    @TableField("VC_MATCH_RELATIVE2_CODE")
    private String vcMatchRelative2Code;

    /**
     * 总股本
     */
    @TableField("L_TOTAL_AMOUNT")
    private BigDecimal lTotalAmount;

    /**
     * 流通股本
     */
    @TableField("L_TURNOVER_AMOUNT")
    private BigDecimal lTurnoverAmount;

    /**
     * 靠档股本
     */
    @TableField("L_NEAR_AMOUNT")
    private BigDecimal lNearAmount;

    /**
     * 市赢率
     */
    @TableField("EN_REPAY_YEAR")
    private BigDecimal enRepayYear;

    /**
     * 昨收盘价
     */
    @TableField("EN_YESTERDAY_CLOSE_PRICE")
    private BigDecimal enYesterdayClosePrice;

    /**
     * 今开盘价
     */
    @TableField("EN_OPEN_PRICE")
    private BigDecimal enOpenPrice;

    /**
     * *发行公司
     */
    @TableField("L_COMPANY_ID")
    private BigDecimal lCompanyId;

    /**
     * 收益率
     */
    @TableField("EN_YIELD_RATIO")
    private BigDecimal enYieldRatio;

    /**
     * 杂项分类
     */
    @TableField("VC_MIXED_TYPE")
    private String vcMixedType;

    /**
     * 停牌标志
     */
    @TableField("C_STOP_FLAG")
    private String cStopFlag;

    /**
     * 最新价/今收盘价
     */
    @TableField("EN_LAST_PRICE")
    private BigDecimal enLastPrice;

    /**
     * 平均价格
     */
    @TableField("EN_AVG_PRICE")
    private BigDecimal enAvgPrice;

    /**
     * 今最高价
     */
    @TableField("EN_MAX_PRICE")
    private BigDecimal enMaxPrice;

    /**
     * 今最低价
     */
    @TableField("EN_MIN_PRICE")
    private BigDecimal enMinPrice;

    /**
     * 最高数量限额
     */
    @TableField("L_UPLIMITED_AMOUNT")
    private BigDecimal lUplimitedAmount;

    /**
     * 最低数量限额
     */
    @TableField("L_DOWNLIMITED_AMOUNT")
    private BigDecimal lDownlimitedAmount;

    /**
     * 市场成交数量
     */
    @TableField("L_MARKET_DEAL_AMOUNT")
    private BigDecimal lMarketDealAmount;

    /**
     * 市场成交金额
     */
    @TableField("EN_MARKET_DEAL_BALANCE")
    private BigDecimal enMarketDealBalance;

    /**
     * 参考价格
     */
    @TableField("EN_REFERENCE_PRICE")
    private BigDecimal enReferencePrice;

    /**
     * 发行日期
     */
    @TableField("L_PUBLISH_DATE")
    private BigDecimal lPublishDate;

    /**
     * 可流通日期
     */
    @TableField("L_TURNOVER_DATE")
    private BigDecimal lTurnoverDate;

    /**
     * 总锁定天数
     */
    @TableField("L_TOTAL_LOCK_DAYS")
    private BigDecimal lTotalLockDays;

    /**
     * 可流通剩余天数
     */
    @TableField("L_LEFT_LOCK_DAYS")
    private BigDecimal lLeftLockDays;

    /**
     * 行情揭示代码
     */
    @TableField("VC_PRICE_RELATIVE_CODE")
    private String vcPriceRelativeCode;

    /**
     * 国际代码
     */
    @TableField("VC_INTERNATIONAL_CODE")
    private String vcInternationalCode;

    /**
     * 路透代码
     */
    @TableField("VC_RIC_CODE")
    private String vcRicCode;

    /**
     * 伦敦代码
     */
    @TableField("VC_SEDOL_CODE")
    private String vcSedolCode;

    /**
     * 美国代码
     */
    @TableField("VC_CUSIP_CODE")
    private String vcCusipCode;

    /**
     * 彭博代码
     */
    @TableField("VC_BLOOMBERG_CODE")
    private String vcBloombergCode;

    /**
     * 买一价
     */
    @TableField("EN_BUY_PRICE1")
    private BigDecimal enBuyPrice1;

    /**
     * 买一数量
     */
    @TableField("L_BUY_AMOUNT1")
    private BigDecimal lBuyAmount1;

    /**
     * 买二价
     */
    @TableField("EN_BUY_PRICE2")
    private BigDecimal enBuyPrice2;

    /**
     * 买二数量
     */
    @TableField("L_BUY_AMOUNT2")
    private BigDecimal lBuyAmount2;

    /**
     * 买三价
     */
    @TableField("EN_BUY_PRICE3")
    private BigDecimal enBuyPrice3;

    /**
     * 买三数量
     */
    @TableField("L_BUY_AMOUNT3")
    private BigDecimal lBuyAmount3;

    /**
     * 买四价
     */
    @TableField("EN_BUY_PRICE4")
    private BigDecimal enBuyPrice4;

    /**
     * 买四数量
     */
    @TableField("L_BUY_AMOUNT4")
    private BigDecimal lBuyAmount4;

    /**
     * 买五价
     */
    @TableField("EN_BUY_PRICE5")
    private BigDecimal enBuyPrice5;

    /**
     * 买五数量
     */
    @TableField("L_BUY_AMOUNT5")
    private BigDecimal lBuyAmount5;

    /**
     * 卖一价
     */
    @TableField("EN_SALE_PRICE1")
    private BigDecimal enSalePrice1;

    /**
     * 卖一数量
     */
    @TableField("L_SALE_AMOUNT1")
    private BigDecimal lSaleAmount1;

    /**
     * 卖二价
     */
    @TableField("EN_SALE_PRICE2")
    private BigDecimal enSalePrice2;

    /**
     * 卖二数量
     */
    @TableField("L_SALE_AMOUNT2")
    private BigDecimal lSaleAmount2;

    /**
     * 卖三价
     */
    @TableField("EN_SALE_PRICE3")
    private BigDecimal enSalePrice3;

    /**
     * 卖三数量
     */
    @TableField("L_SALE_AMOUNT3")
    private BigDecimal lSaleAmount3;

    /**
     * 卖四价
     */
    @TableField("EN_SALE_PRICE4")
    private BigDecimal enSalePrice4;

    /**
     * 卖四数量
     */
    @TableField("L_SALE_AMOUNT4")
    private BigDecimal lSaleAmount4;

    /**
     * 卖五价
     */
    @TableField("EN_SALE_PRICE5")
    private BigDecimal enSalePrice5;

    /**
     * 卖五数量
     */
    @TableField("L_SALE_AMOUNT5")
    private BigDecimal lSaleAmount5;

    /**
     * 币种
     */
    @TableField("VC_CURRENCY_NO")
    private String vcCurrencyNo;

    /**
     * 面值
     */
    @TableField("EN_FACE_VALUES")
    private BigDecimal enFaceValues;

    /**
     * 网上上市日期
     */
    @TableField("L_LISTING_DATE")
    private BigDecimal lListingDate;

    /**
     * 网下上市日期
     */
    @TableField("L_WX_LISTING_DATE")
    private BigDecimal lWxListingDate;

    /**
     * 长期停牌标志
     */
    @TableField("C_long_STOP_FLAG")
    private String cLongStopFlag;

    /**
     * 公允价2
     */
    @TableField("EN_FAIR_PRICE2")
    private BigDecimal enFairPrice2;

    /**
     * 买入最小单位
     */
    @TableField("L_BUY_UNIT")
    private BigDecimal lBuyUnit;

    /**
     * 卖出最小单位
     */
    @TableField("L_SALE_UNIT")
    private BigDecimal lSaleUnit;


}
