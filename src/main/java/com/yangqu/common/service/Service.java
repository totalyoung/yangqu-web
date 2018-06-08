package com.yangqu.common.service;

import java.util.List;

/**
 * Created by yangst on 2018/6/4.
 */
public interface Service {

    <T>T get(int id);

    <T>List<T> findList(T t);
}
