package J5_6;

public class Client {
    public static void main(String args[]) {
        AndroidFactory factory;
        Operation operation;
        Interface interface1;
        factory = (AndroidFactory) XMLUtil.getBean();
        operation = factory.createOperation();
        interface1 = factory.createInterface();
        operation.type();
        interface1.type();
    }
}
