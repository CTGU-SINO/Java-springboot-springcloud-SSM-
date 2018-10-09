package com.ctgu.spring.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;


import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {

    private ApplicationContext cxt = new ClassPathXmlApplicationContext("bean-jdbc.xml");
    private JdbcTemplate jdbcTemplate = (JdbcTemplate) cxt.getBean("jdbcTemplate");
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) cxt.getBean("namedParameterJdbcTemplate");

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = (DataSource) cxt.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }

//    @Test
//    public void testUpdate() {
//        String sql = "UPDATE USER SET age = ? WHERE id = ?";
//        jdbcTemplate.update(sql, 21, 1);
//    }

    @Test
    public void testUpdate1() {
        String sql = "UPDATE USER SET age = :age WHERE id = :id";
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("age", 21);
        paramMap.put("id", 2);
        namedParameterJdbcTemplate.update(sql, paramMap);
    }

    @Test
    public void testInsert() {
        String sql = "INSERT INTO USER(username,age,phone,email) VALUES(:username,:age,:phone,:email)";
        User user = new User();
        user.setUsername("hh");
        user.setAge(23);
        user.setPhone("1234567");
        user.setEmail("111@163.com");
        SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
        namedParameterJdbcTemplate.update(sql, paramSource);
    }

    /*@Test
    public void testBatchInsert() {
        String sql = "INSERT INTO USER(username,age,phone,email) VALUES (?,?,?,?)";
        List<Object[]> batchArgs = new ArrayList<Object[]>();
        for (int i = 0; i < 10; i++) {
            batchArgs.add(new Object[]{"ct" + i, 20, "12345678901", "111@qq.com"});
        }
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }*/

    @Test
    public void testQuery() {
        String sql = "SELECT * FROM USER WHERE id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        User user = jdbcTemplate.queryForObject(sql, rowMapper, 1);
        System.out.println(user);
    }

    @Test
    public void testQueryForList() {
        String sql = "SELECT * FROM USER WHERE id > ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        List<User> users = jdbcTemplate.query(sql, rowMapper, 1);
        System.out.println(users);
    }
}
