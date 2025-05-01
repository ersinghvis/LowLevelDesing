package designpatterns.abstractfactory;

import designpatterns.factory.AndroidDeveloper;
import designpatterns.factory.IEmployee;

public class AndroidAbstract extends AbstractFactory{
    @Override
    public IEmployee getEmployee() {
        return new AndroidDeveloper();
    }
}
