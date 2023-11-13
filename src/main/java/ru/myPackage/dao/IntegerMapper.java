package ru.myPackage.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

public class IntegerMapper implements RowMapper<AtomicInteger> {
    @Override
    public AtomicInteger mapRow(ResultSet rs, int rowNum) throws SQLException {
        AtomicInteger integer = new AtomicInteger(rs.getInt(1));

        return integer;
    }
}
