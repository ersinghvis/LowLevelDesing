package designpatterns.chainofresponsibility.impls;

import designpatterns.chainofresponsibility.abstracts.RequestHandler;
import designpatterns.chainofresponsibility.enums.TaskPriority;

public class HighPriorityTaskRequestHandler extends RequestHandler {
    public HighPriorityTaskRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    public void handleIncomingRequest(TaskPriority priority, int taskId){
        if( priority == TaskPriority.HIGH ){
            System.out.println("Request handled by HighPriorityTaskRequestHandler with id :- " + taskId);
        }else{
            super.handleIncomingRequest(priority, taskId);
        }
    }
}
