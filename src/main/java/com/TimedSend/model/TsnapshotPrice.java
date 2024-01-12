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
@TableName("TSNAPSHOT_PRICE")
public class TsnapshotPrice extends Model {

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
     * 昨收盘
     */
    @TableField("LASTCLOSE")
    private Double lastclose;

    /**
     * 昨结算价格
     */
    @TableField("LASTSETTLE")
    private Double lastsettle;

    /**
     * 今开盘
     */
    @TableField("CURROPEN")
    private Double curropen;

    /**
     * 今最高
     */
    @TableField("CURRHIGH")
    private Double currhigh;

    /**
     * 今最低
     */
    @TableField("CURRLOW")
    private Double currlow;

    /**
     * 今收盘
     */
    @TableField("CURRCLOSE")
    private Double currclose;

    /**
     * 今结算价格
     */
    @TableField("CURRSETTLE")
    private Double currsettle;

    /**
     * 今成交金额
     */
    @TableField("CURRAMOUNT")
    private Double curramount;

    /**
     * 今成交量
     */
    @TableField("CURRVOLUME")
    private Long currvolume;

    /**
     * 今成交笔数
     */
    @TableField("CURRUNITS")
    private Long currunits;

    /**
     * 昨合约持仓量
     */
    @TableField("LASTPOSITION")
    private Long lastposition;

    /**
     * 今合约持仓量
     */
    @TableField("CURRPOSITION")
    private Long currposition;

    /**
     * PE1
     */
    @TableField("PE1")
    private Double pe1;

    /**
     * PE2
     */
    @TableField("PE2")
    private Double pe2;

    /**
     * CHG1
     */
    @TableField("CHG1")
    private Double chg1;

    /**
     * CHG2
     */
    @TableField("CHG2")
    private Double chg2;

    /**
     * 最新成交到期收益率
     */
    @TableField("TRADEYTM")
    private Double tradeytm;

    /**
     * 最新成交价
     */
    @TableField("TRADEPRICE")
    private Double tradeprice;

    /**
     * 买价格1
     */
    @TableField("BIDPRICE1")
    private Double bidprice1;

    /**
     * 买数量1
     */
    @TableField("BIDVOLUME1")
    private Long bidvolume1;

    /**
     * 买价格2
     */
    @TableField("BIDPRICE2")
    private Double bidprice2;

    /**
     * 买数量2
     */
    @TableField("BIDVOLUME2")
    private Long bidvolume2;

    /**
     * 买价格3
     */
    @TableField("BIDPRICE3")
    private Double bidprice3;

    /**
     * 买数量3
     */
    @TableField("BIDVOLUME3")
    private Long bidvolume3;

    /**
     * 买价格4
     */
    @TableField("BIDPRICE4")
    private Double bidprice4;

    /**
     * 买数量4
     */
    @TableField("BIDVOLUME4")
    private Long bidvolume4;

    /**
     * 买价格5
     */
    @TableField("BIDPRICE5")
    private Double bidprice5;

    /**
     * 买数量5
     */
    @TableField("BIDVOLUME5")
    private Long bidvolume5;

    /**
     * 卖价格1
     */
    @TableField("ASKPRICE1")
    private Double askprice1;

    /**
     * 卖数量1
     */
    @TableField("ASKVOLUME1")
    private Long askvolume1;

    /**
     * 卖价格2
     */
    @TableField("ASKPRICE2")
    private Double askprice2;

    /**
     * 卖数量2
     */
    @TableField("ASKVOLUME2")
    private Long askvolume2;

    /**
     * 卖价格3
     */
    @TableField("ASKPRICE3")
    private Double askprice3;

    /**
     * 卖数量3
     */
    @TableField("ASKVOLUME3")
    private Long askvolume3;

    /**
     * 卖价格4
     */
    @TableField("ASKPRICE4")
    private Double askprice4;

    /**
     * 卖数量4
     */
    @TableField("ASKVOLUME4")
    private Long askvolume4;

    /**
     * 卖价格5
     */
    @TableField("ASKPRICE5")
    private Double askprice5;

    /**
     * 卖数量5
     */
    @TableField("ASKVOLUME5")
    private Long askvolume5;

    /**
     * 导入时间
     */
    @TableField("IMP_TIME")
    private String impTime;


}
