package designpatterns.abstractfactory;

import designpatterns.factory.IEmployee;

public class Factory {

    public IEmployee getEmployee( AbstractFactory factory ){
        return factory.getEmployee();
    }

}
