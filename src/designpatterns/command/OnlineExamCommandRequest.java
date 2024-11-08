package designpatterns.command;

public class OnlineExamCommandRequest implements IRequestCommand {

    private ExamSubmissionDetail detail;

    private IExamProcessingService service;

    public OnlineExamCommandRequest(final ExamSubmissionDetail detail,IExamProcessingService service) {
        this.detail = detail;
        this.service = service;
    }

    @Override
    public void execute() {
        System.out.println("Exam command sent for execution");
        service.processExam(detail);
    }
}
