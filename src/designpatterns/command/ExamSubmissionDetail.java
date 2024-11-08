package designpatterns.command;

import java.util.Map;

public class ExamSubmissionDetail {
    private Map<Question,Answer> answers;
   private String examName;

    public Map<Question, Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Question, Answer> answers) {
        this.answers = answers;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
}
