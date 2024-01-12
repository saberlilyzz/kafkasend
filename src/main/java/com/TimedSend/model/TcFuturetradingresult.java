package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaocheng
 * @since 2023-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TC_FUTURETRADINGRESULT")
public class TcFuturetradingresult extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("SERIALNUM")
    private Integer serialnum;

    @TableField("ACCTID")
    private String acctid;

    @TableField("CURRENCYID")
    private String currencyid;

    @TableField("EXCHID")
    private String exchid;

    @TableField("STKID")
    private String stkid;

    @TableField("STKNAME")
    private String stkname;

    @TableField("BSFLAG")
    private String bsflag;

    @TableField("F_OFFSETFLAG")
    private String fOffsetflag;

    @TableField("KNOCKQTY")
    private Long knockqty;

    @TableField("KNOCKPRICE")
    private Double knockprice;

    @TableField("KNOCKAMT")
    private Double knockamt;

    @TableField("KNOCKTIME")
    private Long knocktime;

    @TableField("F_PRODUCTID")
    private String fProductid;

    @TableId("TC_ID")
    private Double tcId;

    @TableField("EXECTYPE")
    private  String exectype;



}
