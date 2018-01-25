package paintTool;

public class Square extends Shape{
    public Square(){

    }
    public void draw(){
        System.out.println("A square is drawn");
    }

    @Override
    public void color(String colorName) {
        System.out.println("Color is now "+colorName);
    }
}
