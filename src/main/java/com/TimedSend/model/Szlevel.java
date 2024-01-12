package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2022-12-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("SZLEVEL")
public class Szlevel extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 证券代码
     */
    @TableId("I_CODE")
    private String iCode;

    /**
     * 买盘价格队列
     */
    @TableField("BUY_PRICE_QUEUE")
    private String buyPriceQueue;

    /**
     * 卖盘价格队列
     */
    @TableField("SELL_PRICE_QUEUE")
    private String sellPriceQueue;

    /**
     * 买盘委托量队列
     */
    @TableField("BUY_AMOUNT_QUEUE")
    private String buyAmountQueue;

    /**
     * 卖盘委托量队列
     */
    @TableField("SELL_AMOUNT_QUEUE")
    private String sellAmountQueue;

    @TableField("EXTRA_DIM")
    private String extraDim;

    /**
     * 证券名称
     */
    @TableField("BOND_NAME")
    private String bondName;

    /**
     * 当前席位
     */
    @TableField("CURRENT_SEAT")
    private String currentSeat;

    /**
     * 最近成交价格
     */
    @TableField("LEAST_DEAL_PRICE")
    private Double leastDealPrice;

    /**
     * 最高成交价格
     */
    @TableField("HIGHEST_DEAL_PRICE")
    private Double highestDealPrice;

    /**
     * 最低成交价格
     */
    @TableField("MINIMUM_DEAL_PRICE")
    private Double minimumDealPrice;

    /**
     * 时间
     */
    @TableField("UPDATE_TIME")
    private String updateTime;

    /**
     * 日期
     */
    @TableField("INFO_DATE")
    private String infoDate;

    /**
     * 最新价格
     */
    @TableField("NEW_PRICE")
    private Double newPrice;

    /**
     * 开盘价
     */
    @TableField("MARKET_OPEN_PRICE")
    private Double marketOpenPrice;

    /**
     * 成交额
     */
    @TableField("DEAL_REAL_CP")
    private Double dealRealCp;

    /**
     * ？
     */
    @TableField("MATCH_PLOT")
    private String matchPlot;

    /**
     * 参考净值
     */
    @TableField("IOPV")
    private Double iopv;

    @TableField("STOCKVALUE")
    private Double stockValue;

    /**
     * 成交量
     */
    @TableField("DEAL_REAL_AMOUNT")
    private Double dealRealAmount;

    /**
     * 卖盘委托量
     */
    @TableField("SELL_ENTRUST_AMOUNT")
    private Double sellEntrustAmount;

    /**
     * 买盘委托量
     */
    @TableField("BUY_ENTRUST_AMOUNT")
    private Double buyEntrustAmount;

    /**
     * 平均买盘价格
     */
    @TableField("AVG_BUY_PRICE")
    private Double avgBuyPrice;

    /**
     * 平均卖盘价格
     */
    @TableField("AVG_SELL_PRICE")
    private Double avgSellPrice;

    @TableField("PE_PRFI01")
    private Double pePrfi01;

    @TableField("PE_PRFI02")
    private Double pePrfi02;

    /**
     * 涨停价
     */
    @TableField("HARDEN_PRICE")
    private Double hardenPrice;

    /**
     * 跌停价
     */
    @TableField("DOWN_PRICE")
    private Double downPrice;

}
