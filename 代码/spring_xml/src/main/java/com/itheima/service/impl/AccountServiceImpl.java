package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.domain.Account;
import com.itheima.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao ;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public Account findById(int id) {
        return accountDao.findById(id);
    }
}
