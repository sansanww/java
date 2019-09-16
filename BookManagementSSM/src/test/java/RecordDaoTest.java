import com.ddu.dao.RecordDao;
import com.ddu.entity.Record;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RecordDaoTest extends BaseTest{

    @Autowired
    private RecordDao recordDao;

    @Test
    public void testAddRecord(){
        Record record=new Record();
        record.setFrequency(1);
        record.setHours(2);
        record.setName("三三");
        record.setPhoneNumber("18819461226");
        recordDao.addRecord(record);
    }
}
