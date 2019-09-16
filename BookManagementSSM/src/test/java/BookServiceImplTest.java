import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ddu.dto.AppointExecution;
import com.ddu.service.BookService;

public class BookServiceImplTest extends BaseTest{

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception{
        long bookId = 1001;
        long studentId = 1234567890L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}