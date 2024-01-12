package com.TimedSend.model;

import java.io.Serializable;


public class TtrdOtcTradePublicSend implements Serializable {
    private static final long serialVersionUID = -1L;

    /**
     * 交易序号
     */
    public String sysordid;

    /**
     * 委托日期
     */
    public String orddate;

    /**
     * 结算日期
     */
    public String setdate;

    /**
     * 确认日期
     */
    public String condate;

    /**
     * 确认时间
     */
    public String contime;


    /**
     * 二级证券账户
     */
    public String secuAccid;

    private String secuExtAccid;

    /**
     * 币种
     */
    public String currency;

    /**
     * 交易类型
     */
    public String trdtype;

    /**
     * 金融工具代码
     */
    public String iCode;

    /**
     * SPT_BD:债券(国债、企业债、金融债、次级债券等,央行票据)
     * SPT_ABS:资产证券化产品(ABS、MBS、CDO)
     * SPT_CB:可转换债券
     * SPT_DB:债务
     * SPT_IBOR:同业拆借
     * SPT_IBDEPO:同业存款
     * SPT_C:现金
     * SPT_F1:封闭式基金
     * SPT_F2:开放式基金
     * SPT_F3:交易所交易基金
     * SPT_STG_1:期限套利
     * SPT_STG_2:跨期套利
     * SPT_PG:配股
     * SPT_IR:利率
     * SPT_CP:商业票据
     * SPT_DED:活期存款
     * SPT_NTD:通知存款(1天通知存款、7天通知存款)
     * SPT_TMD:定期存款(3个月、半年、1年、3年、5年)
     * SPT_NGD:协议存款(期限确定，利率协商确定的存款)
     * SPT_REPO:回购
     * SPT_XR:汇率
     */
    public String aType;

    /**
     * XSHG: 上交所
     * XSHE:深交所
     * X_CNFFEX;中金所
     * X_CNBD;银行间
     */
    public String mType;

    /**
     * 金融工具名称
     */
    public String iName;

    /**
     * 交易数量（应收本金）
     */
    public String ordcount;

    /**
     * 交易价格
     */
    public String ordprice;

    /**
     * 交易金额
     */
    public String ordamount;

    /**
     * 净价金额
     */

    public  String bnd_netprice;

    /**
     * 应计利息
     */

    public  String bnd_aiamount;


    public String getCondate() {
        return condate;
    }

    public void setCondate(String condate) {
        this.condate = condate;
    }

    public String getContime() {
        return contime;
    }

    public void setContime(String contime) {
        this.contime = contime;
    }

    public String getSecuAccid() {
        return secuAccid;
    }

    public void setSecuAccid(String secuAccid) {
        this.secuAccid = secuAccid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTrdtype() {
        return trdtype;
    }

    public void setTrdtype(String trdtype) {
        this.trdtype = trdtype;
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

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getSysordid() {
        return sysordid;
    }

    public void setSysordid(String sysordid) {
        this.sysordid = sysordid;
    }

    public String getOrdcount() {
        return ordcount;
    }

    public void setOrdcount(String ordcount) {
        this.ordcount = ordcount;
    }

    public String getOrdprice() {
        return ordprice;
    }

    public void setOrdprice(String ordprice) {
        this.ordprice = ordprice;
    }

    public String getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(String ordamount) {
        this.ordamount = ordamount;
    }

    public String getOrddate() {
        return orddate;
    }

    public void setOrddate(String orddate) {
        this.orddate = orddate;
    }

    public String getSetdate() {
        return setdate;
    }

    public void setSetdate(String setdate) {
        this.setdate = setdate;
    }

    public String getBnd_netprice() {
        return bnd_netprice;
    }

    public void setBnd_netprice(String bnd_netprice) {
        this.bnd_netprice = bnd_netprice;
    }

    public String getBnd_aiamount() {
        return bnd_aiamount;
    }

    public void setBnd_aiamount(String bnd_aiamount) {
        this.bnd_aiamount = bnd_aiamount;
    }

    public String getSecuExtAccid() {
        return secuExtAccid;
    }

    public void setSecuExtAccid(String secuExtAccid) {
        this.secuExtAccid = secuExtAccid;
    }
}
