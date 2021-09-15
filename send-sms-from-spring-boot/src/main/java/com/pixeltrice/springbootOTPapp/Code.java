package com.pixeltrice.springbootOTPapp;

public class Code {
    int min = 1000;
    int max = 9999;

    int code = (int) (Math.random()*(max-min+1)+min);

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
