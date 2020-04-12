package com.zhihao.miao.bean;

import org.springframework.stereotype.Component;

/**
 * 用户类
 *
 * @author yiyh
 */
@Component
public class User {

    private String username = "zhihao.miao";
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
