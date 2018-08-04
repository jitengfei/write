package com.c4.write.provider.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestConfigBean {
    @Value("${document}")
    private String document;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "TestConfigBean{" +
                "document='" + document + '\'' +
                '}';
    }
}
