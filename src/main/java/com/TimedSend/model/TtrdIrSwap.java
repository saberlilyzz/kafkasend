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
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2023-11-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_IR_SWAP")
public class TtrdIrSwap extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 金融工具代码（模板名称也使用该字段）
     */
    @TableId("I_CODE")
    private String iCode;

    /**
     * 资产类型（如果值为“A_TYPE”则为模板）
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
     * 利率型、净值型
     */
    @TableField("Q_TYPE")
    private String qType;

    /**
     * 产品类型
     */
    @TableField("P_TYPE")
    private String pType;

    /**
     * 产品分类，用户可以修改（模板描述也使用该字段）
     */
    @TableField("P_CLASS")
    private String pClass;

    /**
     * 支付利率代码
     */
    @TableField("U_I_CODE")
    private String uICode;

    /**
     * 支付市场类别
     */
    @TableField("U_M_TYPE")
    private String uMType;

    /**
     * 支付资产类别
     */
    @TableField("U_A_TYPE")
    private String uAType;

    /**
     * 面额
     */
    @TableField("PAR_VALUE")
    private Double parValue;

    /**
     * 起息日
     */
    @TableField("START_DATE")
    private String startDate;

    /**
     * 到期日
     */
    @TableField("MTR_DATE")
    private String mtrDate;

    /**
     * 期限
     */
    @TableField("TERM")
    private String term;

    @TableField("FPML")
    private Clob fpml;

    /**
     * 计算日历
     */
    @TableField("CALENDAR")
    private String calendar;

    /**
     * 支付固定，支付浮动
     */
    @TableField("PAYMENT_DIRECTION")
    private String paymentDirection;

    /**
     * 浮动端收支频率
     */
    @TableField("FLOAT_FREQ")
    private String floatFreq;

    /**
     * 浮动端收支调整规则
     */
    @TableField("FLOAT_CONV")
    private String floatConv;

    /**
     * 浮动端计息基准
     */
    @TableField("FLOAT_DAYCOUNT")
    private String floatDaycount;

    /**
     * 浮动端利息计算方式：单利、复利（不含利差）、复利（含利差）
     */
    @TableField("FLOAT_METHOD")
    private String floatMethod;

    /**
     * 固定/浮动端收支频率(目前肯定是固定端使用)
     */
    @TableField("FREQ")
    private String freq;

    /**
     * 固定/浮动端收支调整规则(目前肯定是固定端使用)
     */
    @TableField("CONV")
    private String conv;

    /**
     * 固定/浮动端计息基准(目前肯定是固定端使用)
     */
    @TableField("DAYCOUNT")
    private String daycount;

    /**
     * 固定/浮动端利息计算方式：单利、复利（不含利差）、复利（含利差）(目前肯定是固定端使用)
     */
    @TableField("METHOD")
    private String method;

    /**
     * 固定利率
     */
    @TableField("FIXED_RATE")
    private Double fixedRate;

    /**
     * 固定端: 付息频率
     */
    @TableField("FIXED_FREQ")
    private String fixedFreq;

    /**
     * 固定端: 计息调整
     */
    @TableField("FIXED_CONV")
    private String fixedConv;

    /**
     * 浮动端：利率利差
     */
    @TableField("SPREAD")
    private Double spread;

    /**
     * 浮动端：定息日
     */
    @TableField("FIXING_DATE")
    private String fixingDate;

    /**
     * 浮动端：重置频率
     */
    @TableField("RESET_FREQ")
    private String resetFreq;

    /**
     * 浮动端：重置调整
     */
    @TableField("RESET_CONV")
    private String resetConv;

    /**
     * 尾巴类型
     */
    @TableField("FINAL_STUB")
    private String finalStub;

    /**
     * 首个实际支付日
     */
    @TableField("FST_PAY_DATE")
    private String fstPayDate;

    /**
     * 首个利率确定日
     */
    @TableField("FST_FIXING_DATE")
    private String fstFixingDate;

    /**
     * 首个规则周期起息日(不使用，预留)
     */
    @TableField("FST_REGULAR_START_DATE")
    private String fstRegularStartDate;

    /**
     * 支付流ID
     */
    @TableField("PAY_STREAM_ID")
    private String payStreamId;

    /**
     * 收取流ID
     */
    @TableField("REC_STREAM_ID")
    private String recStreamId;

    @TableField("S_TYPE")
    private String sType;


}
