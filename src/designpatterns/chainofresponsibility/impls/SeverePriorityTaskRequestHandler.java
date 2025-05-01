package designpatterns.chainofresponsibility.impls;

import designpatterns.chainofresponsibility.abstracts.RequestHandler;
import designpatterns.chainofresponsibility.enums.TaskPriority;

public class SeverePriorityTaskRequestHandler extends RequestHandler {
    public SeverePriorityTaskRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    public void handleIncomingRequest(TaskPriority priority, int taskId){
        if( priority == TaskPriority.CRITICAL ){
            System.out.println("Request handled by SeverePriorityTaskRequestHandler with id :- " + taskId);
        }else if(priority == null){
            System.out.println("Request can't be handled with id :- " + taskId);
        } else{
            super.handleIncomingRequest(priority, taskId);
        }
    }

}
