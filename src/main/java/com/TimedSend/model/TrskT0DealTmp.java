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
 * @since 2023-05-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRSK_T0_DEAL_TMP")
public class TrskT0DealTmp extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("D_DATE")
    private String dDate;

    @TableField("D_TIME")
    private String dTime;

    @TableField("C_PCODE")
    private String cPcode;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("C_DIRECTION")
    private String cDirection;

    @TableField("F_VOL")
    private Double fVol;

    @TableField("F_AMT")
    private Double fAmt;

    @TableField("F_PRICE")
    private Double fPrice;

    @TableField("F_YDAY_PRICE")
    private Double fYdayPrice;

    @TableField("C_EXIST_YDAY")
    private String cExistYday;

    @TableField("C_DEAL_ID")
    private String cDealId;

    @TableField("F_NET_PRICE")
    private Double fNetPrice;

    @TableField("L_ENTRUST_SERIAL_NO")
    private Long lEntrustSerialNo;

    @TableField("VC_DEAL_NO")
    private String vcDealNo;

    @TableField("AR_H_OPERATE")
    private String arHOperate;

    @TableField("AR_H_TIME")
    private String arHTime;

    @TableField("PIPE_ID")
    private Double pipeId;


}
