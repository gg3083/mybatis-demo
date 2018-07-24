package com.mybatis.util;

import javax.persistence.Table;

public class SqlHelper {

    public String getTableName( Class<?> clazz) {
        System.err.println(clazz.getAnnotation(Table.class));
        return clazz.getName();
    }
}
