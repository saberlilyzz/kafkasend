package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2023-02-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRSK_HLD")
public class TrskHld extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("C_TOTAL_TYPE")
    private String cTotalType;

    @TableField("C_PCODE")
    private String cPcode;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("C_POSITION")
    private String cPosition;

    @TableField("C_CURRENCY")
    private String cCurrency;

    @TableField("D_BASE")
    private String dBase;

    @TableField("F_VOL")
    private Double fVol;

    @TableField("L_PIPE_ID")
    private Double lPipeId;

    @TableField("F_COST")
    private Double fCost;

    @TableField("PIPE_ID")
    private Double pipeId;

    @TableField("C_DATA_SOURCE")
    private Double cDataSource;

    @TableField("L_FLAG")
    private Double lFlag;

    @TableField("ORG_ID")
    private Double orgId;

    @TableField("OPERATOR")
    private String operator;

    @TableField("L_DIV_PAY")
    private Double lDivPay;

    @TableField("L_BOOK_VALUE")
    private Double lBookValue;

    @TableField("L_INTEREST_ADJUSTED")
    private Double lInterestAdjusted;

    @TableField("L_PAR_VALUE")
    private Double lParValue;

    @TableField("IMP_DATE")
    private String impDate;

    @TableField("UPDATE_TIME")
    private String updateTime;

    @TableField("I_CODE_OLD")
    private String iCodeOld;

    @TableField("A_TYPE_OLD")
    private String aTypeOld;

    @TableField("M_TYPE_OLD")
    private String mTypeOld;

    @TableField("I_NAME_OLD")
    private String iNameOld;

    @TableField("F_MV")
    private Double fMv;

    @TableField("SUBATTR_CODE")
    private String subattrCode;

    @TableField("P_CLASS")
    private String pClass;

    @TableField("FACCTATTR")
    private String facctattr;

    @TableField("F_ACOST")
    private Double fAcost;

    @TableField("S_F_MV")
    private Double sFMv;

    @TableField("F_MV_ORI")
    private Double fMvOri;

    @TableField("F_COST_ORI")
    private Double fCostOri;

    @TableField("L_DIV_PAY_ORI")
    private Double lDivPayOri;



}
