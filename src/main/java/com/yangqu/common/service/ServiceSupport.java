package com.yangqu.common.service;

import com.yangqu.common.dao.Dao;


import java.util.List;

/**
 * Created by yangst on 2018/6/4.
 */

public abstract class ServiceSupport implements Service{

    protected abstract Dao getDao();

    @Override
    public <T>T get(int id) {
        return getDao().get(id);
    }

    @Override
    public <T>List<T> findList(T t) {
        return getDao().findList(t);
    }
}
