package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfoResponse {
    public UserInfoData getData() {
        return data;
    }

    public void setData(UserInfoData data) {
        this.data = data;
    }

    public UserInfoResponse() {
    }

    public UserInfoResponse(UserInfoData data) {
        this.data = data;
    }

    private UserInfoData data;
}
