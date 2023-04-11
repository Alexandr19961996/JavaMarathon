package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    public Teacher (String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    public void evaluate (Student student){
        Random random = new Random();
        int minAssessment = 2;
        int maxAssessment = 5;
        int randomNumber = random.nextInt(maxAssessment - minAssessment + 1) + minAssessment;
        String assessment = null;
        switch (randomNumber) {
            case 2: {
                assessment = "неудовлетворительно";
                break;
            }
            case 3: {
                assessment = "удовлетворительно";
                break;
            }
            case 4: {
                assessment = "хорошо";
                break;
            }
            case 5: {
                assessment = "отлично";
                break;
            }
        }
        System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку " + assessment + ".");
    }
}
