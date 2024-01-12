package com.TimedSend.model;

public class MktBody {
    private static final long serialVersionUID = 1L;
    public MktParam param;
    public MktResult result;

    public MktParam getParam() {
        return param;
    }

    public void setParam(MktParam param) {
        this.param = param;
    }

    public MktResult getResult() {
        return result;
    }

    public void setResult(MktResult result) {
        this.result = result;
    }
}
