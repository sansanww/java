package com.ddu.service.impl;

import com.ddu.dao.AppointmentDao;
import com.ddu.dao.BookDao;
import com.ddu.dto.AppointExecution;
import com.ddu.entity.Appointment;
import com.ddu.entity.Book;
import com.ddu.enums.AppointStateEnum;
import com.ddu.exception.AppointException;
import com.ddu.exception.NoNumberException;
import com.ddu.exception.RepeatAppointException;
import com.ddu.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll(0,1000);
    }

    @Override
    @Transactional
    public AppointExecution appoint(long bookId, long studentId) {
        try{
            //减库存
            int update = bookDao.reduceNumber(bookId);
            if(update<=0){
                throw new NoNumberException("no number");
            }else{
                //执行预约操作
                int insert=appointmentDao.insertAppointment(bookId,studentId);
                if(insert<=0){
                    //重复预约
                    throw new RepeatAppointException("repeat appoint");
                }else{
                    //预约成功
                    Appointment appointment=appointmentDao.queryByKeyWithBook(bookId,studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS,appointment);
                }

            }
        }catch(NoNumberException e1){
            throw e1;
        }catch(RepeatAppointException e2){
            throw e2;
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            //所有编译器异常转化为运行期异常
            throw new AppointException("appoint inner error:"+e.getMessage());
        }

    }


}
