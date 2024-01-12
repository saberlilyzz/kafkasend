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
@TableName("TRSK_PP_AI_LEVEL")
public class TrskPpAiLevel extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("D_BASE")
    private String dBase;

    @TableField("UPDATE_TIME")
    private String updateTime;

    @TableField("BEG_DATE")
    private String begDate;

    /**
     * 理论价格
     */
    @TableField("MK_TPRICE")
    private BigDecimal mkTprice;

    /**
     * 应计利息T+0
     */
    @TableField("MK_ACCRUAL_0")
    private BigDecimal mkAccrual0;

    /**
     * 应计利息T+1
     */
    @TableField("MK_ACCRUAL_1")
    private BigDecimal mkAccrual1;

    @TableField("EFFECT_TIME")
    private String effectTime;

    @TableField("EFFECT_MSEC")
    private String effectMsec;


}
