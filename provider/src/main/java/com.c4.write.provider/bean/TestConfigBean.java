package com.c4.write.provider.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestConfigBean {
    @Value("${password}")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestConfigBean{" +
                "password='" + password + '\'' +
                '}';
    }
}
