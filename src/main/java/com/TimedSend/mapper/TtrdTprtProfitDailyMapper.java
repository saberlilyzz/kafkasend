package com.TimedSend.mapper;

import com.TimedSend.model.TtrdTprtProfitDaily;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;


public interface TtrdTprtProfitDailyMapper extends BaseMapper<TtrdTprtProfitDaily> {
    @Update(value = "<script>"+
            "INSERT INTO  TTRD_TPRT_PROFIT_DAILY (BEG_DATE, SECU_ACCT_ID, EXTRA_DIM, CURRENCY, I_CODE, A_TYPE, M_TYPE," +
            " REAL_VOLUME, REAL_CP, CUR_BUY_VOLUME, CUR_BUY_CP, CUR_SELL_VOLUME, CUR_SELL_CP, MTM, YTD_MTM, " +
            "EXPOSURE, YTD_EXPOSURE, BUY_PRFT_FV, SELL_PRFT_FV, YTD_PRFT_FV, CUR_PRICE, YTD_PRICE, UPDATE_TIME," +
            "SET_DATE, AI, TODAY_AI, CUR_PRFT_TRD, CUR_PRFT_IR_TRD, CUR_PRFT_IR_AI, F_PRFT_GROSS," +
            "PRFT_TRD, PRFT_IR_TRD, PRFT_IR_AI, PRFT_FV) " +
            "SELECT '${begDate}' AS  BEG_DATE, SECU_ACCT_ID, EXTRA_DIM, CURRENCY, I_CODE, A_TYPE, M_TYPE, " +
            "REAL_VOLUME, REAL_CP, CUR_BUY_VOLUME, CUR_BUY_CP, CUR_SELL_VOLUME, CUR_SELL_CP, MTM, YTD_MTM," +
            "EXPOSURE, YTD_EXPOSURE, BUY_PRFT_FV, SELL_PRFT_FV, YTD_PRFT_FV, CUR_PRICE, YTD_PRICE, UPDATE_TIME," +
            "SET_DATE, AI, TODAY_AI, CUR_PRFT_TRD, CUR_PRFT_IR_TRD, CUR_PRFT_IR_AI, F_PRFT_GROSS, " +
            "PRFT_TRD, PRFT_IR_TRD, PRFT_IR_AI, PRFT_FV " +
            "FROM TTRD_TPRT_PROFIT "+
            "</script>"
    )
    void insertBatch(@Param("begDate") String begDate);

    @Update(value = "<script>"+
            "INSERT INTO  TTRD_TPRT_PROFIT_DAILY (BEG_DATE, SECU_ACCT_ID, EXTRA_DIM, " +
            "CURRENCY, I_CODE, A_TYPE, M_TYPE, REAL_VOLUME, REAL_CP, " +
            "CUR_BUY_VOLUME, CUR_BUY_CP, CUR_SELL_VOLUME, CUR_SELL_CP, MTM, YTD_MTM, EXPOSURE, YTD_EXPOSURE," +
            "BUY_PRFT_FV, SELL_PRFT_FV, YTD_PRFT_FV, CUR_PRICE, YTD_PRICE, UPDATE_TIME, TC_ID," +
            "SET_DATE, AI, TODAY_AI, CUR_PRFT_TRD, CUR_PRFT_IR_TRD, CUR_PRFT_IR_AI, F_PRFT_GROSS ," +
            "PRFT_TRD, PRFT_IR_TRD, PRFT_IR_AI, PRFT_FV) " +
            "SELECT '${begDate}' AS  BEG_DATE, SECU_ACCT_ID, EXTRA_DIM, CURRENCY, I_CODE, A_TYPE, M_TYPE, " +
            "REAL_VOLUME, REAL_CP, CUR_BUY_VOLUME, CUR_BUY_CP, CUR_SELL_VOLUME, CUR_SELL_CP, " +
            "MTM, YTD_MTM, EXPOSURE, YTD_EXPOSURE ,BUY_PRFT_FV, SELL_PRFT_FV, YTD_PRFT_FV, CUR_PRICE, YTD_PRICE, UPDATE_TIME,'${taskID}' AS TC_ID ," +
            "SET_DATE, AI, TODAY_AI, CUR_PRFT_TRD, CUR_PRFT_IR_TRD, CUR_PRFT_IR_AI, F_PRFT_GROSS ," +
            "PRFT_TRD, PRFT_IR_TRD, PRFT_IR_AI, PRFT_FV " +
            "FROM TTRD_TPRT_PROFIT "+
            "</script>"
    )
    void insertBatchTC(@Param("begDate") String begDate, @Param("taskID") String taskID);

}
