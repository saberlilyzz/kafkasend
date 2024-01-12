package com.TimedSend.mapper;

import com.TimedSend.model.OptionDelta;
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
 * @since 2023-05-23
 */
public interface OptionDeltaMapper extends BaseMapper<OptionDelta> {

    @Select("SELECT WIND_CODE, SEC_TYPE, RT_DELTA, RT_DATE, RT_TIME " +
            " FROM  OPTION_DELTA WHERE substr(rt_date,1,8)='${date}' ")
    List<OptionDelta> selectlevelDelta(@Param("date") String date);

}
