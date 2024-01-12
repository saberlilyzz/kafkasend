package com.TimedSend.mapper;

import com.TimedSend.model.TcTrealdeal;
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
 * @since 2023-02-07
 */
public interface TcTrealdealMapper extends BaseMapper<TcTrealdeal> {

    @Select(  "SELECT L_REALDEAL_SERIAL_NO, L_DATE, L_ENTRUST_SERIAL_NO, L_DAILY_INSTRUCTION_NO,\n" +
            "            L_INDEX_DAILY_MODIFY, L_FUND_ID, L_BASECOMBI_ID, C_MARKET_NO, VC_STOCKHOLDER_ID, VC_REPORT_SEAT, \n" +
            "            VC_INTER_CODE, VC_REPORT_CODE, C_STOCK_TYPE, C_ENTRUST_DIRECTION, L_REPORT_SERIAL_NO, L_BUSINESS_TIME, \n" +
            "            L_DEAL_AMOUNT, EN_DEAL_PRICE, VC_DEAL_NO, EN_FEE_JY, EN_FEE_YH, EN_FEE_GH, EN_FEE_YJ, EN_FEE_JS, \n" +
            "            EN_FEE_ZG, EN_FEE_QT, EN_FEE_JS2, EN_FEE_JG, L_SETTLE_DATE, C_CLOSE_TYPE, D_DATETIME, L_MARKET_DATE,\n" +
            "            C_VALID, C_CANCEL_TIME, C_SOURCE, L_OPERATOR_NO, C_MATCH_FLAG, VC_BROKER_NO, C_BUSIN_CLASS,\n" +
            "            L_REALDEAL_CANCEL_NO, C_EXTERNAL_DEAL_FLAG, C_FIXSEND_FLAG, C_TRADE_OPTION, EN_FEE_JY_TRUE,\n" +
            "            EN_FEE_YJ_TRUE, EN_FEE_GH_TOTAL, TC_ID " +
            "FROM YHUSER.TC_TREALDEAL "+
            "WHERE TC_ID='${taskID}' AND L_DATE ='${date}' " +
            "ORDER BY L_BUSINESS_TIME ASC ")
    List<TcTrealdeal> queryTrealdealTc(@Param("taskID") String taskID, @Param("date") String date);

}
