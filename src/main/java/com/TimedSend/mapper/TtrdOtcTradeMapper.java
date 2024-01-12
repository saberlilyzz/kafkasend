package com.TimedSend.mapper;

import com.TimedSend.model.TtrdOtcTrade;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2022-10-21
 */
@Mapper
public interface TtrdOtcTradeMapper extends BaseMapper<TtrdOtcTrade> {
    @Update("DELETE FROM TRADE.TTRD_OTC_TRADE WHERE CONDATE='${baseDate}'")
    void deleteBatch(@Param("baseDate") String baseDate);

    @Update("INSERT INTO TRADE.TTRD_OTC_TRADE (SYSORDID, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, TRDTYPE, I_CODE," +
            "  A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT, ORDSTATUS,ORDDATE,BND_NETPRICE,BND_AIAMOUNT,SETDATE)" +
            "SELECT SYSORDID, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, TRDTYPE, I_CODE," +
            "   A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT ,ORDSTATUS,ORDDATE,BND_NETPRICE,BND_AIAMOUNT,SETDATE " +
            "FROM YHUSER.TC_TTRD_OTC_TRADE " +
            "WHERE TC_ID='${tcid}' AND  CONDATE='${baseDate}' " +
            "ORDER BY CONTIME ASC")
    void insertBatch(@Param("tcid") String taskId, @Param("baseDate") String baseDate);

    @Update("INSERT INTO TRADE.TTRD_OTC_TRADE (REF_SYSORDID,SYSORDID,INTORDID, OCFLAG, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, TRDTYPE, I_CODE," +
            "  A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT, ORDSTATUS,ORDDATE,BND_NETPRICE,BND_AIAMOUNT,SETDATE)" +
            "SELECT REF_SYSORDID, SYSORDID,INTORDID,OCFLAG, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, TRDTYPE, I_CODE," +
            "   A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT ,ORDSTATUS,ORDDATE,BND_NETPRICE,BND_AIAMOUNT,SETDATE " +
            "FROM YHUSER.TC_TTRD_OTC_TRADE " +
            "WHERE TC_ID='${tcid}' AND  CONDATE='${baseDate}' " +
            "ORDER BY SYSORDID ASC")
    void insertBatchTC(@Param("tcid") String taskId, @Param("baseDate") String baseDate);



    @Update("UPDATE TRADE.TTRD_OTC_TRADE " +
            "SET ORDSTATUS=${OrdStatue} " +
            "WHERE CONDATE='${baseDate}' AND ORDSTATUS = ${beforeStatute}")
    void updateOrdStatue(@Param("baseDate")String baseDate,@Param("beforeStatute") int beforeStatute, @Param("OrdStatue")int  OrdStatue );

    @Update("INSERT INTO TRADE.TTRD_OTC_TRADE (SYSORDID,INTORDID, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, TRDTYPE, I_CODE," +
            "  A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT, ORDSTATUS,ORDDATE,BND_NETPRICE,BND_AIAMOUNT,SETDATE)" +
            "SELECT SYSORDID,INTORDID, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, TRDTYPE, I_CODE," +
            "   A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT ,ORDSTATUS,ORDDATE,BND_NETPRICE,BND_AIAMOUNT,SETDATE " +
            "FROM YHUSER.TC_TTRD_OTC_TRADE " +
            "WHERE  CONDATE=TO_CHAR(SYSDATE,'yyyy-mm-dd') " +
            "ORDER BY CONTIME ASC")
    void insertBatchALL();


    @Update("DELETE FROM TRADE.TTRD_OTC_TRADE WHERE CONDATE=TO_CHAR(SYSDATE,'yyyy-mm-dd') ")
    void deleteBatchALL();


}
