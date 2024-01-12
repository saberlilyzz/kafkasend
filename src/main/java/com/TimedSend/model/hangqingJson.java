package com.TimedSend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class hangqingJson {

    class Param {
        @JsonProperty("instrumentID")
        private List<String> instrumentID;

        @JsonProperty("peCode")
        private String peCode;

        @JsonProperty("calcDate")
        private String calcDate;

        @JsonProperty("calcTime")
        private String calcTime;

        @JsonProperty("calcTimeMode")
        private String calcTimeMode;

        @JsonProperty("isInsertDB")
        private String isInsertDB;

        @JsonProperty("content")
        private String content;

        // Getters and setters
    }

    class Result {
        @JsonProperty("errorCode")
        private String errorCode;

        @JsonProperty("errorMsg")
        private String errorMsg;

        @JsonProperty("content")
        private List<Content> content;

        // Getters and setters
    }

    class Content {
        @JsonProperty("npv")
        private String npv;

        // Getter and setter
    }

    class Body {
        @JsonProperty("param")
        private Param param;

        @JsonProperty("result")
        private Result result;

        // Getters and setters
    }

    class Data {
        @JsonProperty("type")
        private String type;

        @JsonProperty("id")
        private String id;

        @JsonProperty("date")
        private String date;

        @JsonProperty("time")
        private String time;

        @JsonProperty("body")
        private Body body;

        // Getters and setters
    }
}
