package cn.it.service.impl;
//StudentService的实现类
import cn.it.dao.StudentDao;
import cn.it.entity.Student;
import cn.it.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    public int getTotal(){
        return studentDao.getTotal();
    }

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void deleteStudent(int id){
        studentDao.deleteStudent(id);
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    public Student getStudent(int id){
        return studentDao.getStudent(id);
    }

    public List<Student> list(int start, int count){
        return studentDao.list(start,count);
    }
}
