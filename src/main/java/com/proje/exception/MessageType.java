package com.proje.exception;

public enum MessageType {

    USERNAME_OR_PASSWORD("01","KULLANICI ADI VEYA ŞİFRE YANLIŞ"),
    NO_USERNAME("02","KULLANICI ADINIZI GİRİNİZ"),
    NO_PASSWORD("03","ŞİFRENİZİ GİRİNİZ");


    private String code;
    private String message;

    MessageType(String code, String message) {
        this.code= code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
