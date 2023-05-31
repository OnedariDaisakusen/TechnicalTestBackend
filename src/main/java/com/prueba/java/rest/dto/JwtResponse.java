package com.prueba.java.rest.dto;

public class JwtResponse {
    private String token;
    private String iat;
    private String exp;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIat() {
        return iat;
    }

    public void setIat(String iat) {
        this.iat = iat;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public JwtResponse(String token, String iat, String exp) {
        this.token = token;
        this.iat = iat;
        this.exp = exp;
    }
}
