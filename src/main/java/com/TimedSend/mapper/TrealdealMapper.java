package com.TimedSend.mapper;

import com.TimedSend.model.Trealdeal;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2022-10-21
 */
@Mapper
public interface TrealdealMapper extends BaseMapper<Trealdeal> {

    @Update(value = "<script>" +
            " INSERT INTO TRADE.TREALDEAL(L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, " +
            "L_DAILY_INSTRUCTION_NO, L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, " +
            "VC_STOCKHOLDER_ID, VC_REPORT_SEAT, VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE," +
            " C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, L_DEAL_AMOUNT, EN_DEAL_PRICE, " +
            "VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, EN_FEE_ZG, EN_FEE_QT, " +
            "EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE, C_VALID, " +
            "C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS, L_REALDEAL_CANCEL_NO, " +
            "C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE, EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL) " +
            "    <foreach collection='tbList' item='item' index='index' separator='union all'>" +
            "    (select " +
            //"#{seq_a.nextval,jdbcType=NUMERIC},"+
            "#{item.lRealdealSerialNo,jdbcType=NUMERIC},"+
            "#{item.lDate,jdbcType=NUMERIC},"+
            "#{item.lEntrustSerialNo,jdbcType=NUMERIC},"+
            "#{item.lDailyInstructionNo,jdbcType=NUMERIC},"+
            "#{item.lIndexDailyModify,jdbcType=NUMERIC},"+
            "#{item.lFundId,jdbcType=NUMERIC},"+
            "#{item.lBasecombiId,jdbcType=NUMERIC},"+

            "#{item.cMarketNo,jdbcType=VARCHAR},"+
            "#{item.vcStockholderId,jdbcType=VARCHAR},"+
            "#{item.vcReportSeat,jdbcType=VARCHAR},"+
            "#{item.vcInterCode,jdbcType=VARCHAR},"+
            "#{item.vcReportCode,jdbcType=VARCHAR},"+
            "#{item.cStockType,jdbcType=VARCHAR},"+
            "#{item.cEntrustDirection,jdbcType=VARCHAR},"+

            "#{item.lReportSerialNo,jdbcType=NUMERIC},"+
            "#{item.lBusinessTime,jdbcType=NUMERIC},"+
            "#{item.lDealAmount,jdbcType=NUMERIC},"+
            "#{item.enDealPrice,jdbcType=NUMERIC},"+
            "#{item.vcDealNo,jdbcType=VARCHAR},"+
            "#{item.enFeeJy,jdbcType=NUMERIC},"+
            "#{item.enFeeYh,jdbcType=NUMERIC},"+

            "#{item.enFeeGh,jdbcType=NUMERIC},"+
            "#{item.enFeeYj,jdbcType=NUMERIC},"+
            "#{item.enFeeJs,jdbcType=NUMERIC},"+
            "#{item.enFeeZg,jdbcType=NUMERIC},"+
            "#{item.enFeeQt,jdbcType=NUMERIC},"+
            "#{item.enFeeJs2,jdbcType=NUMERIC},"+
            "#{item.enFeeJg,jdbcType=NUMERIC},"+

            "#{item.lSettleDate,jdbcType=NUMERIC},"+
            "#{item.cCloseType,jdbcType=VARCHAR},"+
            "#{item.dDatetime,jdbcType=DATE},"+
            "#{item.lMarketDate,jdbcType=NUMERIC},"+
            "#{item.cValid,jdbcType=VARCHAR},"+
            "#{item.cCancelTime,jdbcType=NUMERIC},"+
            "#{item.cSource,jdbcType=VARCHAR},"+

            "#{item.lOperatorNo,jdbcType=NUMERIC},"+
            "#{item.cMatchFlag,jdbcType=VARCHAR},"+
            "#{item.vcBrokerNo,jdbcType=NUMERIC},"+
            "#{item.cBusinClass,jdbcType=VARCHAR},"+
            "#{item.lRealdealCancelNo,jdbcType=VARCHAR},"+
            "#{item.cExternalDealFlag,jdbcType=VARCHAR},"+

            "#{item.cFixsendFlag,jdbcType=VARCHAR},"+
            "#{item.cTradeOption,jdbcType=VARCHAR},"+
            "#{item.enFeeJyTrue,jdbcType=NUMERIC},"+
            "#{item.enFeeYjTrue,jdbcType=NUMERIC},"+
            "#{item.enFeeGhTotal,jdbcType=NUMERIC}"+
            "            from dual" +
            "            )" +
            "        </foreach>" +
            "</script>")
    void SaveBatch(@Param("tbList") List<Trealdeal> tbList);


    @Update(value = "<script>" +
            " DELETE " +
            " FROM TRADE.TREALDEAL " +
            " WHERE L_DATE ='${begDate}'"+
            "</script>")
    void DeleteBatchbyDate(@Param("begDate") String begDate);


    @Update(value = "<script>"+
            "INSERT INTO  TRADE.TREALDEAL (L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, L_DAILY_INSTRUCTION_NO,\n" +
            "            L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, VC_STOCKHOLDER_ID, VC_REPORT_SEAT, \n" +
            "            VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE, C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, \n" +
            "            L_DEAL_AMOUNT, EN_DEAL_PRICE, VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, \n" +
            "            EN_FEE_ZG, EN_FEE_QT, EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE,\n" +
            "            C_VALID, C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS,\n" +
            "            L_REALDEAL_CANCEL_NO, C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE,\n" +
            "            EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL,TC_ID) " +
            "SELECT L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, L_DAILY_INSTRUCTION_NO,\n" +
            "            L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, VC_STOCKHOLDER_ID, VC_REPORT_SEAT, \n" +
            "            VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE, C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, \n" +
            "            L_DEAL_AMOUNT, EN_DEAL_PRICE, VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, \n" +
            "            EN_FEE_ZG, EN_FEE_QT, EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE,\n" +
            "            C_VALID, C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS,\n" +
            "            L_REALDEAL_CANCEL_NO, C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE,\n" +
            "            EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL, TC_ID " +
            "FROM YHUSER.TC_TREALDEAL "+
            "WHERE TC_ID='${taskID}' AND L_DATE ='${date}' " +
            "ORDER BY L_BUSINESS_TIME ASC "+
            "</script>"
    )
    void insertBatch(@Param("taskID") String taskID, @Param("date") String date);


    @Update(value = "<script>"+
            "INSERT INTO  TRADE.TREALDEAL (L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, L_DAILY_INSTRUCTION_NO,\n" +
            "            L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, VC_STOCKHOLDER_ID, VC_REPORT_SEAT, \n" +
            "            VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE, C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, \n" +
            "            L_DEAL_AMOUNT, EN_DEAL_PRICE, VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, \n" +
            "            EN_FEE_ZG, EN_FEE_QT, EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE,\n" +
            "            C_VALID, C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS,\n" +
            "            L_REALDEAL_CANCEL_NO, C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE,\n" +
            "            EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL,TC_ID) " +

            "</script>"
    )
    void insertSingle(@Param("trealdeal")Trealdeal trealdeal);



    @Update(value = "<script>" +
            " DELETE " +
            " FROM TRADE.TREALDEAL_NEQ   " +
            " WHERE L_DATE ='${begDate}'"+
            "</script>")
    void DeleteBatchNEQbyDate(@Param("begDate") String begDate);


    @Update(value = "<script>"+
            "INSERT INTO  TRADE.TREALDEAL_NEQ (L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, L_DAILY_INSTRUCTION_NO,\n" +
            "            L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, VC_STOCKHOLDER_ID, VC_REPORT_SEAT, \n" +
            "            VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE, C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, \n" +
            "            L_DEAL_AMOUNT, EN_DEAL_PRICE, VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, \n" +
            "            EN_FEE_ZG, EN_FEE_QT, EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE,\n" +
            "            C_VALID, C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS,\n" +
            "            L_REALDEAL_CANCEL_NO, C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE,\n" +
            "            EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL,TC_ID) " +
            "SELECT L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, L_DAILY_INSTRUCTION_NO,\n" +
            "            L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, VC_STOCKHOLDER_ID, VC_REPORT_SEAT, \n" +
            "            VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE, C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, \n" +
            "            L_DEAL_AMOUNT, EN_DEAL_PRICE, VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, \n" +
            "            EN_FEE_ZG, EN_FEE_QT, EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE,\n" +
            "            C_VALID, C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS,\n" +
            "            L_REALDEAL_CANCEL_NO, C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE,\n" +
            "            EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL, TC_ID " +
            "FROM YHUSER.TC_TREALDEAL_NEQ  "+
            "WHERE TC_ID='${taskID}' AND L_DATE ='${date}' " +
            "ORDER BY L_BUSINESS_TIME ASC "+
            "</script>"
    )
    void insertBatchNEQ(@Param("taskID") String taskID, @Param("date") String date);

}
