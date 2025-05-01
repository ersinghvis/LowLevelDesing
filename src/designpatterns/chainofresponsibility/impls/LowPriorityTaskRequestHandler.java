package designpatterns.chainofresponsibility.impls;

import designpatterns.chainofresponsibility.abstracts.RequestHandler;
import designpatterns.chainofresponsibility.enums.TaskPriority;

public class LowPriorityTaskRequestHandler extends RequestHandler {


    public LowPriorityTaskRequestHandler(RequestHandler nextRequestHandler){
        super(nextRequestHandler);
    }

    public void handleIncomingRequest(TaskPriority priority, int taskId){
        if( priority == TaskPriority.LOW ){
            System.out.println("Request handled by LowPriorityTaskRequestHandler with id :- " + taskId);
        }else{
            super.handleIncomingRequest(priority, taskId);
        }
    }

}
