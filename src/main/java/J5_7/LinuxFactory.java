package J5_7;

public class LinuxFactory implements  OperationFactory{
    public Button createButton(){
        return new LinuxButton();
    }
    public Text createText(){
        return new LinuxText();
    }
}
