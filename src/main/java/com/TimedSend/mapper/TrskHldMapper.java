package com.TimedSend.mapper;

import com.TimedSend.model.TrskHld;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2023-02-06
 */
public interface TrskHldMapper extends BaseMapper<TrskHld> {
    @Update(value = "<script>" +
            " DELETE " +
            " FROM YHUSER.TRSK_HLD " +
            " WHERE D_BASE ='${begDate}'"+
            "</script>")
    void DeleteBatchbyDate(@Param("begDate") String begDate);



    @Update(value = "<script>"+
            "INSERT INTO  TRSK_HLD (C_TOTAL_TYPE, C_PCODE, I_CODE, A_TYPE, M_TYPE, C_POSITION, C_CURRENCY, \n" +
            "                D_BASE, F_VOL, L_PIPE_ID, F_COST, PIPE_ID, C_DATA_SOURCE, L_FLAG, ORG_ID, OPERATOR,\n" +
            "                L_DIV_PAY, L_BOOK_VALUE, L_INTEREST_ADJUSTED, L_PAR_VALUE, IMP_DATE, \n" +
            "                UPDATE_TIME, I_CODE_OLD, A_TYPE_OLD, M_TYPE_OLD, I_NAME_OLD, F_MV, SUBATTR_CODE, \n" +
            "                P_CLASS, FACCTATTR, F_ACOST, S_F_MV, F_MV_ORI, F_COST_ORI, L_DIV_PAY_ORI, TC_ID) " +
            "SELECT C_TOTAL_TYPE, C_PCODE, I_CODE, A_TYPE, M_TYPE, C_POSITION, C_CURRENCY, \n" +
            "                D_BASE, F_VOL, L_PIPE_ID, F_COST, PIPE_ID, C_DATA_SOURCE, L_FLAG, ORG_ID, OPERATOR,\n" +
            "                L_DIV_PAY, L_BOOK_VALUE, L_INTEREST_ADJUSTED, L_PAR_VALUE, IMP_DATE, \n" +
            "                UPDATE_TIME, I_CODE_OLD, A_TYPE_OLD, M_TYPE_OLD, I_NAME_OLD, F_MV, SUBATTR_CODE, \n" +
            "                P_CLASS, FACCTATTR, F_ACOST, S_F_MV, F_MV_ORI, F_COST_ORI, L_DIV_PAY_ORI, TC_ID " +
            "FROM TC_TRSK_HLD "+
            "WHERE D_BASE ='${begDate}'  AND TC_ID ='${taskID}'"+
            "</script>"
    )
    void insertBatch(@Param("begDate") String begDate, @Param("taskID") String taskID);

}
