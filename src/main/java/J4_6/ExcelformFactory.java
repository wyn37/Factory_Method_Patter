package J4_6;

public class ExcelformFactory implements DataFactory{
    public Data createData() {
        System.out.println("Excelform转换工厂");
        Data data = new Excelform();
        return data;
    }
}
