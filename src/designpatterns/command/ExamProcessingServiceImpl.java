package designpatterns.command;

import java.util.Map;

public class ExamProcessingServiceImpl implements IExamProcessingService{

    @Override
       public void processExam(final ExamSubmissionDetail detail) {
            Map<Question,Answer>answers =detail.getAnswers();
            for (Map.Entry<Question, Answer> entry : answers.entrySet()) {
                Question question = entry.getKey();
                Answer answer = entry.getValue();
                System.out.println("Question: "+question.getDescription());

            }
            System.out.println("Exam processed");
        }
}
