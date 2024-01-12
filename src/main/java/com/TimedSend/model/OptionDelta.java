package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2023-05-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("OPTION_DELTA")
public class OptionDelta extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("WIND_CODE")
    private String windCode;

    @TableField("SEC_TYPE")
    private String secType;

    @TableField("RT_DELTA")
    private BigDecimal rtDelta;

    @TableField("RT_DATE")
    private String rtDate;

    @TableField("RT_TIME")
    private String rtTime;


}
