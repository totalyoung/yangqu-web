package com.yangqu.common.dao;

import java.util.List;

/**
 * Created by yangst on 2018/6/4.
 */
public interface Dao {


    <T>T get(int id);

    <T>List<T> findList(T t);



}
