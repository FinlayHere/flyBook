package com.example.demo;

public class GetTokenRequestBody {
    /**
     * {
     *     "app_id": "cli_a07c7e13c7b8500e",
     *     "app_secret": "6pECIWjfjaNvcNPwkdspXdJsEfNQOZhw"
     * }
     */
    private String app_id;
    private String app_secret;

    public GetTokenRequestBody(String app_id, String app_secret) {
        this.app_id = app_id;
        this.app_secret = app_secret;
    }

    public GetTokenRequestBody() {
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApp_secret() {
        return app_secret;
    }

    public void setApp_secret(String app_secret) {
        this.app_secret = app_secret;
    }
}
