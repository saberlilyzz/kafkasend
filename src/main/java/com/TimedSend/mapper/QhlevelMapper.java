package com.TimedSend.mapper;

import com.TimedSend.model.Qhlevel;
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
public interface QhlevelMapper extends BaseMapper<Qhlevel> {

    @Select("SELECT EXCHID, CLASSID, CODE, NAME, JRKP, ZDCJ, ZJCJ, AVERJ, CJSL, CJJE, CJJJ, LASTUPD " +
            " FROM  QHLEVEL WHERE substr(LASTUPD,1,8)='${date}' ")
    List<Qhlevel> selectQhlevel(@Param("date") String date);

}
