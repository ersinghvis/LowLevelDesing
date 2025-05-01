package designpatterns.abstractfactory;

import designpatterns.factory.IEmployee;
import designpatterns.factory.JavaDeveloper;

public class JavaAbstract extends AbstractFactory{
    @Override
    public IEmployee getEmployee() {
        return new JavaDeveloper();
    }
}
