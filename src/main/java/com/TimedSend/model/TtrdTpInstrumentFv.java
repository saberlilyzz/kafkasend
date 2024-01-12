package com.TimedSend.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zheng.zhang
 * @since 2024-01-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TP_INSTRUMENT_FV")
public class TtrdTpInstrumentFv extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("BEG_DATE")
    private String begDate;

    @TableField("END_DATE")
    private String endDate;

    /**
     * 单张估值
     */
    @TableField("FV")
    private BigDecimal fv;


}
