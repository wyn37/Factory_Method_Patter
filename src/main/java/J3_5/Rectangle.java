package J3_5;

public class Rectangle implements Shape{
    public Rectangle(){
        System.out.println("创建矩形");
    }

    @Override
    public void draw(){
        System.out.println("矩形绘制");
    }
    @Override
    public void erase(){
        System.out.println("矩形擦除");
    }

}
