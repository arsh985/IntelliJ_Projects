package com.spring.thirdjdbcApp.mapper;

import com.spring.thirdjdbcApp.model.Home1;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {

        Home1 h = new Home1();

        h.setHid(resultSet.getInt(1));
        h.setHname(resultSet.getString(2)+"   S H A I K H");
        h.setHmail(resultSet.getString(3));
        h.setHaddr(resultSet.getString(4));

        return h;
    }
}
