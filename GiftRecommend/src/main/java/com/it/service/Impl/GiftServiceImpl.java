package com.it.service.Impl;

import com.it.dao.GiftDao;
import com.it.dao.RecordDao;
import com.it.service.GiftService;
import com.it.entity.Gift;
import com.it.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftServiceImpl implements GiftService {
    @Autowired
    GiftDao giftDao;
    @Autowired
    RecordDao recordDao;

    //通过年龄、性别和风格查询礼物
    @Override
    public Gift queryGift(int age, int gender, int style) {
        return giftDao.queryGift(age,gender,style);
    }

    //插入一条记录
    @Override
    public void insertRecord(Record record) {
        recordDao.insertRecord(record);
    }
}
