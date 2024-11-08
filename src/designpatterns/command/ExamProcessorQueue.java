package designpatterns.command;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExamProcessorQueue {

    private ScheduledExecutorService executorService;

    private Deque<IRequestCommand>queue=new LinkedList<>();

    public ExamProcessorQueue() {
        this.executorService = Executors.newScheduledThreadPool(1);
        executorService.schedule(this::processCommands, 10, java.util.concurrent.TimeUnit.SECONDS);
    }

    void add(final IRequestCommand command)   {
        queue.add(command);
    }


    void processCommands() {
        while(!queue.isEmpty()) {
            IRequestCommand command=queue.poll();
            command.execute();
        }
    }

}
