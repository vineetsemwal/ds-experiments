package designpatterns.command;

import java.util.HashMap;
import java.util.Map;

public class CommandUsage {
    public static void main(String[] args) {
        ExamSubmissionDetail exam1 = new ExamSubmissionDetail();
        Map<Question,Answer>exam1Answers=new HashMap<>();
        exam1Answers.put(new Question("q1","What is the capital of India?",10),
                new Answer("New Delhi"));
        exam1Answers.put(new Question("q2","What is the popular dessert?",10),
                new Answer("Kesari Baat"));
        exam1.setAnswers(exam1Answers);


        ExamSubmissionDetail exam2 = new ExamSubmissionDetail();
        Map<Question,Answer>exam2Answers=new HashMap<>();
        exam2Answers.put(new Question("q1","What is the capital of India?",10),
                new Answer("Chennai"));
        exam2Answers.put(new Question("q2","What is the popular dessert?",10),
                new Answer("Gulab Jamun"));
        exam2.setAnswers(exam1Answers);


        ExamAcceptorService acceptorService = new ExamAcceptorService();
        acceptorService.acceptExam(exam1);
        acceptorService.acceptExam(exam2);


    }
}
