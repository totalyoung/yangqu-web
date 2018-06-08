package com.yangqu.datasource;

/**
 * Created by yangst on 2018/6/7.
 */

public class DatabaseTypeHolder {

    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void putDatabaseType(String name) {
        holder.set(name);
    }

    public static String getDatabaseType() {
        return holder.get();
    }
}
