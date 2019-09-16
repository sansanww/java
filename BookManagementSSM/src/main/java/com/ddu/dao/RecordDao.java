package com.ddu.dao;

import com.ddu.entity.Record;
import org.apache.ibatis.annotations.Param;

public interface RecordDao {
    void addRecord(@Param("record") Record record);
}
