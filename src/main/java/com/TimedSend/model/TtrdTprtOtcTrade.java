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
 * 成交流水表
 * </p>
 *
 * @author zheng.zhang
 * @since 2024-01-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TPRT_OTC_TRADE")
public class TtrdTprtOtcTrade extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 交易序号
     */
    @TableId("SYSORDID")
    private Long sysordid;

    /**
     * 确认日期
     */
    @TableField("CONDATE")
    private String condate;

    /**
     * 确认时间
     */
    @TableField("CONTIME")
    private String contime;

    /**
     * 二级证券账户
     */
    @TableField("SECU_ACCID")
    private String secuAccid;

    /**
     * 币种
     */
    @TableField("CURRENCY")
    private String currency;

    /**
     * 业务类型
     */
    @TableField("TRDTYPE")
    private String trdtype;

    /**
     * 金融工具代码
     */
    @TableField("I_CODE")
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
     * 金融工具名称
     */
    @TableField("I_NAME")
    private String iName;

    /**
     * 交易数量
     */
    @TableField("ORDCOUNT")
    private Double ordcount;

    /**
     * 交易价格
     */
    @TableField("ORDPRICE")
    private Double ordprice;

    /**
     * 交易金额
     */
    @TableField("ORDAMOUNT")
    private Double ordamount;

    /**
     * 使用时间
     */
    @TableField("USEDTIME")
    private String usedtime;

    @TableField("TC_ID")
    private Double tcId;

    @TableField("SET_DATE")
    private String setDate;

    @TableField("ORDDATE")
    private String orddate;

    /**
     * 净价金额
     */
    @TableField("BND_NETPRICE")
    private Double bndNetprice;

    /**
     * 应收利息
     */
    @TableField("BND_AIAMOUNT")
    private Double bndAiamount;

    /**
     * 转托管交易序号
     */
    @TableField("REF_SYSORDID")
    private Long refSysordid;


}
