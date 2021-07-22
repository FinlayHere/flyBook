package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class Controller {
    private final static String APP_ID = "cli_a073c23f09f8d00b";
    private final static String APP_SECRET = "7N0d0CIV7oPzrIJkiatBRbLTVsVC1Jj7";
    private final static String APP_VERIFICATION_TOKEN = "SELi11A8OKoEeuXwwCwPTcweFaZFBGWA";
    public final static String PHONE = "18092096633";
    @Autowired
    private Client client;


    @GetMapping("/hello")
    public String hello() {
        return "Hello Austin!";
    }

    @GetMapping("/send-message")
    public Object getToken() {
        TokenResponse response = client.getToken(new GetTokenRequestBody(APP_ID, APP_SECRET));
        String token = response.getTenant_access_token();
        String openId = client.getUserInfo(PHONE, "Bearer " + token).getData().getMobile_users().getPhoneNumber().get(0).getOpen_id();
        return client.sendMessage("Bearer "+ token, new SendMessageRequest(openId, "text", new MsgContent("Hello 123")));
    }

    @PostMapping("/ckeck")
    public Object test(@RequestBody Object object) {
        System.out.print(object);
        return object;
    }
}
