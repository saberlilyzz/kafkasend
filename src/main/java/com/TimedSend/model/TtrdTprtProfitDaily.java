package com.TimedSend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("TTRD_TPRT_PROFIT_DAILY")
public class TtrdTprtProfitDaily extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 日期
     */

    private String begDate;

    /**
     * 账户
     */

    private String secuAcctId;

    /**
     * 多空维度
     */

    private String extraDim;

    /**
     * 币种
     */

    private String currency;

    /**
     * 资产代码
     */

    private String iCode;

    /**
     * 资产类型
     */

    private String aType;

    /**
     * 市场类型
     */

    private String mType;

    /**
     * 持仓数量
     */

    private BigDecimal realVolume;

    /**
     * 持仓成本
     */

    private BigDecimal realCp;

    /**
     * 当日买入数量
     */

    private BigDecimal curBuyVolume;

    /**
     * 当日买入成本
     */

    private BigDecimal curBuyCp;

    /**
     * 当日买入数量
     */

    private BigDecimal curSellVolume;

    /**
     * 当日卖出数量
     */

    private BigDecimal curSellCp;

    /**
     * 市值
     */

    private BigDecimal mtm;

    /**
     * 昨日市值
     */

    private BigDecimal ytdMtm;

    private BigDecimal exposure;


    private BigDecimal ytdExposure;

    /**
     * 买入损益
     */

    private BigDecimal buyPrftFv;

    /**
     * 卖出损益
     */

    private BigDecimal sellPrftFv;

    /**
     * 昨日持仓损益
     */

    private BigDecimal ytdPrftFv;

    /**
     * 当前行情
     */

    private BigDecimal curPrice;

    /**
     * 昨日收盘价
     */

    private BigDecimal ytdPrice;


    private String updateTime;


    /**
     * 清算日期
     */

    private String setDate;

    /**
     * 昨日持仓利息
     */

    private BigDecimal ai;

    /**
     * 当日单张应计利息
     */

    private BigDecimal todayAi;

    /**
     * 当日价差损益
     */

    private BigDecimal curPrftTrd;

    /**
     * 当日利息损益
     */

    private BigDecimal curPrftIrTrd;

    /**
     * 当日利息收入
     */

    private BigDecimal curPrftIrAi;

    /**
     * 昨日持仓的累计损益
     */

    private BigDecimal fPrftGross;




    private BigDecimal prftTrd;

    /**
     * 累计利息损益
     */

    private BigDecimal prftIrTrd;

    /**
     * 累计利息收入
     */

    private BigDecimal prftIrAi;

    /**
     * 累计浮盈
     */

    private BigDecimal prftFv;

    public String getBegDate() {
        return begDate;
    }

    public void setBegDate(String begDate) {
        this.begDate = begDate;
    }

    public String getSecuAcctId() {
        return secuAcctId;
    }

    public void setSecuAcctId(String secuAcctId) {
        this.secuAcctId = secuAcctId;
    }

    public String getExtraDim() {
        return extraDim;
    }

    public void setExtraDim(String extraDim) {
        this.extraDim = extraDim;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getiCode() {
        return iCode;
    }

    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public BigDecimal getRealVolume() {
        return realVolume;
    }

    public void setRealVolume(BigDecimal realVolume) {
        this.realVolume = realVolume;
    }

    public BigDecimal getRealCp() {
        return realCp;
    }

    public void setRealCp(BigDecimal realCp) {
        this.realCp = realCp;
    }

    public BigDecimal getCurBuyVolume() {
        return curBuyVolume;
    }

    public void setCurBuyVolume(BigDecimal curBuyVolume) {
        this.curBuyVolume = curBuyVolume;
    }

    public BigDecimal getCurBuyCp() {
        return curBuyCp;
    }

    public void setCurBuyCp(BigDecimal curBuyCp) {
        this.curBuyCp = curBuyCp;
    }

    public BigDecimal getCurSellVolume() {
        return curSellVolume;
    }

    public void setCurSellVolume(BigDecimal curSellVolume) {
        this.curSellVolume = curSellVolume;
    }

    public BigDecimal getCurSellCp() {
        return curSellCp;
    }

    public void setCurSellCp(BigDecimal curSellCp) {
        this.curSellCp = curSellCp;
    }

    public BigDecimal getMtm() {
        return mtm;
    }

    public void setMtm(BigDecimal mtm) {
        this.mtm = mtm;
    }

    public BigDecimal getYtdMtm() {
        return ytdMtm;
    }

    public void setYtdMtm(BigDecimal ytdMtm) {
        this.ytdMtm = ytdMtm;
    }

    public BigDecimal getBuyPrftFv() {
        return buyPrftFv;
    }

    public void setBuyPrftFv(BigDecimal buyPrftFv) {
        this.buyPrftFv = buyPrftFv;
    }

    public BigDecimal getSellPrftFv() {
        return sellPrftFv;
    }

    public void setSellPrftFv(BigDecimal sellPrftFv) {
        this.sellPrftFv = sellPrftFv;
    }

    public BigDecimal getYtdPrftFv() {
        return ytdPrftFv;
    }

    public void setYtdPrftFv(BigDecimal ytdPrftFv) {
        this.ytdPrftFv = ytdPrftFv;
    }

    public BigDecimal getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(BigDecimal curPrice) {
        this.curPrice = curPrice;
    }

    public BigDecimal getYtdPrice() {
        return ytdPrice;
    }

    public void setYtdPrice(BigDecimal ytdPrice) {
        this.ytdPrice = ytdPrice;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getExposure() {
        return exposure;
    }

    public void setExposure(BigDecimal exposure) {
        this.exposure = exposure ==null?BigDecimal.ZERO: exposure;
    }

    public BigDecimal getYtdExposure() {
        return ytdExposure;
    }

    public void setYtdExposure(BigDecimal ytdExposure) {
        this.ytdExposure = ytdExposure ==null? BigDecimal.ZERO: ytdExposure;
    }

    public String getSetDate() {
        return setDate;
    }

    public void setSetDate(String setDate) {
        this.setDate = setDate;
    }

    public BigDecimal getAi() {
        return ai;
    }

    public void setAi(BigDecimal ai) {
        this.ai = ai;
    }

    public BigDecimal getTodayAi() {
        return todayAi;
    }

    public void setTodayAi(BigDecimal todayAi) {
        this.todayAi = todayAi;
    }

    public BigDecimal getCurPrftTrd() {
        return curPrftTrd;
    }

    public void setCurPrftTrd(BigDecimal curPrftTrd) {
        this.curPrftTrd = curPrftTrd;
    }

    public BigDecimal getCurPrftIrTrd() {
        return curPrftIrTrd;
    }

    public void setCurPrftIrTrd(BigDecimal curPrftIrTrd) {
        this.curPrftIrTrd = curPrftIrTrd;
    }

    public BigDecimal getCurPrftIrAi() {
        return curPrftIrAi;
    }

    public void setCurPrftIrAi(BigDecimal curPrftIrAi) {
        this.curPrftIrAi = curPrftIrAi;
    }

    public BigDecimal getfPrftGross() {
        return fPrftGross;
    }

    public void setfPrftGross(BigDecimal fPrftGross) {
        this.fPrftGross = fPrftGross;
    }

    public BigDecimal getPrftTrd() {
        return prftTrd;
    }

    public void setPrftTrd(BigDecimal prftTrd) {
        this.prftTrd = prftTrd;
    }

    public BigDecimal getPrftIrTrd() {
        return prftIrTrd;
    }

    public void setPrftIrTrd(BigDecimal prftIrTrd) {
        this.prftIrTrd = prftIrTrd;
    }

    public BigDecimal getPrftIrAi() {
        return prftIrAi;
    }

    public void setPrftIrAi(BigDecimal prftIrAi) {
        this.prftIrAi = prftIrAi;
    }

    public BigDecimal getPrftFv() {
        return prftFv;
    }

    public void setPrftFv(BigDecimal prftFv) {
        this.prftFv = prftFv;
    }
}
