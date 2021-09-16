package J3_5;

public class ShapeFactory {
    public static Shape createShaprByName(String name) throws UnsupportedOperationException {
        Shape res;
        if (name.equalsIgnoreCase("Circle")) {
            res = new Cricle();
        } else if (name.equalsIgnoreCase("Triangle")) {
            res = new Triangle();
        } else if (name.equalsIgnoreCase("Rectangle")) {
            res = new Rectangle();
        } else {
            throw new UnsupportedOperationException("对不起，暂不能生产该种图形");
        }
        return  res;

    }
}
