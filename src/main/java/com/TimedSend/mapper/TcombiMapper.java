package com.TimedSend.mapper;

import com.TimedSend.model.Tcombi;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gaocheng
 * @since 2022-10-21
 */
@Mapper
public interface TcombiMapper extends BaseMapper<Tcombi> {
    @Update(value = "<script>" +
            " INSERT INTO TRADE_DEV.TCOMBI(L_COMBI_ID, L_FUND_ID, VC_COMBI_NO, VC_COMBI_NAME, C_COMBI_CLASS, " +
            "L_ASSET_ID, L_SETUP_DATE, L_END_DATE, C_COMBI_STATUS, EN_REMARK, VC_REMARK, C_INVEST_TYPE, " +
            "VC_STOCKTYPE_RIGHT, VC_ENTRDIRE_RIGHT, L_PARAM_ID, C_JOIN_DISTRIBUTE, EN_FUND_VALUE_RATIO," +
            " EN_TARGET_BALANCE, VC_COMBI_IDENTIFIER, VC_PERMIT_MARKET, VC_PERMIT_BUSIN_CLASS, L_EXPONENT_ID," +
            " C_FUTURES_INVEST_TYPE, L_BID_COMBI_ID, L_BAIL_COMBI_ID, C_APPEND_ENTRUST, C_APPEND_ENTRUST_QH, " +
            "C_FAIR_TRADE, C_INVEST_TYPE_PA, VC_APPLY_BUSIN_CLASS, VC_WS_TRADELEVEL, VC_WX_TRADELEVEL) " +
            "    <foreach collection='tbList' item='item' index='index' separator='union all'>" +
            "    (select " +
            //"#{seq_a.nextval,jdbcType=NUMERIC},"+
            "#{item.lCombiId,jdbcType=NUMERIC},"+
            "#{item.lFundId,jdbcType=NUMERIC},"+
            "#{item.vcCombiNo,jdbcType=VARCHAR},"+
            "#{item.vcCombiName,jdbcType=VARCHAR},"+
            "#{item.cCombiClass,jdbcType=VARCHAR},"+
            "#{item.lAssetId,jdbcType=NUMERIC},"+
            "#{item.lSetupDate,jdbcType=NUMERIC},"+

            "#{item.lEndDate,jdbcType=NUMERIC},"+
            "#{item.cCombiStatus,jdbcType=VARCHAR},"+
            "#{item.enRemark,jdbcType=NUMERIC},"+
            "#{item.vcRemark,jdbcType=VARCHAR},"+
            "#{item.cInvestType,jdbcType=VARCHAR},"+
            "#{item.vcStocktypeRight,jdbcType=VARCHAR},"+
            "#{item.vcEntrdireRight,jdbcType=VARCHAR},"+

            "#{item.lParamId,jdbcType=NUMERIC},"+
            "#{item.cJoinDistribute,jdbcType=VARCHAR},"+
            "#{item.enFundValueRatio,jdbcType=NUMERIC},"+
            "#{item.enTargetBalance,jdbcType=NUMERIC},"+
            "#{item.vcCombiIdentifier,jdbcType=VARCHAR},"+
            "#{item.vcPermitMarket,jdbcType=VARCHAR},"+
            "#{item.vcPermitBusinClass,jdbcType=VARCHAR},"+
            "#{item.lExponentId,jdbcType=NUMERIC},"+

            "#{item.cFuturesInvestType,jdbcType=VARCHAR},"+
            "#{item.lBidCombiId,jdbcType=NUMERIC},"+
            "#{item.lBailCombiId,jdbcType=NUMERIC},"+
            "#{item.cAppendEntrust,jdbcType=VARCHAR},"+
            "#{item.cAppendEntrustQh,jdbcType=VARCHAR},"+
            "#{item.cFairTrade,jdbcType=VARCHAR},"+
            "#{item.cInvestTypePa,jdbcType=VARCHAR},"+

            "#{item.vcApplyBusinClass,jdbcType=VARCHAR},"+
            "#{item.vcWsTradelevel,jdbcType=VARCHAR},"+
            "#{item.vcWxTradelevel,jdbcType=VARCHAR}"+
            "            from dual" +
            "            )" +
            "        </foreach>" +
            "</script>")
    void SaveBatch(@Param("tbList") List<Tcombi> tbList);
}
