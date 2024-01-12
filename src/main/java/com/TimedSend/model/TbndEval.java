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
 * 债券估值表
 * </p>
 *
 * @author gaocheng
 * @since 2023-08-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TBND_EVAL")
public class TbndEval extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易代码
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
     * 报价来源，0：其它估值；1：面值；2：中债估值；3：上清所；4：中证估值；5：交易所行情；6：彭博估值；7：外汇交易中心；8：中债特殊估值；9：Wind资讯；10：手工估值；11：中资美元债行情
     */
    @TableField("Q_SOURCE")
    private String qSource;

    /**
     * 剩余期限
     */
    @TableField("Q_MATURITY")
    private Double qMaturity;

    /**
     * 估值
     */
    @TableField("DP_P_CLOSE")
    private Double dpPClose;

    /**
     * 最高价
     */
    @TableField("DP_P_HIGH")
    private Double dpPHigh;

    /**
     * 最低价
     */
    @TableField("DP_P_LOW")
    private Double dpPLow;

    /**
     * 成交金额
     */
    @TableField("DP_AMOUNT")
    private Double dpAmount;

    /**
     * 成交数量
     */
    @TableField("DP_VOLUME")
    private Double dpVolume;

    /**
     * 估值净价
     */
    @TableField("DP_P_CLOSE_NET")
    private Double dpPCloseNet;

    /**
     * 最高价净价
     */
    @TableField("DP_P_HIGH_NET")
    private Double dpPHighNet;

    /**
     * 最低价净价
     */
    @TableField("DP_P_LOW_NET")
    private Double dpPLowNet;

    /**
     * 应计利息
     */
    @TableField("DP_AI")
    private Double dpAi;

    /**
     * 报价类型
     */
    @TableField("Q_TYPE")
    private String qType;

    /**
     * 推荐类型，0：推荐；1：非推荐
     */
    @TableField("Q_PROPOSED")
    private String qProposed;

    /**
     * 到期收益率
     */
    @TableField("DP_MYIELD")
    private Double dpMyield;

    /**
     * 修正久期
     */
    @TableField("DP_MDURATION")
    private Double dpMduration;

    /**
     * 凸性
     */
    @TableField("DP_MCONVEXITY")
    private Double dpMconvexity;

    /**
     * 基点价值
     */
    @TableField("DP_MDVBP")
    private Double dpMdvbp;

    /**
     * 利差久期
     */
    @TableField("DP_MDURATION_SPREAD")
    private Double dpMdurationSpread;

    /**
     * 利差凸性
     */
    @TableField("DP_MCONVEXITY_SPREAD")
    private Double dpMconvexitySpread;

    /**
     * 基准久期
     */
    @TableField("DP_MDURATION_BENCH")
    private Double dpMdurationBench;

    /**
     * 基准凸性
     */
    @TableField("DP_MCONVEXITY_BENCH")
    private Double dpMconvexityBench;

    /**
     * 日间估价全价
     */
    @TableField("DP_P_CLOSE_INTRADAY")
    private Double dpPCloseIntraday;

    /**
     * 日间应计利息
     */
    @TableField("DP_AI_INTRADAY")
    private Double dpAiIntraday;

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
     * 数据产生者
     */
    @TableField("CONTRIBUTOR")
    private String contributor;

    /**
     * 估值类型，0：行权估值；1：到期估值
     */
    @TableField("EVAL_TYPE")
    private String evalType;

    /**
     * 剩余本金
     */
    @TableField("PAR_VALUE")
    private Double parValue;

    /**
     * 麦克劳林久期
     */
    @TableField("DP_MMACDURATION")
    private Double dpMmacduration;


}
