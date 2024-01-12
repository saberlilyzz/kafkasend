package com.TimedSend.mapper;

import com.TimedSend.model.TtrdOtcTradePublic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TtrdOtcTradePublicMapper extends BaseMapper<TtrdOtcTradePublic>
{
    @Select("SELECT  SYSORDID, ORDDATE, SETDATE, CONDATE, CONTIME, SECU_ACCID,SECU_EXT_ACCID, CURRENCY, " +
            "TRDTYPE, I_CODE,I_NAME, A_TYPE, M_TYPE, I_NAME, ORDCOUNT, ORDPRICE, ORDAMOUNT," +
            " BND_NETPRICE , BND_AIAMOUNT  " +
            " FROM TRADE.TTRD_OTC_TRADE  " +
            "WHERE ORDDATE='${date}'   ORDER BY ORDTIME")
    List<TtrdOtcTradePublic> query4sendXirBond(@Param("date") String  date);

    @Select("SELECT  SYSORDID, ORDDATE, SETDATE, CONDATE, CONTIME, SECU_ACCID, SECU_EXT_ACCID, CURRENCY, " +
            "TRDTYPE, I_CODE,I_NAME, A_TYPE, M_TYPE, I_NAME, ORDSTATUS, ORDCOUNT, ORDPRICE, ORDAMOUNT," +
            " BND_NETPRICE , BND_AIAMOUNT  " +
            " FROM YHUSER.TC_TTRD_OTC_TRADE  " +
            "WHERE ORDDATE='${date}'   ORDER BY ORDTIME")
    List<TtrdOtcTradePublic> query4sendXirTc(@Param("date") String  date);


    @Update(value = "<script>" +
            " insert into TTRD_TPRT_PROFIT (SECU_ACCT_ID, EXTRA_DIM, CURRENCY," +
            " I_CODE, A_TYPE, M_TYPE, REAL_VOLUME, REAL_CP, CUR_BUY_VOLUME," +
            " CUR_BUY_CP, CUR_SELL_VOLUME, CUR_SELL_CP, MTM, YTD_MTM, EXPOSURE, YTD_EXPOSURE, BUY_PRFT_FV, SELL_PRFT_FV," +
            " YTD_PRFT_FV, CUR_PRICE, YTD_PRICE, UPDATE_TIME,SET_DATE,AI,TODAY_AI,CUR_PRFT_TRD," +
            " CUR_PRFT_IR_TRD, CUR_PRFT_IR_AI, F_PRFT_GROSS)" +
            "        <foreach collection='tbList' item='item' index='index' separator='union all'>" +
            "  (select" +
            "#{item.secuAcctId,jdbcType=VARCHAR},"+
            "#{item.extraDim,jdbcType=VARCHAR},"+
            "#{item.currency,jdbcType=VARCHAR},"+
            "#{item.iCode,jdbcType=VARCHAR},"+
            "#{item.aType,jdbcType=VARCHAR},"+
            "#{item.mType,jdbcType=VARCHAR},"+
            "#{item.realVolume,jdbcType=NUMERIC},"+
            "#{item.realCp,jdbcType=NUMERIC},"+
            "#{item.curBuyVolume,jdbcType=NUMERIC}, "+
            "#{item.curBuyCp,jdbcType=NUMERIC}, "+

            "#{item.curSellVolume,jdbcType=NUMERIC}, "+
            "#{item.curSellCp,jdbcType=NUMERIC}, "+

            "#{item.mtm,jdbcType=NUMERIC}, "+
            "#{item.ytdMtm,jdbcType=NUMERIC}, "+
            "#{item.exposure,jdbcType=NUMERIC}, "+
            "#{item.ytdExposure,jdbcType=NUMERIC}, "+
            "#{item.buyPrftFv,jdbcType=NUMERIC}, "+
            "#{item.sellPrftFv,jdbcType=NUMERIC}, "+
            "#{item.ytdPrftFv,jdbcType=NUMERIC}, "+
            "#{item.curPrice,jdbcType=NUMERIC},"+
            "#{item.ytdPrice,jdbcType=NUMERIC},"+
            "#{item.updateTime,jdbcType=VARCHAR},"+
            "#{item.setDate,jdbcType=VARCHAR},"+
            "#{item.ai,jdbcType=NUMERIC}, "+
            "#{item.todayAi,jdbcType=NUMERIC}, "+
            "#{item.curPrftTrd,jdbcType=NUMERIC}, "+
            "#{item.curPrftIrTrd,jdbcType=NUMERIC}, "+
            "#{item.curPrftIrAi,jdbcType=NUMERIC}, "+
            "#{item.fPrftGross,jdbcType=NUMERIC} "+
            "            from dual" +
            "            )" +
            "        </foreach>" +
            "</script>")
    void SaveBatch(@Param("tbList") List<TtrdOtcTradePublic> tbList);
}
