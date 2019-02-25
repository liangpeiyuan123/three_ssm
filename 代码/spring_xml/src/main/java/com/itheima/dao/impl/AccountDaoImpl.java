package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {

    //在课程中用的是 DBUtils/QueryRunner  和我们的  JdbcTemplate 作用完全一样

    JdbcTemplate jt ;             //       = new JdbcTemplate(JdbcUtils.getDateSource())

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public List<Account> findAll() {
        String sql = "select * from account";
        List<Account> query = jt.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        return query;
    }

    public void save(Account account) {
        String sql = "insert into account (name,money) values (?,?)";
        jt.update(sql,account.getName(),account.getMoney());
    }

    public Account findById(int id) {
        String sql = "select * from account where id = ?";
        try{

            Account a = jt.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class),id);
            return a;
        }catch (Exception e){
            return null;
        }
    }
}
