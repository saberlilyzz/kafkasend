package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * TRSK_T0_DEAL T0成交回报
 * </p>
 *
 * @author gaocheng
 * @since 2023-05-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRSK_T0_DEAL")
public class TrskT0Deal extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 日期
     */
    @TableField("D_DATE")
    private String dDate;

    /**
     * 时间
     */
    @TableField("D_TIME")
    private String dTime;

    /**
     * 基金账号
     */
    @TableField("C_PCODE")
    private String cPcode;

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
     * 委托方向 01：买入 02：卖出
     */
    @TableField("C_DIRECTION")
    private String cDirection;

    /**
     * 成交数量
     */
    @TableField("F_VOL")
    private Double fVol;

    /**
     * 成交金额
     */
    @TableField("F_AMT")
    private Double fAmt;

    /**
     * 成交价格
     */
    @TableField("F_PRICE")
    private Double fPrice;

    /**
     * 成交ID
     */
    @TableField("C_DEAL_ID")
    private String cDealId;

    /**
     * 期间成交金额汇总
     */
    @TableField("F_AMT_TOTAL")
    private Double fAmtTotal;

    /**
     * 当日成交金额汇总
     */
    @TableField("F_CUR_AMT_TOTAL")
    private Double fCurAmtTotal;

    /**
     * 期间成交数量汇总
     */
    @TableField("F_VOL_TOTAL")
    private Double fVolTotal;

    /**
     * 市场成交数量汇总
     */
    @TableField("D_DEAL_VOL_TOTAL")
    private Double dDealVolTotal;

    /**
     * 昨日收盘价
     */
    @TableField("F_PRECLOSE")
    private Double fPreclose;


}
