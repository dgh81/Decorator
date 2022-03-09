package FilEksempler;

public class ShapeFactory {

    public Shape makeShape(String shapeType) {

        Shape shape = null;

        if (shapeType.equalsIgnoreCase("r")) {
            return new Rectangel();
        } else
        if (shapeType.equalsIgnoreCase("c")) {
            return new Circle();
        } else return null;


    }

    public void formatShape(Shape shape, String formatCode) {

        if (shape != null && !formatCode.equalsIgnoreCase("")) {

            if (formatCode.equalsIgnoreCase("r")) {
                System.out.println(shape.getClass() + " is now red.");
            }
            if (formatCode.equalsIgnoreCase("b")) {
                System.out.println(shape.getClass() + " is now blue.");
            }
        }

    }


}
