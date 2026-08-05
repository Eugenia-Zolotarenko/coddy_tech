package ShapeDrawingSystem;

public class MainShapeDrawingSystem {
    public static void main(String[] args) {
        // Read two shape types
        String type1 = "unknown";
        String type2 = "invalid";

        // TODO: Use ShapeFactory to create the first shape
        // If the shape is not null, call draw()"
        // If the shape is null, print "Unknown shape: [type]"
        Shape shape1 = ShapeFactory.createShape(type1);
        if(shape1 != null) shape1.draw();
        else System.out.println("Unknown shape: " + type1);

        // TODO: Do the same for the second shape
        Shape shape2 = ShapeFactory.createShape(type2);
        if(shape2 != null) shape2.draw();
        else System.out.println("Unknown shape: " + type2);
    }
}
