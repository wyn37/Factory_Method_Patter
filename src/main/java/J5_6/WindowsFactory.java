package J5_6;

public class WindowsFactory implements ControllerFactory{
    public Operation createOperation(){
        return new WindowsOperation();
    }
    public Interface createInterface(){
        return new WindowsInterface();

    }
}
