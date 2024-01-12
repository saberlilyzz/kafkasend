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
 * @since 2023-12-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_CMDS_EXECUTIONREPORT")
public class TtrdCmdsExecutionreport extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("EPID")
    private Long epid;

    /**
     * 委托日期
     */
    @TableField("TRDDATE")
    private String trddate;

    /**
     * 委托时间
     */
    @TableField("TRDTIME")
    private String trdtime;

    /**
     * 交易序号
     */
    @TableField("EXECID")
    private String execid;

    /**
     * 成交类别
     */
    @TableField("TRDTYPE")
    private String trdtype;

    /**
     * 交易市场:1 -Inter Bank Offering; 2 -Interest Rate SWAP; 3 -Forward Rate Agreement ;4 -Cash Bond ;5 -Bond Forward ;6 -Asset Backed Security; 7 -ETFs ; 8 -Security Lending; 9 -Collateral Repo ;10 -Outright Repo;11-FXSWP;12-FXSPT;13-FXNDF;14-FXFOW ;
15-FXIRS;16 - Benchmark;17-FXCRS

     */
    @TableField("MARKETINDICATOR")
    private Double marketindicator;

    /**
     * 交易方向:1-买入 / 拆入 / 融入 / 逆回购/固定支付/参考利率1支付
4-卖出 / 拆出 / 融出 / 正回购/固定收取/参考利率1收取
B-多端交易产品如双边报价使用此值，每端（Leg）分别定义交易方向，具体参考LegSide定义。
H-买-卖
I-卖-买
     */
    @TableField("DIRCTION")
    private String dirction;

    /**
     * 债券代码
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
     * 金融工具名称
     */
    @TableField("I_NAME")
    private String iName;

    /**
     * 浮动利率曲线名称
     */
    @TableField("U_I_CODE")
    private String uICode;

    /**
     * 资产类型
     */
    @TableField("U_A_TYPE")
    private String uAType;

    /**
     * 市场类型
     */
    @TableField("U_M_TYPE")
    private String uMType;

    /**
     * 金融工具名称
     */
    @TableField("U_I_NAME")
    private String uIName;

    /**
     * 交易价格
     */
    @TableField("PRICE")
    private Double price;

    /**
     * 到期收益率
     */
    @TableField("YTM")
    private Double ytm;

    /**
     * 交易数量
     */
    @TableField("TRDFV")
    private Double trdfv;

    /**
     * 交易金额
     */
    @TableField("TRDCASHAMT")
    private Double trdcashamt;

    /**
     * 首次净价
     */
    @TableField("U_CLEAR_PRICE")
    private Double uClearPrice;

    /**
     * 到期净价
     */
    @TableField("U_CLEAR_PRICE2")
    private Double uClearPrice2;

    /**
     * 首次收益率
     */
    @TableField("U_YTM")
    private Double uYtm;

    /**
     * 到期收益率
     */
    @TableField("U_YTM2")
    private Double uYtm2;

    /**
     * 回购期限
     */
    @TableField("TRADELIMITDAYS")
    private Double tradelimitdays;

    /**
     * 首期结算金额
     */
    @TableField("SETTLCURRAMT")
    private Double settlcurramt;

    /**
     * 到期结算金额
     */
    @TableField("SETTLCURRAMT2")
    private Double settlcurramt2;

    /**
     * 成交状态:F- 成交
H - 撤销
5 - 更新
F-成交;H-撤销;5-更新;101-应急

     */
    @TableField("EXECTYPE")
    private String exectype;

    /**
     * 远期期限
     */
    @TableField("FRA_TRADEFWDDAYS")
    private Double fraTradefwddays;

    /**
     * 1-非做市; 2-做市; 4-买方做市; 5-卖方做市
     */
    @TableField("BND_TRDTYPE")
    private Double bndTrdtype;

    /**
     * 基准端-浮动利率曲线名称
     */
    @TableField("IRS_BENCHMARK2")
    private String irsBenchmark2;

    /**
     * 基准端-浮动利率利差
     */
    @TableField("IRS_BENCHMARKSPREAD2")
    private Double irsBenchmarkspread2;

    /**
     * 非基准端（浮动端）-浮动利率曲线名称
     */
    @TableField("IRS_BENCHMARK1")
    private String irsBenchmark1;

    /**
     * 非基准端（浮动端）-浮动利率利差
     */
    @TableField("IRS_BENCHMARKSPREAD1")
    private Double irsBenchmarkspread1;

    /**
     * 固定端-固定利率
     */
    @TableField("IRS_RATE")
    private Double irsRate;

    /**
     * 每百元本金额
     */
    @TableField("PRINCIPAL")
    private Double principal;

    /**
     * 更新时间
     */
    @TableField("UPDATETIME")
    private String updatetime;

    @TableField("TEXT")
    private String text;

    /**
     * 支付方向2
     */
    @TableField("LEGSIDE")
    private String legside;

    /**
     * 上市前债券
     */
    @TableField("PRE_MARKETBOND_INDICATOR")
    private String preMarketbondIndicator;

    /**
     * 交易方式
     */
    @TableField("TRADE_METHOD")
    private Long tradeMethod;

    /**
     * 成交方向
     */
    @TableField("TRANSACTION_METHOD")
    private String transactionMethod;

    /**
     * 支付方向1
     */
    @TableField("LEGSIDE0")
    private String legside0;

    /**
     * 业务发生时间
     */
    @TableField("TRANSACTTIME")
    private String transacttime;

    /**
     * 交易中心原始成交时间
     */
    @TableField("TRDTIMEORIG")
    private String trdtimeorig;


}
