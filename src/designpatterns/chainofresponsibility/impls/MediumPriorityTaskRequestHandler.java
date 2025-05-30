package designpatterns.chainofresponsibility.impls;

import designpatterns.chainofresponsibility.abstracts.RequestHandler;
import designpatterns.chainofresponsibility.enums.TaskPriority;

public class MediumPriorityTaskRequestHandler extends RequestHandler {
    public MediumPriorityTaskRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    public void handleIncomingRequest(TaskPriority priority, int taskId){
        if( priority == TaskPriority.MEDIUM ){
            System.out.println("Request handled by MediumPriorityTaskRequestHandler with id :- " + taskId);
        }else{
            super.handleIncomingRequest(priority, taskId);
        }
    }
}
