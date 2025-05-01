package designpatterns.factory;

public class Factory implements IFactory{
    @Override
    public IEmployee getEmployee(String type) {
        if( "android".equals(type.toLowerCase()) ){
            return new AndroidDeveloper();
        } else if( "java".equals(type.toLowerCase()) ){
            return new JavaDeveloper();
        }else{
            return null;
        }
    }
}
