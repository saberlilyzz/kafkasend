package com.TimedSend.model;

import java.util.List;

public class MktContent {
    private static final long serialVersionUID = 1L;

    public  String matrixID;
    public List<MtkMatrixData> datas;

    public String getMatrixID() {
        return matrixID;
    }

    public void setMatrixID(String matrixID) {
        this.matrixID = matrixID;
    }

    public List<MtkMatrixData> getDatas() {
        return datas;
    }

    public void setDatas(List<MtkMatrixData> datas) {
        this.datas = datas;
    }
}
