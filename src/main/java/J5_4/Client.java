package J5_4;

public class Client {
    public static void main(String args[]){
        HaierFactory factory;
        Television tv;
        Airconditioner air;
        factory = (HaierFactory)XMLUtil.getBean();
        tv = factory.createTelevision();
        air = factory.createAirconditioner();
        tv.maked();
        air.maked();
    }
}
