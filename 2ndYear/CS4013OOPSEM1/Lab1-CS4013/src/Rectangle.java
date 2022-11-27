public class Rectangle {
    private double height, width;

    public Rectangle() {
        width = 1;
        height = 1;
    }

   public  Rectangle(double newWidth, double newHeight) {
       width = newWidth;
       height = newHeight;
   }

   public  double getArea() {
       double area = (width * height) ;
       return area;
   }

   public double getPerimeter() {
       double perimeter = 2 * (width + height);
       return perimeter;
   }
   public double getHeight() {
        return height;
   }
   public double getWidth() {
        return width;
   }
}
