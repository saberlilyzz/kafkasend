package com.TimedSend.mapper;

import com.TimedSend.model.Tstockinfo;
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
public interface TstockinfoMapper extends BaseMapper<Tstockinfo> {
    @Update(value = "<script>" +
            " INSERT INTO TSTOCKINFO(VC_INTER_CODE, L_DATE, C_MARKET_NO, VC_REPORT_CODE, VC_STOCK_NAME, VC_STOCK_SPELL, " +
            "VC_STOCK_FULLNAME, C_STOCK_TYPE, C_ASSET_CLASS, EN_UPLIMITED_RATIO, EN_DOWNLIMITED_RATIO, EN_UPLIMITED_PRICE, EN_DOWNLIMITED_PRICE, " +
            "C_DEFAULT_PRICE, VC_FROZEN_CODE, VC_RELATIVE_FROZEN_CODE, VC_ASSIGN_CODE, VC_ASSET_RELATIVE_CODE, " +
            "VC_MATCH_RELATIVE1_CODE, VC_MATCH_RELATIVE2_CODE, L_TOTAL_AMOUNT, L_TURNOVER_AMOUNT, L_NEAR_AMOUNT," +
            " EN_REPAY_YEAR, EN_YESTERDAY_CLOSE_PRICE, EN_OPEN_PRICE, L_COMPANY_ID, EN_YIELD_RATIO, VC_MIXED_TYPE," +
            " C_STOP_FLAG, EN_LAST_PRICE, EN_AVG_PRICE, EN_MAX_PRICE, EN_MIN_PRICE, L_UPLIMITED_AMOUNT, " +
            "L_DOWNLIMITED_AMOUNT, L_MARKET_DEAL_AMOUNT, EN_MARKET_DEAL_BALANCE, EN_REFERENCE_PRICE," +
            " L_PUBLISH_DATE, L_TURNOVER_DATE, L_TOTAL_LOCK_DAYS, L_LEFT_LOCK_DAYS, VC_PRICE_RELATIVE_CODE, " +
            "VC_INTERNATIONAL_CODE, VC_RIC_CODE, VC_SEDOL_CODE, VC_CUSIP_CODE, VC_BLOOMBERG_CODE, EN_BUY_PRICE1," +
            " L_BUY_AMOUNT1, EN_BUY_PRICE2, L_BUY_AMOUNT2, EN_BUY_PRICE3, L_BUY_AMOUNT3, EN_BUY_PRICE4, L_BUY_AMOUNT4," +
            " EN_BUY_PRICE5, L_BUY_AMOUNT5, EN_SALE_PRICE1, L_SALE_AMOUNT1, EN_SALE_PRICE2, L_SALE_AMOUNT2, " +
            "EN_SALE_PRICE3, L_SALE_AMOUNT3, EN_SALE_PRICE4, L_SALE_AMOUNT4, EN_SALE_PRICE5, L_SALE_AMOUNT5, " +
            "VC_CURRENCY_NO, EN_FACE_VALUES, L_LISTING_DATE, L_WX_LISTING_DATE, C_LONG_STOP_FLAG, EN_FAIR_PRICE2, L_BUY_UNIT, L_SALE_UNIT) " +
            "    <foreach collection='tbList' item='item' index='index' separator='union all'>" +
            "    (select " +
            //"#{seq_a.nextval,jdbcType=NUMERIC},"+
            "#{item.vcInterCode,jdbcType=VARCHAR},"+
            "#{item.lDate,jdbcType=NUMERIC},"+
            "#{item.cMarketNo,jdbcType=VARCHAR},"+
            "#{item.vcReportCode,jdbcType=VARCHAR},"+
            "#{item.vcStockName,jdbcType=VARCHAR},"+
            "#{item.vcStockSpell,jdbcType=VARCHAR},"+
            "#{item.vcStockFullname,jdbcType=VARCHAR},"+

            "#{item.cStockType,jdbcType=VARCHAR},"+
            "#{item.cAssetClass,jdbcType=VARCHAR},"+
            "#{item.enUplimitedRatio,jdbcType=NUMERIC},"+
            "#{item.enDownlimitedRatio,jdbcType=NUMERIC},"+
            "#{item.enUplimitedPrice,jdbcType=NUMERIC},"+
            "#{item.enDownlimitedPrice,jdbcType=NUMERIC},"+
            "#{item.cDefaultPrice,jdbcType=VARCHAR},"+

            "#{item.vcFrozenCode,jdbcType=VARCHAR},"+
            "#{item.vcRelativeFrozenCode,jdbcType=VARCHAR},"+
            "#{item.vcAssignCode,jdbcType=VARCHAR},"+
            "#{item.vcAssetRelativeCode,jdbcType=VARCHAR},"+
            "#{item.vcMatchRelative1Code,jdbcType=VARCHAR},"+
            "#{item.vcMatchRelative2Code,jdbcType=VARCHAR},"+

            "#{item.lTotalAmount,jdbcType=NUMERIC},"+
            "#{item.lTurnoverAmount,jdbcType=NUMERIC},"+
            "#{item.lNearAmount,jdbcType=NUMERIC},"+
            "#{item.enRepayYear,jdbcType=NUMERIC},"+
            "#{item.enYesterdayClosePrice,jdbcType=NUMERIC},"+
            "#{item.enOpenPrice,jdbcType=NUMERIC},"+
            "#{item.lCompanyId,jdbcType=NUMERIC},"+
            "#{item.enYieldRatio,jdbcType=NUMERIC},"+

            "#{item.vcMixedType,jdbcType=VARCHAR},"+
            "#{item.cStopFlag,jdbcType=VARCHAR},"+
            "#{item.enLastPrice,jdbcType=NUMERIC},"+
            "#{item.enAvgPrice,jdbcType=NUMERIC},"+
            "#{item.enMaxPrice,jdbcType=NUMERIC},"+
            "#{item.enMinPrice,jdbcType=NUMERIC},"+

            "#{item.lUplimitedAmount,jdbcType=NUMERIC},"+
            "#{item.lDownlimitedAmount,jdbcType=NUMERIC},"+
            "#{item.lMarketDealAmount,jdbcType=NUMERIC},"+
            "#{item.enMarketDealBalance,jdbcType=NUMERIC},"+
            "#{item.enReferencePrice,jdbcType=NUMERIC},"+
            "#{item.lPublishDate,jdbcType=NUMERIC},"+
            "#{item.lTurnoverDate,jdbcType=NUMERIC},"+
            "#{item.lTotalLockDays,jdbcType=NUMERIC},"+
            "#{item.lLeftLockDays,jdbcType=NUMERIC},"+

            "#{item.vcPriceRelativeCode,jdbcType=VARCHAR},"+
            "#{item.vcInternationalCode,jdbcType=VARCHAR},"+
            "#{item.vcRicCode,jdbcType=VARCHAR},"+
            "#{item.vcSedolCode,jdbcType=VARCHAR},"+
            "#{item.vcCusipCode,jdbcType=VARCHAR},"+
            "#{item.vcBloombergCode,jdbcType=VARCHAR},"+

            "#{item.enBuyPrice1,jdbcType=NUMERIC},"+
            "#{item.lBuyAmount1,jdbcType=NUMERIC},"+
            "#{item.enBuyPrice2,jdbcType=NUMERIC},"+
            "#{item.lBuyAmount2,jdbcType=NUMERIC},"+
            "#{item.enBuyPrice3,jdbcType=NUMERIC},"+
            "#{item.lBuyAmount3,jdbcType=NUMERIC},"+
            "#{item.enBuyPrice4,jdbcType=NUMERIC},"+
            "#{item.lBuyAmount4,jdbcType=NUMERIC},"+
            "#{item.enBuyPrice5,jdbcType=NUMERIC},"+
            "#{item.lBuyAmount5,jdbcType=NUMERIC},"+

            "#{item.enSalePrice1,jdbcType=NUMERIC},"+
            "#{item.lSaleAmount1,jdbcType=NUMERIC},"+
            "#{item.enSalePrice2,jdbcType=NUMERIC},"+
            "#{item.lSaleAmount2,jdbcType=NUMERIC},"+
            "#{item.enSalePrice3,jdbcType=NUMERIC},"+
            "#{item.lSaleAmount3,jdbcType=NUMERIC},"+
            "#{item.enSalePrice4,jdbcType=NUMERIC},"+
            "#{item.lSaleAmount4,jdbcType=NUMERIC},"+
            "#{item.enSalePrice5,jdbcType=NUMERIC},"+
            "#{item.lSaleAmount5,jdbcType=NUMERIC},"+

            "#{item.vcCurrencyNo,jdbcType=VARCHAR},"+
            "#{item.enFaceValues,jdbcType=NUMERIC},"+
            "#{item.lListingDate,jdbcType=NUMERIC},"+
            "#{item.lWxListingDate,jdbcType=NUMERIC},"+
            "#{item.cLongStopFlag,jdbcType=VARCHAR},"+
            "#{item.enFairPrice2,jdbcType=NUMERIC},"+
            "#{item.lBuyUnit,jdbcType=NUMERIC},"+
            "#{item.lSaleUnit,jdbcType=NUMERIC}"+

            "            from dual" +
            "            )" +
            "        </foreach>" +
            "</script>")
    void SaveBatch(@Param("tbList") List<Tstockinfo> tbList);
}
