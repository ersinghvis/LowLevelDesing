package designpatterns.chainofresponsibility.service;

import designpatterns.chainofresponsibility.abstracts.RequestHandler;
import designpatterns.chainofresponsibility.enums.TaskPriority;
import designpatterns.chainofresponsibility.impls.HighPriorityTaskRequestHandler;
import designpatterns.chainofresponsibility.impls.LowPriorityTaskRequestHandler;
import designpatterns.chainofresponsibility.impls.MediumPriorityTaskRequestHandler;
import designpatterns.chainofresponsibility.impls.SeverePriorityTaskRequestHandler;

public class HandleTask {

    private RequestHandler handler;

    public HandleTask(){
        handler = new LowPriorityTaskRequestHandler(
                new MediumPriorityTaskRequestHandler(
                        new HighPriorityTaskRequestHandler(
                                new SeverePriorityTaskRequestHandler(null)
                        )
                )
        );
    }

    public void submitTask(TaskPriority priority, int id){
        handler.handleIncomingRequest(priority, id);
    }

}
