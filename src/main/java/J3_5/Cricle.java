package J3_5;

public  class  Cricle implements Shape{
    public  Cricle(){
        System.out.println("创建圆形");
    }
    @Override
    public void draw(){
        System.out.println("圆形绘制");
    }
    @Override
    public void erase(){
        System.out.println("圆形擦除");
    }

}
