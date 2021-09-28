package J5_4;

public class HaierFactory implements ElectricFactory{
    public Television createTelevision(){
        return new HaierTvt();
    }
    public Airconditioner createAirconditioner(){
        return new HaierAir();
    }
}
