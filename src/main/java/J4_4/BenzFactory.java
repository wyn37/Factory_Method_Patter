package J4_4;

public class BenzFactory implements CarFactory{
    public Car createCar(){
        Car car = new Benzcar();
        return car;
    }
}
