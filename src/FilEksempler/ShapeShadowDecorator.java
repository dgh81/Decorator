package FilEksempler;

public class ShapeShadowDecorator extends ShapeDecorator {
    public ShapeShadowDecorator(Shape decoratedShape) {super(decoratedShape);}

    @Override
    public void draw() {
        decoratedShape.draw();
        setShadow(decoratedShape);
    }

    private void setShadow(Shape decoratedShape){
        System.out.println("Shadow: on");
    }
}
