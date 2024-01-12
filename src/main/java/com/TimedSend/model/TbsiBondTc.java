package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2023-08-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TBSI_BOND_TC")
public class TbsiBondTc extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("BEG_DATE")
    private String begDate;

    @TableField("END_DATE")
    private String endDate;

    @TableField("MK_MPRICE")
    private BigDecimal mkMprice;

    @TableField("MK_TPRICE")
    private BigDecimal mkTprice;

    @TableField("MK_RETURN")
    private BigDecimal mkReturn;

    @TableField("MK_ACCRUAL")
    private BigDecimal mkAccrual;

    @TableField("MK_MATURITY")
    private BigDecimal mkMaturity;

    @TableField("MK_MATURITY_L")
    private BigDecimal mkMaturityL;

    @TableField("MK_MATURITY_S")
    private BigDecimal mkMaturityS;

    @TableField("MK_YIELD")
    private BigDecimal mkYield;

    @TableField("MK_YIELD_L")
    private BigDecimal mkYieldL;

    @TableField("MK_YIELD_S")
    private BigDecimal mkYieldS;

    @TableField("MK_MAC_DURATION")
    private BigDecimal mkMacDuration;

    @TableField("MK_DURATION")
    private BigDecimal mkDuration;

    @TableField("MK_DURATION_L")
    private BigDecimal mkDurationL;

    @TableField("MK_DURATION_S")
    private BigDecimal mkDurationS;

    @TableField("MK_CONVEXITY")
    private BigDecimal mkConvexity;

    @TableField("MK_CONVEXITY_L")
    private BigDecimal mkConvexityL;

    @TableField("MK_CONVEXITY_S")
    private BigDecimal mkConvexityS;

    @TableField("MK_DVBP")
    private BigDecimal mkDvbp;

    @TableField("MK_IMP_REP")
    private BigDecimal mkImpRep;

    @TableField("MK_KR_DURATION_0")
    private BigDecimal mkKrDuration0;

    @TableField("MK_KR_DURATION_1")
    private BigDecimal mkKrDuration1;

    @TableField("MK_KR_DURATION_2")
    private BigDecimal mkKrDuration2;

    @TableField("MK_KR_DURATION_3")
    private BigDecimal mkKrDuration3;

    @TableField("MK_KR_DURATION_4")
    private BigDecimal mkKrDuration4;

    @TableField("MK_KR_DURATION_5")
    private BigDecimal mkKrDuration5;

    @TableField("MK_KR_DURATION_6")
    private BigDecimal mkKrDuration6;

    @TableField("MK_KR_DURATION_7")
    private BigDecimal mkKrDuration7;

    @TableField("MK_KR_DURATION_8")
    private BigDecimal mkKrDuration8;

    @TableField("MK_KR_DURATION_9")
    private BigDecimal mkKrDuration9;

    @TableField("MK_KR_DURATION_10")
    private BigDecimal mkKrDuration10;

    @TableField("MK_KR_DURATION_11")
    private BigDecimal mkKrDuration11;

    @TableField("MK_KR_DURATION_12")
    private BigDecimal mkKrDuration12;

    @TableField("MK_KR_DURATION_13")
    private BigDecimal mkKrDuration13;

    @TableField("MK_KR_DURATION_14")
    private BigDecimal mkKrDuration14;

    @TableField("MK_KR_DURATION_15")
    private BigDecimal mkKrDuration15;

    @TableField("MK_KM_CASHFLOW_0")
    private BigDecimal mkKmCashflow0;

    @TableField("MK_KM_CASHFLOW_1")
    private BigDecimal mkKmCashflow1;

    @TableField("MK_KM_CASHFLOW_2")
    private BigDecimal mkKmCashflow2;

    @TableField("MK_KM_CASHFLOW_3")
    private BigDecimal mkKmCashflow3;

    @TableField("MK_KM_CASHFLOW_4")
    private BigDecimal mkKmCashflow4;

    @TableField("MK_KM_CASHFLOW_5")
    private BigDecimal mkKmCashflow5;

    @TableField("MK_KM_CASHFLOW_6")
    private BigDecimal mkKmCashflow6;

    @TableField("MK_KM_CASHFLOW_7")
    private BigDecimal mkKmCashflow7;

    @TableField("MK_KM_CASHFLOW_8")
    private BigDecimal mkKmCashflow8;

    @TableField("MK_KM_CASHFLOW_9")
    private BigDecimal mkKmCashflow9;

    @TableField("MK_KM_CASHFLOW_10")
    private BigDecimal mkKmCashflow10;

    @TableField("MK_KM_CASHFLOW_11")
    private BigDecimal mkKmCashflow11;

    @TableField("MK_KM_CASHFLOW_12")
    private BigDecimal mkKmCashflow12;

    @TableField("MK_KM_CASHFLOW_13")
    private BigDecimal mkKmCashflow13;

    @TableField("MK_KM_CASHFLOW_14")
    private BigDecimal mkKmCashflow14;

    @TableField("MK_KM_CASHFLOW_15")
    private BigDecimal mkKmCashflow15;

    @TableField("MK_FPRICE")
    private BigDecimal mkFprice;

    @TableField("MK_L1")
    private BigDecimal mkL1;

    @TableField("MK_L2")
    private BigDecimal mkL2;

    @TableField("MK_AVG_HANDRAIO")
    private BigDecimal mkAvgHandraio;

    @TableField("MK_BARGAIN_RATE_5")
    private BigDecimal mkBargainRate5;

    @TableField("MK_BARGAIN_RATE_20")
    private BigDecimal mkBargainRate20;

    @TableField("MK_BARGAIN_RATE_60")
    private BigDecimal mkBargainRate60;

    @TableField("MK_MARKUP_5")
    private BigDecimal mkMarkup5;

    @TableField("MK_MARKUP_20")
    private BigDecimal mkMarkup20;

    @TableField("MK_MARKUP_60")
    private BigDecimal mkMarkup60;

    @TableField("MK_TPRICE_BAK")
    private BigDecimal mkTpriceBak;

    @TableField("TG_CODE")
    private String tgCode;

    @TableField("MK_DURATION_SPREAD")
    private BigDecimal mkDurationSpread;

    @TableField("MK_DURATION_BENCH")
    private BigDecimal mkDurationBench;

    @TableField("MK_CONVEXITY_SPREAD")
    private BigDecimal mkConvexitySpread;

    @TableField("MK_CONVEXITY_BENCH")
    private BigDecimal mkConvexityBench;

    @TableField("MK_KR_DVBP_0")
    private BigDecimal mkKrDvbp0;

    @TableField("MK_KR_DVBP_1")
    private BigDecimal mkKrDvbp1;

    @TableField("MK_KR_DVBP_2")
    private BigDecimal mkKrDvbp2;

    @TableField("MK_KR_DVBP_3")
    private BigDecimal mkKrDvbp3;

    @TableField("MK_KR_DVBP_4")
    private BigDecimal mkKrDvbp4;

    @TableField("MK_KR_DVBP_5")
    private BigDecimal mkKrDvbp5;

    @TableField("MK_KR_DVBP_6")
    private BigDecimal mkKrDvbp6;

    @TableField("MK_KR_DVBP_7")
    private BigDecimal mkKrDvbp7;

    @TableField("MK_KR_DVBP_8")
    private BigDecimal mkKrDvbp8;

    @TableField("MK_KR_DVBP_9")
    private BigDecimal mkKrDvbp9;

    @TableField("MK_KR_DVBP_10")
    private BigDecimal mkKrDvbp10;

    @TableField("MK_KR_DVBP_11")
    private BigDecimal mkKrDvbp11;

    @TableField("MK_KR_DVBP_12")
    private BigDecimal mkKrDvbp12;

    @TableField("MK_KR_DVBP_13")
    private BigDecimal mkKrDvbp13;

    @TableField("MK_KR_DVBP_14")
    private BigDecimal mkKrDvbp14;

    @TableField("MK_KR_DVBP_15")
    private BigDecimal mkKrDvbp15;

    @TableField("IMP_TIME")
    private String impTime;

    @TableField("MK_PAR_VALUE")
    private BigDecimal mkParValue;


}
