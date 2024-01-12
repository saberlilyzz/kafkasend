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
 * @since 2023-05-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TRSK_T0JYS_LEVEL5_2")
public class TrskT0Level extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("C_STATUS")
    private String cStatus;

    @TableField("D_DATE")
    private String dDate;

    @TableField("D_TIME")
    private String dTime;

    @TableField("F_PRECLOSE")
    private Double fPreclose;

    @TableField("F_OPEN")
    private Double fOpen;

    @TableField("F_HIGH")
    private Double fHigh;

    @TableField("F_LOW")
    private Double fLow;

    @TableField("F_MATCH")
    private Double fMatch;

    @TableField("F_ASKPRICE1")
    private Double fAskprice1;

    @TableField("F_ASKVOL1")
    private Double fAskvol1;

    @TableField("F_BIDPRICE1")
    private Double fBidprice1;

    @TableField("F_BIDVOL1")
    private Double fBidvol1;

    @TableField("F_ASKPRICE2")
    private Double fAskprice2;

    @TableField("F_ASKVOL2")
    private Double fAskvol2;

    @TableField("F_BIDPRICE2")
    private Double fBidprice2;

    @TableField("F_BIDVOL2")
    private Double fBidvol2;

    @TableField("F_ASKPRICE3")
    private Double fAskprice3;

    @TableField("F_ASKVOL3")
    private Double fAskvol3;

    @TableField("F_BIDPRICE3")
    private Double fBidprice3;

    @TableField("F_BIDVOL3")
    private Double fBidvol3;

    @TableField("F_ASKPRICE4")
    private Double fAskprice4;

    @TableField("F_ASKVOL4")
    private Double fAskvol4;

    @TableField("F_BIDPRICE4")
    private Double fBidprice4;

    @TableField("F_BIDVOL4")
    private Double fBidvol4;

    @TableField("F_ASKPRICE5")
    private Double fAskprice5;

    @TableField("F_ASKVOL5")
    private Double fAskvol5;

    @TableField("F_BIDPRICE5")
    private Double fBidprice5;

    @TableField("F_BIDVOL5")
    private Double fBidvol5;

    @TableField("F_NUMTRADES")
    private Double fNumtrades;

    @TableField("F_VOLUME")
    private Double fVolume;

    @TableField("F_TURNOVER")
    private Double fTurnover;

    @TableField("F_HIGHLIMITED")
    private Double fHighlimited;

    @TableField("F_LOWLIMITED")
    private Double fLowlimited;

    @TableField("STRADINGPHASECODE")
    private String stradingphasecode;

    @TableField("F_CLOSEPRICE")
    private Double fCloseprice;


}
