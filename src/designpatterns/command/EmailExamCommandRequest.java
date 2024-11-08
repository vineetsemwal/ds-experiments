package designpatterns.command;

public class EmailExamCommandRequest implements IRequestCommand {

    private final ExamSubmissionDetail detail;
    private IExamProcessingService service;

    public EmailExamCommandRequest(final ExamSubmissionDetail detail, final IExamProcessingService service) {
        this.detail = detail;
        this.service = service;
    }

    @Override
    public void execute() {
        System.out.println("Email command command sent for execution");
        service.processExam(detail);
    }
}
