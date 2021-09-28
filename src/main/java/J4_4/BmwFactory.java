package J4_4;

public class BmwFactory implements CarFactory{
    public Car createCar(){
        Car car = new Bmwcar();
        return car;
    }
}
