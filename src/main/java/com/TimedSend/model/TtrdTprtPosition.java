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
 * @since 2022-11-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TPRT_POSITION")
public class TtrdTprtPosition extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 账户
     */
    @TableId("SECU_ACCT_ID")
    private String secuAcctId;

    /**
     * 多空维度
     */
    @TableField("EXTRA_DIM")
    private String extraDim;

    /**
     * 币种
     */
    @TableField("CURRENCY")
    private String currency;

    /**
     * 资产代码
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
     * 持仓数量
     */
    @TableField("REAL_VOLUME")
    private Double realVolume;

    @TableField("UPDATE_TIME")
    private String updateTime;
}
