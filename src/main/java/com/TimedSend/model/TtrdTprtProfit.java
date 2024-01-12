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
 * @since 2023-08-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TPRT_PROFIT")
public class TtrdTprtProfit extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 内部证券账户
     */
    @TableId("SECU_ACCT_ID")
    private String secuAcctId;

    /**
     * 多空维度
     */
    @TableField("EXTRA_DIM")
    private String extraDim;

    /**
     * 币种
     */
    @TableField("CURRENCY")
    private String currency;

    /**
     * 金融工具代码
     */
    @TableField("I_CODE")
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
     * 持仓数量
     */
    @TableField("REAL_VOLUME")
    private Double realVolume;

    /**
     * 持仓净价成本
     */
    @TableField("REAL_CP")
    private Double realCp;

    /**
     * 当日买入数量
     */
    @TableField("CUR_BUY_VOLUME")
    private Double curBuyVolume;

    /**
     * 当日买入净价成本
     */
    @TableField("CUR_BUY_CP")
    private Double curBuyCp;

    /**
     * 当日卖出数量
     */
    @TableField("CUR_SELL_VOLUME")
    private Double curSellVolume;

    /**
     * 当日卖出净价成本
     */
    @TableField("CUR_SELL_CP")
    private Double curSellCp;

    /**
     * 市值
     */
    @TableField("MTM")
    private Double mtm;

    /**
     * 昨日市值
     */
    @TableField("YTD_MTM")
    private Double ytdMtm;

    /**
     * 当日买入盈亏
     */
    @TableField("BUY_PRFT_FV")
    private Double buyPrftFv;

    /**
     * 当日卖出盈亏
     */
    @TableField("SELL_PRFT_FV")
    private Double sellPrftFv;

    /**
     * 昨日持仓浮盈
     */
    @TableField("YTD_PRFT_FV")
    private Double ytdPrftFv;

    /**
     * 当前单位净价
     */
    @TableField("CUR_PRICE")
    private Double curPrice;

    /**
     * 昨日收盘单位净价
     */
    @TableField("YTD_PRICE")
    private Double ytdPrice;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private String updateTime;

    /**
     * 敞口
     */
    @TableField("EXPOSURE")
    private Double exposure;

    /**
     * 昨日敞口
     */
    @TableField("YTD_EXPOSURE")
    private Double ytdExposure;

    /**
     * 清算日期
     */
    @TableField("SET_DATE")
    private String setDate;

    /**
     * 昨日持仓利息
     */
    @TableField("AI")
    private Double ai;

    /**
     * 当日单张应计利息
     */
    @TableField("TODAY_AI")
    private Double todayAi;

    /**
     * 当日价差损益
     */
    @TableField("CUR_PRFT_TRD")
    private Double curPrftTrd;

    /**
     * 当日利息损益
     */
    @TableField("CUR_PRFT_IR_TRD")
    private Double curPrftIrTrd;

    /**
     * 当日利息收入
     */
    @TableField("CUR_PRFT_IR_AI")
    private Double curPrftIrAi;

    /**
     * 昨日持仓的累计损益
     */
    @TableField("F_PRFT_GROSS")
    private Double fPrftGross;

    /**
     * 累计价差损益
     */
    @TableField("PRFT_TRD")
    private Double prftTrd;

    /**
     * 累计利息损益
     */
    @TableField("PRFT_IR_TRD")
    private Double prftIrTrd;

    /**
     * 累计利息收入
     */
    @TableField("PRFT_IR_AI")
    private Double prftIrAi;

    /**
     * 累计浮盈
     */
    @TableField("PRFT_FV")
    private Double prftFv;


}
