package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
 * @since 2023-02-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TC_TREALDEAL")
public class TcTrealdeal extends Model {

    private static final long serialVersionUID = 1L;

    @TableField("L_REALDEAL_SERIAL_NO")
    private Long lRealdealSerialNo;

    @TableField("L_DATE")
    private Integer lDate;

    @TableField("L_ENTRUST_SERIAL_NO")
    private Long lEntrustSerialNo;

    @TableField("L_DAILY_INSTRUCTION_NO")
    private Long lDailyInstructionNo;

    @TableField("L_INDEX_DAILY_MODIFY")
    private Long lIndexDailyModify;

    @TableField("L_FUND_ID")
    private Integer lFundId;

    @TableField("L_BASECOMBI_ID")
    private Long lBasecombiId;

    @TableField("C_MARKET_NO")
    private String cMarketNo;

    @TableField("VC_STOCKHOLDER_ID")
    private String vcStockholderId;

    @TableField("VC_REPORT_SEAT")
    private String vcReportSeat;

    @TableField("VC_INTER_CODE")
    private String vcInterCode;

    @TableField("VC_REPORT_CODE")
    private String vcReportCode;

    @TableField("C_STOCK_TYPE")
    private String cStockType;

    @TableField("C_ENTRUST_DIRECTION")
    private String cEntrustDirection;

    @TableField("L_REPORT_SERIAL_NO")
    private Long lReportSerialNo;

    @TableField("L_BUSINESS_TIME")
    private Integer lBusinessTime;

    @TableField("L_DEAL_AMOUNT")
    private Long lDealAmount;

    @TableField("EN_DEAL_PRICE")
    private Double enDealPrice;

    @TableField("VC_DEAL_NO")
    private String vcDealNo;

    @TableField("EN_FEE_JY")
    private Double enFeeJy;

    @TableField("EN_FEE_YH")
    private Double enFeeYh;

    @TableField("EN_FEE_GH")
    private Double enFeeGh;

    @TableField("EN_FEE_YJ")
    private Double enFeeYj;

    @TableField("EN_FEE_JS")
    private Double enFeeJs;

    @TableField("EN_FEE_ZG")
    private Double enFeeZg;

    @TableField("EN_FEE_QT")
    private Double enFeeQt;

    @TableField("EN_FEE_JS2")
    private Double enFeeJs2;

    @TableField("EN_FEE_JG")
    private Double enFeeJg;

    @TableField("L_SETTLE_DATE")
    private Integer lSettleDate;

    @TableField("C_CLOSE_TYPE")
    private String cCloseType;

    @TableField("D_DATETIME")
    private LocalDateTime dDatetime;

    @TableField("L_MARKET_DATE")
    private Integer lMarketDate;

    @TableField("C_VALID")
    private String cValid;

    @TableField("C_CANCEL_TIME")
    private Integer cCancelTime;

    @TableField("C_SOURCE")
    private String cSource;

    @TableField("L_OPERATOR_NO")
    private Integer lOperatorNo;

    @TableField("C_MATCH_FLAG")
    private String cMatchFlag;

    @TableField("VC_BROKER_NO")
    private String vcBrokerNo;

    @TableField("C_BUSIN_CLASS")
    private String cBusinClass;

    @TableField("L_REALDEAL_CANCEL_NO")
    private Long lRealdealCancelNo;

    @TableField("C_EXTERNAL_DEAL_FLAG")
    private String cExternalDealFlag;

    @TableField("C_FIXSEND_FLAG")
    private String cFixsendFlag;

    @TableField("C_TRADE_OPTION")
    private String cTradeOption;

    @TableField("EN_FEE_JY_TRUE")
    private Double enFeeJyTrue;

    @TableField("EN_FEE_YJ_TRUE")
    private Double enFeeYjTrue;

    @TableField("EN_FEE_GH_TOTAL")
    private Double enFeeGhTotal;

    @TableField("OBJID")
    private String objid;

    @TableField("TC_ID")
    private String tcId;


}
