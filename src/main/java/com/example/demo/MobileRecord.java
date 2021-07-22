package com.example.demo;

public class MobileRecord {
    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public MobileRecord() {
    }

    public MobileRecord(String open_id, String user_id) {
        this.open_id = open_id;
        this.user_id = user_id;
    }

    private String open_id;
    private String user_id;
}
