public class MyPoint {
    private double x, y;


    public MyPoint() {
        x = 0;
        y = 0;

   }
   public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;

   }
   public double getXCordinate () {
        return this.x;
   }
   public double getYCordinate() {
        return this.y;
   }
  public double distance (double x1, double y1) {
        return Math.sqrt(((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y) ));
  }
  public double distance(MyPoint point) {
        return distance(point.getXCordinate(), point.getYCordinate());
  }
}
