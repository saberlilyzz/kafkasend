package com.TimedSend.mapper;

import com.TimedSend.model.Hklevel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.cursor.Cursor;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2023-03-09
 */
public interface HklevelMapper extends BaseMapper<Hklevel> {
    @Select("SELECT EXCHID, CLASSID, CODE, NAME, JRKP, ZDCJ, ZJCJ, CJSL, CJJE, CJJJ, LASTUPD " +
            " FROM HKLEVEL WHERE substr(LASTUPD,1,8)='${date}' ")
    List<Hklevel> selectHklevel(@Param("date") String date);

    @Select("SELECT EXCHID, CLASSID, CODE, NAME, JRKP, ZDCJ, ZJCJ, CJSL, CJJE, CJJJ, LASTUPD " +
            " FROM zslevel WHERE substr(LASTUPD,1,8)='${date}' ")
    List<Hklevel> selectNormalZSlevel(@Param("date") String date);

    @Select("SELECT EXCHID, CLASSID, CODE, NAME, JRKP, ZDCJ, ZJCJ, CJSL, CJJE, CJJJ, LASTUPD " +
            " FROM zslevel WHERE substr(LASTUPD,1,8)='${date}' ")
    Cursor<Hklevel> scan(@Param("date") String date);
}
