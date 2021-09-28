package J4_5;

public class Client {
    public static void main(String args[]){
        MapFactory factory;
        Map map;
        factory = new GraphFactory();
        //factory = new BargraphFactory();
        map = factory.createMap();
        map.draw();
    }
}
