package com.techno.model;

public class AuthenticateionResponse {
    private String jwt;

    public AuthenticateionResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
