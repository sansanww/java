package cn.it.service.impl;

import cn.it.dao.QuestionnaireDao;
import cn.it.entity.Questionnaire;
import cn.it.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

    @Autowired
     private QuestionnaireDao questionnaireDao;

    @Override
    public int getCount(int student_id) {
        return questionnaireDao.getCount(student_id);
    }

    @Override
    public void addQuestionnaire(Questionnaire questionnaire) {
        questionnaireDao.addQuestionnaire(questionnaire);
    }

    @Override
    public void deleteQuestionnaire(int student_id) {
        questionnaireDao.deleteQuestionnaire(student_id);
    }

    @Override
    public void updateQuestionnaire(Questionnaire questionnaire) {
        questionnaireDao.updateQuestionnaire(questionnaire);
    }

    @Override
    public Questionnaire selectQuestionnaire(int student_id) {
        return questionnaireDao.selectQuestionnaire(student_id);
    }
}
