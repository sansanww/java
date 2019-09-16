package com.ddu.dao;

import com.ddu.entity.Gift;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized;

public interface GiftDao {
    Gift queryGiftById(@Param("giftId") int giftId);
}
