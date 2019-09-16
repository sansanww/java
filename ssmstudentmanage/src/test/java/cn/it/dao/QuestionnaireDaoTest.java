package cn.it.dao;

import cn.it.entity.Questionnaire;
import cn.it.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")

public class QuestionnaireDaoTest {

    @Autowired
    private QuestionnaireDao questionnaireDao;

    @Test
    public void getCount(){
        System.out.println("ID555:"+questionnaireDao.getCount(555));
        System.out.println("ID777:"+questionnaireDao.getCount(777));
    }

    @Test
    public void addQuestionnaire() throws ParseException {
        Questionnaire questionnaire=new Questionnaire();
        questionnaire.setStudent_id(2);
        questionnaire.setExtraversion("外向");
        questionnaire.setSocialSkills("低社交能力");

        Student student=new Student();
        student.setId(2);
        student.setAge(24);
        student.setName("张三");
        student.setSex("男");
        student.setStudent_id(321);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        student.setBirthday(sdf.parse("1991-01-02"));
        questionnaire.setStudent(student);
        questionnaireDao.addQuestionnaire(questionnaire);
    }

    @Test
    public void deleteQuestionnaire() {
        questionnaireDao.deleteQuestionnaire(2);
    }

    @Test
    public void updateQuestion() throws ParseException {
        Questionnaire questionnaire=new Questionnaire();
        questionnaire.setStudent_id(2);
        questionnaire.setExtraversion("双向");
        questionnaire.setSocialSkills("低社交能力");

        Student student=new Student();
        student.setId(2);
        student.setAge(24);
        student.setName("张三");
        student.setSex("男");
        student.setStudent_id(321);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        student.setBirthday(sdf.parse("1991-01-02"));
        questionnaire.setStudent(student);
        questionnaireDao.updateQuestionnaire(questionnaire);
    }

    @Test
    public void getQuestionnaire() {
        System.out.println(questionnaireDao.selectQuestionnaire(2));
    }
}