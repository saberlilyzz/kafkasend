package com.TimedSend.mapper;

import com.TimedSend.model.Hjzslevel;
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
 * @since 2023-04-07
 */
public interface HjzslevelMapper extends BaseMapper<Hjzslevel> {
//WIND_CODE, RT_VOL, RT_AMT, RT_LATEST, RT_OPEN, RT_LOW, RT_VWAP, RT_DATE, RT_TIME
@Select("SELECT WIND_CODE, RT_VOL, RT_AMT, RT_LATEST, RT_OPEN, RT_LOW, RT_VWAP, RT_DATE, RT_TIME, SEC_TYPE" +
        " FROM HJZSLEVEL WHERE substr(RT_DATE,1,8)='${date}' ")
    List<Hjzslevel> HjandIdxlevel(@Param("date") String date);
}
