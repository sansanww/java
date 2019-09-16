package com.it.dao;

import com.it.entity.Record;
import org.apache.ibatis.annotations.Param;

public interface RecordDao {
    //插入一条记录
    void insertRecord(@Param("record") Record record);
}
