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
 * @author zheng.zhang
 * @since 2024-01-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_STD_TRADE")
public class TtrdStdTrade extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("SERIALNO")
    private Double serialno;

    @TableField("TSK_ID")
    private String tskId;

    @TableField("EXTORDID")
    private String extordid;

    @TableField("DEAID")
    private String deaid;

    @TableField("SETDATE")
    private String setdate;

    @TableField("BIZTYPE")
    private String biztype;

    @TableField("BIZNAME")
    private String bizname;

    @TableField("CASH_EXT_ACCID")
    private String cashExtAccid;

    @TableField("CASH_ACCID")
    private String cashAccid;

    @TableField("SECU_EXT_ACCID")
    private String secuExtAccid;

    @TableField("SECU_ACCID")
    private String secuAccid;

    @TableField("CURRENCY")
    private String currency;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("I_NAME")
    private String iName;

    @TableField("DEACOUNT")
    private Double deacount;

    @TableField("DEAPRICE")
    private Double deaprice;

    @TableField("DEAAMOUNT")
    private Double deaamount;

    @TableField("FULLDEALAMOUNT")
    private Double fulldealamount;

    @TableField("TOTALFEE")
    private Double totalfee;

    @TableField("OCCUR_SECU")
    private Double occurSecu;

    @TableField("OCCUR_CASH")
    private Double occurCash;

    @TableField("SETTLE_PRICE")
    private Double settlePrice;

    @TableField("PRE_SETTLE_PRICE")
    private Double preSettlePrice;

    @TableField("CLOSE_PL")
    private Double closePl;

    @TableField("BOOK_PL")
    private Double bookPl;

    @TableField("ACCTG_ORDER")
    private Double acctgOrder;

    @TableField("UPDATETIME")
    private String updatetime;

    @TableField("ACCTG_STATE")
    private Double acctgState;


}
