package J5_6;

public class IosFactory implements ControllerFactory{
    public Operation createOperation(){
        return new IosOperation();
    }
    public Interface createInterface(){
        return new IosInterface();

    }
}
