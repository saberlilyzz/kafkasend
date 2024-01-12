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
 * 定盘行情表
 * </p>
 *
 * @author gaocheng
 * @since 2023-08-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TDAILY_FIXING")
public class TdailyFixing extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 金融工具代码
     */
    @TableId("I_CODE")
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
     * 行情源
     */
    @TableField("SOURCE")
    private String source;

    /**
     * 生效日期
     */
    @TableField("BEG_DATE")
    private String begDate;

    /**
     * 失效日期
     */
    @TableField("END_DATE")
    private String endDate;

    /**
     * 定盘价
     */
    @TableField("DP_CLOSE")
    private Double dpClose;

    /**
     * 导入管道
     */
    @TableField("PIPE_ID")
    private Double pipeId;

    /**
     * 导入日期
     */
    @TableField("IMP_DATE")
    private String impDate;

    /**
     * 导入时间
     */
    @TableField("IMP_TIME")
    private String impTime;

    /**
     * 平均价
     */
    @TableField("DP_AVG")
    private Double dpAvg;

    /**
     * 最高价
     */
    @TableField("DP_HIGH")
    private Double dpHigh;

    /**
     * 最低价
     */
    @TableField("DP_LOW")
    private Double dpLow;

    /**
     * 中间价
     */
    @TableField("DP_MID")
    private Double dpMid;

    /**
     * 开盘价
     */
    @TableField("DP_OPEN")
    private Double dpOpen;

    /**
     * 结算价
     */
    @TableField("DP_SET")
    private Double dpSet;

    /**
     * 交易量
     */
    @TableField("DP_AMOUNT")
    private Double dpAmount;


}
