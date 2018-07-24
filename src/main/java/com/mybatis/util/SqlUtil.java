package com.mybatis.util;

import com.mybatis.util.domain.SqlName;

public class SqlUtil extends SqlHelper {

    public String list(Class<?> clazz) {
        System.err.println(getName(clazz));
        String sql = "select * from user";
        String.format(sql, getName(clazz).getTableName());
        System.err.println(sql);
        return sql;
    }

    public SqlName getName(Class<?> clazz) {
        SqlName sqlName = new SqlName();
        sqlName.setTableName(getTableName(clazz));
        return sqlName;
    }

}
