package com.itheima.dao;

import com.domain.Account;
import java.util.List;

public interface AccountDao {

    //查询所有
    List<Account> findAll();

    //保存信息
    void save(Account account);


    //按id查询一个
    Account findById(int id);
}
