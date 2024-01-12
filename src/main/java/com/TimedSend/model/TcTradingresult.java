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
 * @since 2023-04-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TC_TRADINGRESULT")
public class TcTradingresult extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("SERIALNUM")
    private Integer serialnum;

    @TableField("ACCTID")
    private String acctid;

    @TableField("CONTRACTNUM")
    private String contractnum;

    @TableField("CURRENCYID")
    private String currencyid;

    @TableField("EXCHID")
    private String exchid;

    @TableField("REGID")
    private String regid;

    @TableField("REGNAME")
    private String regname;

    @TableField("OFFERREGID")
    private String offerregid;

    @TableField("STKID")
    private String stkid;

    @TableField("STKNAME")
    private String stkname;

    @TableField("KNOCKQTY")
    private Long knockqty;

    @TableField("POSTQTY")
    private Long postqty;

    @TableField("KNOCKPRICE")
    private Double knockprice;

    @TableField("KNOCKAMT")
    private Double knockamt;

    @TableField("KNOCKTIME")
    private Long knocktime;

    @TableField("KNOCKCODE")
    private String knockcode;

    @TableField("ORDERTYPE")
    private String ordertype;

    @TableField("EXCHERRORCODE")
    private String excherrorcode;

    @TableField("STKTYPE")
    private String stktype;

    @TableField("TRADETYPE")
    private String tradetype;

    @TableField("DESKID")
    private String deskid;

    @TableField("ORDEREXISTFLAG")
    private Integer orderexistflag;

    @TableField("ORDERQTY")
    private Long orderqty;

    @TableField("ORDERPRICE")
    private Double orderprice;

    @TableField("ORDERTIME")
    private Long ordertime;

    @TableField("OPTMODE")
    private String optmode;

    @TableField("OPTID")
    private String optid;

    @TableField("OPTLEVEL")
    private String optlevel;

    @TableField("BRANCHID")
    private String branchid;

    @TableField("CUSTTYPE")
    private String custtype;

    @TableField("BROKERID")
    private String brokerid;

    @TableField("CUSTID")
    private String custid;

    @TableField("RECKONINGAMT")
    private Double reckoningamt;

    @TableField("TRADINGRESULTTYPE")
    private String tradingresulttype;

    @TableField("OCCURTIME")
    private Long occurtime;

    @TableField("INTERNALBIZMARK")
    private String internalbizmark;

    @TableField("CREDITSTOCKFLAG")
    private String creditstockflag;

    @TableField("MEMO")
    private String memo;

    @TableField("INTERNALORDERTYPE")
    private String internalordertype;

    @TableField("POSTPROCESSFLAG")
    private Integer postprocessflag;

    @TableField("PRODUCTGRP")
    private String productgrp;

    @TableField("KNOCKNUM")
    private String knocknum;

    @TableField("STAMPTAX")
    private Double stamptax;

    @TableField("COMMISION")
    private Double commision;

    @TableField("TRADETRANSFEE")
    private Double tradetransfee;

    @TableField("RECKONINGFEE")
    private Double reckoningfee;

    @TableField("TRANSRULEFEE")
    private Double transrulefee;

    @TableField("HANDLINGFEE")
    private Double handlingfee;

    @TableField("STKMNGFEE")
    private Double stkmngfee;

    @TableField("EXCHTRANSFEE")
    private Double exchtransfee;

    @TableField("VENTUREFEE")
    private Double venturefee;

    @TableField("BATCHNUM")
    private Integer batchnum;

    @TableField("SUBCLIENTID")
    private String subclientid;

    @TableField("OPERATIONMAC")
    private String operationmac;

    @TableField("BASKETID")
    private String basketid;

    @TableField("FULLKNOCKAMT")
    private Double fullknockamt;

    @TableField("ACCUREDINTEREST")
    private Double accuredinterest;

    @TableField("TARGETDESKID")
    private String targetdeskid;

    @TableField("TARGETREGID")
    private String targetregid;

    @TableField("ORDERSOURCE")
    private Integer ordersource;

    @TableField("EXTERIORACCTID")
    private String exterioracctid;

    @TableField("KNOCKBATCHNUM")
    private Integer knockbatchnum;

    @TableField("UPDATEFLAG")
    private Integer updateflag;

    @TableField("CLIENTID")
    private String clientid;

    @TableField("OCCURTIME2")
    private String occurtime2;

    @TableField("RETURNTIME2")
    private String returntime2;

    @TableField("TRADECURRENCYID")
    private String tradecurrencyid;

    @TableField("EXCHRATE")
    private Double exchrate;

    @TableField("INSTRUCTID")
    private String instructid;

    @TableField("LIMITTYPE")
    private String limittype;

    @TableField("QTY2")
    private Long qty2;

    @TableField("PRICE2")
    private Double price2;

    @TableField("REPURCHASEDAY")
    private Integer repurchaseday;

    @TableField("BUSINESSMARK")
    private String businessmark;

    @TableField("RETURNTIME1")
    private String returntime1;

    @TableField("MS_RECEIVE")
    private Long msReceive;

    @TableField("MS_RETURN")
    private Long msReturn;

    @TableField("MULTINSTANCEID")
    private Integer multinstanceid;

    @TableField("STKID2")
    private String stkid2;

    @TableField("ETL_DATE")
    private Double etlDate;

    @TableField("TC_ID")
    private Double tcId;


}
