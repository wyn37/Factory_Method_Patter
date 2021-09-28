package J5_7;

public class UnitxFactory implements OperationFactory{
    public Button createButton(){
        return new UnitxButton();
    }
    public Text createText(){
        return new UnitxText();
    }
}
