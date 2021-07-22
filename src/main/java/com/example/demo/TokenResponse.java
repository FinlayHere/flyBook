package com.example.demo;

public class TokenResponse {
    public TokenResponse(Integer code, Integer expire, String msg, String tenant_access_token) {
        this.code = code;
        this.expire = expire;
        this.msg = msg;
        this.tenant_access_token = tenant_access_token;
    }

    public TokenResponse() {
    }

    private Integer code;
    private Integer expire;
    private String msg;
    private String tenant_access_token;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTenant_access_token() {
        return tenant_access_token;
    }

    public void setTenant_access_token(String tenant_access_token) {
        this.tenant_access_token = tenant_access_token;
    }
}
