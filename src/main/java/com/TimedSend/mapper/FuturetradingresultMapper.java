package com.TimedSend.mapper;

import com.TimedSend.model.Futuretradingresult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2023-04-17
 */
public interface FuturetradingresultMapper extends BaseMapper<Futuretradingresult> {

    @Update(value = "<script>" +
            " DELETE " +
            " FROM TRADE.FUTURETRADINGRESULT " +
            " WHERE SERIALNUM IN  (SELECT B.SERIALNUM FROM YHUSER.TC_FUTURETRADINGRESULT B " +
            "WHERE  substr(B.KNOCKTIME,1,8) ='${date}') "+
            "</script>")
    void DeleteBatchbyDate(@Param("date") String date);

    @Update(value = "<script>"+
            "INSERT INTO  TRADE.FUTURETRADINGRESULT (SERIALNUM, ACCTID, CURRENCYID, EXCHID, STKID," +
            " STKNAME, BSFLAG, F_OFFSETFLAG, KNOCKQTY, KNOCKPRICE, KNOCKAMT, KNOCKTIME," +
            " F_PRODUCTID,EXECTYPE, TC_ID) " +
            "SELECT SERIALNUM, ACCTID, CURRENCYID, EXCHID, STKID, STKNAME, " +
            "BSFLAG, F_OFFSETFLAG, KNOCKQTY, KNOCKPRICE, KNOCKAMT, KNOCKTIME, " +
            "F_PRODUCTID,EXECTYPE, TC_ID " +
            "FROM YHUSER.TC_FUTURETRADINGRESULT "+
            "WHERE TC_ID = '${taskID}' AND substr(KNOCKTIME,1,8) ='${date}' " +
            " ORDER BY KNOCKTIME ASC"+
            "</script>"
    )
    void insertBatch(@Param("taskID") String taskID, @Param("date") String date);

}
