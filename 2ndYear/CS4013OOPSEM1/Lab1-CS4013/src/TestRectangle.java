public class TestRectangle  {
    public static void main(String[] args) {
    Rectangle test = new Rectangle();

    System.out.println("1st test");
    System.out.println("Width is " + test.getWidth()  );
    System.out.println("Height is " + test.getWidth()  );
    System.out.println("Area of test rectangle is " + test.getArea());
    System.out.println("Perimeter of test rectangle is " + test.getPerimeter());
    Rectangle two = new Rectangle(4, 5.5);
    System.out.println("=================");
    System.out.println("2nd test");

    System.out.println("Width is " + two.getWidth());
    System.out.println("Height is " + two.getHeight());
    System.out.println("Area of test rectangle is " + two.getArea());
    System.out.println("Perimeter of test rectangle is " + two.getPerimeter());





}
}
