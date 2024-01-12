package com.TimedSend.mapper;

import com.TimedSend.model.TcTradingresult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2023-04-14
 */
public interface TcTradingresultMapper extends BaseMapper<TcTradingresult> {
    @Select("SELECT SERIALNUM, ACCTID, CONTRACTNUM, CURRENCYID, EXCHID, REGID, " +
            "REGNAME, OFFERREGID, STKID, STKNAME, KNOCKQTY, POSTQTY, KNOCKPRICE, KNOCKAMT, KNOCKTIME, " +
            "KNOCKCODE, ORDERTYPE, EXCHERRORCODE, STKTYPE, TRADETYPE, DESKID, ORDEREXISTFLAG, ORDERQTY, " +
            "ORDERPRICE, ORDERTIME, OPTMODE, OPTID, OPTLEVEL, BRANCHID, CUSTTYPE, BROKERID, CUSTID," +
            " RECKONINGAMT, TRADINGRESULTTYPE, OCCURTIME, INTERNALBIZMARK, CREDITSTOCKFLAG, MEMO, " +
            "INTERNALORDERTYPE, POSTPROCESSFLAG, PRODUCTGRP, KNOCKNUM, STAMPTAX, COMMISION, " +
            "TRADETRANSFEE, RECKONINGFEE, TRANSRULEFEE, HANDLINGFEE, STKMNGFEE, EXCHTRANSFEE," +
            " VENTUREFEE, BATCHNUM, SUBCLIENTID, OPERATIONMAC, BASKETID, FULLKNOCKAMT, ACCUREDINTEREST, " +
            "TARGETDESKID, TARGETREGID, ORDERSOURCE, EXTERIORACCTID, KNOCKBATCHNUM, UPDATEFLAG, " +
            "CLIENTID, OCCURTIME2, RETURNTIME2, TRADECURRENCYID, EXCHRATE, INSTRUCTID, LIMITTYPE, " +
            "QTY2, PRICE2, REPURCHASEDAY, BUSINESSMARK, RETURNTIME1, MS_RECEIVE, MS_RETURN, " +
            "MULTINSTANCEID, STKID2, ETL_DATE " +
            "FROM YHUSER.TC_TRADINGRESULT "+
            "WHERE TC_ID = '${taskID}' AND substr(KNOCKTIME,1,8) ='${date}' " +
            "ORDER BY  KNOCKTIME ASC"
    )
    List<TcTradingresult> querytclist(@Param("taskID") String taskID, @Param("date") String date);
}
