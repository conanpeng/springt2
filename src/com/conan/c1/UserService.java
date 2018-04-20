package com.conan.c1;

import org.springframework.stereotype.Service;

/**
 * @author huangjinsheng on 2017/11/9.
 */
@Service
public class UserService {
    public UserService(){
        System.out.println("UserService..................");
    }

    private String userId = "t1";

    public String getName() {
        return "tttt_name";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
