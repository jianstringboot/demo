package com.example.demo.data.error;

import com.example.demo.data.IServiceData;

public class ErrorData implements IServiceData {
    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "ErrorData{" +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
