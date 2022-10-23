public class TestMyPoint {
    public static void main (String[] args) {
        MyPoint p1 = new MyPoint(3, 6 );
        MyPoint p2 = new MyPoint(8, 6);



        System.out.println("1st point");
        System.out.println("X Co-ordinate = " + p1.getXCordinate() + " || Y Co-ordinate = " + p1.getYCordinate());
        System.out.println("========================================");
        System.out.println("2nd point");
        System.out.println("X Co-ordinate = " + p2.getXCordinate() + " || Y Co-ordinate = " + p2.getYCordinate());
        System.out.println("========================================");
        System.out.println("Distance between 1st and second point = " + p1.distance(p2));
        System.out.println("Distance from 1st point and point c(9,3) = " + p1.distance(9,3));
        System.out.println("Distance from 2nd point and point c(9,3) = " + p2.distance(9,3));

    }
}
