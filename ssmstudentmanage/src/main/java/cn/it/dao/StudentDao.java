package cn.it.dao;
import cn.it.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int getTotal();
    void addStudent(@Param("student") Student student);
    void deleteStudent(@Param("id") int id);
    void updateStudent(@Param("student") Student student);
    Student getStudent(@Param("id") int id);
    List<Student> list(@Param("start") int start,@Param("count") int count);
}
