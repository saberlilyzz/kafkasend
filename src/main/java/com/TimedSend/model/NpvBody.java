package com.TimedSend.model;

public class NpvBody {
    private static final long serialVersionUID = 1L;
    public  NpvParam  param;
    public  NpvResult  result;

    public NpvParam getParam() {
        return param;
    }

    public void setParam(NpvParam param) {
        this.param = param;
    }

    public NpvResult getResult() {
        return result;
    }

    public void setResult(NpvResult result) {
        this.result = result;
    }
}
