package J4_6;

public class DatabaseFactory implements DataFactory{
    public Data createData(){
        System.out.println("Database转换工厂");
        Data data = new Database();
        return data;
    }
}
