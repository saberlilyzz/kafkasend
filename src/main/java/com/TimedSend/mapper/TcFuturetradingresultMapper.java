package com.TimedSend.mapper;

import com.TimedSend.model.TcFuturetradingresult;
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
 * @since 2023-03-09
 */
public interface TcFuturetradingresultMapper extends BaseMapper<TcFuturetradingresult> {
    @Select("SELECT SERIALNUM, ACCTID, CURRENCYID, EXCHID, STKID, STKNAME, BSFLAG, " +
            "F_OFFSETFLAG, KNOCKQTY, KNOCKPRICE, KNOCKAMT, KNOCKTIME, F_PRODUCTID, TC_ID, EXECTYPE " +
            "FROM YHUSER.TC_FUTURETRADINGRESULT " +
            "WHERE TC_ID = '${taskID}' AND substr(KNOCKTIME,1,8) ='${date}' " +
            "ORDER BY  KNOCKTIME ASC")
    List<TcFuturetradingresult> querytclist(@Param("taskID") String taskID, @Param("date") String date);
}
