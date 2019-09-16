package cn.it.service;

import cn.it.entity.Questionnaire;

public interface QuestionnaireService {
    int getCount(int student_id);
    void addQuestionnaire( Questionnaire questionnaire);
    void deleteQuestionnaire(int student_id);
    void updateQuestionnaire(Questionnaire questionnaire);
    Questionnaire selectQuestionnaire(int student_id);
}
