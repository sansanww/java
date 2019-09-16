package com.it.service;

import com.it.entity.Gift;
import com.it.entity.Record;

public interface GiftService {
    Gift queryGift(int age, int gender, int style);
    void insertRecord(Record record);
}
