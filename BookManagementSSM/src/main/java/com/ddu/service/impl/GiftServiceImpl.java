package com.ddu.service.impl;

import com.ddu.dao.GiftDao;
import com.ddu.entity.Gift;
import com.ddu.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GiftServiceImpl implements GiftService {
    @Autowired
    private GiftDao giftDao;

    @Override
    public Gift queryGiftById(int giftId) {
        return  giftDao.queryGiftById(giftId);
    }
}
