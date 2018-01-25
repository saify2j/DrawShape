package paintTool;

public class Rectangle extends Shape {

    public void draw() {
        System.out.println("A rectangle is drawn!");
    }

    public void color(String colorName) {
        System.out.println("Color is now " + colorName);

    }
}