package com.TimedSend.model;

public class NpvResult {
    private static final long serialVersionUID = 1L;
    public  String  errorCode;
    public  String  errorMsg;

    public  NpvContent content;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public NpvContent getContent() {
        return content;
    }

    public void setContent(NpvContent content) {
        this.content = content;
    }
}
