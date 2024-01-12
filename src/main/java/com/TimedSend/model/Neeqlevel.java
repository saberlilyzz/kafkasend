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
 * @since 2023-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("NEEQLEVEL")
public class Neeqlevel extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易所代码
     */
    @TableField("EXCHID")
    private String exchid;

    /**
     * 商品类型
     */
    @TableField("CLASSID")
    private String classid;

    /**
     * 证券代码
     */
    @TableField("CODE")
    private String code;

    /**
     * 证券名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 今日开盘
     */
    @TableField("JRKP")
    private BigDecimal jrkp;

    /**
     * 最低成交
     */
    @TableField("ZDCJ")
    private BigDecimal zdcj;

    /**
     * 最近成交
     */
    @TableField("ZJCJ")
    private BigDecimal zjcj;

    /**
     * 成交数量
     */
    @TableField("CJSL")
    private BigDecimal cjsl;

    /**
     * 成交金额
     */
    @TableField("CJJE")
    private BigDecimal cjje;

    /**
     * 成交均价
     */
    @TableField("CJJJ")
    private BigDecimal cjjj;

    /**
     * 行情刷新时间
     */
    @TableField("LASTUPD")
    private String lastupd;


}
