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
 * TTRD_OTC_EQUITY_SWAP
 * </p>
 *
 * @author gaocheng
 * @since 2023-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_OTC_EQUITY_SWAP")
public class TtrdOtcEquitySwap extends Model {

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
     * 币种
     */
    @TableField("CURRENCY")
    private String currency;

    /**
     * 报价方式
     */
    @TableField("Q_TYPE")
    private String qType;

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
     * 本金
     */
    @TableField("PARVALUE")
    private Double parvalue;

    /**
     * 起息日期
     */
    @TableField("START_DATE")
    private String startDate;

    /**
     * 到期日期
     */
    @TableField("MATER_DATE")
    private String materDate;

    /**
     * 交易日历
     */
    @TableField("CALENDAR")
    private String calendar;

    /**
     * 权益端标的交易代码
     */
    @TableField("EQUITY_I_CODE")
    private String equityICode;

    /**
     * 权益端标的资产类型
     */
    @TableField("EQUITY_M_TYPE")
    private String equityMType;

    /**
     * 权益端标的市场类型
     */
    @TableField("EQUITY_A_TYPE")
    private String equityAType;

    /**
     * 权益端期初价格
     */
    @TableField("EQUITY_INITIALPRICE")
    private Double equityInitialprice;

    /**
     * 权益端观察频率
     */
    @TableField("EQUITY_OBS_FREQ")
    private String equityObsFreq;

    /**
     * 权益端付息频率
     */
    @TableField("EQUITY_FREQ")
    private String equityFreq;

    /**
     * 权益端付息调整规则
     */
    @TableField("EQUITY_DAYCONVERSION")
    private String equityDayconversion;

    /**
     * 费用端浮动基准交易代码
     */
    @TableField("FEE_I_CODE")
    private String feeICode;

    /**
     * 费用端浮动基准资产类型
     */
    @TableField("FEE_M_TYPE")
    private String feeMType;

    /**
     * 费用端浮动基准市场类型
     */
    @TableField("FEE_A_TYPE")
    private String feeAType;

    /**
     * 利率端利率类型，Fixed：固定 Float：浮动
     */
    @TableField("FEE_IR_TYPE")
    private String feeIrType;

    /**
     * 费用端计息基准
     */
    @TableField("FEE_DAYCOUNT")
    private String feeDaycount;

    /**
     * 费用端固定利率
     */
    @TableField("FEE_FIXED_RATE")
    private Double feeFixedRate;

    /**
     * 费用端付息频率
     */
    @TableField("FEE_FREQ")
    private String feeFreq;

    /**
     * 费用端付息调整规则
     */
    @TableField("FEE_DAYCONVERSION")
    private String feeDayconversion;

    /**
     * 费用端重置频率
     */
    @TableField("FEE_RESET_FREQ")
    private String feeResetFreq;

    /**
     * 费用端重置调整规则
     */
    @TableField("FEE_RESET_DAYCONVERSION")
    private String feeResetDayconversion;

    /**
     * 费用端定息日偏移
     */
    @TableField("FEE_FIXING_DAYS")
    private String feeFixingDays;

    /**
     * 费用端定息日调整规则
     */
    @TableField("FEE_FIXING_DAYCONVERSION")
    private String feeFixingDayconversion;

    /**
     * 交易方向，1：收去利率 0：支付利率
     */
    @TableField("SWAP_DIRECTION")
    private String swapDirection;

    /**
     * 费用端FpML
     */
    @TableField("FEE_FPML")
    private Clob feeFpml;

    /**
     * 导入管道
     */
    @TableField("PIPE_ID")
    private Double pipeId;

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
     * 权益端结算日偏移
     */
    @TableField("EQUITY_SETTLE_DAYS")
    private Double equitySettleDays;

    /**
     * 费用端结算日偏移
     */
    @TableField("FEE_SETTLE_DAYS")
    private Double feeSettleDays;

    /**
     * 权益端到期调整规则
     */
    @TableField("EQUITY_MATER_DAYCONVERSION")
    private String equityMaterDayconversion;

    /**
     * 权益端多空标志，Long：多头，Short：空头
     */
    @TableField("EQUITY_POSITION")
    private String equityPosition;

    /**
     * 权益端交易费用
     */
    @TableField("EQUITY_FEE")
    private Double equityFee;

    /**
     * 标准类型
     */
    @TableField("S_TYPE")
    private String sType;

    /**
     * 是否年化，1：年化；0：非年化  默认0
     */
    @TableField("IS_ANNUAL")
    private String isAnnual;

    /**
     * 合约期初标的数量
     */
    @TableField("AMOUNT")
    private Float amount;

    /**
     * 本金参与率
     */
    @TableField("REFERENCE_PRICE")
    private Double referencePrice;

    /**
     * 合约乘数
     */
    @TableField("LOTSIZE")
    private Double lotsize;

    /**
     * 流动性折扣
     */
    @TableField("LIQUID_RATIO")
    private Double liquidRatio;

    /**
     * 固定收益计算方式,0：摊销；1：调整后摊销；2：期初确认
     */
    @TableField("FEE_PAY_METHOD")
    private String feePayMethod;

    /**
     * 固定收益支付方，0：多头；1：空头
     */
    @TableField("FEE_PAY_POSITION")
    private String feePayPosition;

    /**
     * 调整比例
     */
    @TableField("ADJUST_RATIO")
    private Double adjustRatio;

    /**
     * 交易对手ID
     */
    @TableField("PARTY_TRADE_ID")
    private String partyTradeId;

    /**
     * 交易对手名称
     */
    @TableField("PARTY_TRADE_NAME")
    private String partyTradeName;

    /**
     * 期初价格-含费
     */
    @TableField("INITIAL_PRICE")
    private Double initialPrice;

    /**
     * 是否框架合约，1：是；0：否
     */
    @TableField("IS_FRAME_CONTRACT")
    private String isFrameContract;

    /**
     * 框架合约编号
     */
    @TableField("MAIN_CODE")
    private String mainCode;

    /**
     * 标的调整比例
     */
    @TableField("UNDERLYING_ADJUST_RATIO")
    private Double underlyingAdjustRatio;

    /**
     * 权益支付多空标志，Long：多头；Short：空头
     */
    @TableField("EQUITY_PAY_POSITION")
    private String equityPayPosition;

    /**
     * 是否单权益端合约, 1：是；0：否
     */
    @TableField("IS_SINGLEEQUITY_CONTRACT")
    private String isSingleequityContract;


}
