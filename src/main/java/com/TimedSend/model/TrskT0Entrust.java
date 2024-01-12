package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * TRSK_T0_ENTRUST T0指令数据
 * </p>
 *
 * @author gaocheng
 * @since 2023-05-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRSK_T0_ENTRUST")
public class TrskT0Entrust extends Model {

    private static final long serialVersionUID = 1L;

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
     * 时间
     */
    @TableField("D_TIME")
    private String dTime;

    /**
     * 状态 1：正常 2：撤出
     */
    @TableField("C_STATUS")
    private String cStatus;

    /**
     * 日期
     */
    @TableField("D_DATE")
    private String dDate;

    /**
     * 指令数量
     */
    @TableField("F_VOL")
    private Double fVol;

    /**
     * 指令金额
     */
    @TableField("F_AMT")
    private Double fAmt;

    /**
     * 申报价格
     */
    @TableField("F_PRICE")
    private Double fPrice;

    /**
     * 委托序号
     */
    @TableField("L_ENTRUST_SERIAL_NO")
    private Long lEntrustSerialNo;

    /**
     * 撤单数量
     */
    @TableField("CANCEL_AMOUNT")
    private Double cancelAmount;

    /**
     * 当日委托数量汇总
     */
    @TableField("F_VOL_TOTAL")
    private Double fVolTotal;

    /**
     * 当日委托金额汇总
     */
    @TableField("F_AMT_TOTAL")
    private Double fAmtTotal;

    /**
     * 市场委托数量汇总
     */
    @TableField("D_ORDER_VOL_TOTAL")
    private Double dOrderVolTotal;

    /**
     * 反向1档行情
     */
    @TableField("REVERSE_PRICE1")
    private Double reversePrice1;

    /**
     * 昨日收盘价
     */
    @TableField("F_PRECLOSE")
    private Double fPreclose;

    /**
     * 最新价格
     */
    @TableField("F_MATCH")
    private Double fMatch;

    /**
     * 基准价格
     */
    @TableField("D_BASE_PRICE")
    private Double dBasePrice;


}
