public class Test {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(5), new Rectangle(4, 5)};
        GeometricObject max = GeometricObject.max(objects[0], objects[1]);
        System.out.println("The largest object is " + max);
        GeometricObject[] shapes = new GeometricObject[5];
        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(4.8, 6.4);
        shapes[2] = new Square(5, 5);
        shapes[3] = new Circle(6.9);
        shapes[4] = new Rectangle(2.5, 5.5);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
        }
    }
}

