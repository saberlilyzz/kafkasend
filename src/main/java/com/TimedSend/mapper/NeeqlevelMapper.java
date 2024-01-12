package com.TimedSend.mapper;

import com.TimedSend.model.Neeqlevel;
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
public interface NeeqlevelMapper extends BaseMapper<Neeqlevel> {

    @Select("SELECT EXCHID, CLASSID, CODE, NAME, JRKP, ZDCJ, ZJCJ, CJSL, CJJE, CJJJ, LASTUPD " +
            " FROM NEEQLEVEL WHERE substr(LASTUPD,1,8)='${date}' ")
    List<Neeqlevel> selectnewthreelevel(@Param("date") String date);

}
