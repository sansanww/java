package com.ddu.service.impl;

import com.ddu.dao.RecordDao;
import com.ddu.entity.Record;
import com.ddu.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;

    @Override
    public void addRecord(Record record) {
        recordDao.addRecord(record);
    }
}
