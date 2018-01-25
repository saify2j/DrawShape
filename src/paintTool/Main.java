package paintTool;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Shape newShape=new Shape();
        String choice="";
        String color="";
        Scanner input=new Scanner(System.in);

        System.out.println("Enter what shape to draw:(Circle || Square || Rectangle )");
        choice=input.nextLine();

        System.out.println("Enter Color");
        color =input.nextLine();

        if(choice.equalsIgnoreCase("circle")){
            Shape aCircle=new Circle();
            aCircle.draw();
            aCircle.color(color);
        }
        if(choice.equalsIgnoreCase("square")){
            Square aSquare=new Square();
            aSquare.draw();
            aSquare.color(color);
        }
        if(choice.equalsIgnoreCase("rectangle")){
            Shape aRectangle= new Rectangle();
            aRectangle.draw();
            aRectangle.color(color);
        }



    }


}
