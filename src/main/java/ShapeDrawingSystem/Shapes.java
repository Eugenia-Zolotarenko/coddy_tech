package ShapeDrawingSystem;
// TODO: Create three classes that implement the Shape interface:

// Circle class
// - draw() should print "Drawing a Circle"
 class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
// Rectangle class
// - draw() should print "Drawing a Rectangle"
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
// Triangle class
// - draw() should print "Drawing a Triangle"
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
