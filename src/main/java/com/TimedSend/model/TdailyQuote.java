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
 * 报价表
 * </p>
 *
 * @author gaocheng
 * @since 2023-08-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TDAILY_QUOTE")
public class TdailyQuote extends Model {

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
     * 报买价提供者
     */
    @TableField("DP_BID_CONTRIBUTOR")
    private String dpBidContributor;

    /**
     * 报买价
     */
    @TableField("DP_BID")
    private Double dpBid;

    /**
     * 报卖价提供者
     */
    @TableField("DP_ASK_CONTRIBUTOR")
    private String dpAskContributor;

    /**
     * 报卖价
     */
    @TableField("DP_ASK")
    private Double dpAsk;

    /**
     * 中间价
     */
    @TableField("DP_MID")
    private Double dpMid;

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
     * 来源时间
     */
    @TableField("SOURCE_TIME")
    private String sourceTime;

    /**
     * 行权报价，仅对期权类有效
     */
    @TableField("DP_STRIKE")
    private Double dpStrike;


}
