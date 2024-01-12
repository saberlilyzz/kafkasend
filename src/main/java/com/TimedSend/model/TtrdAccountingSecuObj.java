package com.TimedSend.model;

import java.math.BigDecimal;
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
 * @author zheng.zhang
 * @since 2024-01-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_ACCOUNTING_SECU_OBJ")
public class TtrdAccountingSecuObj extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("OBJ_ID")
    private String objId;

    @TableField("TSK_ID")
    private String tskId;

    @TableField("BEG_DATE")
    private String begDate;

    @TableField("END_DATE")
    private String endDate;

    @TableField("EXT_SECU_ACCT_ID")
    private String extSecuAcctId;

    @TableField("SECU_ACCT_ID")
    private String secuAcctId;

    @TableField("TRADE_GRP_ID")
    private String tradeGrpId;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("TRADE_ID")
    private String tradeId;

    @TableField("EXTRA_DIM")
    private String extraDim;

    @TableField("REAL_VOLUME")
    private BigDecimal realVolume;

    @TableField("REAL_AMOUNT")
    private BigDecimal realAmount;

    @TableField("REAL_CP")
    private BigDecimal realCp;

    @TableField("PRFT_FEE")
    private BigDecimal prftFee;

    @TableField("AI")
    private BigDecimal ai;

    @TableField("AI_COST")
    private BigDecimal aiCost;

    @TableField("CHG_FV")
    private BigDecimal chgFv;

    @TableField("DUE_AMOUNT")
    private BigDecimal dueAmount;

    @TableField("DUE_CP")
    private BigDecimal dueCp;

    @TableField("DUE_AI")
    private BigDecimal dueAi;

    @TableField("AMRT_COUNT")
    private BigDecimal amrtCount;

    @TableField("AMRT_DATE")
    private String amrtDate;

    @TableField("AMRT_IR")
    private BigDecimal amrtIr;

    @TableField("PRFT_FV")
    private BigDecimal prftFv;

    @TableField("PRFT_TRD")
    private BigDecimal prftTrd;

    @TableField("PRFT_IR")
    private BigDecimal prftIr;

    @TableField("PRFT_IR_AI")
    private BigDecimal prftIrAi;

    @TableField("PRFT_IR_AMRT")
    private BigDecimal prftIrAmrt;

    @TableField("PRFT_IR_AI_HLD")
    private BigDecimal prftIrAiHld;

    @TableField("PRFT_IR_AMRT_HLD")
    private BigDecimal prftIrAmrtHld;

    @TableField("RECLASS_PRFT_FV")
    private BigDecimal reclassPrftFv;

    @TableField("IMPAIR")
    private BigDecimal impair;

    @TableField("PRFT_IMPAIR")
    private BigDecimal prftImpair;

    @TableField("REAL_MARGIN")
    private BigDecimal realMargin;

    @TableField("OPEN_TIME")
    private String openTime;

    @TableField("UPDATE_TIME")
    private String updateTime;

    @TableField("DUE_FEE")
    private BigDecimal dueFee;

    @TableField("FEE")
    private BigDecimal fee;

    @TableField("AMRT_IR_HP")
    private BigDecimal amrtIrHp;

    @TableField("AMRT_YTM")
    private BigDecimal amrtYtm;

    @TableField("AMRT_COST_CP")
    private BigDecimal amrtCostCp;

    @TableField("AMRT_COST_AI")
    private BigDecimal amrtCostAi;

    @TableField("INVEST_YTM")
    private BigDecimal investYtm;

    @TableField("OPEN_YTM")
    private BigDecimal openYtm;

    @TableField("FUTURE_AI")
    private BigDecimal futureAi;

    @TableField("REAL_CP_NOAMRT")
    private BigDecimal realCpNoamrt;

    @TableField("CHG_FV_NOAMRT")
    private BigDecimal chgFvNoamrt;

    @TableField("PRFT_FV_NOAMRT")
    private BigDecimal prftFvNoamrt;

    @TableField("PRFT_TRD_NOAMRT")
    private BigDecimal prftTrdNoamrt;

    @TableField("REAL_VOLUME_TERMCUR")
    private BigDecimal realVolumeTermcur;

    @TableField("REAL_AMOUNT_TERMCUR")
    private BigDecimal realAmountTermcur;

    @TableField("DUE_AMOUNT_TERMCUR")
    private BigDecimal dueAmountTermcur;

    @TableField("REAL_CP_TERMCUR")
    private BigDecimal realCpTermcur;

    @TableField("DUE_CP_TERMCUR")
    private BigDecimal dueCpTermcur;

    @TableField("AMRT_METHOD")
    private Integer amrtMethod;

    @TableField("PRFT_IR_AMRT_RC")
    private BigDecimal prftIrAmrtRc;

    @TableField("PRFT_IR_AMRT_HLD_RC")
    private BigDecimal prftIrAmrtHldRc;

    @TableField("AMRT_COST_CP_RC")
    private BigDecimal amrtCostCpRc;

    @TableField("AMRT_YTM_RC")
    private BigDecimal amrtYtmRc;

    @TableField("AMRT_IR_HP_RC")
    private BigDecimal amrtIrHpRc;

    @TableField("CALC_DATE")
    private String calcDate;

    @TableField("IPR_STATE")
    private BigDecimal iprState;

    @TableField("IPR_PRFT_CP")
    private BigDecimal iprPrftCp;

    @TableField("IPR_PRFT_AI")
    private BigDecimal iprPrftAi;

    @TableField("IPR_CP")
    private BigDecimal iprCp;

    @TableField("IPR_HX_CP")
    private BigDecimal iprHxCp;

    @TableField("IPR_HX_AI")
    private BigDecimal iprHxAi;

    @TableField("IPR_HX_DUE_AI")
    private BigDecimal iprHxDueAi;

    @TableField("IPR_BW_AI")
    private BigDecimal iprBwAi;

    @TableField("IPR_BW_DUE_AI")
    private BigDecimal iprBwDueAi;

    @TableField("AMRT_DATE_RC")
    private String amrtDateRc;

    @TableField("AMRT_COST_AI_RC")
    private BigDecimal amrtCostAiRc;

    @TableField("OPEN_DATE_RC")
    private String openDateRc;

    @TableField("PRFT_IR_AI_CALC_TAX")
    private BigDecimal prftIrAiCalcTax;

    @TableField("TAX_AI")
    private BigDecimal taxAi;

    @TableField("TAX_DUE_AI")
    private BigDecimal taxDueAi;

    @TableField("TAX_FEE")
    private BigDecimal taxFee;

    @TableField("FV_CURRENCY")
    private String fvCurrency;

    @TableField("SET_DATE")
    private String setDate;

    @TableField("PRFT_FV_CASH")
    private BigDecimal prftFvCash;

    @TableField("TAX_AI_HLD")
    private BigDecimal taxAiHld;

    @TableField("OPEN_AI")
    private BigDecimal openAi;

    @TableField("OPEN_YTM_OPT")
    private BigDecimal openYtmOpt;

    @TableField("PRFT_IR_AI_FUT")
    private BigDecimal prftIrAiFut;

    @TableField("PRFT_IR_AI_CUR")
    private BigDecimal prftIrAiCur;

    @TableField("PRFT_IR_AI_DUE")
    private BigDecimal prftIrAiDue;

    @TableField("PRFT_IR_AI_CASH")
    private BigDecimal prftIrAiCash;

    @TableField("TAX_FUT_AI")
    private BigDecimal taxFutAi;

    @TableField("TAX_DUE_AMRT")
    private BigDecimal taxDueAmrt;

    @TableField("TAX_DUE_AMRT_RC")
    private BigDecimal taxDueAmrtRc;

    @TableField("TAX_DUE_TRD")
    private BigDecimal taxDueTrd;

    @TableField("TAX_DUE_FV")
    private BigDecimal taxDueFv;

    @TableField("TAX_DUE_FV_RECLASS")
    private BigDecimal taxDueFvReclass;

    @TableField("TAX_DUE_FV_CASH")
    private BigDecimal taxDueFvCash;

    @TableField("TAX_DUE_FEE")
    private BigDecimal taxDueFee;

    @TableField("DUE_CHG_FV")
    private BigDecimal dueChgFv;

    @TableField("DUE_VOLUME")
    private BigDecimal dueVolume;

    @TableField("AMRT_VERIFY_CODE")
    private String amrtVerifyCode;

    @TableField("AMRT_VERIFY_DATE")
    private String amrtVerifyDate;

    @TableField("PRFT_RECLASS")
    private BigDecimal prftReclass;

    @TableField("CLOSE_SET_DATE")
    private String closeSetDate;

    @TableField("TRADE_INST_ID")
    private BigDecimal tradeInstId;

    @TableField("CUSTOM_DIM1")
    private String customDim1;

    @TableField("IPR_PERIOD")
    private Integer iprPeriod;

    @TableField("IPR_CP1")
    private BigDecimal iprCp1;

    @TableField("IPR_CP2")
    private BigDecimal iprCp2;

    @TableField("IPR_CP3")
    private BigDecimal iprCp3;

    @TableField("IPR_PRFT_CP1")
    private BigDecimal iprPrftCp1;

    @TableField("IPR_PRFT_CP2")
    private BigDecimal iprPrftCp2;

    @TableField("IPR_PRFT_CP3")
    private BigDecimal iprPrftCp3;

    @TableField("AMRT_START_IR_HP")
    private BigDecimal amrtStartIrHp;

    @TableField("TAX_AMRT")
    private BigDecimal taxAmrt;

    @TableField("CALC_TAX_AMRT_CUR")
    private BigDecimal calcTaxAmrtCur;

    @TableField("CALC_TAX_AMRT_DUE")
    private BigDecimal calcTaxAmrtDue;

    @TableField("CALC_TAX_AMRT_CASH")
    private BigDecimal calcTaxAmrtCash;

    @TableField("TAX_FV")
    private BigDecimal taxFv;

    @TableField("DISCOUNT_AI")
    private BigDecimal discountAi;

    @TableField("TAX_DUE_AI_AMRT")
    private BigDecimal taxDueAiAmrt;

    @TableField("PRFT_IR_TRD")
    private BigDecimal prftIrTrd;

    @TableField("TAX_DUE_AI_TRD")
    private BigDecimal taxDueAiTrd;

    @TableField("PRFT_IR_AMRT_CUR")
    private BigDecimal prftIrAmrtCur;

    @TableField("PRFT_IR_AMRT_DUE")
    private BigDecimal prftIrAmrtDue;

    @TableField("PRFT_IR_AMRT_CASH")
    private BigDecimal prftIrAmrtCash;

    @TableField("TAX_IR")
    private BigDecimal taxIr;

    @TableField("TAX_DUE_IR")
    private BigDecimal taxDueIr;

    @TableField("PRFT_ID")
    private String prftId;

    @TableField("DEVIATION")
    private BigDecimal deviation;

    @TableField("PRFT_IR_FUT_AI")
    private BigDecimal prftIrFutAi;

    @TableField("IS_AI_TRANSFERED")
    private Integer isAiTransfered;

    @TableField("IPR_AI3")
    private BigDecimal iprAi3;

    @TableField("IPR_PRFT_AI3")
    private BigDecimal iprPrftAi3;

    @TableField("DEFERRED_FV_TAX")
    private BigDecimal deferredFvTax;

    @TableField("DEFERRED_PROFIT_FV_TAX")
    private BigDecimal deferredProfitFvTax;

    @TableField("IPR_AI")
    private BigDecimal iprAi;

    /**
     * 当前周期应收未收应计利息
     */
    @TableField("CUR_DUE_AI")
    private BigDecimal curDueAi;

    /**
     * 红利收入
     */
    @TableField("PRFT_IR_DVD")
    private BigDecimal prftIrDvd;

    /**
     * 市值
     */
    @TableField("MKT_VALUE")
    private BigDecimal mktValue;


}
