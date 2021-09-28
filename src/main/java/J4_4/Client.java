package J4_4;

public class Client {
    public static void main(String agrs[]){
        CarFactory factory;
        Car car;
        //factory = new BmwFactory();
        factory = new BenzFactory();
        car = factory.createCar();
        car.makeCar();
    }
}
