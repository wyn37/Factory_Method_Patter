package J5_7;


public class Client {
    public static void main(String args[]){
        WindowsFactory factory;
        Button button;
        Text text;
        factory = (WindowsFactory) XMLUtil.getBean();
        button = factory.createButton();
        text = factory.createText();
        button.type();
        text.type();
    }
}
