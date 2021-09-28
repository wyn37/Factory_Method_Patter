package J4_5;

public class BargraphFactory implements MapFactory{
    public Map createMap() {
        Map map = new Bargraph();
        return map;
    }
}
