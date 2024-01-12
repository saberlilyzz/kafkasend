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
 * @since 2023-08-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TSNAPSHOT_QUOTE")
public class TsnapshotQuote extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易代码
     */
    @TableId("I_CODE")
    private String iCode;

    /**
     * 资产类型
     */
    @TableField("A_TYPE")
    private String aType;

    /**
     * 市场类型
     */
    @TableField("M_TYPE")
    private String mType;

    /**
     * 市场类型
     */
    @TableField("MARKET")
    private String market;

    /**
     * 证券代码
     */
    @TableField("SECUCODE")
    private String secucode;

    /**
     * 证券名称
     */
    @TableField("SECUNAME")
    private String secuname;

    /**
     * 行情日期
     */
    @TableField("EFFECT_DATE")
    private String effectDate;

    /**
     * 行情时间
     */
    @TableField("EFFECT_TIME")
    private String effectTime;

    /**
     * 行情毫秒
     */
    @TableField("EFFECT_MSEC")
    private String effectMsec;

    /**
     * 切片日期
     */
    @TableField("SNAPSHOT_DATE")
    private String snapshotDate;

    /**
     * 切片时间
     */
    @TableField("SNAPSHOT_TIME")
    private String snapshotTime;

    /**
     * 行权价
     */
    @TableField("OPT_STRIKE")
    private Double optStrike;

    /**
     * 最新成交价
     */
    @TableField("TRADEPRICE")
    private Double tradeprice;

    /**
     * 买价格
     */
    @TableField("BIDPRICE")
    private Double bidprice;

    /**
     * 买数量
     */
    @TableField("BIDVOLUME")
    private Long bidvolume;

    /**
     * 卖价格
     */
    @TableField("ASKPRICE")
    private Double askprice;

    /**
     * 卖数量
     */
    @TableField("ASKVOLUME")
    private Long askvolume;

    /**
     * 今合约持仓量
     */
    @TableField("CURRPOSITION")
    private Long currposition;

    /**
     * 振幅
     */
    @TableField("AMPLITUDE")
    private Double amplitude;

    /**
     * 涨跌幅
     */
    @TableField("CHG_RATIO")
    private Double chgRatio;

    /**
     * 导入时间
     */
    @TableField("IMP_TIME")
    private String impTime;


}
