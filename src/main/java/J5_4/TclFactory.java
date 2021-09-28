package J5_4;

public class TclFactory implements ElectricFactory{
    public Television createTelevision(){
        return new TclTv();
    }
    public Airconditioner createAirconditioner(){
        return new TclAir();
    }
}
