package FilEksempler;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        ShapeFactory sf = new ShapeFactory();

        Shape shape = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of shape? (r for rectangle / c for circle)");

        if (userInput.hasNextLine()) {

            String typeOfShape = userInput.nextLine();

            shape = sf.makeShape(typeOfShape);

        }

        if (shape != null) {
            doStuff(shape);
        } else System.out.println("Enter r or c next time.");

        System.out.println("Do you want to format your shape? (r for red / b for blue)");

        if (userInput.hasNextLine()) {
            sf.formatShape(shape, userInput.nextLine());
        }

}

    private static void doStuff(Shape shape) {
        System.out.println(shape.getClass());
    }
/*        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangel());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        Shape shadowRectangle = new ShapeShadowDecorator(new Rectangel());
        System.out.println("\nRectangle with shadow");
        shadowRectangle.draw();*/

}
