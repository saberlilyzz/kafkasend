package com.TimedSend.model;

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
 * @author gaocheng
 * @since 2023-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("QHLEVEL")
public class Qhlevel extends Model {

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
    private Double jrkp;

    /**
     * 最低成交
     */
    @TableField("ZDCJ")
    private Double zdcj;

    /**
     * 最近成交
     */
    @TableField("ZJCJ")
    private Double zjcj;

    /**
     * 结算价
     */
    @TableField("AVERJ")
    private Double averj;

    /**
     * 成交数量
     */
    @TableField("CJSL")
    private Double cjsl;

    /**
     * 成交金额
     */
    @TableField("CJJE")
    private Double cjje;

    /**
     * 成交均价
     */
    @TableField("CJJJ")
    private Double cjjj;

    /**
     * 行情刷新时间
     */
    @TableField("LASTUPD")
    private String lastupd;


}
