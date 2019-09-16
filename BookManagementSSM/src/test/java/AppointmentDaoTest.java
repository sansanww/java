import com.ddu.dao.AppointmentDao;
import com.ddu.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest extends BaseTest{
    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() throws Exception{
        long bookId=1000;
        long studentId = 1243658709L;
        int insert=appointmentDao.insertAppointment(bookId,studentId);
        System.out.println("insert="+insert);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception{
        long bookId=1000;
        long studentId=1243658709L;
        Appointment appointment=appointmentDao.queryByKeyWithBook(bookId,studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }
}
