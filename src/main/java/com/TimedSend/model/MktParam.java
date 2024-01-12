package com.TimedSend.model;

import java.util.List;

public class MktParam {
    private static final long serialVersionUID = 1L;

    public List<String> instrumentID;
    public String peCode;
    public String calcDate;
    public String calcTime;
    public String calcTimeMode;
    public String isInsertDB;
    public String content;

    public List<String> getInstrumentID() {
        return instrumentID;
    }

    public void setInstrumentID(List<String> instrumentID) {
        this.instrumentID = instrumentID;
    }

    public String getPeCode() {
        return peCode;
    }

    public void setPeCode(String peCode) {
        this.peCode = peCode;
    }

    public String getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(String calcDate) {
        this.calcDate = calcDate;
    }

    public String getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(String calcTime) {
        this.calcTime = calcTime;
    }

    public String getCalcTimeMode() {
        return calcTimeMode;
    }

    public void setCalcTimeMode(String calcTimeMode) {
        this.calcTimeMode = calcTimeMode;
    }

    public String getIsInsertDB() {
        return isInsertDB;
    }

    public void setIsInsertDB(String isInsertDB) {
        this.isInsertDB = isInsertDB;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
