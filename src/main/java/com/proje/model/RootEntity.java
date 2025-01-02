package com.proje.model;

public class RootEntity<T> {
    private boolean result;

    private String errorMessage;

    private T data;

    public static <T>RootEntity<T> ok(T data){

        RootEntity<T>rootEntity=new RootEntity<>();
        rootEntity.setData(data);
        rootEntity.setResult(true);
        rootEntity.setErrorMessage(null);

        return rootEntity;
    }

    public static <T>RootEntity<T> error(String errorMessage){

        RootEntity<T>rootEntity=new RootEntity<>();
        rootEntity.setData(null);
        rootEntity.setErrorMessage(errorMessage);
        rootEntity.setResult(false);

        return rootEntity;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
