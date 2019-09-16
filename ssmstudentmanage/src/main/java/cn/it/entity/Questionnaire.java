package cn.it.entity;

public class Questionnaire {
    private int student_id;
    private String extraversion;
    private String socialSkills;
    private Student student;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getExtraversion() {
        return extraversion;
    }

    public void setExtraversion(String extraversion) {
        this.extraversion = extraversion;
    }

    public String getSocialSkills() {
        return socialSkills;
    }

    public void setSocialSkills(String socialSkills) {
        this.socialSkills = socialSkills;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "student_id=" + student_id +
                ", extraversion='" + extraversion + '\'' +
                ", socialSkills='" + socialSkills + '\'' +
                ", student=" + student +
                '}';
    }
}
