package designpatterns.command;

public class ExamAcceptorService {

    private ExamProcessorQueue queue=new ExamProcessorQueue();
    public ExamProcessorQueue getQueue() {
        return queue;
    }

    void acceptExam(final ExamSubmissionDetail detail) {
        IRequestCommand command = new EmailExamCommandRequest(detail, new ExamProcessingServiceImpl());
        queue.add(command);
    }

}
