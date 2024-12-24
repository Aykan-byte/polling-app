package com.proje.controller;

import com.proje.model.RootEntity;

public interface IRestBaseController {

    public <T> RootEntity<T> ok(T data);

    public <T>RootEntity<T>error(String errorMessage);

}
