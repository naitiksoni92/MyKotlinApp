package com.example.soninait.mykotlinapp;

public class IntentServiceResult {

    int mResult;
    String mResultValue;
    Object obj;

    public IntentServiceResult(int resultCode, String resultValue) {
        mResult = resultCode;
        mResultValue = resultValue;
    }

    public IntentServiceResult(int resultCode, Object resultValue) {
        mResult = resultCode;
        obj = resultValue;
    }

    public int getResult() {
        return mResult;
    }

    public String getResultValue() {
        return mResultValue;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}