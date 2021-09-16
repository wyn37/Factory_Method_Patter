package J3_5;

public class Triangle implements Shape{
    public Triangle(){
        System.out.println("创建三角形");
    }

    @Override
    public void draw(){
        System.out.println("三角形绘制");
    }
    @Override
    public void erase(){
        System.out.println("三角形擦除");
    }

}
