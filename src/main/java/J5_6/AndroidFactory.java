package J5_6;

public class AndroidFactory implements ControllerFactory{
    public Operation createOperation(){
        return new AndroidOperation();
    }
    public Interface createInterface(){
        return new AndroidInterface();

    }
}
