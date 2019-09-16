package com.it.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")

public class GiftDaoTest {

    @Autowired
    GiftDao giftDao;
    @Test
    public void queryGift() {
        System.out.println(giftDao.queryGift(1,1,1));
    }
}