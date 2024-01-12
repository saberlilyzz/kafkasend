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
 * 实时估值结果表
 * </p>
 *
 * @author gaocheng
 * @since 2023-09-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TBSI_INST_REALTIME")
public class TbsiInstRealtime extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易代码
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
     * 分组代码
     */
    @TableField("TG_CODE")
    private String tgCode;

    /**
     * 定价环境代码
     */
    @TableId("PE_CODE")
    private String peCode;

    /**
     * 日期
     */
    @TableField("EFFECT_DATE")
    private String effectDate;

    /**
     * 有效时间
     */
    @TableField("EFFECT_TIME")
    private String effectTime;

    /**
     * 理论价格
     */
    @TableField("TPRICE")
    private Double tprice;

    /**
     * 应计利息T+0
     */
    @TableField("ACCRUAL_0")
    private Double accrual0;

    /**
     * 应计利息T+1
     */
    @TableField("ACCRUAL_1")
    private Double accrual1;

    /**
     * 导入时间
     */
    @TableField("IMP_TIME")
    private String impTime;

    /**
     * 计算时使用的到期日，如果是含权债，有可能为行权点
     */
    @TableField("MTR_DATE")
    private String mtrDate;

    /**
     * 时间模型，0：日起；1：日间；2：切片
     */
    @TableField("TIME_MODE_TYPE")
    private String timeModeType;


}
