package J5_7;

public class WindowsFactory implements OperationFactory{
    public Button createButton(){
        return new WindowsButton();
    }
    public Text createText(){
        return new WindownsText();
    }
}
