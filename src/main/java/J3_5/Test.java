package J3_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Shape shape = null;
        Scanner scanner = new Scanner(System.in);
        String shapeName = "";
        while(true){
            shapeName = scanner.next();
            if(shapeName.equalsIgnoreCase("exit"))
                break;
            try{
                shape = ShapeFactory.createShaprByName(shapeName);
                shape.draw();
                shape.erase();
            }catch (UnsupportedOperationException e){
                System.out.println("没有该名称的图形");
            }
        }
    }
}
