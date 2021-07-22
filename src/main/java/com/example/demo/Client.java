package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "flyBook", url = "https://open.feishu.cn/open-apis")
public interface Client {

    @PostMapping("/auth/v3/tenant_access_token/internal")
    TokenResponse getToken(@RequestBody GetTokenRequestBody body);

    @GetMapping("/user/v1/batch_get_id")
    UserInfoResponse getUserInfo(@RequestParam("mobiles") String phoneNumber, @RequestHeader("Authorization") String token);

    @PostMapping("/message/v4/send")
    Object sendMessage(@RequestHeader("Authorization") String token, @RequestBody SendMessageRequest request);

}
