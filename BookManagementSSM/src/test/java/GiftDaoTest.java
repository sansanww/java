import com.ddu.dao.GiftDao;
import com.ddu.entity.Gift;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GiftDaoTest extends BaseTest{
    @Autowired
    private GiftDao giftDao;

    @Test
    public void testQueryGiftById(){
        Gift gift=giftDao.queryGiftById(1);
        System.out.println(gift);

    }
}
