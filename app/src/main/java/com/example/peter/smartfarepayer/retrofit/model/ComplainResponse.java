package com.example.peter.smartfarepayer.retrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ComplainResponse {

    @SerializedName("result_msg")
    @Expose
    private String resultMsg;
    @SerializedName("authorization")
    @Expose
    private String authorization;

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

}