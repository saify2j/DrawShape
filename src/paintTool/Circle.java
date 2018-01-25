package paintTool;

public class Circle extends Shape {

    public Circle() {

    }

    public void draw() {

        System.out.println("A circle is drawn!");
    }

    public void color(String colorName) {
        System.out.println("Color is now " + colorName);


    }
}