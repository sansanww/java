package com.it.dao;

import com.it.entity.Gift;
import com.it.entity.Record;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class RecordDaoTest {

    @Autowired
    RecordDao recordDao;
    @Autowired
    GiftDao giftDao;

    @Test
    public void insertReocrd() {
        Record record=new Record();
        Gift gift=giftDao.queryGift(1,1,1);
        record.setCustomerId("111");
        record.setGift(gift);
        recordDao.insertRecord(record);
    }
}