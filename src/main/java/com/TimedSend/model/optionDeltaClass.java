package com.TimedSend.model;

import org.apache.kafka.common.protocol.types.Field;

import java.math.BigDecimal;

public class optionDeltaClass {
    private static final long serialVersionUID = 1L;
    /**
    * {
"wind_code":"CU2307C56000.SHF",
"sec_type":"4",
"rt_delta":0.8506,
"rt_date":20230516.0,
"rt_time":151936.0
},*/
    String wind_code;
    String sec_type;
    BigDecimal rt_delta;
    String rt_date;
    String rt_time;

    public String getWind_code() {
        return wind_code;
    }

    public void setWind_code(String wind_code) {
        this.wind_code = wind_code;
    }

    public String getSec_type() {
        return sec_type;
    }

    public void setSec_type(String sec_type) {
        this.sec_type = sec_type;
    }

    public BigDecimal getRt_delta() {
        return rt_delta;
    }

    public void setRt_delta(BigDecimal rt_delta) {
        this.rt_delta = rt_delta;
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
}
