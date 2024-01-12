package com.TimedSend.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class DSingleStock implements Serializable {
    private static final long serialVersionUID = -1L;
    /**
     * 金融工具代码
     */
    @JSONField(name = "iCode")
    public String iCode;

    /**
     * 资产类型
     */
    @JSONField(name = "aType")
    public String aType;

    /**
     * 市场类型
     */
    @JSONField(name = "mType")
    public String mType;

    /**
     * L:多头
     S:空头
     */
    @JSONField(name = "extraDim")
    public String extraDim;

    /**
     * 币种
     */
    @JSONField(name = "currency")
    public String currency;

    /**
     * 账户
     */
    @JSONField(name = "secuAcctId")
    public String secuAcctId;

    /**
     * 持仓数量
     */
    @JSONField(name = "realVolume")
    public String realVolume;
    @JSONField(name = "realCP")
    public String realCP;
    @JSONField(name = "curBuyVolume")
    public String curBuyVolume;
    @JSONField(name = "curBuyCP")
    public String curBuyCP;
    @JSONField(name = "curSellVolume")
    public String curSellVolume;
    @JSONField(name = "curSellCP")
    public String curSellCP;

    @JSONField(name = "mtm")
    public String mtm;
    @JSONField(name = "ytdMtm")
    public String ytdMtm;
    @JSONField(name = "buyPrftFV")
    public String buyPrftFV;
    @JSONField(name = "sellPrftFV")
    public String sellPrftFV;
    @JSONField(name = "ytdPrftFV")
    public String ytdPrftFV;
    @JSONField(name = "curPrice")
    public String curPrice;
    @JSONField(name = "ytdPrice")
    public String ytdPrice;

    @JSONField(name = "updateTime")
    public String updateTime;
    @JSONField(name = "exposure")
    public String exposure;
    @JSONField(name = "ytdExposure")
    public String ytdExposure;


    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getYtdExposure() {
        return ytdExposure;
    }

    public void setYtdExposure(String ytdExposure) {
        this.ytdExposure = ytdExposure;
    }

    public String getIcode() {
        return iCode;
    }

    public void setIcode(String iCode) {
        this.iCode = iCode;
    }

    public String getAtype() {
        return aType;
    }

    public void setAtype(String aType) {
        this.aType = aType;
    }

    public String getMtype() {
        return mType;
    }

    public void setMtype(String mType) {
        this.mType = mType;
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

    public String getSecuAcctId() {
        return secuAcctId;
    }

    public void setSecuAcctId(String secuAcctId) {
        this.secuAcctId = secuAcctId;
    }

    public String getRealVolume() {
        return realVolume;
    }

    public void setRealVolume(String realVolume) {
        this.realVolume = realVolume;
    }

    public String getRealCP() {
        return realCP;
    }

    public void setRealCP(String realCP) {
        this.realCP = realCP;
    }

    public String getCurBuyVolume() {
        return curBuyVolume;
    }

    public void setCurBuyVolume(String curBuyVolume) {
        this.curBuyVolume = curBuyVolume;
    }

    public String getCurBuyCP() {
        return curBuyCP;
    }

    public void setCurBuyCP(String curBuyCP) {
        this.curBuyCP = curBuyCP;
    }

    public String getCurSellVolume() {
        return curSellVolume;
    }

    public void setCurSellVolume(String curSellVolume) {
        this.curSellVolume = curSellVolume;
    }

    public String getCurSellCP() {
        return curSellCP;
    }

    public void setCurSellCP(String curSellCP) {
        this.curSellCP = curSellCP;
    }

    public String getMtm() {
        return mtm;
    }

    public void setMtm(String mtm) {
        this.mtm = mtm;
    }

    public String getYtdMtm() {
        return ytdMtm;
    }

    public void setYtdMtm(String ytdMtm) {
        this.ytdMtm = ytdMtm;
    }

    public String getBuyPrftFV() {
        return buyPrftFV;
    }

    public void setBuyPrftFV(String buyPrftFV) {
        this.buyPrftFV = buyPrftFV;
    }

    public String getSellPrftFV() {
        return sellPrftFV;
    }

    public void setSellPrftFV(String sellPrftFV) {
        this.sellPrftFV = sellPrftFV;
    }

    public String getYtdPrftFV() {
        return ytdPrftFV;
    }

    public void setYtdPrftFV(String ytdPrftFV) {
        this.ytdPrftFV = ytdPrftFV;
    }

    public String getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(String curPrice) {
        this.curPrice = curPrice;
    }

    public String getYtdPrice() {
        return ytdPrice;
    }

    public void setYtdPrice(String ytdPrice) {
        this.ytdPrice = ytdPrice;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
