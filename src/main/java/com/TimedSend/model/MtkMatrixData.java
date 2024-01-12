package com.TimedSend.model;

import java.math.BigDecimal;

public class MtkMatrixData {

    private static final long serialVersionUID = 1L;

    public  String I_CODE;
    public  String A_TYPE;
    public  String M_TYPE;
    public  String PE_CODE;
    public  String TG_CODE;
    public  String BEG_DATE;
    public  String EFFECT_TIME;
    public  String EFFECT_MSEC;
    public  BigDecimal MK_ACCRUAL_0;
    public  BigDecimal MK_ACCRUAL_1;
    public  BigDecimal MK_TPRICE;
    public  String MK_MTR_DATE;
    public  String IMP_TIME;

    public String getI_CODE() {
        return I_CODE;
    }

    public void setI_CODE(String i_CODE) {
        I_CODE = i_CODE;
    }

    public String getA_TYPE() {
        return A_TYPE;
    }

    public void setA_TYPE(String a_TYPE) {
        A_TYPE = a_TYPE;
    }

    public String getM_TYPE() {
        return M_TYPE;
    }

    public void setM_TYPE(String m_TYPE) {
        M_TYPE = m_TYPE;
    }

    public String getPE_CODE() {
        return PE_CODE;
    }

    public void setPE_CODE(String PE_CODE) {
        this.PE_CODE = PE_CODE;
    }

    public String getTG_CODE() {
        return TG_CODE;
    }

    public void setTG_CODE(String TG_CODE) {
        this.TG_CODE = TG_CODE;
    }

    public String getBEG_DATE() {
        return BEG_DATE;
    }

    public void setBEG_DATE(String BEG_DATE) {
        this.BEG_DATE = BEG_DATE;
    }

    public String getEFFECT_TIME() {
        return EFFECT_TIME;
    }

    public void setEFFECT_TIME(String EFFECT_TIME) {
        this.EFFECT_TIME = EFFECT_TIME;
    }

    public String getEFFECT_MSEC() {
        return EFFECT_MSEC;
    }

    public void setEFFECT_MSEC(String EFFECT_MSEC) {
        this.EFFECT_MSEC = EFFECT_MSEC;
    }

    public BigDecimal getMK_ACCRUAL_0() {
        return MK_ACCRUAL_0;
    }

    public void setMK_ACCRUAL_0(BigDecimal MK_ACCRUAL_0) {
        this.MK_ACCRUAL_0 = MK_ACCRUAL_0;
    }

    public BigDecimal getMK_ACCRUAL_1() {
        return MK_ACCRUAL_1;
    }

    public void setMK_ACCRUAL_1(BigDecimal MK_ACCRUAL_1) {
        this.MK_ACCRUAL_1 = MK_ACCRUAL_1;
    }

    public BigDecimal getMK_TPRICE() {
        return MK_TPRICE;
    }

    public void setMK_TPRICE(BigDecimal MK_TPRICE) {
        this.MK_TPRICE = MK_TPRICE;
    }

    public String getMK_MTR_DATE() {
        return MK_MTR_DATE;
    }

    public void setMK_MTR_DATE(String MK_MTR_DATE) {
        this.MK_MTR_DATE = MK_MTR_DATE;
    }

    public String getIMP_TIME() {
        return IMP_TIME;
    }

    public void setIMP_TIME(String IMP_TIME) {
        this.IMP_TIME = IMP_TIME;
    }
}
