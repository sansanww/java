package cn.it.service;

import cn.it.entity.Student;

import java.util.List;

public interface StudentService {
//    获取到学生总数
    int getTotal();

//    增加一条数据
    void addStudent(Student student);

//    删除一条数据
    void deleteStudent(int id);

//    更新一条数据
    void updateStudent(Student student);

//    找到一条数据
    Student getStudent(int id);

//    列举出从start位置开始的count条数据
    List<Student> list(int start, int count);
}
