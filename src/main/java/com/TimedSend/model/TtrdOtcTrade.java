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
 * @since 2022-10-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_OTC_TRADE")
public class TtrdOtcTrade extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易序号
     */
    @TableId("SYSORDID")
    private Long sysordid;

    @TableField("ORD_ID")
    private String ordId;
    /**
     * 结算日期
     */
    @TableField("SETDATE")
    private String setdate;

    /**
     * 委托日期
     */
    @TableField("ORDDATE")
    private String orddate;

    /**
     * 委托时间
     */
    @TableField("ORDTIME")
    private String ordtime;

    /**
     * 确认日期
     */
    @TableField("CONDATE")
    private String condate;

    /**
     * 确认时间
     */
    @TableField("CONTIME")
    private String contime;

    /**
     * 指令号，也叫审批号
     */
    @TableField("INSID")
    private String insid;

    /**
     * 内部交易号
     */
    @TableField("INTORDID")
    private String intordid;

    /**
     * 外部交易号
     */
    @TableField("EXTORDID")
    private String extordid;

    /**
     * 客户交易号
     */
    @TableField("CUSTORDID")
    private String custordid;

    /**
     * 外部业务编号
     */
    @TableField("EXTBIZID")
    private String extbizid;

    /**
     * 操作人
     */
    @TableField("OPERATOR")
    private String operator;

    @TableField("TRDTYPE")
    private String trdtype;

    /**
     * 一级资金账户
     */
    @TableField("CASH_EXT_ACCID")
    private String cashExtAccid;

    /**
     * 二级资金账户
     */
    @TableField("CASH_ACCID")
    private String cashAccid;

    /**
     * 一级证券账户
     */
    @TableField("SECU_EXT_ACCID")
    private String secuExtAccid;

    /**
     * 二级证券账户
     */
    @TableField("SECU_ACCID")
    private String secuAccid;

    /**
     * 交易对手
     */
    @TableField("PARTYID")
    private Double partyid;

    /**
     * 二级资金账户
     */
    @TableField("CP_CASH_ACCID")
    private String cpCashAccid;

    /**
     * 二级证券账户
     */
    @TableField("CP_SECU_ACCID")
    private String cpSecuAccid;

    /**
     * 金融工具代码
     */
    @TableField("I_CODE")
    private String iCode;

    /**
     * SPT_BD:债券(国债、企业债、金融债、次级债券等,央行票据)
SPT_ABS:资产证券化产品(ABS、MBS、CDO)
SPT_CB:可转换债券
SPT_DB:债务
SPT_IBOR:同业拆借
SPT_IBDEPO:同业存款
SPT_C:现金
SPT_F1:封闭式基金
SPT_F2:开放式基金
SPT_F3:交易所交易基金
SPT_STG_1:期限套利
SPT_STG_2:跨期套利
SPT_PG:配股
SPT_IR:利率
SPT_CP:商业票据
SPT_DED:活期存款
SPT_NTD:通知存款(1天通知存款、7天通知存款)
SPT_TMD:定期存款(3个月、半年、1年、3年、5年)
SPT_NGD:协议存款(期限确定，利率协商确定的存款)
SPT_REPO:回购
SPT_XR:汇率
     */
    @TableField("A_TYPE")
    private String aType;

    /**
     * XSHG: 上交所
XSHE:深交所
X_CNFFEX;中金所
X_CNBD;银行间
     */
    @TableField("M_TYPE")
    private String mType;

    /**
     * 金融工具名称
     */
    @TableField("I_NAME")
    private String iName;

    /**
     * 交易数量
     */
    @TableField("ORDCOUNT")
    private Double ordcount;

    /**
     * 交易价格
     */
    @TableField("ORDPRICE")
    private Double ordprice;

    /**
     * 交易金额
     */
    @TableField("ORDAMOUNT")
    private Double ordamount;

    /**
     * 交易费用
     */
    @TableField("TRDFEE")
    private Double trdfee;

    /**
     * 结算费用
     */
    @TableField("SETFEE")
    private Double setfee;

    /**
     * 清算速度
     */
    @TableField("SETDAYS")
    private Double setdays;



    /**
     * 当时市场价
     */
    @TableField("THENMKTPRICE")
    private Double thenmktprice;

    /**
     * 当时标的市场价
     */
    @TableField("THENMKTPRICE_U")
    private Double thenmktpriceU;

    /**
     * 0：新建
1：OTCTrade审批中
2：本系统内发生的错误
3：交易所或集中交易系统返回失败
4：审核未通过
5：审核通过
7：成交确认
9：撤销
10：交易终止
     */
    @TableField("ORDSTATUS")
    private Double ordstatus;

    /**
     * 错误代码
     */
    @TableField("ERRCODE")
    private Double errcode;

    /**
     * 错误信息
     */
    @TableField("ERRINFO")
    private String errinfo;

    @TableField("BND_SETTYPE")
    private String bndSettype;

    @TableField("BND_NETPRICE")
    private Double bndNetprice;

    @TableField("BND_AIAMOUNT")
    private Double bndAiamount;

    @TableField("REMARK")
    private String remark;

    @TableField("RESERVETYPE")
    private String reservetype;

    @TableField("CP_RESERVETYPE")
    private String cpReservetype;

    @TableField("RESERVECHG")
    private String reservechg;

    @TableField("CP_RESERVECHG")
    private String cpReservechg;

    @TableField("RESERVEVALUE")
    private Double reservevalue;

    @TableField("CP_RESERVEVALUE")
    private Double cpReservevalue;

    @TableField("RESOLVE")
    private String resolve;

    @TableField("GRPID")
    private String grpid;

    @TableField("REF_ORDDATE")
    private String refOrddate;

    @TableField("REF_SYSORDID")
    private Long refSysordid;

    /**
     * 1=忽略，0=不忽略，主要是针对开放式回购的现券交易
     */
    @TableField("IGNORE_FLAG")
    private String ignoreFlag;

    @TableField("EXE_MARKET")
    private String exeMarket;

    @TableField("TRADER")
    private String trader;

    @TableField("TRADER_CP")
    private String traderCp;

    @TableField("DEALTYPE")
    private Double dealtype;

    @TableField("AGREENUMBER")
    private String agreenumber;

    /**
     * 净价跟中债估值净价的偏移度 【value = (中债估值净价-交易净价)/中债估值净价】
     */
    @TableField("EVAL_NETPRICE")
    private Double evalNetprice;

    @TableField("ORDSOURCE")
    private Double ordsource;

    @TableField("DEAL_COUNT")
    private Double dealCount;

    @TableField("DEAL_AVG_NETPRICE")
    private Double dealAvgNetprice;

    @TableField("DEAL_NETAMOUNT")
    private Double dealNetamount;

    @TableField("DEAL_AIAMOUNT")
    private Double dealAiamount;

    @TableField("DEAL_AMOUNT")
    private Double dealAmount;

    @TableField("BIDASKID")
    private Long bidaskid;

    @TableField("RELATEDPARTY")
    private String relatedparty;

    @TableField("TERMINATE_AMOUNT")
    private Double terminateAmount;

    @TableField("SETDATE_TERMINATE")
    private String setdateTerminate;

    @TableField("AGREEMENTTYPE")
    private Double agreementtype;

    @TableField("PARTYNAMETEMPORITY")
    private String partynametempority;

    @TableField("PARTY_ZZDACCNAME")
    private String partyZzdaccname;

    @TableField("SEATNO_CP")
    private String seatnoCp;

    @TableField("EXECUTOR")
    private String executor;

    @TableField("UNION_SYSORDID")
    private Long unionSysordid;

    @TableField("PARTY_ZZDACCCODE")
    private String partyZzdacccode;

    @TableField("PARTY_BANK_CODE")
    private String partyBankCode;

    @TableField("PARTY_BANK_ACC_CODE")
    private String partyBankAccCode;

    @TableField("PARTY_BANK_ACC_NAME")
    private String partyBankAccName;

    @TableField("PARTY_ACC_NAME")
    private String partyAccName;

    @TableField("DIS_FEE_KIND_FOLLOW")
    private String disFeeKindFollow;

    @TableField("DIS_FEE_KIND")
    private String disFeeKind;

    @TableField("GRPID_SUB")
    private String grpidSub;

    @TableField("IMP_TIME")
    private String impTime;


}
