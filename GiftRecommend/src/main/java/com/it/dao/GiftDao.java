package com.it.dao;

import com.it.entity.Gift;
import org.apache.ibatis.annotations.Param;

public interface GiftDao {
    //通过年龄、性别和风格查询礼物
    Gift queryGift(@Param("age") int age, @Param("gender") int gender, @Param("style") int style);
}
