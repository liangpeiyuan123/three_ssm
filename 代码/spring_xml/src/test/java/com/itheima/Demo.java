package com.itheima;

import com.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {


    @Test
    public void findAllTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AccountService service = (AccountService) context.getBean("service");

        List<Account> list = service.findAll();

        for (Account account : list) {
            System.out.println(account);
        }
    }
}
