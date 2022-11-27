public class Square extends GeometricObject implements Colorable
{
    private double width;
    private double height;
    private String result;
    Square(double width, double height)
    {
        width = width;
        height = height;
    }
    public void howToColor()
    {
        System.out.println("Colour all four of the sides");
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return  width*height;

    }
    public double getPerimeter()
    {
        return  2*(width+height);

    }
    public String toString()
    {
        return  "Square: Width = " + width + " Height = " + height + " Area = " + getArea() + " Perimeter = " + getPerimeter();

    }
}