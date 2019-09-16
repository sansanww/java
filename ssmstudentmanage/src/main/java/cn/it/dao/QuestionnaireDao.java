package cn.it.dao;

import cn.it.entity.Questionnaire;
import org.apache.ibatis.annotations.Param;

public interface QuestionnaireDao {
    int getCount(@Param("student_id") int student_id);
    void addQuestionnaire(@Param("questionnaire") Questionnaire questionnaire);
    void deleteQuestionnaire(@Param("student_id") int student_id);
    void updateQuestionnaire(@Param("questionnaire") Questionnaire questionnaire);
    Questionnaire selectQuestionnaire(@Param("student_id") int student_id);
}
