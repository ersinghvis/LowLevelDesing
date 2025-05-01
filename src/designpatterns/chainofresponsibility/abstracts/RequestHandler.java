package designpatterns.chainofresponsibility.abstracts;

import designpatterns.chainofresponsibility.enums.TaskPriority;

public abstract class RequestHandler {

    private RequestHandler nextRequestHandler;

    public RequestHandler(RequestHandler nextRequestHandler){
        this.nextRequestHandler = nextRequestHandler;
    }

    public void handleIncomingRequest(TaskPriority priority, int taskId){
        if( nextRequestHandler != null ){
            nextRequestHandler.handleIncomingRequest(priority,taskId);
        }
    }

}
