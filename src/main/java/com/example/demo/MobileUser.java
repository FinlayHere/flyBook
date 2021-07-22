package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static com.example.demo.Controller.PHONE;

public class MobileUser {
    public List<MobileRecord> getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(List<MobileRecord> phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public MobileUser() {
    }

    public MobileUser(List<MobileRecord> phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @JsonProperty(PHONE)
    private List<MobileRecord> PhoneNumber;
}
