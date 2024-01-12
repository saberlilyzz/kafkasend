package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2023-04-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Hjzslevel extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * WIND代码
     */

    private String windCode;

    /**
     * 成交量
     */
    
    private BigDecimal rtVol;

    /**
     * 成交金额
     */

    private BigDecimal rtAmt;

    /**
     * 最新成交价
     */

    private BigDecimal rtLatest;

    /**
     * 今开
     */

    private BigDecimal rtOpen;

    /**
     * 最低
     */

    private BigDecimal rtLow;

    /**
     * 均价
     */

    private BigDecimal rtVwap;

    /**
     * 日期
     */

    private String rtDate;

    /**
     * 时间
     */

    private String rtTime;


    private  int  secType;
}
