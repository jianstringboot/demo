package com.example.demo.data.service;

import com.example.demo.data.IServiceData;

public class ServiceData <D extends IServiceData>{

    private String code;

    private D data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IServiceData{" +
                "code='" + code + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
