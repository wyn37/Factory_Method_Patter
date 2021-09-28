package J4_5;

public class GraphFactory implements  MapFactory{
    public Map createMap(){
        Map map = new Graph();
        return map;
    }
}
