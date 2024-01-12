package com.TimedSend.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 剩余本金表
 * </p>
 *
 * @author zheng.zhang
 * @since 2024-01-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TP_INSTRUMENT_REMAIN_NOTIONAL")
public class TtrdTpInstrumentRemainNotional extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("I_CODE")
    private String iCode;

    @TableField("A_TYPE")
    private String aType;

    @TableField("M_TYPE")
    private String mType;

    @TableField("BEG_DATE")
    private String begDate;

    /**
     * 单张剩余本金
     */
    @TableField("REMAIN_NOTIONAL")
    private BigDecimal remainNotional;


}
