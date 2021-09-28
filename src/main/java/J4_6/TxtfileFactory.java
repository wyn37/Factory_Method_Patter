package J4_6;

public class TxtfileFactory implements DataFactory{
    public Data createData(){
        System.out.println("TXT转换工厂");
        Data data = new Txtfile();
        return data;
    }
}
