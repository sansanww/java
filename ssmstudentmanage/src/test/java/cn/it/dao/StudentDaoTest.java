package cn.it.dao;

import cn.it.dao.StudentDao;
import cn.it.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 配置spring和junit整合,junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")


public class StudentDaoTest {
    //注入Dao实现类依赖
    @Autowired
    private StudentDao studentDao;

    @Test
    public void testGetTotal(){
        System.out.println("总共有"+studentDao.getTotal()+"个学生");
    }

    @Test
    public void testAddStudent() throws ParseException {
      Student student=new Student();
      student.setAge(24);
      student.setName("张三");
      student.setSex("男");
      student.setStudent_id(321);
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
      student.setBirthday(sdf.parse("1991-01-02"));
      studentDao.addStudent(student);

    }
    @Test
    public void testDeleteStudent(){
        int id=1;
        studentDao.deleteStudent(id);
    }

    @Test
    public void testUpdateStudent( ) throws ParseException {
        Student student=new Student();
        student.setId(3);
        student.setAge(22);
        student.setName("丽丽");
        student.setSex("女");
        student.setStudent_id(111);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        student.setBirthday(sdf.parse("1999-01-02"));
        studentDao.updateStudent(student);
    }

    @Test
    public void testGetStudent( ){
        System.out.println(studentDao.getStudent(2));
    }
//    List<Student> list(int start, int count);
    @Test
    public void testList(){
        System.out.println(studentDao.list(0,2));
    }

}
