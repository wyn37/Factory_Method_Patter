package J4_6;

public class Client {
    public static void main(String args[]){
        DataFactory factory;
        Data data;
        factory = (DataFactory)XMLUtil.getBean();
        data = factory.createData();
        data.transverter();
    }
}
