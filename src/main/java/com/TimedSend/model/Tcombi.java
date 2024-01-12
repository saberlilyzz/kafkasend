package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2022-10-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TCOMBI")
public class Tcombi extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 投资组合序号
     */
    //BigDecimal
    @TableId("L_COMBI_ID")
    private BigDecimal lCombiId;

    /**
     * 基金序号
     */
    @TableField("L_FUND_ID")
    private BigDecimal lFundId;

    /**
     * 投资组合编号
     */
    @TableField("VC_COMBI_NO")
    private String vcCombiNo;

    /**
     * 投资组合名称
     */
    @TableField("VC_COMBI_NAME")
    private String vcCombiName;

    /**
     * *组合类型
     */
    @TableField("C_COMBI_CLASS")
    private String cCombiClass;

    /**
     * 资产单元序号
     */
    @TableField("L_ASSET_ID")
    private BigDecimal lAssetId;

    /**
     * 创建日期
     */
    @TableField("L_SETUP_DATE")
    private BigDecimal lSetupDate;

    /**
     * 结束日期
     */
    @TableField("L_END_DATE")
    private BigDecimal lEndDate;

    /**
     * 组合状态
     */
    @TableField("C_COMBI_STATUS")
    private String cCombiStatus;

    /**
     * 金额备用＃
     */
    @TableField("EN_REMARK")
    private BigDecimal enRemark;

    /**
     * 字符备注
     */
    @TableField("VC_REMARK")
    private String vcRemark;

    /**
     * 投资类型
     */
    @TableField("C_INVEST_TYPE")
    private String cInvestType;

    /**
     * 证券类别权限
     */
    @TableField("VC_STOCKTYPE_RIGHT")
    private String vcStocktypeRight;

    /**
     * 委托方向权限
     */
    @TableField("VC_ENTRDIRE_RIGHT")
    private String vcEntrdireRight;

    /**
     * 组合模板序号
     */
    @TableField("L_PARAM_ID")
    private BigDecimal lParamId;

    /**
     * 参与指令分配
     */
    @TableField("C_JOIN_DISTRIBUTE")
    private String cJoinDistribute;

    /**
     * 基金净值比例
     */
    @TableField("EN_FUND_VALUE_RATIO")
    private BigDecimal enFundValueRatio;

    /**
     * 目标金额
     */
    @TableField("EN_TARGET_BALANCE")
    private BigDecimal enTargetBalance;

    /**
     * 组合分类标识
     */
    @TableField("VC_COMBI_IDENTIFIER")
    private String vcCombiIdentifier;

    /**
     * 允许投资的交易市场
     */
    @TableField("VC_PERMIT_MARKET")
    private String vcPermitMarket;

    /**
     * 允许投资的业务分类
     */
    @TableField("VC_PERMIT_BUSIN_CLASS")
    private String vcPermitBusinClass;

    /**
     * 对应指数
     */
    @TableField("L_EXPONENT_ID")
    private BigDecimal lExponentId;

    /**
     * 股指期货投资类型
     */
    @TableField("C_FUTURES_INVEST_TYPE")
    private String cFuturesInvestType;

    /**
     * 标的组合
     */
    @TableField("L_BID_COMBI_ID")
    private BigDecimal lBidCombiId;

    /**
     * 转融通担保品组合
     */
    @TableField("L_BAIL_COMBI_ID")
    private BigDecimal lBailCombiId;

    /**
     * Column_26
     */
    @TableField("C_APPEND_ENTRUST")
    private String cAppendEntrust;

    /**
     * Column_27
     */
    @TableField("C_APPEND_ENTRUST_QH")
    private String cAppendEntrustQh;

    /**
     * Column_28
     */
    @TableField("C_FAIR_TRADE")
    private String cFairTrade;

    /**
     * Column_29
     */
    @TableField("C_INVEST_TYPE_PA")
    private String cInvestTypePa;

    /**
     * Column_30
     */
    @TableField("VC_APPLY_BUSIN_CLASS")
    private String vcApplyBusinClass;

    /**
     * Column_31
     */
    @TableField("VC_WS_TRADELEVEL")
    private String vcWsTradelevel;

    /**
     * Column_32
     */
    @TableField("VC_WX_TRADELEVEL")
    private String vcWxTradelevel;


}
