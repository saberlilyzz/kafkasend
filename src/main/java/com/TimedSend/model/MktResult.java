package com.TimedSend.model;

import java.util.List;

public class MktResult {
    private static final long serialVersionUID = 1L;
    public  String  errorCode;
    public  String  errorMsg;

    public List<MktContent> content;

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

    public List<MktContent> getContent() {
        return content;
    }

    public void setContent(List<MktContent> content) {
        this.content = content;
    }
}
