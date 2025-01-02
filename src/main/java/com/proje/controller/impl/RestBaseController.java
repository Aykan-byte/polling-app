package com.proje.controller.impl;

import com.proje.controller.IRestBaseController;
import com.proje.model.RootEntity;

public class RestBaseController implements IRestBaseController {
    public <T> RootEntity<T> ok(T data){

        return RootEntity.ok(data);
    }
    public <T>RootEntity<T>error(String errorMessage){

        return RootEntity.error(errorMessage);
    }
}
