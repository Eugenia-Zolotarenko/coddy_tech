package ShapeDrawingSystem;
// TODO: Create the ShapeFactory class
// It should have a static method: createShape(String type)
// The method should return a Shape based on the type:
// - "circle" -> return new Circle()
// - "rectangle" -> return new Rectangle()
// - "triangle" -> return new Triangle()
// - any other value -> return null
public class ShapeFactory {
    public static Shape createShape(String type){
        switch (type){
            case "circle" -> {
                return new Circle();
            }
            case "rectangle" -> {
                return new Rectangle();
            }
            case "triangle" -> {
                return new Triangle();
            }
        }
        return null;
    }
}
