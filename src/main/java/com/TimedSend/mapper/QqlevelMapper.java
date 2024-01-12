package com.TimedSend.mapper;

import com.TimedSend.model.Qqlevel;
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
 * @since 2023-03-24
 */
public interface QqlevelMapper extends BaseMapper<Qqlevel> {

    @Select("SELECT EXCHID, CLASSID, CODE, NAME, JRKP, ZDCJ, ZJCJ, CJSL, CJJE, CJJJ, LASTUPD " +
            " FROM  QQLEVEL WHERE substr(LASTUPD,1,8)='${date}' ")
    List<Qqlevel> selectQQlevel(@Param("date") String date);
}
