package com.example.demo;

public class UserInfoData {
//     "mobile_users": {
//     *             "18092096633": [
//     *                 {
//     *                     "open_id": "ou_04af95c85483238d3b680728726116e8",
//     *                     "user_id": "1ag316a8"
//                    *                 }
//     *             ]
//     *         },
    private MobileUser mobile_users;

    public MobileUser getMobile_users() {
        return mobile_users;
    }

    public void setMobile_users(MobileUser mobile_users) {
        this.mobile_users = mobile_users;
    }

    public UserInfoData() {
    }

    public UserInfoData(MobileUser mobile_users) {
        this.mobile_users = mobile_users;
    }
}
