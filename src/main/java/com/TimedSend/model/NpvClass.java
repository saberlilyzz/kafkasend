package com.TimedSend.model;

public class NpvClass {
    private static final long serialVersionUID = 1L;
    public String  type;
    public String  id;
    public String  date;
    public String  time;
    public NpvBody  body;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public NpvBody getBody() {
        return body;
    }

    public void setBody(NpvBody body) {
        this.body = body;
    }
}
