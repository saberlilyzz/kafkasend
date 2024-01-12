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
 * TRSK_T0_ENTRUST_TMP1 T0指令数据
 * </p>
 *
 * @author gaocheng
 * @since 2023-05-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRSK_T0_ENTRUST_TMP1")
public class TrskT0EntrustTmp extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 指令序号
     */
    @TableId("C_ID")
    private String cId;

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
     * 价格美型:0:限价
     */
    @TableField("C_PRICE_TYPE")
    private String cPriceType;

    /**
     * 具体的委托方向
     */
    @TableField("C_DIRECTION_DETAIL")
    private String cDirectionDetail;

    /**
     * 委托序号
     */
    @TableField("L_ENTRUST_SERIAL_NO")
    private Long lEntrustSerialNo;

    /**
     * 导入时间
     */
    @TableField("IMP_TIME")
    private String impTime;

    /**
     * 数插入更新状态
     */
    @TableField("AR_H_OPERATE")
    private String arHOperate;

    /**
     * 032数店更新时间
     */
    @TableField("AR_H_TIME")
    private String arHTime;

    /**
     * 撤单标志
     */
    @TableField("CANCEL_FLAG")
    private String cancelFlag;

    /**
     * 撤单数量
     */
    @TableField("CANCEL_AMOUNT")
    private Double cancelAmount;


}
