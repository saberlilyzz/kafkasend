package com.TimedSend.model;

import java.math.BigDecimal;

public class hjAndIdxLevel {

    private static final long serialVersionUID = 1L;

    /**
     * WIND代码
     */

    private String wind_code;

    /**
     * 成交量
     */

    private BigDecimal rt_vol;

    /**
     * 成交金额
     */

    private BigDecimal rt_amt;

    /**
     * 最新成交价
     */

    private BigDecimal rt_latest;

    /**
     * 今开
     */

    private BigDecimal rt_open;

    /**
     * 最低
     */

    private BigDecimal rt_low;

    /**
     * 均价
     */

    private BigDecimal rt_vwap;

    /**
     * 日期
     */

    private String rt_date;

    /**
     * 时间
     */

    private String rt_time;


    private  int  sec_type;

    public String getWind_code() {
        return wind_code;
    }

    public void setWind_code(String wind_code) {
        this.wind_code = wind_code;
    }

    public BigDecimal getRt_vol() {
        return rt_vol;
    }

    public void setRt_vol(BigDecimal rt_vol) {
        this.rt_vol = rt_vol;
    }

    public BigDecimal getRt_amt() {
        return rt_amt;
    }

    public void setRt_amt(BigDecimal rt_amt) {
        this.rt_amt = rt_amt;
    }

    public BigDecimal getRt_latest() {
        return rt_latest;
    }

    public void setRt_latest(BigDecimal rt_latest) {
        this.rt_latest = rt_latest;
    }

    public BigDecimal getRt_open() {
        return rt_open;
    }

    public void setRt_open(BigDecimal rt_open) {
        this.rt_open = rt_open;
    }

    public BigDecimal getRt_low() {
        return rt_low;
    }

    public void setRt_low(BigDecimal rt_low) {
        this.rt_low = rt_low;
    }

    public BigDecimal getRt_vwap() {
        return rt_vwap;
    }

    public void setRt_vwap(BigDecimal rt_vwap) {
        this.rt_vwap = rt_vwap;
    }

    public String getRt_date() {
        return rt_date;
    }

    public void setRt_date(String rt_date) {
        this.rt_date = rt_date;
    }

    public String getRt_time() {
        return rt_time;
    }

    public void setRt_time(String rt_time) {
        this.rt_time = rt_time;
    }

    public int getSec_type() {
        return sec_type;
    }

    public void setSec_type(int sec_type) {
        this.sec_type = sec_type;
    }
}
